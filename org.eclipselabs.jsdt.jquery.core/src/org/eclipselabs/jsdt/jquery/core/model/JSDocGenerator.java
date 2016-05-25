/*
 * *****************************************************************************
 * Copyright (c) 2011 Philippe Marschall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Philippe Marschall
 * *****************************************************************************
 *
 */
package org.eclipselabs.jsdt.jquery.core.model;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;
import org.eclipselabs.jsdt.jquery.api.Version;
import org.eclipselabs.jsdt.jquery.core.api.JQueryArgument;
import org.eclipselabs.jsdt.jquery.core.api.JQueryMember;
import org.eclipselabs.jsdt.jquery.core.api.MemberVisitor;


public class JSDocGenerator extends WriterSupport {

  private static final String JQUERY_OBJECT_PROTOTYPE = JQueryMember.JQUERY_OBJECT + ".prototype";

  private static final String JQUERY_EVENT_PROTOTYPE = JQueryMember.JQUERY_EVENT + ".prototype";
  
  private static final String JQUERY_DEFERRED_PROTOTYPE = JQueryMember.JQUERY_DEFERRED + ".prototype";
  
  private static final String JQUERY_XMLHTTPREQUEST_PROTOTYPE = JQueryMember.JQUERY_XMLHTTPREQUEST + ".prototype";

  private static final Map<String, String> DEFAULT_VALUES;

  static {
    DEFAULT_VALUES = new HashMap<String, String>();
    DEFAULT_VALUES.put("String", "\"\"");
    DEFAULT_VALUES.put("Object", "{}");
    DEFAULT_VALUES.put("Map", "{}");
    DEFAULT_VALUES.put("Boolean", "true");
    DEFAULT_VALUES.put("Number", "1");
    DEFAULT_VALUES.put("Integer", "1");
    DEFAULT_VALUES.put("Element", "null");
    DEFAULT_VALUES.put("Anything", "{}");
    DEFAULT_VALUES.put("Document", "new Document()");
  }

  private static final Version VERSION_WITH_DEFERRED = SimpleVersion.fromString("1.5");

  private boolean noConflict;

  private Version maximumVersion;

  public void write(Collection<JQueryMember> members, boolean noConflict, Writer output, Version maximumVersion) throws IOException {
    try {
      this.writeProtected(new CompositeIterable<JQueryMember>(members, fakeJqXhr()), noConflict, output, maximumVersion);
    } finally {
      output.close();
    }
  }
  
