/*
 * *****************************************************************************
 * Copyright (c) 2011 Philippe Marschall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Philippe Marschall
 * *****************************************************************************
 */
package org.eclipselabs.jsdt.jquery.core.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipselabs.jsdt.jquery.core.api.JQueryMember;

enum Filters implements Predicate {



  FUNCTION {

    @Override
    public boolean isTrue(Function function) {
      return true;
    }

    @Override
    public boolean isTrue(Property property) {
      return false;
    }

  },

  PROPERTY {

    @Override
    public boolean isTrue(Function function) {
      return false;
    }

    @Override
    public boolean isTrue(Property property) {
      return true;
    }

  },

  CLASS_SIDE {

    @Override
    public boolean isTrue(Function function) {
      return isJQueryStatic(function);
    }

    @Override
    public boolean isTrue(Property property) {
      return isJQueryStatic(property);
    }

  },
  
  JQUERY_AJAX {
    
    private final Set<String> ajaxFunctions = new HashSet<String>(Arrays.asList("get", "getJSON", "getScript", "post"));
    
    @Override
    public boolean isTrue(Function function) {
      String functionName = function.getName();
      return functionName.startsWith("ajax")
          || ajaxFunctions.contains(functionName);
    }
    
    @Override
    public boolean isTrue(Property property) {
      return false;
    }
    
  },

  INSTANCE_SIDE {

    @Override
    public boolean isTrue(Function function) {
      return isJQueryObject(function);
    }

    @Override
    public boolean isTrue(Property property) {
      return isJQueryObject(property);
    }

  },

  EVENT {

    @Override
    public boolean isTrue(Function function) {
      return isJQueryEvent(function);
    }

    @Override
    public boolean isTrue(Property property) {
      return isJQueryEvent(property);
    }

  },
  
  XHR {
    
    @Override
    public boolean isTrue(Function function) {
      return isJQueryXhr(function);
    }
    
    @Override
    public boolean isTrue(Property property) {
      return isJQueryXhr(property);
    }
    
  },
  
  DEFERRED {
    
    @Override
    public boolean isTrue(Function function) {
      return isJQueryDeferred(function);
    }
    
    @Override
    public boolean isTrue(Property property) {
      return isJQueryDeferred(property);
    }
    
  };


  static boolean isJQueryObject(DocumentedMember member) {
    return isJQueryObject(member.getOwner());
  }

  static boolean isJQueryObject(String owner) {
    return JQueryMember.JQUERY_OBJECT.equals(owner);
  }

  static boolean isJQueryStatic(DocumentedMember member) {
    return isJQueryStatic(member.getOwner());
  }

  static boolean isJQueryStatic(String owner) {
    return "jQuery".equals(owner);
  }

  static boolean isJQueryEvent(DocumentedMember member) {
    return isJQueryEvent(member.getOwner());
  }

  static boolean isJQueryEvent(String owner) {
    return "event".equals(owner);
  }
  
  static boolean isJQueryDeferred(DocumentedMember member) {
    return isJQueryDeferred(member.getOwner());
  }
  
  static boolean isJQueryDeferred(String owner) {
    return "deferred".equals(owner);
  }
  
  static boolean isJQueryXhr(DocumentedMember member) {
    return isJQueryXhr(member.getOwner());
  }
  
  static boolean isJQueryXhr(String owner) {
    return "jqXHR".equals(owner);
  }


}