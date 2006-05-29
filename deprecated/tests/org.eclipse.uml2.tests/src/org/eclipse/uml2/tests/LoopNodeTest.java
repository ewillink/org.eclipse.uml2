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
 * $Id: LoopNodeTest.java,v 1.3 2006/05/29 17:27:33 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.LoopNode;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopNodeTest extends StructuredActivityNodeTest {

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
		TestRunner.run(LoopNodeTest.class);
	}

	/**
	 * Constructs a new Loop Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LoopNode getFixture() {
		return (LoopNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createLoopNode());
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


	public void testGetOutputs() {
		super.testGetOutputs();

		assertTrue(getFixture().getOutputs().containsAll(getFixture().getResults()));
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getLoopVariables()));
	}

	public void testGetInputs() {
		super.testGetInputs();

		assertTrue(getFixture().getInputs().containsAll(getFixture().getLoopVariableInputs()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getLoopVariables().add(UML2Factory.eINSTANCE.createOutputPin());
		getFixture().getLoopVariables().add(UML2Factory.eINSTANCE.createOutputPin());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().getLoopVariableInputs().add(UML2Factory.eINSTANCE.createInputPin());
		getFixture().getLoopVariableInputs().add(UML2Factory.eINSTANCE.createInputPin());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpOutputs()
	 */
	protected void setUpOutputs() {
		super.setUpOutputs();

		getFixture().getResults().add(UML2Factory.eINSTANCE.createOutputPin());
		getFixture().getResults().add(UML2Factory.eINSTANCE.createOutputPin());
	}

} //LoopNodeImplTest
