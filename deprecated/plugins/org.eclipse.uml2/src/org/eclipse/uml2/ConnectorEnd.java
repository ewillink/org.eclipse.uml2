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
 * $Id: ConnectorEnd.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.eclipse.uml2.ConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getConnectorEnd()
 * @model 
 * @generated
 */
public interface ConnectorEnd extends MultiplicityElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Defining End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining End</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getConnectorEnd_DefiningEnd()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Property getDefiningEnd();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ConnectableElement#getEnds <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ConnectableElement)
	 * @see org.eclipse.uml2.UML2Package#getConnectorEnd_Role()
	 * @see org.eclipse.uml2.ConnectableElement#getEnds
	 * @model opposite="end"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Part With Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part With Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part With Port</em>' reference.
	 * @see #setPartWithPort(Property)
	 * @see org.eclipse.uml2.UML2Package#getConnectorEnd_PartWithPort()
	 * @model 
	 * @generated
	 */
	Property getPartWithPort();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port</em>' reference.
	 * @see #getPartWithPort()
	 * @generated
	 */
	void setPartWithPort(Property value);

} // ConnectorEnd
