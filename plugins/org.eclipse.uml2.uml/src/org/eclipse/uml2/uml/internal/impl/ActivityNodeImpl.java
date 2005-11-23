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
 * $Id: ActivityNodeImpl.java,v 1.3 2005/11/23 13:27:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInPartitions <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInInterruptibleRegions <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getRedefinedNodes <em>Redefined Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl
		extends RedefinableElementImpl
		implements ActivityNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInGroups() {
		List inGroup = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__IN_GROUP);
		if (inGroup == null) {
			eVirtualSet(UMLPackage.ACTIVITY_NODE__IN_GROUP,
				inGroup = new DerivedUnionEObjectEList(ActivityGroup.class,
					this, UMLPackage.ACTIVITY_NODE__IN_GROUP, new int[]{
						UMLPackage.ACTIVITY_NODE__IN_PARTITION,
						UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE,
						UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION}));
		}
		return inGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT,
					new int[]{UMLPackage.ACTIVITY_NODE__REDEFINED_NODE}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOutgoings() {
		List outgoing = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__OUTGOING);
		if (outgoing == null) {
			eVirtualSet(UMLPackage.ACTIVITY_NODE__OUTGOING,
				outgoing = new EObjectWithInverseResolvingEList(
					ActivityEdge.class, this,
					UMLPackage.ACTIVITY_NODE__OUTGOING,
					UMLPackage.ACTIVITY_EDGE__SOURCE));
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getOutgoing(String name) {
		for (Iterator i = getOutgoings().iterator(); i.hasNext();) {
			ActivityEdge outgoing = (ActivityEdge) i.next();
			if (name.equals(outgoing.getName())) {
				return outgoing;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInPartitions() {
		List inPartition = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__IN_PARTITION);
		if (inPartition == null) {
			eVirtualSet(UMLPackage.ACTIVITY_NODE__IN_PARTITION,
				inPartition = new EObjectWithInverseResolvingEList.ManyInverse(
					ActivityPartition.class, this,
					UMLPackage.ACTIVITY_NODE__IN_PARTITION,
					UMLPackage.ACTIVITY_PARTITION__NODE));
		}
		return inPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getInPartition(String name) {
		for (Iterator i = getInPartitions().iterator(); i.hasNext();) {
			ActivityPartition inPartition = (ActivityPartition) i.next();
			if (name.equals(inPartition.getName())) {
				return inPartition;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID != UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE)
			return null;
		return (StructuredActivityNode) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newInStructuredNode))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject) newInStructuredNode).eInverseAdd(
					this, UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE,
					StructuredActivityNode.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newInStructuredNode,
				UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE,
				newInStructuredNode, newInStructuredNode));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (eContainerFeatureID != UMLPackage.ACTIVITY_NODE__ACTIVITY)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ACTIVITY_NODE__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newActivity))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject) newActivity).eInverseAdd(this,
					UMLPackage.ACTIVITY__NODE, Activity.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newActivity,
				UMLPackage.ACTIVITY_NODE__ACTIVITY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_NODE__ACTIVITY, newActivity, newActivity));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getIncomings() {
		List incoming = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__INCOMING);
		if (incoming == null) {
			eVirtualSet(UMLPackage.ACTIVITY_NODE__INCOMING,
				incoming = new EObjectWithInverseResolvingEList(
					ActivityEdge.class, this,
					UMLPackage.ACTIVITY_NODE__INCOMING,
					UMLPackage.ACTIVITY_EDGE__TARGET));
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getIncoming(String name) {
		for (Iterator i = getIncomings().iterator(); i.hasNext();) {
			ActivityEdge incoming = (ActivityEdge) i.next();
			if (name.equals(incoming.getName())) {
				return incoming;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInInterruptibleRegions() {
		List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		if (inInterruptibleRegion == null) {
			eVirtualSet(
				UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION,
				inInterruptibleRegion = new EObjectWithInverseResolvingEList.ManyInverse(
					InterruptibleActivityRegion.class, this,
					UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE));
		}
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedNodes() {
		List redefinedNode = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__REDEFINED_NODE);
		if (redefinedNode == null) {
			eVirtualSet(UMLPackage.ACTIVITY_NODE__REDEFINED_NODE,
				redefinedNode = new EObjectResolvingEList(ActivityNode.class,
					this, UMLPackage.ACTIVITY_NODE__REDEFINED_NODE));
		}
		return redefinedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getRedefinedNode(String name) {
		for (Iterator i = getRedefinedNodes().iterator(); i.hasNext();) {
			ActivityNode redefinedNode = (ActivityNode) i.next();
			if (name.equals(redefinedNode.getName())) {
				return redefinedNode;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwned(DiagnosticChain diagnostics, Map context) {
		return ActivityNodeOperations.validateOwned(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnedStructuredNode(DiagnosticChain diagnostics,
			Map context) {
		return ActivityNodeOperations.validateOwnedStructuredNode(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
				case UMLPackage.ACTIVITY_NODE__ACTIVITY :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.ACTIVITY_NODE__ACTIVITY, msgs);
				case UMLPackage.ACTIVITY_NODE__INCOMING :
					return ((InternalEList) getIncomings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicAdd(otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.ACTIVITY_NODE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
					return eBasicSetContainer(null,
						UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
				case UMLPackage.ACTIVITY_NODE__ACTIVITY :
					return eBasicSetContainer(null,
						UMLPackage.ACTIVITY_NODE__ACTIVITY, msgs);
				case UMLPackage.ACTIVITY_NODE__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicRemove(otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE,
						StructuredActivityNode.class, msgs);
				case UMLPackage.ACTIVITY_NODE__ACTIVITY :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.ACTIVITY__NODE, Activity.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_NODE__OWNER :
				return getOwner();
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_NODE__NAME :
				return getName();
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACTIVITY_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
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
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
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
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
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
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACTIVITY_NODE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.ACTIVITY_NODE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				return eVirtualGet(UMLPackage.ACTIVITY_NODE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.ACTIVITY_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACTIVITY_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.ACTIVITY_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.ACTIVITY_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInGroups() {
		return eIsSet(UMLPackage.ACTIVITY_NODE__IN_PARTITION)
			|| eIsSet(UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE)
			|| eIsSet(UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Activity activity = getActivity();
		if (activity != null) {
			return activity;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.ACTIVITY_NODE__ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.ACTIVITY_NODE__REDEFINED_NODE);
	}

} //ActivityNodeImpl
