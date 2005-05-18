/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InterfaceItemProviderTest.java,v 1.4 2005/05/18 17:04:05 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Interface;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Interface</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceItemProviderTest extends ClassifierItemProviderTest {

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
		TestRunner.run(InterfaceItemProviderTest.class);
	}

	/**
	 * Constructs a new Interface item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Interface item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Interface getModelObject() {
		return (Interface) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createInterface());
	}

} //InterfaceItemProviderTest
