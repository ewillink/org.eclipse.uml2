/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: AcceptEventActionItemProviderTest.java,v 1.1 2004/04/29 14:43:45 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.AcceptEventAction;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Accept Event Action</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcceptEventActionItemProviderTest extends ActionItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcceptEventActionItemProviderTest.class);
	}

	/**
	 * Constructs a new Accept Event Action item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Accept Event Action item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AcceptEventAction getModelObject() {
		return (AcceptEventAction) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createAcceptEventAction());
	}

} //AcceptEventActionItemProviderTest
