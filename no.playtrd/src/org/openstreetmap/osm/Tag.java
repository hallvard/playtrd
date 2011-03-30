/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openstreetmap.osm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openstreetmap.osm.Tag#getKey <em>Key</em>}</li>
 *   <li>{@link org.openstreetmap.osm.Tag#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openstreetmap.osm.OsmPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.openstreetmap.osm.OsmPackage#getTag_Key()
	 * @model extendedMetaData="name='k' namespace=''"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.openstreetmap.osm.Tag#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openstreetmap.osm.OsmPackage#getTag_Value()
	 * @model extendedMetaData="name='v' namespace=''"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openstreetmap.osm.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Tag
