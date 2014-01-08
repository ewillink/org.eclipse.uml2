/*
 * Copyright (c) 2013, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 286404
 *
 */
package org.eclipse.uml2.ant.tests;

import org.eclipse.uml2.ant.app.tests.DefineProfileApplicationTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * The master test suite for the UML Ant Tasks tests.
 */
public class UMLAntAllTests
		extends TestSuite {

	/**
	 * Initializes me with my name.
	 */
	public UMLAntAllTests(String name) {
		super(name);
	}

	public static Test suite() {
		TestSuite suite = new UMLAntAllTests("UML Ant Tasks Tests"); //$NON-NLS-1$
		suite.addTestSuite(DefineProfileApplicationTest.class);
		suite.addTestSuite(UMLDefineProfileTaskTest.class);
		return suite;
	}

}