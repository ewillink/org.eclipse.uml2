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
 * $Id: NamespaceImpl.java,v 1.3 2004/04/27 13:56:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.NamespaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getPackageImports <em>Package Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList ownedRule = null;

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList elementImport = null;

	/**
	 * The cached value of the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected EList packageImport = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Member</b></em>' reference list, a derived union.
	 * @generated
	 */
	public EList getMembers() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getNamespace_Member())) {
			Set union = new LinkedHashSet();
			union.addAll(getOwnedMembers());
			union.addAll(getImportedMembers());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getNamespace_Member(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getNamespace_Member(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getNamespace_Member());
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public NamedElement getMember(String unqualifiedName) {
    	for (Iterator i = getMembers().iterator(); i.hasNext(); ) {
    		NamedElement namedMember = (NamedElement) i.next();
    		
    		if (unqualifiedName.equals(namedMember.getName())) {
    			return namedMember;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedRules() {
		if (null == ownedRule) {
			ownedRule = new EObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.NAMESPACE__OWNED_RULE, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRule;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Constraint getOwnedRule(String unqualifiedName) {
    	for (Iterator i = getOwnedRules().iterator(); i.hasNext(); ) {
    		Constraint namedOwnedRule = (Constraint) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedRule.getName())) {
    			return namedOwnedRule;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(EClass eClass) {
		Constraint newOwnedRule = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.NAMESPACE__OWNED_RULE, null, newOwnedRule));
		}
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Imported Member</b></em>' reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Namespace#getMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getImportedMembersGen() {
		// TODO: implement this derived getter to return the 'Imported Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getImportedMembers() {
		// TODO: test this derived getter
        if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getNamespace_ImportedMember())) {
            Set importedMember = importedMember();

            getCacheAdapter()
                    .put(
                            this,
                            UML2Package.eINSTANCE.getNamespace_ImportedMember(),
                            new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getNamespace_ImportedMember(), importedMember.size(), importedMember
                                    .toArray()));
        }

        return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getNamespace_ImportedMember());
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public PackageableElement getImportedMember(String unqualifiedName) {
    	for (Iterator i = getImportedMembers().iterator(); i.hasNext(); ) {
    		PackageableElement namedImportedMember = (PackageableElement) i.next();
    		
    		if (unqualifiedName.equals(namedImportedMember.getName())) {
    			return namedImportedMember;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getElementImports() {
		if (null == elementImport) {
			elementImport = new EObjectContainmentWithInverseEList(ElementImport.class, this, UML2Package.NAMESPACE__ELEMENT_IMPORT, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport(EClass eClass) {
		ElementImport newElementImport = (ElementImport) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.NAMESPACE__ELEMENT_IMPORT, null, newElementImport));
		}
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getPackageImports() {
		if (null == packageImport) {
			packageImport = new EObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.NAMESPACE__PACKAGE_IMPORT, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(EClass eClass) {
		PackageImport newPackageImport = (PackageImport) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.NAMESPACE__PACKAGE_IMPORT, null, newPackageImport));
		}
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMembersAreDistinguishable(DiagnosticChain diagnostics, Map data) {
		// TODO: test this OCL constraint
		return NamespaceOperations.validateMembersAreDistinguishable(this, diagnostics, data);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set getNamesOfMember(NamedElement element) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.NamespaceOperations.getNamesOfMember(this, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.NamespaceOperations.membersAreDistinguishable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateImportedMemberDerived(DiagnosticChain diagnostics, Map data) {
		// TODO: test this OCL constraint
		return NamespaceOperations.validateImportedMemberDerived(this, diagnostics, data);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set importedMember() {
		// TODO: test this OCL operation
		try {
			java.lang.reflect.Method method = getClass().getMethod("importedMember", new Class[] {}); //$NON-NLS-1$
			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this,
					method,
					java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.NamespaceOperations.importedMember(this)));
			}
			return (Set) getCacheAdapter().get(this, method);
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.NamespaceOperations.importedMember(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set importMembers(Set imps) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.NamespaceOperations.importMembers(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set excludeCollisions(Set imps) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.NamespaceOperations.excludeCollisions(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 *   <li>{@link org.eclipse.uml2.Namespace#getMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedMembers() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getNamespace().getEAllOperations().get(38))) {
			Set union = new LinkedHashSet();
			union.addAll(getOwnedRules());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getNamespace().getEAllOperations().get(38),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getNamespace().getEAllOperations().get(38));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getOwnedMembers());
			union.addAll(getElementImports());
			union.addAll(getPackageImports());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.NAMESPACE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.NAMESPACE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.NAMESPACE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.NAMESPACE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.NAMESPACE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
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
				case UML2Package.NAMESPACE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMESPACE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMESPACE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMESPACE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.NAMESPACE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMESPACE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.NAMESPACE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.NAMESPACE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.NAMESPACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.NAMESPACE__NAME:
				return getName();
			case UML2Package.NAMESPACE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.NAMESPACE__VISIBILITY:
				return getVisibility();
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.NAMESPACE__MEMBER:
				return getMembers();
			case UML2Package.NAMESPACE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return getPackageImports();
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.NAMESPACE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.NAMESPACE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.NAMESPACE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.NAMESPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.NAMESPACE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.NAMESPACE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImports().clear();
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.NAMESPACE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.NAMESPACE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.NAMESPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.NAMESPACE__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.NAMESPACE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.NAMESPACE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.NAMESPACE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	// <!-- begin-custom-operations -->

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Namespace#getImportedPackages()
	 */
	public Set getImportedPackages() {

	    try {
            Method method = getClass().getMethod("getImportedPackages", new Class[] {}); //$NON-NLS-1$

            if (!getCacheAdapter().containsKey(this, method)) {
                getCacheAdapter().put(this, method, NamespaceOperations.getImportedPackages(this));
            }

            return (Set) getCacheAdapter().get(this, method);

        } catch (Exception e) {
    		return NamespaceOperations.getImportedPackages(this);
        }
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Namespace#importElement(org.eclipse.uml2.VisibilityKind, org.eclipse.uml2.PackageableElement)
	 */
	public void importElement(VisibilityKind visibility, PackageableElement element) {
		NamespaceOperations.importElement(this, this.visibility, element);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Namespace#importPackage(org.eclipse.uml2.VisibilityKind, org.eclipse.uml2.Package)
	 */
	public void importPackage(VisibilityKind visibility, org.eclipse.uml2.Package package_) {
		NamespaceOperations.importPackage(this, visibility, package_);
	}

	// <!-- begin-custom-operations -->

} //NamespaceImpl
