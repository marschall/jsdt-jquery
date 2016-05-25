package org.eclipselabs.jsdt.jquery.api.js;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;

public class JQuery21ConflictGlobalScopeContainerInitializer extends
    JQueryGlobalScopeContainerInitializer {

  public JQuery21ConflictGlobalScopeContainerInitializer() {
    super(SimpleVersion.fromString("2.1"), false);
  }

}
