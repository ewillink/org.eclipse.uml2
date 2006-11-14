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
 * $Id: WriteVariableActionImpl.java,v 1.22 2006/11/14 18:02:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.WriteVariableAction;

import org.eclipse.uml2.uml.internal.operations.WriteVariableActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Variable Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.WriteVariableActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.WriteVariableActionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WriteVariableActionImpl
		extends VariableActionImpl
		implements WriteVariableAction {

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected InputPin value = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteVariableActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.WRITE_VARIABLE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList inputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache
					.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
						inputs = new DerivedUnionEObjectEList(InputPin.class,
							this, UMLPackage.WRITE_VARIABLE_ACTION__INPUT,
							INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this,
			UMLPackage.WRITE_VARIABLE_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (InputPin) eResolveProxy(oldValue);
			if (value != oldValue) {
				InternalEObject newValue = (InternalEObject) value;
				NotificationChain msgs = oldValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.WRITE_VARIABLE_ACTION__VALUE, null, null);
				if (newValue.eInternalContainer() == null) {
					msgs = newValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.WRITE_VARIABLE_ACTION__VALUE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.WRITE_VARIABLE_ACTION__VALUE, oldValue,
						value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(InputPin newValue,
			NotificationChain msgs) {
		InputPin oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.WRITE_VARIABLE_ACTION__VALUE,
				oldValue, newValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {

		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.WRITE_VARIABLE_ACTION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.WRITE_VARIABLE_ACTION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.WRITE_VARIABLE_ACTION__VALUE, newValue, newValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createValue(String name, Type type, EClass eClass) {
		InputPin newValue = (InputPin) create(eClass);
		setValue(newValue);
		if (name != null)
			newValue.setName(name);
		if (type != null)
			newValue.setType(type);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createValue(String name, Type type) {
		return createValue(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics, Map context) {
		return WriteVariableActionOperations.validateSameType(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return WriteVariableActionOperations.validateMultiplicity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				return basicSetValue(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				return getName();
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.WRITE_VARIABLE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				if (resolve)
					return getVariable();
				return basicGetVariable();
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				setVariable((Variable) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				setValue((InputPin) newValue);
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				setVariable((Variable) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				setValue((InputPin) null);
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				return isSetName();
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.WRITE_VARIABLE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				return variable != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				return value != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{UMLPackage.WRITE_VARIABLE_ACTION__VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.WRITE_VARIABLE_ACTION__VALUE);
	}

} //WriteVariableActionImpl
