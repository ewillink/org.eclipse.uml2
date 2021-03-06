/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: EMOF2EcoreResourceImpl.java,v 1.6 2005/06/28 16:26:34 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResource;

/**
 * The <b>Resource </b> associated with the package.
 * 
 * @see org.eclipse.uml2.examples.emof2ecore.internal.Ecore2EcoreResourceFactoryImpl
 */
public class EMOF2EcoreResourceImpl
		extends XMIResourceImpl
		implements EMOF2EcoreResource {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource.
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 */
	public EMOF2EcoreResourceImpl(URI uri) {
		super(uri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl#createXMLHelper()
	 */
	protected XMLHelper createXMLHelper() {
		return new XMIHelperImpl(this) {

			public void setValue(EObject object, EStructuralFeature feature,
					Object value, int position) {

				if (EcorePackage.eINSTANCE.getETypedElement_UpperBound() == feature
					&& "*".equals(value)) { //$NON-NLS-1$

					((ETypedElement) object).setUpperBound(-1);
				} else {
					super.setValue(object, feature, value, position);
				}
			}
		};
	}

} // EMOF2EcoreResourceImpl
