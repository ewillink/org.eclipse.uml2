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
 * $Id: ClassifierOperations.java,v 1.3 2004/04/27 13:56:09 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.UML2DiagnosticConstants;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;

/**
 * A static utility class that provides operations related to classifiers.
 */
public final class ClassifierOperations
	extends UML2Operations {

	/**
	 * Constructs a new Classifier Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ClassifierOperations() {
		super();
	}

	public static Set allFeatures(Classifier classifier) {
		Set allFeatures = new HashSet();

		for (Iterator members = classifier.getMembers().iterator(); members
			.hasNext();) {

			NamedElement member = (NamedElement) members.next();

			if (Feature.class.isInstance(member)) {
				allFeatures.add(member);
			}
		}

		return allFeatures;
	}

	public static Set allParents(Classifier classifier) {
		Set allParents = new HashSet();

		allParentsHelper(classifier, allParents);

		return allParents;
	}

	protected static void allParentsHelper(Classifier classifier, Set allParents) {

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			Classifier parent = (Classifier) parents.next();

			if (!allParents.contains(parent)) {
				allParents.add(parent);

				allParentsHelper(parent, allParents);
			}
		}

	}

	public static boolean conformsTo(Classifier classifier, Classifier other) {
		return classifier == other || classifier.allParents().contains(other);
	}

	public static Set general(Classifier classifier) {
		return classifier.parents();
	}

	public static boolean hasVisibilityOf(Classifier classifier, NamedElement n) {

		for (Iterator allParents = classifier.allParents().iterator(); allParents
			.hasNext();) {

			if (((Classifier) allParents.next()).getMembers().contains(n)) {
				return VisibilityKind.PRIVATE_LITERAL != n.getVisibility();
			}
		}

		return false;
	}

	public static Set inherit(Classifier classifier, Set inhs) {
		return inhs;
	}

	public static Set inheritableMembers(Classifier classifier, Classifier c) {
		Set inheritableMembers = new HashSet();

		if (classifier == c || !c.allParents().contains(classifier)) {
			return inheritableMembers;
		}

		for (Iterator members = classifier.getMembers().iterator(); members
			.hasNext();) {

			NamedElement member = (NamedElement) members.next();

			if (c.hasVisibilityOf(member)) {
				inheritableMembers.add(member);
			}
		}

		return inheritableMembers;
	}

	public static Set inheritedMember(Classifier classifier) {
		Set inheritedMember = new HashSet();

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			inheritedMember.addAll(((Classifier) parents.next())
				.inheritableMembers(classifier));
		}

		return classifier.inherit(inheritedMember);
	}

	public static boolean maySpecializeType(Classifier classifier, Classifier c) {
		return c.eClass().isSuperTypeOf(classifier.eClass());
	}

	public static Set parents(Classifier classifier) {
		Set parents = new HashSet();

		for (Iterator generalizations = classifier.getGeneralizations()
			.iterator(); generalizations.hasNext();) {

			Generalization generalization = (Generalization) generalizations
				.next();

			if (null != generalization.getGeneral()) {
				parents.add(generalization.getGeneral());
			}
		}

		return parents;
	}

	/**
	 * Creates a generalization between the specified classifier and the
	 * specified general classifier.
	 * 
	 * @param classifier
	 *            The classifier from which to create a generalization.
	 * @param generalClassifier
	 *            The classifier to which to create a generalization.
	 * @return The new generalization.
	 * @exception IllegalArgumentException
	 *                If either of the classifiers is already a direct or
	 *                indirect parent of the other.
	 */
	public static Generalization createGeneralization(Classifier classifier,
			Classifier generalClassifier) {

		if (null == classifier) {
			throw new IllegalArgumentException(String.valueOf(classifier));
		}

		if (null == generalClassifier
			|| classifier.allParents().contains(generalClassifier)
			|| generalClassifier.allParents().contains(classifier)) {

			throw new IllegalArgumentException(String
				.valueOf(generalClassifier));
		}

		Generalization generalization = classifier
			.createGeneralization(UML2Package.eINSTANCE.getGeneralization());
		generalization.setGeneral(generalClassifier);

		return generalization;
	}

	public static boolean validateNoCyclesInGeneralization(
			Classifier classifier, DiagnosticChain diagnostics, Map data) {
		boolean result = true;

		if (classifier.allParents().contains(classifier)) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
							UML2Plugin.INSTANCE
								.getString("_UI_Classifier_NoCyclesInGeneralization_message"), //$NON-NLS-1$
							null));
			}
		}

		return result;
	}

	public static boolean validateSpecializeType(Classifier classifier,
			DiagnosticChain diagnostics, Map data) {
		boolean result = true;

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			Classifier parent = (Classifier) parents.next();

			if (!classifier.maySpecializeType(parent)) {
				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UML2DiagnosticConstants.PLUGIN_ID,
								UML2DiagnosticConstants.CLASSIFIER__SPECIALIZE_TYPE,
								UML2Plugin.INSTANCE
									.getString("_UI_Classifier_SpecializeType_message"), //$NON-NLS-1$
								new Object[] {parent}));
				}
			}
		}

		return result;
	}

	public static boolean validateInheritedMember(Classifier classifier,
			DiagnosticChain diagnostics, Map data) {
		boolean result = true;

		Set inheritedMember = new HashSet();

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			inheritedMember.addAll(((Classifier) parents.next())
				.inheritableMembers(classifier));
		}

		if (!classifier.inheritedMember().containsAll(
			classifier.inherit(inheritedMember))) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.ERROR,
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.CLASSIFIER__INHERITED_MEMBER,
							UML2Plugin.INSTANCE
								.getString("_UI_Classifier_InheritedMember_message"), //$NON-NLS-1$
							null));
			}
		}

		return result;
	}

	public static boolean validateGeneralEqualsParents(Classifier classifier,
			DiagnosticChain diagnostics, Map data) {
		boolean result = true;

		if (!classifier.general().equals(classifier.parents())) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.ERROR,
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.CLASSIFIER__GENERAL_EQUALS_PARENTS,
							UML2Plugin.INSTANCE
								.getString("_UI_Classifier_GeneralEqualsParents_message"), //$NON-NLS-1$
							null));
			}
		}

		return result;
	}

}