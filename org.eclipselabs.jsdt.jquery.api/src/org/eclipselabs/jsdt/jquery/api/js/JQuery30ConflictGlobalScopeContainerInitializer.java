package org.eclipselabs.jsdt.jquery.api.js;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;

public class JQuery30ConflictGlobalScopeContainerInitializer extends
    JQueryGlobalScopeContainerInitializer {

  public JQuery30ConflictGlobalScopeContainerInitializer() {
    super(SimpleVersion.fromString("3.0"), false);
  }

}
