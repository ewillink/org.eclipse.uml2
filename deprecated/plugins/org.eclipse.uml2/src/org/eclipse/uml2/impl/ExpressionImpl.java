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
 * $Id: ExpressionImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Expression;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExpressionImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExpressionImpl#getOperands <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends OpaqueExpressionImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperands() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList operand = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol == null ? SYMBOL_EDEFAULT : newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXPRESSION__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOperands() {
		if (operand == null) {
			operand = new EObjectContainmentEList(ValueSpecification.class, this, UML2Package.EXPRESSION__OPERAND);
		}
		return operand;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public ValueSpecification getOperand(String unqualifiedName) {
    	for (Iterator i = getOperands().iterator(); i.hasNext(); ) {
    		ValueSpecification namedOperand = (ValueSpecification) i.next();
    		
    		if (unqualifiedName.equals(namedOperand.getName())) {
    			return namedOperand;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createOperand(EClass eClass) {
		ValueSpecification newOperand = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.EXPRESSION__OPERAND, null, newOperand));
		}
		getOperands().add(newOperand);
		return newOperand;
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
			union.addAll(getOperands());
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
				case UML2Package.EXPRESSION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPRESSION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.EXPRESSION__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.EXPRESSION__OWNING_PARAMETER, msgs);
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
				case UML2Package.EXPRESSION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPRESSION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPRESSION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.EXPRESSION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.EXPRESSION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.EXPRESSION__OWNING_PARAMETER, msgs);
				case UML2Package.EXPRESSION__OPERAND:
					return ((InternalEList)getOperands()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.EXPRESSION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.EXPRESSION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXPRESSION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXPRESSION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.EXPRESSION__NAME:
				return getName();
			case UML2Package.EXPRESSION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.EXPRESSION__VISIBILITY:
				return getVisibility();
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.EXPRESSION__BODY:
				return getBody();
			case UML2Package.EXPRESSION__LANGUAGE:
				return getLanguage();
			case UML2Package.EXPRESSION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case UML2Package.EXPRESSION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case UML2Package.EXPRESSION__SYMBOL:
				return getSymbol();
			case UML2Package.EXPRESSION__OPERAND:
				return getOperands();
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
			case UML2Package.EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.EXPRESSION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.EXPRESSION__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.EXPRESSION__BODY:
				setBody((String)newValue);
				return;
			case UML2Package.EXPRESSION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case UML2Package.EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case UML2Package.EXPRESSION__SYMBOL:
				setSymbol((String)newValue);
				return;
			case UML2Package.EXPRESSION__OPERAND:
				getOperands().clear();
				getOperands().addAll((Collection)newValue);
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
			case UML2Package.EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.EXPRESSION__TYPE:
				setType((Type)null);
				return;
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.EXPRESSION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case UML2Package.EXPRESSION__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case UML2Package.EXPRESSION__OPERAND:
				getOperands().clear();
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
			case UML2Package.EXPRESSION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXPRESSION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.EXPRESSION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.EXPRESSION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.EXPRESSION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.EXPRESSION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.EXPRESSION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.EXPRESSION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.EXPRESSION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.EXPRESSION__TYPE:
				return type != null;
			case UML2Package.EXPRESSION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.EXPRESSION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UML2Package.EXPRESSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case UML2Package.EXPRESSION__RESULT:
				return basicGetResult() != null;
			case UML2Package.EXPRESSION__BEHAVIOR:
				return behavior != null;
			case UML2Package.EXPRESSION__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case UML2Package.EXPRESSION__OPERAND:
				return operand != null && !operand.isEmpty();
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
		result.append(" (symbol: "); //$NON-NLS-1$
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
