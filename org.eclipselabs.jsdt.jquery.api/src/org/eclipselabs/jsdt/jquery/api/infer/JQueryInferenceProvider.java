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
package org.eclipselabs.jsdt.jquery.api.infer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.jsdt.core.IIncludePathEntry;
import org.eclipse.wst.jsdt.core.IJavaScriptProject;
import org.eclipse.wst.jsdt.core.IPackageFragmentRoot;
import org.eclipse.wst.jsdt.core.JavaScriptCore;
import org.eclipse.wst.jsdt.core.infer.IInferEngine;
import org.eclipse.wst.jsdt.core.infer.IInferenceFile;
import org.eclipse.wst.jsdt.core.infer.InferrenceProvider;
import org.eclipse.wst.jsdt.core.infer.RefactoringSupport;
import org.eclipse.wst.jsdt.core.infer.ResolutionConfiguration;
import org.eclipselabs.jsdt.jquery.api.JQueryApiPlugin;
import org.eclipselabs.jsdt.jquery.api.JQueryContainer;

public abstract class JQueryInferenceProvider implements InferrenceProvider {

  private static final String ID = JQueryInferenceProvider.class.getName();

  private final JQueryCallbackMethods callbackMethods;

  private final JQueryXhrMethods jqXhrMethods;

  public JQueryInferenceProvider() {
    this.callbackMethods = new JQueryCallbackMethodsGenerator().createCallbackMethods();
    this.jqXhrMethods = new JQueryJqXhrMethodsGenerator().createJqXhrMethods();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IInferEngine getInferEngine() {
    return new JQueryInferEngine(this.callbackMethods, this.jqXhrMethods, this.getNoConflict());
  }

  abstract boolean getNoConflict();

  /**
   * {@inheritDoc}
   */
  @Override
  public int applysTo(IInferenceFile scriptFile) {

    char[] fileName = scriptFile.getFileName();
    if (fileName == null) {
      return InferrenceProvider.NOT_THIS;
    }
    IPath path = new Path(new String(fileName));
    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
    IResource member = workspaceRoot.findMember(path);
    if (member == null) {
      return InferrenceProvider.NOT_THIS;
    }

    IProject project = member.getProject();
    if (project == null) {
      return InferrenceProvider.NOT_THIS;
    }

    try {
      if (!project.hasNature(JavaScriptCore.NATURE_ID)) {
        return InferrenceProvider.NOT_THIS;
      }
      IJavaScriptProject javaScriptProject = JavaScriptCore.create(project);
      if (!javaScriptProject.exists()) {
        return InferrenceProvider.NOT_THIS;
      }
      IIncludePathEntry[] rawIncludepath = javaScriptProject.getRawIncludepath();
      if (rawIncludepath == null) {
        return InferrenceProvider.NOT_THIS;
      }
      for (IIncludePathEntry includePathEntry : rawIncludepath) {
        if (includePathEntry.getEntryKind() == IIncludePathEntry.CPE_CONTAINER
            && includePathEntry.getContentKind() == IPackageFragmentRoot.K_SOURCE) {
          IPath includePath = includePathEntry.getPath();
          if (this.isHit(includePath)) {

            return InferrenceProvider.MAYBE_THIS;
          }
        }
      }
    } catch (CoreException e) {
      this.logException("failed to determine whether project uses jQuery", e);
      return InferrenceProvider.NOT_THIS;
    }
    return InferrenceProvider.NOT_THIS;
  }

  boolean isHit(IPath includePath) {
    return JQueryContainer.isQueryNoConflict(includePath)
        || (!this.getNoConflict() && JQueryContainer.isQueryConflict(includePath));
  }

  private void logException(String message, Exception cause) {
    JQueryApiPlugin plugin = JQueryApiPlugin.getDefault();
    String pluginId = plugin.getBundle().getSymbolicName();
    Status status = new Status(IStatus.ERROR, pluginId, message, cause);
    ILog log = plugin.getLog();
    log.log(status);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getID() {
    return ID;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ResolutionConfiguration getResolutionConfiguration() {
    return new ResolutionConfiguration();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public RefactoringSupport getRefactoringSupport() {
    return null;
  }

}
