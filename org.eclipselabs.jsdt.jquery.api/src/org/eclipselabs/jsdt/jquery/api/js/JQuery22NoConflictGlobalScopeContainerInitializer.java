package org.eclipselabs.jsdt.jquery.api.js;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;

public class JQuery22NoConflictGlobalScopeContainerInitializer  extends
    JQueryGlobalScopeContainerInitializer {

  public JQuery22NoConflictGlobalScopeContainerInitializer() {
    super(SimpleVersion.fromString("2.2"), true);
  }

}
