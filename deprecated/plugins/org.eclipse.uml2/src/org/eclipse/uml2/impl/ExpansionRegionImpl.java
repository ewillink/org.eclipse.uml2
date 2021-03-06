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
 * $Id: ExpansionRegionImpl.java,v 1.21 2006/04/10 20:40:17 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ExpansionKind;
import org.eclipse.uml2.ExpansionNode;
import org.eclipse.uml2.ExpansionRegion;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExpansionRegionImpl#getOutputElements <em>Output Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExpansionRegionImpl#getInputElements <em>Input Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.PARALLEL_LITERAL;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ExpansionKind mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputElements() <em>Output Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElements()
	 * @generated
	 * @ordered
	 */
	protected EList outputElements = null;

	/**
	 * The cached value of the '{@link #getInputElements() <em>Input Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElements()
	 * @generated
	 * @ordered
	 */
	protected EList inputElements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.EXPANSION_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ExpansionKind newMode) {
		ExpansionKind oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXPANSION_REGION__MODE, oldMode, mode));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputElements() {
		if (outputElements == null) {
			outputElements = new EObjectWithInverseResolvingEList(ExpansionNode.class, this, UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT, UML2Package.EXPANSION_NODE__REGION_AS_OUTPUT);
		}
		return outputElements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ExpansionNode getOutputElement(String name) {
		return getOutputElement(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getOutputElement(String name, boolean ignoreCase) {
		outputElementLoop: for (Iterator i = getOutputElements().iterator(); i.hasNext(); ) {
			ExpansionNode outputElement = (ExpansionNode) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(outputElement.getName()) : name.equals(outputElement.getName())))
				continue outputElementLoop;
			return outputElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputElements() {
		if (inputElements == null) {
			inputElements = new EObjectWithInverseResolvingEList(ExpansionNode.class, this, UML2Package.EXPANSION_REGION__INPUT_ELEMENT, UML2Package.EXPANSION_NODE__REGION_AS_INPUT);
		}
		return inputElements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ExpansionNode getInputElement(String name) {
		return getInputElement(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getInputElement(String name, boolean ignoreCase) {
		inputElementLoop: for (Iterator i = getInputElements().iterator(); i.hasNext(); ) {
			ExpansionNode inputElement = (ExpansionNode) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(inputElement.getName()) : name.equals(inputElement.getName())))
				continue inputElementLoop;
			return inputElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.EXPANSION_REGION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.EXPANSION_REGION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OUTGOING:
				return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__INCOMING:
				return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__HANDLER:
				return ((InternalEList)getHandlers()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__ACTIVITY_GROUP_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityGroup_activity((Activity)otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__VARIABLE:
				return ((InternalEList)getVariables()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__CONTAINED_EDGE:
				return ((InternalEList)getContainedEdges()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return ((InternalEList)getOutputElements()).basicAdd(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return ((InternalEList)getInputElements()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.EXPANSION_REGION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.EXPANSION_REGION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.EXPANSION_REGION__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.EXPANSION_REGION__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.EXPANSION_REGION__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
			case UML2Package.EXPANSION_REGION__VARIABLE:
				return ((InternalEList)getVariables()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__CONTAINED_EDGE:
				return ((InternalEList)getContainedEdges()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return ((InternalEList)getOutputElements()).basicRemove(otherEnd, msgs);
			case UML2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return ((InternalEList)getInputElements()).basicRemove(otherEnd, msgs);
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
			case UML2Package.EXPANSION_REGION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXPANSION_REGION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXPANSION_REGION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXPANSION_REGION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXPANSION_REGION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.EXPANSION_REGION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.EXPANSION_REGION__NAME:
				return getName();
			case UML2Package.EXPANSION_REGION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.EXPANSION_REGION__VISIBILITY:
				return getVisibility();
			case UML2Package.EXPANSION_REGION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.EXPANSION_REGION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.EXPANSION_REGION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.EXPANSION_REGION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXPANSION_REGION__OUTGOING:
				return getOutgoings();
			case UML2Package.EXPANSION_REGION__INCOMING:
				return getIncomings();
			case UML2Package.EXPANSION_REGION__IN_GROUP:
				return getInGroups();
			case UML2Package.EXPANSION_REGION__ACTIVITY:
				return getActivity();
			case UML2Package.EXPANSION_REGION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.EXPANSION_REGION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.EXPANSION_REGION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.EXPANSION_REGION__HANDLER:
				return getHandlers();
			case UML2Package.EXPANSION_REGION__EFFECT:
				return getEffect();
			case UML2Package.EXPANSION_REGION__OUTPUT:
				return getOutputs();
			case UML2Package.EXPANSION_REGION__INPUT:
				return getInputs();
			case UML2Package.EXPANSION_REGION__CONTEXT:
				return getContext();
			case UML2Package.EXPANSION_REGION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.EXPANSION_REGION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.EXPANSION_REGION__MEMBER:
				return getMembers();
			case UML2Package.EXPANSION_REGION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.EXPANSION_REGION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.EXPANSION_REGION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.EXPANSION_REGION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.EXPANSION_REGION__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.EXPANSION_REGION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.EXPANSION_REGION__VARIABLE:
				return getVariables();
			case UML2Package.EXPANSION_REGION__CONTAINED_NODE:
				return getContainedNodes();
			case UML2Package.EXPANSION_REGION__CONTAINED_EDGE:
				return getContainedEdges();
			case UML2Package.EXPANSION_REGION__MUST_ISOLATE:
				return isMustIsolate() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXPANSION_REGION__MODE:
				return getMode();
			case UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return getOutputElements();
			case UML2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return getInputElements();
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
			case UML2Package.EXPANSION_REGION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.EXPANSION_REGION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.EXPANSION_REGION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.EXPANSION_REGION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.EXPANSION_REGION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXPANSION_REGION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.EXPANSION_REGION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.EXPANSION_REGION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.EXPANSION_REGION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.EXPANSION_REGION__VARIABLE:
				getVariables().clear();
				getVariables().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__CONTAINED_NODE:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__CONTAINED_EDGE:
				getContainedEdges().clear();
				getContainedEdges().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__MUST_ISOLATE:
				setMustIsolate(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.EXPANSION_REGION__MODE:
				setMode((ExpansionKind)newValue);
				return;
			case UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElements().clear();
				getOutputElements().addAll((Collection)newValue);
				return;
			case UML2Package.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElements().clear();
				getInputElements().addAll((Collection)newValue);
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
			case UML2Package.EXPANSION_REGION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.EXPANSION_REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.EXPANSION_REGION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.EXPANSION_REGION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.EXPANSION_REGION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.EXPANSION_REGION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.EXPANSION_REGION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.EXPANSION_REGION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.EXPANSION_REGION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.EXPANSION_REGION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.EXPANSION_REGION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.EXPANSION_REGION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.EXPANSION_REGION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.EXPANSION_REGION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.EXPANSION_REGION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.EXPANSION_REGION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.EXPANSION_REGION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.EXPANSION_REGION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.EXPANSION_REGION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.EXPANSION_REGION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.EXPANSION_REGION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.EXPANSION_REGION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.EXPANSION_REGION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.EXPANSION_REGION__VARIABLE:
				getVariables().clear();
				return;
			case UML2Package.EXPANSION_REGION__CONTAINED_NODE:
				getContainedNodes().clear();
				return;
			case UML2Package.EXPANSION_REGION__CONTAINED_EDGE:
				getContainedEdges().clear();
				return;
			case UML2Package.EXPANSION_REGION__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UML2Package.EXPANSION_REGION__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElements().clear();
				return;
			case UML2Package.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElements().clear();
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
			case UML2Package.EXPANSION_REGION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXPANSION_REGION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.EXPANSION_REGION__OWNER:
				return isSetOwner();
			case UML2Package.EXPANSION_REGION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.EXPANSION_REGION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.EXPANSION_REGION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.EXPANSION_REGION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.EXPANSION_REGION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.EXPANSION_REGION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.EXPANSION_REGION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.EXPANSION_REGION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.EXPANSION_REGION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.EXPANSION_REGION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.EXPANSION_REGION__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.EXPANSION_REGION__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.EXPANSION_REGION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.EXPANSION_REGION__ACTIVITY:
				return isSetActivity();
			case UML2Package.EXPANSION_REGION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.EXPANSION_REGION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.EXPANSION_REGION__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.EXPANSION_REGION__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.EXPANSION_REGION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.EXPANSION_REGION__OUTPUT:
				return isSetOutputs();
			case UML2Package.EXPANSION_REGION__INPUT:
				return isSetInputs();
			case UML2Package.EXPANSION_REGION__CONTEXT:
				return getContext() != null;
			case UML2Package.EXPANSION_REGION__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.EXPANSION_REGION__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.EXPANSION_REGION__MEMBER:
				return isSetMembers();
			case UML2Package.EXPANSION_REGION__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.EXPANSION_REGION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.EXPANSION_REGION__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.EXPANSION_REGION__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.EXPANSION_REGION__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.EXPANSION_REGION__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.EXPANSION_REGION__VARIABLE:
				return variables != null && !variables.isEmpty();
			case UML2Package.EXPANSION_REGION__CONTAINED_NODE:
				return isSetContainedNodes();
			case UML2Package.EXPANSION_REGION__CONTAINED_EDGE:
				return isSetContainedEdges();
			case UML2Package.EXPANSION_REGION__MUST_ISOLATE:
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UML2Package.EXPANSION_REGION__MODE:
				return mode != MODE_EDEFAULT;
			case UML2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return outputElements != null && !outputElements.isEmpty();
			case UML2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return inputElements != null && !inputElements.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mode: "); //$NON-NLS-1$
		result.append(mode);
		result.append(')');
		return result.toString();
	}


} //ExpansionRegionImpl
