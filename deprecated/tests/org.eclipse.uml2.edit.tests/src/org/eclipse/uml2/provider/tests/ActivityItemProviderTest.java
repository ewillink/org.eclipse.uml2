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
 * $Id: ActivityItemProviderTest.java,v 1.4 2005/05/18 17:04:05 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.util.Collections;
import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.uml2.Action;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Activity</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProviderTest extends BehaviorItemProviderTest {

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
		TestRunner.run(ActivityItemProviderTest.class);
	}

	/**
	 * Constructs a new Activity item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Activity item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Activity getModelObject() {
		return (Activity) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ActivityItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int) <em>Create Add Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ActivityItemProvider#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * @generated
	 */
	public void testCreateAddCommandGen() {
		// TODO: implement this add command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateAddCommand() {
		testCreateAddCommandGen();
		
		super.testCreateAddCommand();
		
		// test ACTIVITY__ACTION subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getAction()).iterator(); eAllSubClasses.hasNext();) {
			Action action = (Action) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			Command command =
				AddCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getActivity_Action(),
					Collections.singleton(action),
					CommandParameter.NO_INDEX);
			
			getCommandStack().execute(command);
			
			assertTrue(getModelObject().getActions().contains(action));
			assertTrue(getModelObject().getNodes().contains(action));
			
			getCommandStack().undo();
			
			assertFalse(getModelObject().getActions().contains(action));
			assertFalse(getModelObject().getNodes().contains(action));
			
			getCommandStack().redo();
			
			assertTrue(getModelObject().getActions().contains(action));
			assertTrue(getModelObject().getNodes().contains(action));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ActivityItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection) <em>Create Remove Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ActivityItemProvider#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, java.util.Collection)
	 * @generated
	 */
	public void testCreateRemoveCommandGen() {
		// TODO: implement this remove command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateRemoveCommand() {
		testCreateRemoveCommandGen();
		
		super.testCreateRemoveCommand();
		
		// test ACTIVITY__NODE superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getAction()).iterator(); eAllSubClasses.hasNext();) {
			Action action = (Action) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			
			getModelObject().getActions().add(action);
			
			Command command = RemoveCommand.create(getEditingDomain(), getModelObject(), UML2Package.eINSTANCE.getActivity_Node(), Collections.singleton(action));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getNodes().contains(action));
			assertFalse(getModelObject().getActions().contains(action));
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getNodes().contains(action));
			assertTrue(getModelObject().getActions().contains(action));
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getNodes().contains(action));
			assertFalse(getModelObject().getActions().contains(action));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.provider.ActivityItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection) <em>Create Replace Command</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.provider.ActivityItemProvider#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * @generated
	 */
	public void testCreateReplaceCommandGen() {
		// TODO: implement this replace command creation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testCreateReplaceCommand() {
		testCreateReplaceCommandGen();
		
		super.testCreateReplaceCommand();
		
		// test ACTIVITY__ACTION subset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getAction()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
			
			Action action = (Action) UML2Factory.eINSTANCE.create(eClass);
			Action replacementAction = (Action) UML2Factory.eINSTANCE.create(eClass);
			
			getModelObject().getActions().add(action);
			
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getActivity_Action(),
					action,
					Collections.singleton(replacementAction));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getActions().contains(action));
			assertTrue(getModelObject().getActions().contains(replacementAction));
			assertTrue(getModelObject().getNodes().contains(replacementAction));
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getActions().contains(action));
			assertFalse(getModelObject().getActions().contains(replacementAction));
			assertFalse(getModelObject().getNodes().contains(replacementAction));
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getActions().contains(action));
			assertTrue(getModelObject().getActions().contains(replacementAction));
			assertTrue(getModelObject().getNodes().contains(replacementAction));
		}
		
		// test ACTIVITY__NODE superset...
		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getAction()).iterator(); eAllSubClasses.hasNext();) {
			EClass eClass = (EClass) eAllSubClasses.next();
			
			Action action = (Action) UML2Factory.eINSTANCE.create(eClass);
			Action replacementAction = (Action) UML2Factory.eINSTANCE.create(eClass);
			
			getModelObject().getActions().add(action);
			
			Command command =
				ReplaceCommand.create(
					getEditingDomain(),
					getModelObject(),
					UML2Package.eINSTANCE.getActivity_Node(),
					action,
					Collections.singleton(replacementAction));
			
			getCommandStack().execute(command);
			
			assertFalse(getModelObject().getNodes().contains(action));
			assertTrue(getModelObject().getNodes().contains(replacementAction));
			assertFalse(getModelObject().getActions().contains(action));
			
			getCommandStack().undo();
			
			assertTrue(getModelObject().getNodes().contains(action));
			assertFalse(getModelObject().getNodes().contains(replacementAction));
			assertTrue(getModelObject().getActions().contains(action));
			
			getCommandStack().redo();
			
			assertFalse(getModelObject().getNodes().contains(action));
			assertTrue(getModelObject().getNodes().contains(replacementAction));
			assertFalse(getModelObject().getActions().contains(action));
		}
	}
	
} //ActivityItemProviderTest
