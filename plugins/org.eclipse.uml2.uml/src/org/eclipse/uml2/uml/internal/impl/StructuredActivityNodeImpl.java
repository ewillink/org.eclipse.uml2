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
 * $Id: StructuredActivityNodeImpl.java,v 1.35 2008/04/21 16:32:41 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityGroupOperations;
import org.eclipse.uml2.uml.internal.operations.NamespaceOperations;
import org.eclipse.uml2.uml.internal.operations.StructuredActivityNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl
		extends ActionImpl
		implements StructuredActivityNode {

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImports;

	/**
	 * The cached value of the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImports;

	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRules;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edges;

	/**
	 * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_ISOLATE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final int MUST_ISOLATE_EFLAG = 1 << 13;

	/**
	 * The cached value of the '{@link #getNodes() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE;
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
						UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER,
			OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name) {
		return getOwnedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name, boolean ignoreCase,
			EClass eClass) {
		ownedMemberLoop : for (NamedElement ownedMember : getOwnedMembers()) {
			if (eClass != null && !eClass.isInstance(ownedMember))
				continue ownedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedMember.getName())
				: name.equals(ownedMember.getName())))
				continue ownedMemberLoop;
			return ownedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> members = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__MEMBER,
					members = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER,
						MEMBER_ESUBSETS));
			}
			return members;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name) {
		return getMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name, boolean ignoreCase, EClass eClass) {
		memberLoop : for (NamedElement member : getMembers()) {
			if (eClass != null && !eClass.isInstance(member))
				continue memberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(member.getName())
				: name.equals(member.getName())))
				continue memberLoop;
			return member;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImports() {
		if (elementImports == null) {
			elementImports = new EObjectContainmentWithInverseEList.Resolving<ElementImport>(
				ElementImport.class, this,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT,
				UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport(PackageableElement importedElement) {
		ElementImport newElementImport = (ElementImport) create(UMLPackage.Literals.ELEMENT_IMPORT);
		getElementImports().add(newElementImport);
		if (importedElement != null)
			newElementImport.setImportedElement(importedElement);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getElementImport(PackageableElement importedElement) {
		return getElementImport(importedElement, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getElementImport(PackageableElement importedElement,
			boolean createOnDemand) {
		elementImportLoop : for (ElementImport elementImport : getElementImports()) {
			if (importedElement != null
				&& !importedElement.equals(elementImport.getImportedElement()))
				continue elementImportLoop;
			return elementImport;
		}
		return createOnDemand
			? createElementImport(importedElement)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImports() {
		if (packageImports == null) {
			packageImports = new EObjectContainmentWithInverseEList.Resolving<PackageImport>(
				PackageImport.class, this,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT,
				UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(
			org.eclipse.uml2.uml.Package importedPackage) {
		PackageImport newPackageImport = (PackageImport) create(UMLPackage.Literals.PACKAGE_IMPORT);
		getPackageImports().add(newPackageImport);
		if (importedPackage != null)
			newPackageImport.setImportedPackage(importedPackage);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getPackageImport(
			org.eclipse.uml2.uml.Package importedPackage) {
		return getPackageImport(importedPackage, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getPackageImport(
			org.eclipse.uml2.uml.Package importedPackage, boolean createOnDemand) {
		packageImportLoop : for (PackageImport packageImport : getPackageImports()) {
			if (importedPackage != null
				&& !importedPackage.equals(packageImport.getImportedPackage()))
				continue packageImportLoop;
			return packageImport;
		}
		return createOnDemand
			? createPackageImport(importedPackage)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new EObjectContainmentWithInverseEList.Resolving<Constraint>(
				Constraint.class, this,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE,
				UMLPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(String name, EClass eClass) {
		Constraint newOwnedRule = (Constraint) create(eClass);
		getOwnedRules().add(newOwnedRule);
		if (name != null)
			newOwnedRule.setName(name);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(String name) {
		return createOwnedRule(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name) {
		return getOwnedRule(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedRuleLoop : for (Constraint ownedRule : getOwnedRules()) {
			if (eClass != null && !eClass.isInstance(ownedRule))
				continue ownedRuleLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedRule.getName())
				: name.equals(ownedRule.getName())))
				continue ownedRuleLoop;
			return ownedRule;
		}
		return createOnDemand && eClass != null
			? createOwnedRule(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<PackageableElement> result = (EList<PackageableElement>) cache
				.get(this, UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER,
					result = NamespaceOperations.getImportedMembers(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name) {
		return getImportedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name,
			boolean ignoreCase, EClass eClass) {
		importedMemberLoop : for (PackageableElement importedMember : getImportedMembers()) {
			if (eClass != null && !eClass.isInstance(importedMember))
				continue importedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(importedMember.getName())
				: name.equals(importedMember.getName())))
				continue importedMemberLoop;
			return importedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityGroup> subgroups = (EList<ActivityGroup>) cache.get(
				eResource, this, UMLPackage.Literals.ACTIVITY_GROUP__SUBGROUP);
			if (subgroups == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__SUBGROUP,
					subgroups = new DerivedUnionEObjectEList<ActivityGroup>(
						ActivityGroup.class, this,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP, null));
			}
			return subgroups;
		}
		return new DerivedUnionEObjectEList<ActivityGroup>(ActivityGroup.class,
			this, UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNodes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityNode> containedNodes = (EList<ActivityNode>) cache
				.get(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
			if (containedNodes == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE,
						containedNodes = new DerivedUnionEObjectEList<ActivityNode>(
							ActivityNode.class,
							this,
							UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE,
							CONTAINED_NODE_ESUBSETS));
			}
			return containedNodes;
		}
		return new DerivedUnionEObjectEList<ActivityNode>(ActivityNode.class,
			this, UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE,
			CONTAINED_NODE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name) {
		return getContainedNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name, boolean ignoreCase,
			EClass eClass) {
		containedNodeLoop : for (ActivityNode containedNode : getContainedNodes()) {
			if (eClass != null && !eClass.isInstance(containedNode))
				continue containedNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(containedNode.getName())
				: name.equals(containedNode.getName())))
				continue containedNodeLoop;
			return containedNode;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdges() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityEdge> containedEdges = (EList<ActivityEdge>) cache
				.get(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
			if (containedEdges == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE,
						containedEdges = new DerivedUnionEObjectEList<ActivityEdge>(
							ActivityEdge.class,
							this,
							UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE,
							CONTAINED_EDGE_ESUBSETS));
			}
			return containedEdges;
		}
		return new DerivedUnionEObjectEList<ActivityEdge>(ActivityEdge.class,
			this, UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE,
			CONTAINED_EDGE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name) {
		return getContainedEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name, boolean ignoreCase,
			EClass eClass) {
		containedEdgeLoop : for (ActivityEdge containedEdge : getContainedEdges()) {
			if (eClass != null && !eClass.isInstance(containedEdge))
				continue containedEdgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(containedEdge.getName())
				: name.equals(containedEdge.getName())))
				continue containedEdgeLoop;
			return containedEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList.Resolving<Variable>(
				Variable.class, this,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE,
				UMLPackage.VARIABLE__SCOPE);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable(String name, Type type) {
		Variable newVariable = (Variable) create(UMLPackage.Literals.VARIABLE);
		getVariables().add(newVariable);
		if (name != null)
			newVariable.setName(name);
		if (type != null)
			newVariable.setType(type);
		return newVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable(String name, Type type) {
		return getVariable(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		variableLoop : for (Variable variable : getVariables()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(variable.getName())
				: name.equals(variable.getName())))
				continue variableLoop;
			if (type != null && !type.equals(variable.getType()))
				continue variableLoop;
			return variable;
		}
		return createOnDemand
			? createVariable(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList.Resolving<ActivityNode>(
				ActivityNode.class, this,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE,
				UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createNode(String name, EClass eClass) {
		ActivityNode newNode = (ActivityNode) create(eClass);
		getNodes().add(newNode);
		if (name != null)
			newNode.setName(name);
		return newNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		return getNode(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		nodeLoop : for (ActivityNode node : getNodes()) {
			if (eClass != null && !eClass.isInstance(node))
				continue nodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(node.getName())
				: name.equals(node.getName())))
				continue nodeLoop;
			return node;
		}
		return createOnDemand && eClass != null
			? createNode(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustIsolate() {
		return (eFlags & MUST_ISOLATE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(boolean newMustIsolate) {
		boolean oldMustIsolate = (eFlags & MUST_ISOLATE_EFLAG) != 0;
		if (newMustIsolate)
			eFlags |= MUST_ISOLATE_EFLAG;
		else
			eFlags &= ~MUST_ISOLATE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE,
				oldMustIsolate, newMustIsolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList.Resolving<ActivityEdge>(
				ActivityEdge.class, this,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE,
				UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createEdge(String name, EClass eClass) {
		ActivityEdge newEdge = (ActivityEdge) create(eClass);
		getEdges().add(newEdge);
		if (name != null)
			newEdge.setName(name);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name) {
		return getEdge(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		edgeLoop : for (ActivityEdge edge : getEdges()) {
			if (eClass != null && !eClass.isInstance(edge))
				continue edgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(edge.getName())
				: name.equals(edge.getName())))
				continue edgeLoop;
			return edge;
		}
		return createOnDemand && eClass != null
			? createEdge(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		Activity activity = basicGetActivity();
		return activity != null && activity.eIsProxy()
			? (Activity) eResolveProxy((InternalEObject) activity)
			: activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Activity basicGetActivity() {
		if (eContainerFeatureID != UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY
			&& eContainerFeatureID != UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY)
			return null;
		return (Activity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setActivity(Activity newActivity) {
		super.setActivity(newActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivity() {
		return basicGetActivity() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersDistinguishable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NamespaceOperations.validateMembersDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport(PackageableElement element,
			VisibilityKind visibility) {
		return NamespaceOperations.createElementImport(this, element,
			visibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(
			org.eclipse.uml2.uml.Package package_, VisibilityKind visibility) {
		return NamespaceOperations.createPackageImport(this, package_,
			visibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<PackageableElement> result = (EList<PackageableElement>) cache
				.get(this, UMLPackage.Literals.NAMESPACE.getEOperations()
					.get(3));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.NAMESPACE.getEOperations()
					.get(3), result = NamespaceOperations
					.getImportedElements(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Package> getImportedPackages() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<org.eclipse.uml2.uml.Package> result = (EList<org.eclipse.uml2.uml.Package>) cache
				.get(this, UMLPackage.Literals.NAMESPACE.getEOperations()
					.get(4));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.NAMESPACE.getEOperations()
					.get(4), result = NamespaceOperations
					.getImportedPackages(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedPackages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamesOfMember(NamedElement element) {
		return NamespaceOperations.getNamesOfMember(this, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		return NamespaceOperations.membersAreDistinguishable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> importMembers(
			EList<PackageableElement> imps) {
		return NamespaceOperations.importMembers(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> excludeCollisions(
			EList<PackageableElement> imps) {
		return NamespaceOperations.excludeCollisions(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodesAndEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityGroupOperations.validateNodesAndEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotContained(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityGroupOperations.validateNotContained(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupOwned(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityGroupOperations.validateGroupOwned(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StructuredActivityNodeOperations.validateEdges(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClientDependencies())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode(
					(StructuredActivityNode) otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity) otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInPartitions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInInterruptibleRegions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getHandlers())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInActivity((Activity) otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getNodes())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				return basicSetInActivity(null, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				return ((InternalEList<?>) getVariables()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				return ((InternalEList<?>) getEdges()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				return ((InternalEList<?>) getNodes()).basicRemove(otherEnd,
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
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				return getName();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INPUT :
				return getInputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER :
				return getMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				return getEdges();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				return isMustIsolate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				return getNodes();
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
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll(
					(Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions()
					.addAll(
						(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll(
					(Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				getHandlers().clear();
				getHandlers().addAll(
					(Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll(
					(Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll(
					(Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				getVariables().clear();
				getVariables()
					.addAll((Collection<? extends Variable>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				getEdges().clear();
				getEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				setMustIsolate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
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
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				getNodes().clear();
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
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				return isSetName();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				return nodes != null && !nodes.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
					return UMLPackage.NAMESPACE__ELEMENT_IMPORT;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
					return UMLPackage.NAMESPACE__PACKAGE_IMPORT;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
					return UMLPackage.NAMESPACE__OWNED_RULE;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER :
					return UMLPackage.NAMESPACE__MEMBER;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER :
					return UMLPackage.NAMESPACE__IMPORTED_MEMBER;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER :
					return UMLPackage.NAMESPACE__OWNED_MEMBER;
				default :
					return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP :
					return UMLPackage.ACTIVITY_GROUP__SUBGROUP;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP :
					return UMLPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
					return UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE :
					return UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE :
					return UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
				case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
				case UMLPackage.NAMESPACE__OWNED_RULE :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
				case UMLPackage.NAMESPACE__MEMBER :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER;
				case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
				case UMLPackage.NAMESPACE__OWNED_MEMBER :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;
				default :
					return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UMLPackage.ACTIVITY_GROUP__SUBGROUP :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
				case UMLPackage.ACTIVITY_GROUP__SUPER_GROUP :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
				case UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
				case UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
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
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mustIsolate: "); //$NON-NLS-1$
		result.append((eFlags & MUST_ISOLATE_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
		UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__INPUT,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT)
			|| eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT)
			|| isSetOwnedMembers() || isSetSubgroups();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE};

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[]{
		UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER,
		UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE)
			|| eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER)
			|| isSetOwnedMembers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubgroups() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy()
			? (ActivityGroup) eResolveProxy((InternalEObject) superGroup)
			: superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperGroup() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		if (isSetSuperGroup()) {
			return basicGetSuperGroup();
		}
		if (isSetInActivity()) {
			return basicGetInActivity();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || isSetSuperGroup() || isSetInActivity();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getContainedEdges() <em>Contained Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdges()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CONTAINED_EDGE_ESUBSETS = new int[]{UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE};

	/**
	 * The array of subset feature identifiers for the '{@link #getContainedNodes() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CONTAINED_NODE_ESUBSETS = new int[]{UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedEdges() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInActivity() {
		return getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetInActivity() {
		return basicGetActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetInActivity(Activity newInActivity,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInActivity,
			UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		setActivity(newInActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInActivity() {
		return false;
	}

} //StructuredActivityNodeImpl
