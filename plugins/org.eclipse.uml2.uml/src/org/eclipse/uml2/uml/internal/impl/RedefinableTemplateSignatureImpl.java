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
 * $Id: RedefinableTemplateSignatureImpl.java,v 1.4 2005/11/23 13:27:43 khussey Exp $
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RedefinableTemplateSignatureOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateSignatureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getExtendedSignatures <em>Extended Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getInheritedParameters <em>Inherited Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RedefinableTemplateSignatureImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl
		extends RedefinableElementImpl
		implements RedefinableTemplateSignature {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableTemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getRedefinableTemplateSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(
					Element.class,
					this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT,
					new int[]{
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getParameters() {
		List parameter = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER);
		if (parameter == null) {
			eVirtualSet(
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER,
				parameter = new SupersetEObjectResolvingEList(
					TemplateParameter.class,
					this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER,
					new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER}));
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE)
			return null;
		return (TemplateableElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newTemplate))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject) newTemplate).eInverseAdd(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
					TemplateableElement.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newTemplate,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE,
				newTemplate, newTemplate));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedParameters() {
		List ownedParameter = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER);
		if (ownedParameter == null) {
			eVirtualSet(
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				ownedParameter = new SubsetEObjectContainmentWithInverseEList(
					TemplateParameter.class,
					this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER,
					new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER},
					UMLPackage.TEMPLATE_PARAMETER__SIGNATURE));
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter(EClass eClass) {
		TemplateParameter newOwnedParameter = (TemplateParameter) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter() {
		TemplateParameter newOwnedParameter = UMLFactory.eINSTANCE
			.createTemplateParameter();
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class,
					this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT,
					new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinitionContexts() {
		List redefinitionContext = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT);
		if (redefinitionContext == null) {
			eVirtualSet(
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT,
				redefinitionContext = new DerivedUnionEObjectEList(
					Classifier.class,
					this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT,
					new int[]{UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER}));
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtendedSignatures() {
		List extendedSignature = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
		if (extendedSignature == null) {
			eVirtualSet(
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE,
				extendedSignature = new EObjectResolvingEList(
					RedefinableTemplateSignature.class,
					this,
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE));
		}
		return extendedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature getExtendedSignature(String name) {
		for (Iterator i = getExtendedSignatures().iterator(); i.hasNext();) {
			RedefinableTemplateSignature extendedSignature = (RedefinableTemplateSignature) i
				.next();
			if (name.equals(extendedSignature.getName())) {
				return extendedSignature;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInheritedParameters() {
		return RedefinableTemplateSignatureOperations
			.getInheritedParameters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier() {
		if (eContainerFeatureID != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER)
			return null;
		return (Classifier) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Classifier newClassifier) {
		if (newClassifier != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER && newClassifier != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newClassifier))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClassifier != null)
				msgs = ((InternalEObject) newClassifier).eInverseAdd(this,
					UMLPackage.CLASSIFIER__OWNED_SIGNATURE, Classifier.class,
					msgs);
			msgs = eBasicSetContainer((InternalEObject) newClassifier,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER,
				newClassifier, newClassifier));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnElements(DiagnosticChain diagnostics, Map context) {
		return TemplateSignatureOperations.validateOwnElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedParameters(DiagnosticChain diagnostics,
			Map context) {
		return RedefinableTemplateSignatureOperations
			.validateInheritedParameters(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableTemplateSignatureOperations.isConsistentWith(this,
			redefinee);
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
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE,
						msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return ((InternalEList) getOwnedParameters()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER,
						msgs);
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
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
					return eBasicSetContainer(null,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE,
						msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return ((InternalEList) getOwnedParameters()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
					return eBasicSetContainer(null,
						UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER,
						msgs);
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
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
							TemplateableElement.class, msgs);
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.CLASSIFIER__OWNED_SIGNATURE,
						Classifier.class, msgs);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER :
				return getOwner();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				return getName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				return getParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				return getTemplate();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				return getExtendedSignatures();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER :
				return getInheritedParameters();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				return getClassifier();
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				getParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				getExtendedSignatures().clear();
				getExtendedSignatures().addAll((Collection) newValue);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				setClassifier((Classifier) newValue);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) null);
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				getExtendedSignatures().clear();
				return;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				setClassifier((Classifier) null);
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
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNER :
				return isSetOwner();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY :
				return eVirtualGet(
					UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION) != null;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
				List parameter = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER);
				return parameter != null && !parameter.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				return getTemplate() != null;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				List extendedSignature = (List) eVirtualGet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
				return extendedSignature != null
					&& !extendedSignature.isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER :
				return !getInheritedParameters().isEmpty();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				return getClassifier() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TemplateSignature.class) {
			switch (derivedFeatureID) {
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER :
					return UMLPackage.TEMPLATE_SIGNATURE__PARAMETER;
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
					return UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE;
				case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == TemplateSignature.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
				case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
				case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		TemplateableElement template = getTemplate();
		if (template != null) {
			return template;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts()
			|| eIsSet(UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER);
	}

} //RedefinableTemplateSignatureImpl
