/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StateMachineOperations.java,v 1.2 2005/11/17 21:23:32 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>State Machine</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateClassifierContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connection Points</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#LCA(org.eclipse.uml2.uml.State, org.eclipse.uml2.uml.State) <em>LCA</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#ancestor(org.eclipse.uml2.uml.State, org.eclipse.uml2.uml.State) <em>Ancestor</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#isRedefinitionContextValid(org.eclipse.uml2.uml.StateMachine) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class StateMachineOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StateMachineOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier context of a state machine cannot be an interface.
	 * context->notEmpty() implies not context.oclIsKindOf(Interface)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassifierContext(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.STATE_MACHINE__CLASSIFIER_CONTEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateClassifierContext", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context classifier of the method state machine of a behavioral feature must be the classifier that owns the behavioral feature.
	 * specification->notEmpty() implies (context->notEmpty() and specification->featuringClassifier->exists (c | c = context))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContextClassifier(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.STATE_MACHINE__CONTEXT_CLASSIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateContextClassifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points of a state machine are pseudostates of kind entry point or exit point.
	 * conectionPoint->forAll (c | c.kind = #entryPoint or c.kind = #exitPoint)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConnectionPoints(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.STATE_MACHINE__CONNECTION_POINTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateConnectionPoints", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state machine as the method for a behavioral feature cannot have entry/exit connection points.
	 * specification->notEmpty() implies connectionPoint->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMethod(StateMachine stateMachine,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.STATE_MACHINE__METHOD,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMethod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation LCA(s1,s2) returns an orthogonal state or region which is the least common ancestor of states s1 and s2, based on the statemachine containment hierarchy.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Namespace LCA(StateMachine stateMachine, State s1, State s2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query ancestor(s1, s2) checks whether s2 is an ancestor state of state s1. context StateMachine::ancestor (s1 : State, s2 : State) : Boolean
	 * 
	 * 
	 * result = if (s2 = s1) then
	 * true
	 * else if (s1.container->isEmpty) then
	 * true
	 * else if (s2.container->isEmpty) then
	 * false
	 * else (ancestor (s1, s2.container))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean ancestor(StateMachine stateMachine, State s1, State s2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a statemachine are properly related to the redefinition contexts of the specified statemachine to allow this element to redefine the other. The containing classifier of a redefining statemachine must redefine the containing classifier of the redefined statemachine.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isRedefinitionContextValid(StateMachine stateMachine,
			StateMachine redefined) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies that a redefining state machine is consistent with a redefined state machine provided that the redefining state machine is an extension of the redefined state machine: Regions are inherited and regions can be added, inherited regions can be redefined. In case of multiple redefining state machines, extension implies that the redefining state machine gets orthogonal regions for each of the redefined state machines.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isConsistentWith(StateMachine stateMachine,
			RedefinableElement redefinee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // StateMachineOperations