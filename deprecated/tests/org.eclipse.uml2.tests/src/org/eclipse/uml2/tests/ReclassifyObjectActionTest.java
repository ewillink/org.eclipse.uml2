/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ReclassifyObjectActionTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.ReclassifyObjectAction;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReclassifyObjectActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReclassifyObjectActionTest.class);
	}

	/**
	 * Constructs a new Reclassify Object Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reclassify Object Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReclassifyObjectAction getFixture() {
		return (ReclassifyObjectAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createReclassifyObjectAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}


	public void testGetInputs() {
		super.testGetInputs();

		assertTrue(getFixture().getInputs().contains(getFixture().getObject()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setObject(UML2Factory.eINSTANCE.createInputPin());
	}

} //ReclassifyObjectActionImplTest
