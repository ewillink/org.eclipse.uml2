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
 * $Id: Enumeration.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Enumeration#getOwnedLiterals <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getEnumeration()
 * @model 
 * @generated
 */
public interface Enumeration extends DataType{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getEnumeration_OwnedLiteral()
	 * @see org.eclipse.uml2.EnumerationLiteral#getEnumeration
	 * @model type="org.eclipse.uml2.EnumerationLiteral" opposite="enumeration" containment="true"
	 * @generated
	 */
	EList getOwnedLiterals();

    /**
     * Retrieves the {@link org.eclipse.uml2.EnumerationLiteral} with the specified name from the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.EnumerationLiteral} to retrieve.
	 * @return The {@link org.eclipse.uml2.EnumerationLiteral} with the specified name, or <code>null</code>.
	 * @see #getOwnedLiterals()
	 * @generated
     */
    EnumerationLiteral getOwnedLiteral(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.EnumerationLiteral} and appends it to the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.EnumerationLiteral} to create.
	 * @return The new {@link org.eclipse.uml2.EnumerationLiteral}.
	 * @see #getOwnedLiterals()
	 * @generated
     */
    EnumerationLiteral createOwnedLiteral(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

} // Enumeration
