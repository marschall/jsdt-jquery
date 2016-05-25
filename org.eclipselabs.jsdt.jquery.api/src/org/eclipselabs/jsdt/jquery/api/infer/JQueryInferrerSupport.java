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

import org.eclipse.wst.jsdt.core.ast.ASTVisitor;
import org.eclipse.wst.jsdt.core.ast.IASTNode;
import org.eclipse.wst.jsdt.core.ast.IExpression;
import org.eclipse.wst.jsdt.core.ast.IFunctionCall;
import org.eclipse.wst.jsdt.core.ast.ISingleNameReference;

abstract class JQueryInferrerSupport extends ASTVisitor {

  protected final boolean noConflict;

  JQueryInferrerSupport(boolean noConflict) {
    this.noConflict = noConflict;
  }

  boolean isJQueryObject(IExpression expression) {
    //TODO check inferred type
    IExpression current = expression;
    while (current != null && current.getASTType() == IASTNode.FUNCTION_CALL) {
      IFunctionCall call = (IFunctionCall) current;
      if (isJQuery(call.getSelector())) {
        return true;
      } else {
        current = call.getReceiver();
      }
    }
    return false;
  }
  
  boolean isJQueryStatic(IExpression expression) {
   if (expression.getASTType() == IASTNode.SINGLE_NAME_REFERENCE) {
     ISingleNameReference reference = (ISingleNameReference) expression;
     char[] token = reference.getToken();
      return isJQuery(token);
    }
    return false;
  }

  private boolean isJQuery(char[] token) {
    if (token == null) {
      return false;
    } else if (!this.noConflict && token.length == 1) {
      return token[0] == '$';
    } else if (token.length == 6) {
      return token[0] == 'j'
          && token[1] == 'Q'
          && token[2] == 'u'
          && token[3] == 'e'
          && token[4] == 'r'
          && token[5] == 'y';
    } else {
      return false;
    }
  }

}