  private Iterable<JQueryMember> fakeJqXhr() {
    Collection<PropertySignature> since15 = Collections.singletonList(new PropertySignature("1.5", null, null));
    Property readyState = new Property("jqXHR.readyState",
        "The state of the request",
        "The state of the request",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        since15, "Integer", null, null);
    Property status = new Property("jqXHR.status",
        "The status of the response to the request. This is the HTTP result code (for example, status is 200 for a successful request).",
        "The status of the response to the request. This is the HTTP result code (for example, status is 200 for a successful request).",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        since15, "Integer", null, null);
    Property statusText = new Property("jqXHR.statusText",
        "The response string returned by the HTTP server. Unlike status, this includes the entire text of the response message (\"200 OK\", for example).",
        "The response string returned by the HTTP server. Unlike status, this includes the entire text of the response message (\"200 OK\", for example).",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        since15, "String", null, null);
    Property responseXML = new Property("jqXHR.responseXML",
        "The response to the request as a DOM Document object, or null if the request was unsuccessful, has not yet been sent, or cannot be parsed as XML or HTML. The response is parsed as if it were a text/xml stream. When the responseType is set to \"document\" and the request has been made asynchronously, the response is parsed as a text/html stream.",
        "The response to the request as a DOM Document object, or null if the request was unsuccessful, has not yet been sent, or cannot be parsed as XML or HTML. The response is parsed as if it were a text/xml stream. When the responseType is set to \"document\" and the request has been made asynchronously, the response is parsed as a text/html stream.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        since15, "Document", null, null);
    Function abort = new Function("jqXHR.abort",
        "Aborts the request if it has already been sent.",
        "Aborts the request if it has already been sent.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, null, Collections.<FunctionArgument>emptyList())),
        "void", null, null);
    Function getAllResponseHeaders = new Function("jqXHR.getAllResponseHeaders",
        "Returns all the response headers as a string, or null if no response has been received. Note: For multipart requests, this returns the headers from the current part of the request, not from the original channel.",
        "Returns all the response headers as a string, or null if no response has been received. Note: For multipart requests, this returns the headers from the current part of the request, not from the original channel.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, null, Collections.<FunctionArgument>emptyList())),
        "String", null, null);
    Function getResponseHeader = new Function("jqXHR.getResponseHeader",
        "Returns the header field value from the response of which the field name matches header, unless the field name is Set-Cookie or Set-Cookie2.",
        "Returns the header field value from the response of which the field name matches header, unless the field name is Set-Cookie or Set-Cookie2.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, null, Collections.singletonList(new FunctionArgument("header", Collections.singleton("String"), "the header name", false, null, Collections.<Option>emptyList())))),
        "String", null, null);
    Function statusCode = new Function("jqXHR.statusCode",
        "statusCode",
        "statusCode",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, null, Collections.<FunctionArgument>emptyList())),
        "Object", null, null);
    Function overrideMimeType = new Function("jqXHR.overrideMimeType",
        "Override the mime type. Available in jQuery 1.4.x, as well, temporarily removed in jQuery 1.5 but added again in 1.5.1.",
        "Override the mime type. Available in jQuery 1.4.x, as well, temporarily removed in jQuery 1.5 but added again in 1.5.1.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.4", null, null, Collections.singletonList(new FunctionArgument("mimeType", Collections.singleton("String"), "the header name", false, null, Collections.<Option>emptyList())))),
        "String", null, null);
    Function done = new Function("jqXHR.done",
        "An alternative construct to the success callback option, the .done() method replaces the deprecated jqXHR.success() method. Refer to deferred.done() for implementation details.",
        "An alternative construct to the success callback option, the .done() method replaces the deprecated jqXHR.success() method. Refer to deferred.done() for implementation details.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, null, Collections.singletonList(new FunctionArgument("function( data, textStatus, jqXHR )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList())))),
        "Deferred", null, null);
    Function success = new Function("jqXHR.success",
        "Refer to deferred.done() for implementation details.",
        "Refer to deferred.done() for implementation details.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, "1.8", Collections.singletonList(new FunctionArgument("function( data, textStatus, jqXHR )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList())))),
        "Deferred", null, null);
    Function fail = new Function("jqXHR.fail",
        "An alternative construct to the error callback option, the .fail() method replaces the deprecated .error() method. Refer to deferred.fail() for implementation details. ",
        "An alternative construct to the error callback option, the .fail() method replaces the deprecated .error() method. Refer to deferred.fail() for implementation details. ",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, null, Collections.singletonList(new FunctionArgument("function( jqXHR, textStatus, errorThrown )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList())))),
        "Deferred", null, null);
    Function error = new Function("jqXHR.error",
        "Refer to deferred.fail() for implementation details. ",
        "Refer to deferred.fail() for implementation details. ",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, "1.8", Collections.singletonList(new FunctionArgument("function( jqXHR, textStatus, errorThrown )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList())))),
        "Deferred", null, null);
    Function always = new Function("jqXHR.always",
        "An alternative construct to the complete callback option, the .always() method replaces the deprecated .complete() method.",
        "An alternative construct to the complete callback option, the .always() method replaces the deprecated .complete() method.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, null, Collections.singletonList(new FunctionArgument("function( data|jqXHR, textStatus, jqXHR|errorThrown )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList())))),
        "Deferred", null, null);
    Function complete = new Function("jqXHR.complete",
        "An alternative construct to the complete callback option, the .always() method replaces the deprecated .complete() method.",
        "An alternative construct to the complete callback option, the .always() method replaces the deprecated .complete() method.",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.5", null, "1.8", Collections.singletonList(new FunctionArgument("function( data|jqXHR, textStatus, jqXHR|errorThrown )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList())))),
        "Deferred", null, null);
    Function then = new Function("jqXHR.then",
        "Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details. ",
        "Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details. ",
        Collections.<Example>emptyList(), Collections.<String>emptySet(),
        Collections.singletonList(new FunctionSignature("1.8", null, null, Arrays.asList(
            new FunctionArgument("function( data, textStatus, jqXHR )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList()),
            new FunctionArgument("function( jqXHR, textStatus, errorThrown )", Collections.singleton("Function"), "the callback", false, null, Collections.<Option>emptyList())))),
        "Deferred", null, null);
    return Arrays.<JQueryMember>asList(readyState, status, statusText, responseXML, abort,
        getAllResponseHeaders, getResponseHeader, overrideMimeType, statusCode,
        done, fail, always, then,
        success, error, complete);
  }

  private void writeProtected(Iterable<JQueryMember> members, boolean noConflict, Writer output, Version maximumVersion) {
    this.noConflict = noConflict;
    this.output = output;
    this.maximumVersion = maximumVersion;

    this.writeJQueryObjectType();
    this.openPrototype(JQUERY_OBJECT_PROTOTYPE);
    this.visitAll(members, Filters.INSTANCE_SIDE, new JQueryInstanceSideWriter());
    this.closePrototype();

    this.writeJQueryEventType();
    this.openPrototype(JQUERY_EVENT_PROTOTYPE);
    this.visitAll(members, Filters.EVENT, new JQueryEventWriter());
    this.closePrototype();
    
    if (this.supportsDeferred()) {
      this.writeJQueryDeferredType();
      this.openPrototype(JQUERY_DEFERRED_PROTOTYPE);
      this.visitAll(members, Filters.DEFERRED, new JQueryDeferredWriter());
      this.closePrototype();
    }
    
    if (this.supportsDeferred()) {
      this.writeJQueryXmlHttpRequestType();
      this.openPrototype(JQUERY_XMLHTTPREQUEST_PROTOTYPE);
      this.visitAll(members, Filters.XHR, new JQueryXhrWriter());
      this.closePrototype();
    }
    
    Function constructor = this.findConstructor(members);
    this.writeConstructor(constructor);
    // waiting for the following bug to be fixed
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=362403
    //    this.writeDeferredConsturctor();
    //    MemberVisitor<Void> classVisitor = new ClassSideVisitor<Void>(this);
    //    for (JQueryMember member : members) {
    //      member.accept(classVisitor);
    //    }
  }
  
  private void openPrototype(String ownerName) {
    this.write(ownerName);
    this.write(" = {");
    this.writeNewLine();
  }
  
  private void closePrototype() {
    this.writeLine("};");
  }

  private Function findConstructor(Iterable<JQueryMember> members) {
    MemberVisitor<Function> finder = new ConstructorFinder();
    for (JQueryMember member : members) {
      Function constructor = member.accept(finder);
      if (constructor != null) {
        return constructor;
      }
    }
    throw new RuntimeException("no constructor found");
  }

  static final class ConstructorFinder implements MemberVisitor<Function> {

    @Override
    public Function visitFuntion(Function function) {
      String owner = function.getOwner();
      if (JQueryMember.JQUERY_OBJECT.equals(owner)
          && "jQuery".equals(function.getName())
          && "jQuery".equals(function.getReturnType())) {
        return function;
      }
      return null;
    }

    @Override
    public Function visitProperty(Property property) {
      return null;
    }

  }

  private void writeConstructor(Function constructor) {
    this.writeConstructor(constructor, "jQuery");
    if (!this.noConflict) {
      this.writeConstructor(constructor, "$");
    }
  }

  private void writeConstructor(Function constructor, String globalVariableName) {

    this.writeStart();
    this.writeCommentLine(constructor.getDescription());
    this.writeTag("returns", '{' + JQueryMember.JQUERY_OBJECT + '}');
    this.writeEnd();

    this.writeLine("function " + globalVariableName + "() {};");
  }

  private void writeJQueryObjectType() {
    this.writeType(JQueryMember.JQUERY_OBJECT);
  }

  private void writeJQueryEventType() {
    this.writeType(JQueryMember.JQUERY_EVENT);
  }
  
  private void writeJQueryDeferredType() {
    this.writeType(JQueryMember.JQUERY_DEFERRED);
  }
  
  private void writeJQueryXmlHttpRequestType() {
    this.writeType(JQueryMember.JQUERY_XMLHTTPREQUEST);
  }
  
  private void writeType(String typeName) {
    this.write("var ");
    this.write(typeName);
    this.write(" = { };");
    this.writeNewLine();
  }


  private void writeDeferredConsturctor() {
    if (supportsDeferred()) {
      this.writeDeferredConsturctor("jQuery");
      if (!this.noConflict) {
        this.writeDeferredConsturctor("$");
      }
    }
  }

  private boolean supportsDeferred() {
    return this.maximumVersion.compareTo(VERSION_WITH_DEFERRED) >= 0;
  }

  private void writeDeferredConsturctor(String globalVariableName) {
    this.writeStart();
    this.writeTag("returns", "{Promise}");
    this.writeEnd();
    this.writeLine(globalVariableName + ".Deferred = function() {};");
  }

  final class JQueryEventWriter implements MemberVisitor<Void> {

    @Override
    public Void visitFuntion(Function function) {
      JSDocGenerator.this.visitJQueryEventFunction(function);
      return null;
    }

    @Override
    public Void visitProperty(Property property) {
      JSDocGenerator.this.visitJQueryEventProperty(property);
      return null;
    }

  }
  
  final class JQueryDeferredWriter implements MemberVisitor<Void> {
    
    @Override
    public Void visitFuntion(Function function) {
      JSDocGenerator.this.visitJQueryDeferredFunction(function);
      return null;
    }
    
    @Override
    public Void visitProperty(Property property) {
      JSDocGenerator.this.visitJQueryDeferredProperty(property);
      return null;
    }
    
  }
  
  final class JQueryXhrWriter implements MemberVisitor<Void> {
    
    @Override
    public Void visitFuntion(Function function) {
      JSDocGenerator.this.visitJQueryXhrFunction(function);
      return null;
    }
    
    @Override
    public Void visitProperty(Property property) {
      JSDocGenerator.this.visitJQueryXhrProperty(property);
      return null;
    }
    
  }

  final class JQueryInstanceSideWriter implements MemberVisitor<Void> {

    @Override
    public Void visitFuntion(Function function) {
      JSDocGenerator.this.visitJQueryInstanceSideFunction(function);
      return null;
    }

    @Override
    public Void visitProperty(Property property) {
      JSDocGenerator.this.visitJQueryInstanceSideProperty(property);
      return null;
    }

  }

  final class JQueryClassSideWriter implements MemberVisitor<Void> {

    private final String jQueryGlobal;

    JQueryClassSideWriter(String jQueryGlobal) {
      this.jQueryGlobal = jQueryGlobal;
    }

    @Override
    public Void visitFuntion(Function function) {
      JSDocGenerator.this.visitJQueryClassSideFunction(function);
      return null;
    }

    @Override
    public Void visitProperty(Property property) {
      JSDocGenerator.this.visitJQueryClassSideProperty(property, this.jQueryGlobal);
      return null;
    }

  }

  void visitJQueryEventFunction(Function function) {
    this.writeFunction(function);
  }

  void visitJQueryEventProperty(Property property) {
    this.writeProperty(property);
  }
  
  void visitJQueryDeferredFunction(Function function) {
    this.writeFunction(function);
  }
  
  void visitJQueryDeferredProperty(Property property) {
    this.writeProperty(property);
  }
  
  void visitJQueryXhrFunction(Function function) {
    this.writeFunction(function);
  }
  
  void visitJQueryXhrProperty(Property property) {
    this.writeProperty(property);
  }

  void visitJQueryInstanceSideFunction(Function function) {
    this.writeFunction(function);
  }

  void visitJQueryInstanceSideProperty(Property property) {
    this.writeProperty(property);
  }

  void visitJQueryClassSideFunction(Function function) {
    this.writeFunction(function);
  }

  void visitJQueryClassSideProperty(Property property, String jQueryGlobal) {
    this.writeProperty(property);
  }

  private void writeFunction(Function function) {
    if (!function.isPresentIn(this.maximumVersion)) {
      return;
    }
    
    List<FunctionSignature> signatures = function.getSignaturesInVersion(this.maximumVersion);
    if (!signatures.isEmpty()) {
      this.writeStart();
      this.writeCommentLine(function.getDescription());
      String returnType = function.getReturnType();
      if (!signatures.isEmpty()) {
        //String prefix;
        //if (signatures.size() > 1) {
        //  prefix = "^1";
        //} else {
        //  prefix = null;
        //}
        FunctionSignature signature = signatures.get(0);
        this.writeSignature(function, signature, null);
      }
      if (!isEmpty(returnType)) {
        this.writeTag("returns", '{' + this.fixReturnTypes(returnType) + '}');
      }
      this.writeEnd();
      //if (signatures.size() > 1) {
      //  int i = 2;
      //  for (MethodSignature signature : signatures.subList(1, signatures.size())) {
      //    String suffix = "^" + i;
      //    this.writeStart();
      //    this.writeSignature(method.getName(), signature, suffix);
      //    this.writeEnd();
      //    i += 1;
      //  }
      //}
      this.write(function.getName());
      this.write(": function(");
      if (!signatures.isEmpty()) {
        FunctionSignature signature = signatures.get(0);
        boolean first = true;
        for (FunctionArgument argument : signature.getArguments()) {
          if (!first) {
            this.write(", ");
          }
          first = false;
          String argumentName = extractArgumentName(argument);
          this.write(argumentName);
        }
      }
      this.write(") {},");
      this.writeNewLine();
    }
  }

  private void writeSignature(Function function, FunctionSignature signature, String suffix) {
    Version added = signature.getAdded();
    this.writeTag("since", added.toString());

    if (function.isDeprecatedIn(this.maximumVersion)) {
      this.writeTag("deprecated", function.getDeprecated());
    } else {
      if (signature.isDeprecatedIn(this.maximumVersion)) {
        this.writeTag("deprecated", signature.getDeprecated());
      }
    }
    //this.writeTag("name", methodName + StringUtils.defaultString(suffix));

    for (JQueryArgument argument : signature.getArguments()) {
      this.writeArgument(argument, null);
    }
  }

  private void writeArgument(JQueryArgument argument, String prefix) {
    StringBuilder buffer = new StringBuilder();

    //type
    Set<String> types = argument.getTypes();
    if (!types.isEmpty()) {
      buffer.append('{');
      //FIXME hax for JSDT bug, can't have multiple types
      buffer.append(types.iterator().next());
      buffer.append('}');
      buffer.append(' ');
    }

    // name, optional, default
    boolean optional = argument.isOptional();
    if (optional) {
      buffer.append('[');
    }

    if (!isEmpty(prefix)) {
      buffer.append(prefix);
    }
    String argumentName = extractArgumentName(argument);
    buffer.append(argumentName);
    if (optional) {
      String defaultValue = argument.getDefaultValue();
      if (!isEmpty(defaultValue)) {
        buffer.append('=');
        buffer.append(defaultValue);
      }
    }
    if (optional) {
      buffer.append(']');
    }
    buffer.append(' ');
    buffer.append(argument.getDescription());

    this.writeTag("param", buffer.toString());

    if (types.contains("Map")) {
      Collection<? extends JQueryArgument> options = argument.getOptions();
      if (!options.isEmpty()) {
        String subPrefix = argumentName + '.';
        for (JQueryArgument option : options) {
          this.writeArgument(option, subPrefix);
        }
      }
    }
  }


  private static String extractArgumentName(JQueryArgument argument) {

    String nameWithArguments = argument.getName();
    if (!argument.getTypes().contains("Function")) {
      return nameWithArguments;
    }
    int parenIndex = nameWithArguments.indexOf('(');
    if (parenIndex == -1) {
      return safeFunctionName(nameWithArguments);
    } else {
      String substring = nameWithArguments.substring(0, parenIndex);
      return safeFunctionName(substring);
    }
  }

  private static String safeFunctionName(String functionName) {
    //HAX for function()
    if ("function".equals(functionName)) {
      return "func";
    } else {
      return functionName;
    }
  }

  private String fixPropertyTypes(String type) {
    return this.fixMultipleTypes(type);
  }

  private String fixReturnTypes(String type) {
    if ("jQuery".equals(type)) {
      return JQueryMember.JQUERY_OBJECT;
    } else if ("Deferred".equals(type)) {
      return JQueryMember.JQUERY_DEFERRED;
    } else if ("jqXHR".equals(type)) {
      return JQueryMember.JQUERY_XMLHTTPREQUEST;
    } else {
      return this.fixMultipleTypes(type);
    }
  }

  private String fixMultipleTypes(String type) {
    //buffer.append(StringUtils.replaceChars(type, ',', '|')); // different types may be allowed eg. String,Number
    int commaIndex = type.indexOf(',');
    if (commaIndex == -1) {
      return type;
    } else {
      String[] types = type.split(",");
      for (int i = 0; i < types.length; ++i) {
        types[i] = types[i].trim();
      }
      return join(types, '|');
    }
  }

  private void writeProperty(Property property) {
    if (!property.isPresentIn(this.maximumVersion)) {
      return;
    }

    this.writeStart();
    this.writeCommentLine(property.getDescription());

    this.writeDeprecated(property);

    String returnType = property.getReturnType();
    if (!isEmpty(returnType)) {
      this.writeTag("type", '{' + this.fixPropertyTypes(returnType) + '}');
    }
    this.writeEnd();

    this.write(property.getName());
    this.write(": ");

    String defaultValue = DEFAULT_VALUES.get(returnType);
    if (defaultValue == null) {
      if (property.getName().equals("data") && property.getOwner().endsWith("event")) {
        defaultValue = DEFAULT_VALUES.get("Object");
      } else {
        throw new RuntimeException("no known default type for: " + returnType);
      }
    }
    this.write(defaultValue);

    this.write(',');
    this.writeNewLine();
  }

  private void writeDeprecated(Property property) {
    if (property.isDeprecatedIn(this.maximumVersion)) {
      this.writeTag("deprecated", property.getDeprecated());
    } else {
      Collection<PropertySignature> signatures = property.getSignatures();
      if (!signatures.isEmpty()) {
        PropertySignature signature = signatures.iterator().next();
        if (signature.isDeprecatedIn(this.maximumVersion)) {
          this.writeTag("deprecated", signature.getDeprecated());
        }
      }
    }
  }

  private void writeStart() {
    try {
      this.output.write("/**");
      this.writeNewLine();
    } catch (IOException e) {
      throw new RuntimeException("output failed", e);
    }
  }

  private void writeCommentLine(String line) {
    try {
      this.writeStartLine();
      StringTokenizer tokenizer = new StringTokenizer(line, "\n");
      while (tokenizer.hasMoreTokens()) {
        this.output.write(tokenizer.nextToken());
      }
      this.writeNewLine();
    } catch (IOException e) {
      throw new RuntimeException("output failed", e);
    }
  }

  private void writeStartLine() {
    try {
      this.output.write(" * ");
    } catch (IOException e) {
      throw new RuntimeException("output failed", e);
    }
  }

  private void writeTag(String tag, String content) {
    try {
      this.writeStartLine();
      this.output.write('@');
      this.output.write(tag);
      this.output.write(' ');
      this.output.write(content);
      this.writeNewLine();
    } catch (IOException e) {
      throw new RuntimeException("output failed", e);
    }
  }
  
  private static boolean isEmpty(String s) {
    return s == null || s.isEmpty(); 
  }

  private static String join(String[] strings, char delimeter) {
    if (strings.length == 0) {
      return "";
    }
    int size = strings.length - 1;
    for (String string : strings) {
      size += string.length();
    }
    StringBuilder buffer = new StringBuilder(size);
    boolean first = true;
    for (String string : strings) {
      if (!first) {
        buffer.append(delimeter);
      }
      buffer.append(string);
      first = false;
    }
    return buffer.toString();
  }

  private void writeEnd() {
    try {
      this.output.write(" */");
      this.writeNewLine();
    } catch (IOException e) {
      throw new RuntimeException("output failed", e);
    }
  }

}
