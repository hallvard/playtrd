/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openstreetmap.osm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openstreetmap.osm.Way#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openstreetmap.osm.OsmPackage#getWay()
 * @model
 * @generated
 */
public interface Way extends OSMElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.openstreetmap.osm.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see org.openstreetmap.osm.OsmPackage#getWay_Nodes()
	 * @model extendedMetaData="name='nd' namespace='' kind='element'"
	 * @generated
	 */
	EList<Node> getNodes();

} // Way
