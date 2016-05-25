package org.eclipselabs.jsdt.jquery.api.js;

import org.eclipselabs.jsdt.jquery.api.SimpleVersion;

public class JQuery30NoConflictGlobalScopeContainerInitializer  extends
    JQueryGlobalScopeContainerInitializer {

  public JQuery30NoConflictGlobalScopeContainerInitializer() {
    super(SimpleVersion.fromString("3.0"), true);
  }

}
