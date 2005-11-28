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
 * $Id: ArtifactImpl.java,v 1.5 2005/11/28 20:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getNestedArtifacts <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ArtifactImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl
		extends ClassifierImpl
		implements Artifact {

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.ARTIFACT__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.ARTIFACT__OWNED_MEMBER, new int[]{
						UMLPackage.ARTIFACT__OWNED_RULE,
						UMLPackage.ARTIFACT__OWNED_USE_CASE,
						UMLPackage.ARTIFACT__NESTED_ARTIFACT,
						UMLPackage.ARTIFACT__OWNED_OPERATION,
						UMLPackage.ARTIFACT__OWNED_ATTRIBUTE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ARTIFACT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ARTIFACT__OWNED_ELEMENT, new int[]{
						UMLPackage.ARTIFACT__OWNED_COMMENT,
						UMLPackage.ARTIFACT__NAME_EXPRESSION,
						UMLPackage.ARTIFACT__ELEMENT_IMPORT,
						UMLPackage.ARTIFACT__PACKAGE_IMPORT,
						UMLPackage.ARTIFACT__OWNED_MEMBER,
						UMLPackage.ARTIFACT__TEMPLATE_BINDING,
						UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.ARTIFACT__GENERALIZATION,
						UMLPackage.ARTIFACT__SUBSTITUTION,
						UMLPackage.ARTIFACT__COLLABORATION_USE,
						UMLPackage.ARTIFACT__OWNED_SIGNATURE,
						UMLPackage.ARTIFACT__MANIFESTATION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFeatures() {
		List feature = (List) eVirtualGet(UMLPackage.ARTIFACT__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.ARTIFACT__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.ARTIFACT__FEATURE, new int[]{
						UMLPackage.ARTIFACT__ATTRIBUTE,
						UMLPackage.ARTIFACT__OWNED_OPERATION}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAttributes() {
		List attribute = (List) eVirtualGet(UMLPackage.ARTIFACT__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.ARTIFACT__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.ARTIFACT__ATTRIBUTE,
					new int[]{UMLPackage.ARTIFACT__OWNED_ATTRIBUTE}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClientDependencies() {
		List clientDependency = (List) eVirtualGet(UMLPackage.ARTIFACT__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.ARTIFACT__CLIENT_DEPENDENCY,
				clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this,
					UMLPackage.ARTIFACT__CLIENT_DEPENDENCY, new int[]{
						UMLPackage.ARTIFACT__SUBSTITUTION,
						UMLPackage.ARTIFACT__MANIFESTATION},
					UMLPackage.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return (String) eVirtualGet(UMLPackage.ARTIFACT__FILE_NAME,
			FILE_NAME_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		newFileName = newFileName == null
			? FILE_NAME_EDEFAULT
			: newFileName;
		String fileName = newFileName;
		Object oldFileName = eVirtualSet(UMLPackage.ARTIFACT__FILE_NAME,
			fileName);
		boolean isSetChange = oldFileName == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ARTIFACT__FILE_NAME, isSetChange
					? FILE_NAME_EDEFAULT
					: oldFileName, fileName, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileName() {
		Object oldFileName = eVirtualUnset(UMLPackage.ARTIFACT__FILE_NAME);
		boolean isSetChange = oldFileName != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.ARTIFACT__FILE_NAME, isSetChange
					? oldFileName
					: FILE_NAME_EDEFAULT, FILE_NAME_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileName() {
		return eVirtualIsSet(UMLPackage.ARTIFACT__FILE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNestedArtifacts() {
		List nestedArtifact = (List) eVirtualGet(UMLPackage.ARTIFACT__NESTED_ARTIFACT);
		if (nestedArtifact == null) {
			eVirtualSet(UMLPackage.ARTIFACT__NESTED_ARTIFACT,
				nestedArtifact = new EObjectContainmentEList(Artifact.class,
					this, UMLPackage.ARTIFACT__NESTED_ARTIFACT));
		}
		return nestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createNestedArtifact(EClass eClass) {
		Artifact newNestedArtifact = (Artifact) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getNestedArtifacts().add(newNestedArtifact);
		return newNestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createNestedArtifact() {
		Artifact newNestedArtifact = UMLFactory.eINSTANCE.createArtifact();
		getNestedArtifacts().add(newNestedArtifact);
		return newNestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getNestedArtifact(String name) {
		for (Iterator i = getNestedArtifacts().iterator(); i.hasNext();) {
			Artifact nestedArtifact = (Artifact) i.next();
			if (name.equals(nestedArtifact.getName())) {
				return nestedArtifact;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getManifestations() {
		List manifestation = (List) eVirtualGet(UMLPackage.ARTIFACT__MANIFESTATION);
		if (manifestation == null) {
			eVirtualSet(UMLPackage.ARTIFACT__MANIFESTATION,
				manifestation = new SubsetEObjectContainmentEList(
					Manifestation.class, this,
					UMLPackage.ARTIFACT__MANIFESTATION,
					new int[]{UMLPackage.ARTIFACT__CLIENT_DEPENDENCY}));
		}
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation createManifestation() {
		Manifestation newManifestation = UMLFactory.eINSTANCE
			.createManifestation();
		getManifestations().add(newManifestation);
		return newManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation getManifestation(String name) {
		for (Iterator i = getManifestations().iterator(); i.hasNext();) {
			Manifestation manifestation = (Manifestation) i.next();
			if (name.equals(manifestation.getName())) {
				return manifestation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedOperations() {
		List ownedOperation = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(UMLPackage.ARTIFACT__OWNED_OPERATION,
				ownedOperation = new EObjectContainmentEList(Operation.class,
					this, UMLPackage.ARTIFACT__OWNED_OPERATION));
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation() {
		Operation newOwnedOperation = UMLFactory.eINSTANCE.createOperation();
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name) {
		for (Iterator i = getOwnedOperations().iterator(); i.hasNext();) {
			Operation ownedOperation = (Operation) i.next();
			if (name.equals(ownedOperation.getName())) {
				return ownedOperation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedAttributes() {
		List ownedAttribute = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentEList(Property.class,
					this, UMLPackage.ARTIFACT__OWNED_ATTRIBUTE));
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute() {
		Property newOwnedAttribute = UMLFactory.eINSTANCE.createProperty();
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name) {
		for (Iterator i = getOwnedAttributes().iterator(); i.hasNext();) {
			Property ownedAttribute = (Property) i.next();
			if (name.equals(ownedAttribute.getName())) {
				return ownedAttribute;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.ARTIFACT__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ARTIFACT__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.ARTIFACT__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ARTIFACT__OWNED_SIGNATURE, null, msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ARTIFACT__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				return ((InternalEList) getNestedArtifacts()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__MANIFESTATION :
				return ((InternalEList) getManifestations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ARTIFACT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ARTIFACT__OWNER :
				return getOwner();
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ARTIFACT__NAME :
				return getName();
			case UMLPackage.ARTIFACT__VISIBILITY :
				return getVisibility();
			case UMLPackage.ARTIFACT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ARTIFACT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ARTIFACT__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ARTIFACT__MEMBER :
				return getMembers();
			case UMLPackage.ARTIFACT__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ARTIFACT__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ARTIFACT__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ARTIFACT__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ARTIFACT__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ARTIFACT__PACKAGE :
				return getPackage();
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ARTIFACT__FEATURE :
				return getFeatures();
			case UMLPackage.ARTIFACT__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ARTIFACT__GENERAL :
				return getGenerals();
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ARTIFACT__USE_CASE :
				return getUseCases();
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ARTIFACT__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ARTIFACT__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ARTIFACT__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.ARTIFACT__FILE_NAME :
				return getFileName();
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				return getNestedArtifacts();
			case UMLPackage.ARTIFACT__MANIFESTATION :
				return getManifestations();
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ARTIFACT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ARTIFACT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.ARTIFACT__FILE_NAME :
				setFileName((String) newValue);
				return;
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				getNestedArtifacts().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__MANIFESTATION :
				getManifestations().clear();
				getManifestations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ARTIFACT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ARTIFACT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ARTIFACT__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ARTIFACT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ARTIFACT__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ARTIFACT__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ARTIFACT__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ARTIFACT__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.ARTIFACT__FILE_NAME :
				unsetFileName();
				return;
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				return;
			case UMLPackage.ARTIFACT__MANIFESTATION :
				getManifestations().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
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
			case UMLPackage.ARTIFACT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ARTIFACT__OWNER :
				return isSetOwner();
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ARTIFACT__NAME :
				String name = (String) eVirtualGet(UMLPackage.ARTIFACT__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ARTIFACT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ARTIFACT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ARTIFACT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ARTIFACT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ARTIFACT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ARTIFACT__NAME_EXPRESSION) != null;
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.ARTIFACT__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.ARTIFACT__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.ARTIFACT__MEMBER :
				return isSetMembers();
			case UMLPackage.ARTIFACT__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ARTIFACT__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ARTIFACT__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ARTIFACT__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ARTIFACT__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ARTIFACT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ARTIFACT__PACKAGE :
				return getPackage() != null;
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.ARTIFACT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.ARTIFACT__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.ARTIFACT__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.ARTIFACT__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.ARTIFACT__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.ARTIFACT__FEATURE :
				return isSetFeatures();
			case UMLPackage.ARTIFACT__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.ARTIFACT__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.ARTIFACT__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.ARTIFACT__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.ARTIFACT__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.ARTIFACT__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ARTIFACT__REPRESENTATION :
				return eVirtualGet(UMLPackage.ARTIFACT__REPRESENTATION) != null;
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.ARTIFACT__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.ARTIFACT__OWNED_SIGNATURE) != null;
			case UMLPackage.ARTIFACT__FILE_NAME :
				return isSetFileName();
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				List nestedArtifact = (List) eVirtualGet(UMLPackage.ARTIFACT__NESTED_ARTIFACT);
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case UMLPackage.ARTIFACT__MANIFESTATION :
				List manifestation = (List) eVirtualGet(UMLPackage.ARTIFACT__MANIFESTATION);
				return manifestation != null && !manifestation.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.ARTIFACT__FILE_NAME))
			result.append(eVirtualGet(UMLPackage.ARTIFACT__FILE_NAME));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.ARTIFACT__NESTED_ARTIFACT)
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_OPERATION)
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ARTIFACT__MANIFESTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.ARTIFACT__OWNED_ATTRIBUTE);
	}

} //ArtifactImpl
