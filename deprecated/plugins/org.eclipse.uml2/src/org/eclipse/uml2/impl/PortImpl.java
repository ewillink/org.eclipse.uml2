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
 * $Id: PortImpl.java,v 1.21 2005/11/23 13:25:33 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.ProtocolStateMachine;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.PortOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#isBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#isService <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#getRequireds <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#getRedefinedPorts <em>Redefined Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends PropertyImpl implements Port {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BEHAVIOR_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_BEHAVIOR_EFLAG = 1 << 15;

	/**
	 * The default value of the '{@link #isService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVICE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_SERVICE_EFLAG = 1 << 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
		eFlags |= IS_SERVICE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBehavior() {
		return (eFlags & IS_BEHAVIOR_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(boolean newIsBehavior) {
		boolean oldIsBehavior = (eFlags & IS_BEHAVIOR_EFLAG) != 0;
		if (newIsBehavior) eFlags |= IS_BEHAVIOR_EFLAG; else eFlags &= ~IS_BEHAVIOR_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PORT__IS_BEHAVIOR, oldIsBehavior, newIsBehavior));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isService() {
		return (eFlags & IS_SERVICE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(boolean newIsService) {
		boolean oldIsService = (eFlags & IS_SERVICE_EFLAG) != 0;
		if (newIsService) eFlags |= IS_SERVICE_EFLAG; else eFlags &= ~IS_SERVICE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PORT__IS_SERVICE, oldIsService, newIsService));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRequireds() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getPort_Required());

			if (result == null) {
				EList requireds = PortOperations.getRequireds(this);
				cache.put(this, UML2Package.eINSTANCE.getPort_Required(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getPort_Required(), requireds
							.size(), requireds.toArray()));
			}

			return result;
		}

		EList requireds = PortOperations.getRequireds(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getPort_Required(), requireds.size(), requireds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRequired(String name) {
		for (Iterator i = getRequireds().iterator(); i.hasNext(); ) {
			Interface required = (Interface) i.next();
			if (name.equals(required.getName())) {
				return required;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedPorts() {
		EList redefinedPort = (EList)eVirtualGet(UML2Package.PORT__REDEFINED_PORT);
		if (redefinedPort == null) {
			eVirtualSet(UML2Package.PORT__REDEFINED_PORT, redefinedPort = new EObjectResolvingEList(Port.class, this, UML2Package.PORT__REDEFINED_PORT));
		}
		return redefinedPort;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRedefinedPort(String name) {
		for (Iterator i = getRedefinedPorts().iterator(); i.hasNext(); ) {
			Port redefinedPort = (Port) i.next();
			if (name.equals(redefinedPort.getName())) {
				return redefinedPort;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getProvideds() {
		CacheAdapter cache = getCacheAdapter();
		
		if (cache != null) {
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getPort_Provided());

			if (result == null) {
				EList provideds = PortOperations.getProvideds(this);
				cache.put(this, UML2Package.eINSTANCE.getPort_Provided(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getPort_Provided(), provideds
							.size(), provideds.toArray()));
			}

			return result;
		}

		EList provideds = PortOperations.getProvideds(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getPort_Provided(), provideds.size(), provideds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvided(String name) {
		for (Iterator i = getProvideds().iterator(); i.hasNext(); ) {
			Interface provided = (Interface) i.next();
			if (name.equals(provided.getName())) {
				return provided;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		ProtocolStateMachine protocol = (ProtocolStateMachine)eVirtualGet(UML2Package.PORT__PROTOCOL);
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (ProtocolStateMachine)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				eVirtualSet(UML2Package.PORT__PROTOCOL, protocol);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PORT__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetProtocol() {
		return (ProtocolStateMachine)eVirtualGet(UML2Package.PORT__PROTOCOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine protocol = newProtocol;
		Object oldProtocol = eVirtualSet(UML2Package.PORT__PROTOCOL, protocol);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PORT__PROTOCOL, oldProtocol == EVIRTUAL_NO_VALUE ? null : oldProtocol, protocol));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PORT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PORT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PORT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PORT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PORT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PORT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PORT__NAME:
				return getName();
			case UML2Package.PORT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PORT__VISIBILITY:
				return getVisibility();
			case UML2Package.PORT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PORT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PORT__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.PORT__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.PORT__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.PORT__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__LOWER:
				return new Integer(getLower());
			case UML2Package.PORT__UPPER:
				return new Integer(getUpper());
			case UML2Package.PORT__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.PORT__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.PORT__IS_READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PORT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PORT__END:
				return getEnds();
			case UML2Package.PORT__DEPLOYMENT:
				return getDeployments();
			case UML2Package.PORT__DEPLOYED_ELEMENT:
				return getDeployedElements();
			case UML2Package.PORT__DEFAULT:
				return getDefault();
			case UML2Package.PORT__IS_COMPOSITE:
				return isComposite() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__IS_DERIVED:
				return isDerived() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__CLASS_:
				return getClass_();
			case UML2Package.PORT__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case UML2Package.PORT__IS_DERIVED_UNION:
				return isDerivedUnion() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__OWNING_ASSOCIATION:
				return getOwningAssociation();
			case UML2Package.PORT__REDEFINED_PROPERTY:
				return getRedefinedProperties();
			case UML2Package.PORT__SUBSETTED_PROPERTY:
				return getSubsettedProperties();
			case UML2Package.PORT__DATATYPE:
				return getDatatype();
			case UML2Package.PORT__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case UML2Package.PORT__AGGREGATION:
				return getAggregation();
			case UML2Package.PORT__DEFAULT_VALUE:
				return getDefaultValue();
			case UML2Package.PORT__QUALIFIER:
				return getQualifiers();
			case UML2Package.PORT__ASSOCIATION_END:
				return getAssociationEnd();
			case UML2Package.PORT__IS_BEHAVIOR:
				return isBehavior() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__IS_SERVICE:
				return isService() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PORT__REQUIRED:
				return getRequireds();
			case UML2Package.PORT__REDEFINED_PORT:
				return getRedefinedPorts();
			case UML2Package.PORT__PROVIDED:
				return getProvideds();
			case UML2Package.PORT__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
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
			case UML2Package.PORT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PORT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PORT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PORT__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.PORT__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.PORT__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.PORT__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PORT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PORT__END:
				getEnds().clear();
				getEnds().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__IS_DERIVED_UNION:
				setIsDerivedUnion(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
				return;
			case UML2Package.PORT__REDEFINED_PROPERTY:
				getRedefinedProperties().clear();
				getRedefinedProperties().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__SUBSETTED_PROPERTY:
				getSubsettedProperties().clear();
				getSubsettedProperties().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case UML2Package.PORT__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case UML2Package.PORT__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case UML2Package.PORT__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case UML2Package.PORT__QUALIFIER:
				getQualifiers().clear();
				getQualifiers().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__ASSOCIATION_END:
				setAssociationEnd((Property)newValue);
				return;
			case UML2Package.PORT__IS_BEHAVIOR:
				setIsBehavior(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__IS_SERVICE:
				setIsService(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PORT__REDEFINED_PORT:
				getRedefinedPorts().clear();
				getRedefinedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)newValue);
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
			case UML2Package.PORT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PORT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PORT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PORT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PORT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PORT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PORT__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.PORT__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.PORT__TYPE:
				setType((Type)null);
				return;
			case UML2Package.PORT__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.PORT__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.PORT__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.PORT__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.PORT__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UML2Package.PORT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PORT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PORT__END:
				getEnds().clear();
				return;
			case UML2Package.PORT__DEPLOYMENT:
				getDeployments().clear();
				return;
			case UML2Package.PORT__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2Package.PORT__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UML2Package.PORT__OWNING_ASSOCIATION:
				setOwningAssociation((Association)null);
				return;
			case UML2Package.PORT__REDEFINED_PROPERTY:
				getRedefinedProperties().clear();
				return;
			case UML2Package.PORT__SUBSETTED_PROPERTY:
				getSubsettedProperties().clear();
				return;
			case UML2Package.PORT__DATATYPE:
				setDatatype((DataType)null);
				return;
			case UML2Package.PORT__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case UML2Package.PORT__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UML2Package.PORT__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case UML2Package.PORT__QUALIFIER:
				getQualifiers().clear();
				return;
			case UML2Package.PORT__ASSOCIATION_END:
				setAssociationEnd((Property)null);
				return;
			case UML2Package.PORT__IS_BEHAVIOR:
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case UML2Package.PORT__IS_SERVICE:
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case UML2Package.PORT__REDEFINED_PORT:
				getRedefinedPorts().clear();
				return;
			case UML2Package.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)null);
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
			case UML2Package.PORT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PORT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PORT__OWNER:
				return isSetOwner();
			case UML2Package.PORT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.PORT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PORT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.PORT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PORT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.PORT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.PORT__NAME:
				String name = (String)eVirtualGet(UML2Package.PORT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PORT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PORT__VISIBILITY:
				return eVirtualGet(UML2Package.PORT__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.PORT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.PORT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PORT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.PORT__NAME_EXPRESSION) != null;
			case UML2Package.PORT__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.PORT__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.PORT__FEATURING_CLASSIFIER:
				return isSetFeaturingClassifiers();
			case UML2Package.PORT__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UML2Package.PORT__TYPE:
				return eVirtualGet(UML2Package.PORT__TYPE) != null;
			case UML2Package.PORT__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UML2Package.PORT__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UML2Package.PORT__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.PORT__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.PORT__UPPER_VALUE:
				return eVirtualGet(UML2Package.PORT__UPPER_VALUE) != null;
			case UML2Package.PORT__LOWER_VALUE:
				return eVirtualGet(UML2Package.PORT__LOWER_VALUE) != null;
			case UML2Package.PORT__IS_READ_ONLY:
				return isSetIsReadOnly();
			case UML2Package.PORT__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.PORT__TEMPLATE_PARAMETER) != null;
			case UML2Package.PORT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PORT__END:
				EList end = (EList)eVirtualGet(UML2Package.PORT__END);
				return end != null && !end.isEmpty();
			case UML2Package.PORT__DEPLOYMENT:
				EList deployment = (EList)eVirtualGet(UML2Package.PORT__DEPLOYMENT);
				return deployment != null && !deployment.isEmpty();
			case UML2Package.PORT__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case UML2Package.PORT__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case UML2Package.PORT__IS_COMPOSITE:
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UML2Package.PORT__IS_DERIVED:
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UML2Package.PORT__CLASS_:
				return getClass_() != null;
			case UML2Package.PORT__OPPOSITE:
				return basicGetOpposite() != null;
			case UML2Package.PORT__IS_DERIVED_UNION:
				return ((eFlags & IS_DERIVED_UNION_EFLAG) != 0) != IS_DERIVED_UNION_EDEFAULT;
			case UML2Package.PORT__OWNING_ASSOCIATION:
				return getOwningAssociation() != null;
			case UML2Package.PORT__REDEFINED_PROPERTY:
				EList redefinedProperty = (EList)eVirtualGet(UML2Package.PORT__REDEFINED_PROPERTY);
				return redefinedProperty != null && !redefinedProperty.isEmpty();
			case UML2Package.PORT__SUBSETTED_PROPERTY:
				EList subsettedProperty = (EList)eVirtualGet(UML2Package.PORT__SUBSETTED_PROPERTY);
				return subsettedProperty != null && !subsettedProperty.isEmpty();
			case UML2Package.PORT__DATATYPE:
				return getDatatype() != null;
			case UML2Package.PORT__ASSOCIATION:
				return eVirtualGet(UML2Package.PORT__ASSOCIATION) != null;
			case UML2Package.PORT__AGGREGATION:
				return eVirtualGet(UML2Package.PORT__AGGREGATION, AGGREGATION_EDEFAULT) != AGGREGATION_EDEFAULT;
			case UML2Package.PORT__DEFAULT_VALUE:
				return eVirtualGet(UML2Package.PORT__DEFAULT_VALUE) != null;
			case UML2Package.PORT__QUALIFIER:
				EList qualifier = (EList)eVirtualGet(UML2Package.PORT__QUALIFIER);
				return qualifier != null && !qualifier.isEmpty();
			case UML2Package.PORT__ASSOCIATION_END:
				return getAssociationEnd() != null;
			case UML2Package.PORT__IS_BEHAVIOR:
				return ((eFlags & IS_BEHAVIOR_EFLAG) != 0) != IS_BEHAVIOR_EDEFAULT;
			case UML2Package.PORT__IS_SERVICE:
				return ((eFlags & IS_SERVICE_EFLAG) != 0) != IS_SERVICE_EDEFAULT;
			case UML2Package.PORT__REQUIRED:
				return !getRequireds().isEmpty();
			case UML2Package.PORT__REDEFINED_PORT:
				EList redefinedPort = (EList)eVirtualGet(UML2Package.PORT__REDEFINED_PORT);
				return redefinedPort != null && !redefinedPort.isEmpty();
			case UML2Package.PORT__PROVIDED:
				return !getProvideds().isEmpty();
			case UML2Package.PORT__PROTOCOL:
				return eVirtualGet(UML2Package.PORT__PROTOCOL) != null;
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
		result.append(" (isBehavior: "); //$NON-NLS-1$
		result.append((eFlags & IS_BEHAVIOR_EFLAG) != 0);
		result.append(", isService: "); //$NON-NLS-1$
		result.append((eFlags & IS_SERVICE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRedefinedElementsHelper(EList redefinedElement) {
		super.getRedefinedElementsHelper(redefinedElement);
		EList redefinedPort = getRedefinedPorts();
		if (!redefinedPort.isEmpty()) {
			for (Iterator i = ((InternalEList) redefinedPort).basicIterator(); i.hasNext(); ) {
				redefinedElement.add(i.next());
			}
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UML2Package.PORT__REDEFINED_PORT);
	}


} //PortImpl
