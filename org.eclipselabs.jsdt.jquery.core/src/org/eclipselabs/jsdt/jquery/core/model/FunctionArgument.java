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
 *
 */
package org.eclipselabs.jsdt.jquery.core.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipselabs.jsdt.jquery.core.api.JQueryArgument;



class FunctionArgument extends Argument {

  private final boolean optional;
  private final Collection<Option> options;
  private final String returnType;
  private final List<FunctionArgument> arguments;

  FunctionArgument(String name, Set<String> types, String description, boolean optional, String defaultValue, Collection<Option> options) {
    this(name, types, description, optional, defaultValue, options, Collections.<FunctionArgument>emptyList(), null);
  }

  FunctionArgument(String name, Set<String> types, String description, boolean optional, String defaultValue, Collection<Option> options, List<FunctionArgument> arguments, String returnType) {
    super(name, types, description, defaultValue);
    this.optional = optional;
    this.options = options;
    this.arguments = arguments;
    this.returnType = returnType;
  }

  @Override
  public boolean isOptional() {
    return this.optional;
  }

  @Override
  public Collection<? extends JQueryArgument> getOptions() {
    // TODO Auto-generated method stub
    return this.options;
  }
  
  public int getArgumentIndex(String argumentName) {
    for (int i = 0; i < this.arguments.size(); i++) {
      FunctionArgument argument = this.arguments.get(i);
      if (argumentName.equals(argument.getName())) {
        return i;
      }
    }
    return -1;
  }

}
