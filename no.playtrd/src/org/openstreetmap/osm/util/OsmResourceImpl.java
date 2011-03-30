/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openstreetmap.osm.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.openstreetmap.osm.OsmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.openstreetmap.osm.util.OsmResourceFactoryImpl
 * @generated
 */
public class OsmResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public OsmResourceImpl(URI uri) {
		super(uri);
	}

	protected XMLHelper createXMLHelper() {
		XMLHelper xmlHelper = new XMLHelperImpl(this);
		xmlHelper.setNoNamespacePackage(OsmPackage.eINSTANCE);

		return xmlHelper;
	}

} //OsmResourceImpl
