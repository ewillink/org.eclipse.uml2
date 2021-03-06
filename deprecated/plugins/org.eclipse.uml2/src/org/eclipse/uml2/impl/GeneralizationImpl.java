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
 * $Id: GeneralizationImpl.java,v 1.21 2006/05/26 18:16:44 khussey Exp $
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.GeneralizationSet;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#isSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getGeneralizationSets <em>Generalization Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends DirectedRelationshipImpl implements Generalization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected Classifier general = null;

	/**
	 * The default value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_SUBSTITUTABLE_EFLAG = 1 << 8;

	/**
	 * The cached value of the '{@link #getGeneralizationSets() <em>Generalization Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationSets()
	 * @generated
	 * @ordered
	 */
	protected EList generalizationSets = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList sources = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE, sources = new DerivedUnionEObjectEList(Element.class, this, UML2Package.GENERALIZATION__SOURCE, SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.GENERALIZATION__SOURCE, SOURCE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UML2Package.GENERALIZATION__SPECIFIC);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {UML2Package.GENERALIZATION__SPECIFIC};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList targets = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET, targets = new DerivedUnionEObjectEList(Element.class, this, UML2Package.GENERALIZATION__TARGET, TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.GENERALIZATION__TARGET, TARGET_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.GENERALIZATION__GENERAL);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {UML2Package.GENERALIZATION__GENERAL};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutable() {
		return (eFlags & IS_SUBSTITUTABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstitutable(boolean newIsSubstitutable) {
		boolean oldIsSubstitutable = (eFlags & IS_SUBSTITUTABLE_EFLAG) != 0;
		if (newIsSubstitutable) eFlags |= IS_SUBSTITUTABLE_EFLAG; else eFlags &= ~IS_SUBSTITUTABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, newIsSubstitutable));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecific() {
		if (eContainerFeatureID != UML2Package.GENERALIZATION__SPECIFIC) return null;
		return (Classifier)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecific(Classifier newSpecific, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecific, UML2Package.GENERALIZATION__SPECIFIC, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		if (newSpecific != eInternalContainer() || (eContainerFeatureID != UML2Package.GENERALIZATION__SPECIFIC && newSpecific != null)) {
			if (EcoreUtil.isAncestor(this, newSpecific))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecific != null)
				msgs = ((InternalEObject)newSpecific).eInverseAdd(this, UML2Package.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
			msgs = basicSetSpecific(newSpecific, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERALIZATION__SPECIFIC, newSpecific, newSpecific));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (Classifier)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Classifier newGeneral) {
		Classifier oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERALIZATION__GENERAL, oldGeneral, general));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGeneralizationSets() {
		if (generalizationSets == null) {
			generalizationSets = new EObjectWithInverseResolvingEList.ManyInverse(GeneralizationSet.class, this, UML2Package.GENERALIZATION__GENERALIZATION_SET, UML2Package.GENERALIZATION_SET__GENERALIZATION);
		}
		return generalizationSets;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public GeneralizationSet getGeneralizationSet(String name) {
		return getGeneralizationSet(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getGeneralizationSet(String name, boolean ignoreCase) {
		generalizationSetLoop: for (Iterator i = getGeneralizationSets().iterator(); i.hasNext(); ) {
			GeneralizationSet generalizationSet = (GeneralizationSet) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(generalizationSet.getName()) : name.equals(generalizationSet.getName())))
				continue generalizationSetLoop;
			return generalizationSet;
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.GENERALIZATION__SPECIFIC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecific((Classifier)otherEnd, msgs);
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				return ((InternalEList)getGeneralizationSets()).basicAdd(otherEnd, msgs);
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.GENERALIZATION__SPECIFIC:
				return basicSetSpecific(null, msgs);
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				return ((InternalEList)getGeneralizationSets()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.GENERALIZATION__SPECIFIC:
				return eInternalContainer().eInverseRemove(this, UML2Package.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		Classifier specific = getSpecific();			
		if (specific != null) {
			return specific;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.GENERALIZATION__SPECIFIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.GENERALIZATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.GENERALIZATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.GENERALIZATION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.GENERALIZATION__SOURCE:
				return getSources();
			case UML2Package.GENERALIZATION__TARGET:
				return getTargets();
			case UML2Package.GENERALIZATION__SPECIFIC:
				return getSpecific();
			case UML2Package.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				return isSubstitutable() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				return getGeneralizationSets();
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)newValue);
				return;
			case UML2Package.GENERALIZATION__GENERAL:
				setGeneral((Classifier)newValue);
				return;
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSets().clear();
				getGeneralizationSets().addAll((Collection)newValue);
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)null);
				return;
			case UML2Package.GENERALIZATION__GENERAL:
				setGeneral((Classifier)null);
				return;
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable(IS_SUBSTITUTABLE_EDEFAULT);
				return;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSets().clear();
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
			case UML2Package.GENERALIZATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.GENERALIZATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.GENERALIZATION__OWNER:
				return isSetOwner();
			case UML2Package.GENERALIZATION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.GENERALIZATION__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.GENERALIZATION__SOURCE:
				return isSetSources();
			case UML2Package.GENERALIZATION__TARGET:
				return isSetTargets();
			case UML2Package.GENERALIZATION__SPECIFIC:
				return getSpecific() != null;
			case UML2Package.GENERALIZATION__GENERAL:
				return general != null;
			case UML2Package.GENERALIZATION__IS_SUBSTITUTABLE:
				return ((eFlags & IS_SUBSTITUTABLE_EFLAG) != 0) != IS_SUBSTITUTABLE_EDEFAULT;
			case UML2Package.GENERALIZATION__GENERALIZATION_SET:
				return generalizationSets != null && !generalizationSets.isEmpty();
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
		result.append(" (isSubstitutable: "); //$NON-NLS-1$
		result.append((eFlags & IS_SUBSTITUTABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //GeneralizationImpl
