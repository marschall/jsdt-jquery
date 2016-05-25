package org.eclipselabs.jsdt.jquery.api.js;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;

public class JQuery112NoConflictGlobalScopeContainerInitializer extends
    JQueryGlobalScopeContainerInitializer {

  public JQuery112NoConflictGlobalScopeContainerInitializer() {
    super(SimpleVersion.fromString("1.12"), true);
  }

}
