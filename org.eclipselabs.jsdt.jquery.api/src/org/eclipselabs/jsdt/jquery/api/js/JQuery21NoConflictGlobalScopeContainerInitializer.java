package org.eclipselabs.jsdt.jquery.api.js;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;

public class JQuery21NoConflictGlobalScopeContainerInitializer  extends
JQueryGlobalScopeContainerInitializer {

  public JQuery21NoConflictGlobalScopeContainerInitializer() {
    super(SimpleVersion.fromString("2.1"), true);
  }

}
