/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POI Meta Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.TagService#getMetaData <em>Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTagService()
 * @model
 * @generated
 */
public interface TagService extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.TagData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTagService_MetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<TagData> getMetaData();

} // POIMetaDataService
