/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2GenModelGeneratorAdapterFactory.java,v 1.1 2006/05/02 22:05:25 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.generator;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.uml2.codegen.ecore.CodeGenEcorePlugin;

/**
 * @since 1.2.0
 */
public class UML2GenModelGeneratorAdapterFactory
		extends GenModelGeneratorAdapterFactory {

	protected static String[] getUML2TemplatePath(String[] templatePath) {
		String[] uml2TemplatePath = new String[templatePath.length + 1];
		System.arraycopy(templatePath, 0, uml2TemplatePath, 0,
			templatePath.length);
		uml2TemplatePath[templatePath.length] = uml2TemplatePath[templatePath.length - 1];
		uml2TemplatePath[templatePath.length - 1] = CodeGenEcorePlugin.INSTANCE
			.getBaseURL().toString()
			+ "templates"; //$NON-NLS-1$
		return uml2TemplatePath;
	}

	protected String[] getTemplatePath(GenModel genModel) {
		return getUML2TemplatePath(super.getTemplatePath(genModel));
	}

	public Adapter createGenClassAdapter() {

		if (genClassGeneratorAdapter == null) {
			genClassGeneratorAdapter = new UML2GenClassGeneratorAdapter(this);
		}

		return genClassGeneratorAdapter;
	}

	public Adapter createGenEnumAdapter() {
		return null;
	}

	public Adapter createGenModelAdapter() {
		return null;
	}

	public Adapter createGenPackageAdapter() {

		if (genPackageGeneratorAdapter == null) {
			genPackageGeneratorAdapter = new UML2GenPackageGeneratorAdapter(
				this);
		}

		return genPackageGeneratorAdapter;
	}

}
