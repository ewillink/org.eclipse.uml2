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
 * $Id: ProfileApplication.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ProfileApplication#getImportedProfile <em>Imported Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getProfileApplication()
 * @model 
 * @generated
 */
public interface ProfileApplication extends PackageImport{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Imported Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Profile</em>' reference.
	 * @see #setImportedProfile(Profile)
	 * @see org.eclipse.uml2.UML2Package#getProfileApplication_ImportedProfile()
	 * @model required="true" volatile="true"
	 * @generated
	 */
	Profile getImportedProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ProfileApplication#getImportedProfile <em>Imported Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Profile</em>' reference.
	 * @see #getImportedProfile()
	 * @generated
	 */
	void setImportedProfile(Profile value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model 
	 * @generated
	 */
	void setImportedPackage(org.eclipse.uml2.Package value);

} // ProfileApplication
