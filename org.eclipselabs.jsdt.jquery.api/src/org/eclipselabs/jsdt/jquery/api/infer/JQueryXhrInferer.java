/*
 * *****************************************************************************
 * Copyright (c) 2014 Philippe Marschall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Philippe Marschall
 * *****************************************************************************
 */
package org.eclipselabs.jsdt.jquery.api.infer;

import org.eclipse.wst.jsdt.core.ast.IASTNode;
import org.eclipse.wst.jsdt.core.ast.IArgument;
import org.eclipse.wst.jsdt.core.ast.IExpression;
import org.eclipse.wst.jsdt.core.ast.IFunctionCall;
import org.eclipse.wst.jsdt.core.ast.IFunctionExpression;
import org.eclipse.wst.jsdt.core.infer.InferredType;
import org.eclipselabs.jsdt.jquery.api.infer.JQueryXhrMethods.XhrLocator;

class JQueryXhrInferer extends JQueryInferrerSupport {
  
  private static final InferredType jQueryXMLHttpRequest;

  private final JQueryXhrMethods xhrMethods;

  static {
    char[] selector = "jQueryXMLHttpRequest".toCharArray();
    jQueryXMLHttpRequest = new InferredType(selector);
  }

  JQueryXhrInferer(JQueryXhrMethods callbackMethods, boolean noConflict) {
    super(noConflict);
    this.xhrMethods = callbackMethods;
  }

  @Override
  public boolean visit(IFunctionCall functionCall) {

    IExpression receiver = functionCall.getReceiver();
    if (receiver != null && this.isJQueryStatic(receiver)) {
      checkForXhr(functionCall);
    }
    return super.visit(functionCall);
  }

  private void checkForXhr(IFunctionCall functionCall) {
    String selector = new String(functionCall.getSelector());
    IExpression[] functionCallArguments = functionCall.getArguments();
    if (functionCallArguments != null) {
      int argumentCount = functionCallArguments.length;
      XhrLocator locator = this.getXhrLocator(selector, argumentCount);
      if (locator != null) {
        int callbackFunctionIndex = locator.callbackFunctionIndex;
        if (callbackFunctionIndex < argumentCount) {
          IExpression expression = functionCallArguments[callbackFunctionIndex];
          if (expression.getASTType() == IASTNode.FUNCTION_EXPRESSION) {
            this.setInferredTypeXhr(expression, locator);
          }
        }
      }
    }
  }

  private void setInferredTypeXhr(IExpression expression, XhrLocator locator) {
    IFunctionExpression functionExpression = (IFunctionExpression) expression;
    IArgument[] functionExpressionArguments = functionExpression.getMethodDeclaration().getArguments();
    int xhrArgumentIndex = locator.xhrArgumentIndex;
    if (functionExpressionArguments != null && xhrArgumentIndex < functionExpressionArguments.length) {
      IArgument argument = functionExpressionArguments[xhrArgumentIndex];
      argument.setInferredType(jQueryXMLHttpRequest);
    }
  }
  

  private XhrLocator getXhrLocator(String selector, int argumentCount) {
    return this.xhrMethods.getXhrLocator(selector, argumentCount);
  }

}
