/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *
 * $Id: ConnectorImpl.java,v 1.20 2008/04/21 16:32:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConnectorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorImpl#getContracts <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl
		extends FeatureImpl
		implements Connector {

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Association type;

	/**
	 * The cached value of the '{@link #getRedefinedConnectors() <em>Redefined Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> redefinedConnectors;

	/**
	 * The cached value of the '{@link #getEnds() <em>End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> ends;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorKind KIND_EDEFAULT = ConnectorKind.ASSEMBLY_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_EFLAG_OFFSET = 14;

	/**
	 * The flags representing the default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_EFLAG_DEFAULT = KIND_EDEFAULT.ordinal() << KIND_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link ConnectorKind Connector Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final ConnectorKind[] KIND_EFLAG_VALUES = ConnectorKind
		.values();

	/**
	 * The flag representing the value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_EFLAG = 1 << KIND_EFLAG_OFFSET;

	/**
	 * The flag representing whether the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_ESETFLAG = 1 << 15;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> contracts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedefinableElement> getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<RedefinableElement> redefinedElements = (EList<RedefinableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
						redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
							RedefinableElement.class, this,
							UMLPackage.CONNECTOR__REDEFINED_ELEMENT,
							REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.CONNECTOR__REDEFINED_ELEMENT, REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(
				eResource, this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.CONNECTOR__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.CONNECTOR__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Association) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CONNECTOR__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Association newType) {
		Association oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getRedefinedConnectors() {
		if (redefinedConnectors == null) {
			redefinedConnectors = new EObjectResolvingEList<Connector>(
				Connector.class, this,
				UMLPackage.CONNECTOR__REDEFINED_CONNECTOR);
		}
		return redefinedConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getRedefinedConnector(String name) {
		return getRedefinedConnector(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getRedefinedConnector(String name, boolean ignoreCase) {
		redefinedConnectorLoop : for (Connector redefinedConnector : getRedefinedConnectors()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedConnector.getName())
				: name.equals(redefinedConnector.getName())))
				continue redefinedConnectorLoop;
			return redefinedConnector;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnds() {
		if (ends == null) {
			ends = new EObjectContainmentEList.Resolving<ConnectorEnd>(
				ConnectorEnd.class, this, UMLPackage.CONNECTOR__END);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createEnd() {
		ConnectorEnd newEnd = (ConnectorEnd) create(UMLPackage.Literals.CONNECTOR_END);
		getEnds().add(newEnd);
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getKind() {
		return KIND_EFLAG_VALUES[(eFlags & KIND_EFLAG) >>> KIND_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConnectorKind newKind) {
		ConnectorKind oldKind = KIND_EFLAG_VALUES[(eFlags & KIND_EFLAG) >>> KIND_EFLAG_OFFSET];
		if (newKind == null)
			newKind = KIND_EDEFAULT;
		eFlags = eFlags & ~KIND_EFLAG | newKind.ordinal() << KIND_EFLAG_OFFSET;
		boolean oldKindESet = (eFlags & KIND_ESETFLAG) != 0;
		eFlags |= KIND_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR__KIND, oldKind, newKind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		ConnectorKind oldKind = KIND_EFLAG_VALUES[(eFlags & KIND_EFLAG) >>> KIND_EFLAG_OFFSET];
		boolean oldKindESet = (eFlags & KIND_ESETFLAG) != 0;
		eFlags = eFlags & ~KIND_EFLAG | KIND_EFLAG_DEFAULT;
		eFlags &= ~KIND_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.CONNECTOR__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return (eFlags & KIND_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getContracts() {
		if (contracts == null) {
			contracts = new EObjectResolvingEList<Behavior>(Behavior.class,
				this, UMLPackage.CONNECTOR__CONTRACT);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getContract(String name) {
		return getContract(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getContract(String name, boolean ignoreCase, EClass eClass) {
		contractLoop : for (Behavior contract : getContracts()) {
			if (eClass != null && !eClass.isInstance(contract))
				continue contractLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(contract.getName())
				: name.equals(contract.getName())))
				continue contractLoop;
			return contract;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorOperations.validateTypes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompatible(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorOperations.validateCompatible(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoles(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorOperations.validateRoles(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetweenInterfacesPorts(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorOperations.validateBetweenInterfacesPorts(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetweenInterfacePortImplements(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConnectorOperations.validateBetweenInterfacePortImplements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetweenInterfacePortSignature(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConnectorOperations.validateBetweenInterfacePortSignature(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionSignatureCompatible(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConnectorOperations.validateUnionSignatureCompatible(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorOperations.validateAssemblyConnector(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONNECTOR__END :
				return ((InternalEList<?>) getEnds()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTOR__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTOR__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTOR__NAME :
				return getName();
			case UMLPackage.CONNECTOR__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONNECTOR__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONNECTOR__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONNECTOR__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONNECTOR__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CONNECTOR__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CONNECTOR__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONNECTOR__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.CONNECTOR__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				return getRedefinedConnectors();
			case UMLPackage.CONNECTOR__END :
				return getEnds();
			case UMLPackage.CONNECTOR__KIND :
				return getKind();
			case UMLPackage.CONNECTOR__CONTRACT :
				return getContracts();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONNECTOR__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONNECTOR__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONNECTOR__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONNECTOR__IS_STATIC :
				setIsStatic(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONNECTOR__TYPE :
				setType((Association) newValue);
				return;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				getRedefinedConnectors().clear();
				getRedefinedConnectors().addAll(
					(Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.CONNECTOR__END :
				getEnds().clear();
				getEnds().addAll((Collection<? extends ConnectorEnd>) newValue);
				return;
			case UMLPackage.CONNECTOR__KIND :
				setKind((ConnectorKind) newValue);
				return;
			case UMLPackage.CONNECTOR__CONTRACT :
				getContracts().clear();
				getContracts()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTOR__NAME :
				unsetName();
				return;
			case UMLPackage.CONNECTOR__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONNECTOR__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR__TYPE :
				setType((Association) null);
				return;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				getRedefinedConnectors().clear();
				return;
			case UMLPackage.CONNECTOR__END :
				getEnds().clear();
				return;
			case UMLPackage.CONNECTOR__KIND :
				unsetKind();
				return;
			case UMLPackage.CONNECTOR__CONTRACT :
				getContracts().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.CONNECTOR__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTOR__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTOR__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTOR__NAME :
				return isSetName();
			case UMLPackage.CONNECTOR__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONNECTOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTOR__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.CONNECTOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONNECTOR__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CONNECTOR__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CONNECTOR__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CONNECTOR__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.CONNECTOR__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.CONNECTOR__TYPE :
				return type != null;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				return redefinedConnectors != null
					&& !redefinedConnectors.isEmpty();
			case UMLPackage.CONNECTOR__END :
				return ends != null && !ends.isEmpty();
			case UMLPackage.CONNECTOR__KIND :
				return isSetKind();
			case UMLPackage.CONNECTOR__CONTRACT :
				return contracts != null && !contracts.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		if ((eFlags & KIND_ESETFLAG) != 0)
			result
				.append(KIND_EFLAG_VALUES[(eFlags & KIND_EFLAG) >>> KIND_EFLAG_OFFSET]);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{UMLPackage.CONNECTOR__REDEFINED_CONNECTOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.CONNECTOR__REDEFINED_CONNECTOR);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.CONNECTOR__OWNED_COMMENT,
		UMLPackage.CONNECTOR__NAME_EXPRESSION, UMLPackage.CONNECTOR__END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.CONNECTOR__END);
	}

} //ConnectorImpl
