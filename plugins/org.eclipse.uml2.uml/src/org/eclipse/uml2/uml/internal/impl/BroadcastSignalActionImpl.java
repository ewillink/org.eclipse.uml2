/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BroadcastSignalActionImpl.java,v 1.13 2006/04/10 19:16:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BroadcastSignalActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broadcast Signal Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BroadcastSignalActionImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BroadcastSignalActionImpl
		extends InvocationActionImpl
		implements BroadcastSignalAction {

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastSignalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.BROADCAST_SIGNAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject) signal;
			signal = (Signal) eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.BROADCAST_SIGNAL_ACTION__SIGNAL, oldSignal,
						signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BROADCAST_SIGNAL_ACTION__SIGNAL, oldSignal, signal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberAndOrder(DiagnosticChain diagnostics,
			Map context) {
		return BroadcastSignalActionOperations.validateNumberAndOrder(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOrderingMultiplicity(
			DiagnosticChain diagnostics, Map context) {
		return BroadcastSignalActionOperations
			.validateTypeOrderingMultiplicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.BROADCAST_SIGNAL_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME :
				return getName();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__INPUT :
				return getInputs();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ARGUMENT :
				return getArguments();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ON_PORT :
				if (resolve)
					return getOnPort();
				return basicGetOnPort();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__SIGNAL :
				if (resolve)
					return getSignal();
				return basicGetSignal();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.BROADCAST_SIGNAL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ON_PORT :
				setOnPort((Port) newValue);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__SIGNAL :
				setSignal((Signal) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.BROADCAST_SIGNAL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ON_PORT :
				setOnPort((Port) null);
				return;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__SIGNAL :
				setSignal((Signal) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.BROADCAST_SIGNAL_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME :
				return isSetName();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BROADCAST_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ARGUMENT :
				return arguments != null && !arguments.isEmpty();
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ON_PORT :
				return onPort != null;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__SIGNAL :
				return signal != null;
		}
		return eDynamicIsSet(featureID);
	}

} //BroadcastSignalActionImpl
