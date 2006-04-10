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
 * $Id: DestroyLinkActionImpl.java,v 1.14 2006/04/10 19:16:20 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destroy Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyLinkActionImpl#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DestroyLinkActionImpl
		extends WriteLinkActionImpl
		implements DestroyLinkAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestroyLinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DESTROY_LINK_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList.Resolving(
				LinkEndDestructionData.class, this,
				UMLPackage.DESTROY_LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createEndData() {
		LinkEndDestructionData newEndData = (LinkEndDestructionData) create(UMLPackage.Literals.LINK_END_DESTRUCTION_DATA);
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndData() {
		return endData != null && !endData.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DESTROY_LINK_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				return getName();
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DESTROY_LINK_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DESTROY_LINK_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DESTROY_LINK_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DESTROY_LINK_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.DESTROY_LINK_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT :
				return getInputs();
			case UMLPackage.DESTROY_LINK_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				return getEndData();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
				return getInputValues();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DESTROY_LINK_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				return isSetName();
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DESTROY_LINK_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DESTROY_LINK_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.DESTROY_LINK_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				return isSetEndData();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
				return inputValues != null && !inputValues.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //DestroyLinkActionImpl
