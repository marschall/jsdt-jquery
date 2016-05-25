package org.eclipselabs.jsdt.jquery.api.js;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;

public class JQuery111NoConflictGlobalScopeContainerInitializer extends
JQueryGlobalScopeContainerInitializer {

  public JQuery111NoConflictGlobalScopeContainerInitializer() {
    super(SimpleVersion.fromString("1.11"), true);
  }

}
