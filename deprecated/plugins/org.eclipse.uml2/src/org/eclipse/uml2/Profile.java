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
 * $Id: Profile.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Profile#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.Profile#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.Profile#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getProfile()
 * @model 
 * @generated
 */
public interface Profile extends org.eclipse.uml2.Package{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stereotype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProfile_OwnedStereotype()
	 * @model type="org.eclipse.uml2.Stereotype" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getOwnedStereotypes();

    /**
     * Retrieves the {@link org.eclipse.uml2.Stereotype} with the specified name from the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Stereotype} to retrieve.
	 * @return The {@link org.eclipse.uml2.Stereotype} with the specified name, or <code>null</code>.
	 * @see #getOwnedStereotypes()
	 * @generated
     */
    Stereotype getOwnedStereotype(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProfile_MetaclassReference()
	 * @model type="org.eclipse.uml2.ElementImport" resolveProxies="false" volatile="true"
	 * @generated
	 */
	EList getMetaclassReferences();

	/**
	 * Returns the value of the '<em><b>Metamodel Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProfile_MetamodelReference()
	 * @model type="org.eclipse.uml2.PackageImport" resolveProxies="false" volatile="true"
	 * @generated
	 */
	EList getMetamodelReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getElementImports();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getPackageImports();

	// <!-- begin-custom-operations -->

	/**
	 * Determines whether this profile is defined.
	 * 
	 * @return <code>true</code> if this profile is defined; <code>false</code>
	 *         otherwise.
	 */
	public boolean isDefined();

	/**
	 * Retrieves the version of this profile.
	 * 
	 * @return The version of this profile, or <code>null</code> if undefined.
	 */
	public String getVersion();

	/**
	 * Defines this profile by (re)creating Ecore representations of its current
	 * contents and incrementing its version.
	 * 
	 * @throws IllegalArgumentException If this profile has no name.
	 */
	public void define();

	/**
	 * Retrieves the set of metaclasses referenced by this profile.
	 * 
	 * @return The metaclasses referenced by this profile.
	 */
	public Set getReferencedMetaclasses();

	/**
	 * References the specified metaclass in this profile with private
	 * visibility.
	 * 
	 * @param class_ The metaclass to reference.
	 * @exception IllegalArgumentException If this profile already references
	 *                                     the metaclass.
	 */
	public void referenceMetaclass(org.eclipse.uml2.Class class_);

	/**
	 * Retrieves the set of metamodels referenced by this profile.
	 * 
	 * @return The metamodels referenced by this profile.
	 */
	public Set getReferencedMetamodels();

	/**
	 * References the specified metamodel in this profile with private
	 * visibility.
	 * 
	 * @param model The metamodel to reference.
	 * @exception IllegalArgumentException If this profile already references
	 *                                     the metamodel.
	 */
	public void referenceMetamodel(Model model);

	// <!-- end-custom-operations -->

} // Profile
