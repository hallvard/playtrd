/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POI Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.TagData#getPoi <em>Poi</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.TagData#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTagData()
 * @model
 * @generated
 */
public interface TagData extends EObject {
	/**
	 * Returns the value of the '<em><b>Poi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poi</em>' reference.
	 * @see #setPoi(POI)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTagData_Poi()
	 * @model
	 * @generated
	 */
	POI getPoi();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.TagData#getPoi <em>Poi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poi</em>' reference.
	 * @see #getPoi()
	 * @generated
	 */
	void setPoi(POI value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTagData_Entries()
	 * @model mapType="no.playtrd.v10.playtrd.TagEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getEntries();

} // POIMetaData
