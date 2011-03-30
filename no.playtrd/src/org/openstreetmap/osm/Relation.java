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
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openstreetmap.osm.Relation#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openstreetmap.osm.OsmPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends OSMElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.openstreetmap.osm.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.openstreetmap.osm.OsmPackage#getRelation_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // Relation
