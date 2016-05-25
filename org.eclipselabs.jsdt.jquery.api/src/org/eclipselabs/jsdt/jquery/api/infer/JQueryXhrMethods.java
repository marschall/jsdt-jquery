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

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JQueryXhrMethods {

  public static final int NO_CALLBACK = -1;

  private final Map<XhrKey, XhrLocator> callbackFunctions;

  public JQueryXhrMethods() {
    this.callbackFunctions = new ConcurrentHashMap<XhrKey, XhrLocator>();
  }

  public void addCallbackMethod(String selector, int argumentAcount, int callbackFunctionIndex, int xhrArgumentIndex) {
    XhrKey key = new XhrKey(selector, argumentAcount);
    XhrLocator xhrLocator = new XhrLocator(callbackFunctionIndex, xhrArgumentIndex);
    this.callbackFunctions.put(key, xhrLocator);
  }

  public XhrLocator getXhrLocator(String selector, int argumentCount) {
    XhrKey key = new XhrKey(selector, argumentCount);
    return this.callbackFunctions.get(key);
  }
  
  static final class XhrLocator {
    
    final int callbackFunctionIndex;
    final int xhrArgumentIndex;
    
    XhrLocator(int callbackFunctionIndex, int xhrArgumentIndex) {
      this.callbackFunctionIndex = callbackFunctionIndex;
      this.xhrArgumentIndex = xhrArgumentIndex;
    }
    
  }
  
  static final class XhrKey {

    final String selector;
    final int argmentCount;

    XhrKey(String selector, int argmentCount) {
      this.selector = selector;
      this.argmentCount = argmentCount;
    }

    @Override
    public String toString() {
      return this.selector + ":(" + this.argmentCount + ')';
    }

    @Override
    public int hashCode() {
      return this.selector.hashCode() ^ this.argmentCount;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (!(obj instanceof XhrKey)) {
        return false;
      }
      XhrKey other = (XhrKey) obj;
      return this.selector.equals(other.selector)
          && this.argmentCount == other.argmentCount;
    }

  }

}
