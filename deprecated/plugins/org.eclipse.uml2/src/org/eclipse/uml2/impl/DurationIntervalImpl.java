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
 * $Id: DurationIntervalImpl.java,v 1.18 2006/04/10 20:40:17 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.Duration;
import org.eclipse.uml2.DurationInterval;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DurationIntervalImpl#getMaxes <em>Max</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DurationIntervalImpl#getMins <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationIntervalImpl extends IntervalImpl implements DurationInterval {
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
	protected DurationIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.DURATION_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMins() {
		if (mins == null) {
			mins = new EObjectResolvingEList(Duration.class, this, UML2Package.DURATION_INTERVAL__MIN);
		}
		return mins;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMins() {
		return mins != null && !mins.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.DURATION_INTERVAL__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DURATION_INTERVAL__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DURATION_INTERVAL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DURATION_INTERVAL__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DURATION_INTERVAL__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DURATION_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DURATION_INTERVAL__NAME:
				return getName();
			case UML2Package.DURATION_INTERVAL__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DURATION_INTERVAL__VISIBILITY:
				return getVisibility();
			case UML2Package.DURATION_INTERVAL__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DURATION_INTERVAL__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DURATION_INTERVAL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.DURATION_INTERVAL__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.DURATION_INTERVAL__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.DURATION_INTERVAL__MIN:
				return getMins();
			case UML2Package.DURATION_INTERVAL__MAX:
				return getMaxes();
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
			case UML2Package.DURATION_INTERVAL__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DURATION_INTERVAL__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DURATION_INTERVAL__OWNER:
				return isSetOwner();
			case UML2Package.DURATION_INTERVAL__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.DURATION_INTERVAL__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.DURATION_INTERVAL__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DURATION_INTERVAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DURATION_INTERVAL__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.DURATION_INTERVAL__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.DURATION_INTERVAL__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.DURATION_INTERVAL__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DURATION_INTERVAL__TYPE:
				return type != null;
			case UML2Package.DURATION_INTERVAL__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.DURATION_INTERVAL__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.DURATION_INTERVAL__MIN:
				return isSetMins();
			case UML2Package.DURATION_INTERVAL__MAX:
				return isSetMaxes();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMin(String name) {
		return getMin(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMin(String name, boolean ignoreCase) {
		minLoop: for (Iterator i = getMins().iterator(); i.hasNext(); ) {
			Duration min = (Duration) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(min.getName()) : name.equals(min.getName())))
				continue minLoop;
			return min;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMaxes() {
		if (maxes == null) {
			maxes = new EObjectResolvingEList(Duration.class, this, UML2Package.DURATION_INTERVAL__MAX);
		}
		return maxes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxes() {
		return maxes != null && !maxes.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getMax(String name) {
		return getMax(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMax(String name, boolean ignoreCase) {
		maxLoop: for (Iterator i = getMaxes().iterator(); i.hasNext(); ) {
			Duration max = (Duration) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(max.getName()) : name.equals(max.getName())))
				continue maxLoop;
			return max;
		}
		return null;
	}

} //DurationIntervalImpl
