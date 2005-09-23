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
 * $Id: TimeIntervalImpl.java,v 1.8 2005/09/23 21:22:53 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TimeExpression;
import org.eclipse.uml2.TimeInterval;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TimeIntervalImpl#getMaxes <em>Max</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TimeIntervalImpl#getMins <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeIntervalImpl extends IntervalImpl implements TimeInterval {
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
	protected TimeIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getTimeInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMaxes() {
		if (max == null) {
			max = new EObjectResolvingEList(TimeExpression.class, this, UML2Package.TIME_INTERVAL__MAX);
		}
		return max;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMax(String name) {
		for (Iterator i = getMaxes().iterator(); i.hasNext(); ) {
			TimeExpression max = (TimeExpression) i.next();
			if (name.equals(max.getName())) {
				return max;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMins() {
		if (min == null) {
			min = new EObjectResolvingEList(TimeExpression.class, this, UML2Package.TIME_INTERVAL__MIN);
		}
		return min;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMin(String name) {
		for (Iterator i = getMins().iterator(); i.hasNext(); ) {
			TimeExpression min = (TimeExpression) i.next();
			if (name.equals(min.getName())) {
				return min;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.TIME_INTERVAL__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TIME_INTERVAL__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.TIME_INTERVAL__OWNING_PARAMETER, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.TIME_INTERVAL__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.TIME_INTERVAL__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_INTERVAL__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.TIME_INTERVAL__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.TIME_INTERVAL__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.TIME_INTERVAL__OWNING_PARAMETER, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
				case UML2Package.TIME_INTERVAL__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_INTERVAL__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TIME_INTERVAL__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TIME_INTERVAL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TIME_INTERVAL__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TIME_INTERVAL__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TIME_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.TIME_INTERVAL__NAME:
				return getName();
			case UML2Package.TIME_INTERVAL__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.TIME_INTERVAL__VISIBILITY:
				return getVisibility();
			case UML2Package.TIME_INTERVAL__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.TIME_INTERVAL__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.TIME_INTERVAL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.TIME_INTERVAL__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.TIME_INTERVAL__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.TIME_INTERVAL__MIN:
				return getMins();
			case UML2Package.TIME_INTERVAL__MAX:
				return getMaxes();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_INTERVAL__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_INTERVAL__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_INTERVAL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TIME_INTERVAL__NAME:
				setName((String)newValue);
				return;
			case UML2Package.TIME_INTERVAL__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.TIME_INTERVAL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_INTERVAL__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.TIME_INTERVAL__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.TIME_INTERVAL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.TIME_INTERVAL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.TIME_INTERVAL__MIN:
				getMins().clear();
				getMins().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_INTERVAL__MAX:
				getMaxes().clear();
				getMaxes().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_INTERVAL__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TIME_INTERVAL__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TIME_INTERVAL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.TIME_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.TIME_INTERVAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.TIME_INTERVAL__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.TIME_INTERVAL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.TIME_INTERVAL__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.TIME_INTERVAL__TYPE:
				setType((Type)null);
				return;
			case UML2Package.TIME_INTERVAL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.TIME_INTERVAL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.TIME_INTERVAL__MIN:
				getMins().clear();
				return;
			case UML2Package.TIME_INTERVAL__MAX:
				getMaxes().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_INTERVAL__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TIME_INTERVAL__OWNED_ELEMENT:
				return eIsSet(UML2Package.eINSTANCE.getElement_OwnedComment())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature())
					|| eIsSet(UML2Package.eINSTANCE.getNamedElement_NameExpression());
			case UML2Package.TIME_INTERVAL__OWNER:
				return eIsSet(UML2Package.eINSTANCE.getParameterableElement_OwningParameter());
			case UML2Package.TIME_INTERVAL__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.TIME_INTERVAL__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.TIME_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.TIME_INTERVAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.TIME_INTERVAL__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.TIME_INTERVAL__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.TIME_INTERVAL__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.TIME_INTERVAL__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.TIME_INTERVAL__TYPE:
				return type != null;
			case UML2Package.TIME_INTERVAL__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.TIME_INTERVAL__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.TIME_INTERVAL__MIN:
				return !getMins().isEmpty();
			case UML2Package.TIME_INTERVAL__MAX:
				return !getMaxes().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //TimeIntervalImpl
