package org.eclipselabs.jsdt.jquery.core.model;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.List;

import org.eclipselabs.jsdt.jquery.api.JQueryApiPlugin;
import org.eclipselabs.jsdt.jquery.core.api.JQueryMember;
import org.eclipselabs.jsdt.jquery.core.api.MemberVisitor;

public class XhrGenerator extends WriterSupport {
  private static final String JQ_XHR_ARGUMENT_NAME = "jqXHR";


  public void write(Collection<JQueryMember> members, Writer output) throws IOException {
    try {
      this.writeProtected(members, output);
    } finally {
      output.close();
    }
  }

  private void writeProtected(Iterable<JQueryMember> members, Writer output) {
    this.output = output;

    this.writeHeader();
    Predicate classSideFunction = new And(Filters.FUNCTION, Filters.JQUERY_AJAX);
    this.visitAll(members, classSideFunction, new CallbackWirter());
    this.writeTrailer();
  }

  final class CallbackWirter implements MemberVisitor<Void> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Void visitFuntion(Function function) {
      XhrGenerator.this.writeMember(function);
      return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Void visitProperty(Property property) {
      throw new AssertionError("should never be called");
    }

  }

  void writeMember(Function function) {
    List<FunctionSignature> signatures = function.getSignaturesInVersion(JQueryApiPlugin.MAX_VERSION);
    for (FunctionSignature signature : signatures) {
      for (List<FunctionArgument> arguments : signature.getArgumentCombinations()) {
        for (int i = 0; i < arguments.size(); ++i) {
          FunctionArgument argument = arguments.get(i);
          if (isJqXhrCallback(argument)) {
            int callbackIndex = extractJqXhrCallbackIndex(argument);
            int argumentCount = arguments.size();
            this.writeLine("    methods.addCallbackMethod(\"" + function.getName() + "\", " + argumentCount + ", " + i + ", " + callbackIndex + ");");
          }
        }
      }
    }
  }
  

  private boolean isJqXhrCallback(FunctionArgument argument) {
    String argumentName = argument.getName();
    return argument.getTypes().contains("Function")
        && ("handler".equals(argumentName) || "success".equals(argumentName))
        && argument.getArgumentIndex(JQ_XHR_ARGUMENT_NAME) != -1;
  }
  
  private int extractJqXhrCallbackIndex(FunctionArgument argument) {
    int index = argument.getArgumentIndex(JQ_XHR_ARGUMENT_NAME);
    if (index == -1) {
      throw new IllegalArgumentException("jqXHR not found");
    }
    return index;
  }
  
  private void writeHeader() {
    // TODO read file instead of hard code
    this.writeLine("/*");
    this.writeLine(" * *****************************************************************************");
    this.writeLine(" * Copyright (c) 2014 Philippe Marschall and others.");
    this.writeLine(" * All rights reserved. This program and the accompanying materials");
    this.writeLine(" * are made available under the terms of the Eclipse Public License v1.0");
    this.writeLine(" * which accompanies this distribution, and is available at");
    this.writeLine(" * http://www.eclipse.org/legal/epl-v10.html");
    this.writeLine(" *");
    this.writeLine(" * Contributors:");
    this.writeLine(" *     Philippe Marschall");
    this.writeLine(" * *****************************************************************************");
    this.writeLine(" */");
    this.writeLine("package org.eclipselabs.jsdt.jquery.api.infer;");
    this.writeNewLine();
    this.writeLine("import javax.annotation.Generated;");
    this.writeNewLine();
    this.writeLine("@Generated(\"" + this.getClass().getName() + "\")");
    this.writeLine("public class JQueryJqXhrMethodsGenerator {");
    this.writeNewLine();
    this.writeLine("  public JQueryXhrMethods createJqXhrMethods() {");
    this.writeLine("    JQueryXhrMethods methods = new JQueryXhrMethods();");
  }


  private void writeTrailer() {
    this.writeLine("    return methods;");
    this.writeLine("  }");
    this.writeNewLine();
    this.writeLine("}");
  }

}
