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
 * $Id: InterruptibleActivityRegionImpl.java,v 1.17 2006/04/10 20:40:19 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.InterruptibleActivityRegion;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InterruptibleActivityRegionImpl#getInterruptingEdges <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterruptibleActivityRegionImpl#getContainedNodes <em>Contained Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl extends ActivityGroupImpl implements InterruptibleActivityRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getInterruptingEdges() <em>Interrupting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList interruptingEdges = null;

	/**
	 * The cached value of the '{@link #getContainedNodes() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList containedNodes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.INTERRUPTIBLE_ACTIVITY_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInterruptingEdges() {
		if (interruptingEdges == null) {
			interruptingEdges = new EObjectWithInverseResolvingEList(ActivityEdge.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, UML2Package.ACTIVITY_EDGE__INTERRUPTS);
		}
		return interruptingEdges;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getInterruptingEdge(String name) {
		return getInterruptingEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getInterruptingEdge(String name, boolean ignoreCase, EClass eClass) {
		interruptingEdgeLoop: for (Iterator i = getInterruptingEdges().iterator(); i.hasNext(); ) {
			ActivityEdge interruptingEdge = (ActivityEdge) i.next();
			if (eClass != null && !eClass.isInstance(interruptingEdge))
				continue interruptingEdgeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(interruptingEdge.getName()) : name.equals(interruptingEdge.getName())))
				continue interruptingEdgeLoop;
			return interruptingEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedNodes() {
		if (containedNodes == null) {
			containedNodes = new EObjectWithInverseResolvingEList.ManyInverse(ActivityNode.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		}
		return containedNodes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return containedNodes != null && !containedNodes.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityGroup_activity((Activity)otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList)getInterruptingEdges()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicAdd(otherEnd, msgs);
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList)getInterruptingEdges()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getContainedNode(String name) {
		return getContainedNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name, boolean ignoreCase, EClass eClass) {
		containedNodeLoop: for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
			ActivityNode containedNode = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(containedNode))
				continue containedNodeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedNode.getName()) : name.equals(containedNode.getName())))
				continue containedNodeLoop;
			return containedNode;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return getInterruptingEdges();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return getContainedNodes();
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdges().clear();
				getInterruptingEdges().addAll((Collection)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdges().clear();
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNodes().clear();
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNER:
				return isSetOwner();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return interruptingEdges != null && !interruptingEdges.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return isSetContainedNodes();
		}
		return eDynamicIsSet(featureID);
	}


} //InterruptibleActivityRegionImpl
