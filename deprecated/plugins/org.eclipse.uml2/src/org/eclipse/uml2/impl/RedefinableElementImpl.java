/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: RedefinableElementImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RedefinableElementImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RedefinableElementImpl#isLeaf <em>Is Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RedefinableElementImpl extends NamedElementImpl implements RedefinableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getRedefinableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * @generated
	 */
	public boolean isLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REDEFINABLE_ELEMENT__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Redefinition Context</b></em>' reference list, a derived union.
	 * @generated
	 */
	public EList getRedefinitionContexts() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext());
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getRedefinitionContext(String unqualifiedName) {
    	for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext(); ) {
    		Classifier namedRedefinitionContext = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinitionContext.getName())) {
    			return namedRedefinitionContext;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinable) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isRedefinitionContextValid(this, redefinable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.RedefinableElement}.
	 * @generated
	 */
	public EList getRedefinedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getRedefinableElement().getEAllOperations().get(35))) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getRedefinableElement().getEAllOperations().get(35),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRedefinableElement().getEAllOperations().get(35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.REDEFINABLE_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.REDEFINABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
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
				case UML2Package.REDEFINABLE_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.REDEFINABLE_ELEMENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.REDEFINABLE_ELEMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.REDEFINABLE_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.REDEFINABLE_ELEMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.REDEFINABLE_ELEMENT__NAME:
				return getName();
			case UML2Package.REDEFINABLE_ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.REDEFINABLE_ELEMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.REDEFINABLE_ELEMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
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
			case UML2Package.REDEFINABLE_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
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
			case UML2Package.REDEFINABLE_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.REDEFINABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.REDEFINABLE_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
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
			case UML2Package.REDEFINABLE_ELEMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.REDEFINABLE_ELEMENT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.REDEFINABLE_ELEMENT__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.REDEFINABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.REDEFINABLE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.REDEFINABLE_ELEMENT__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.REDEFINABLE_ELEMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.REDEFINABLE_ELEMENT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append(isLeaf);
		result.append(')');
		return result.toString();
	}

} //RedefinableElementImpl
