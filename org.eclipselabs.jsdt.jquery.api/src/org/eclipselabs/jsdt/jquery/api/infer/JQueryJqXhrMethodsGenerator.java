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

import javax.annotation.Generated;

@Generated("org.eclipselabs.jsdt.jquery.core.model.XhrGenerator")
public class JQueryJqXhrMethodsGenerator {

  public JQueryXhrMethods createJqXhrMethods() {
    JQueryXhrMethods methods = new JQueryXhrMethods();
    methods.addCallbackMethod("ajaxComplete", 1, 0, 1);
    methods.addCallbackMethod("ajaxError", 1, 0, 1);
    methods.addCallbackMethod("ajaxSend", 1, 0, 1);
    methods.addCallbackMethod("ajaxSuccess", 1, 0, 1);
    methods.addCallbackMethod("ajaxPrefilter", 2, 1, 2);
    methods.addCallbackMethod("ajaxPrefilter", 1, 0, 2);
    methods.addCallbackMethod("ajaxTransport", 2, 1, 2);
    methods.addCallbackMethod("get", 4, 2, 2);
    methods.addCallbackMethod("get", 3, 2, 2);
    methods.addCallbackMethod("getJSON", 3, 2, 2);
    methods.addCallbackMethod("getScript", 2, 1, 2);
    methods.addCallbackMethod("post", 4, 2, 2);
    methods.addCallbackMethod("post", 3, 2, 2);
    return methods;
  }

}
