/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openstreetmap.osm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openstreetmap.osm.OsmFactory
 * @model kind="package"
 * @generated
 */
public interface OsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openstreetmap.org/v06/osm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "osm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsmPackage eINSTANCE = org.openstreetmap.osm.impl.OsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.OSMElementImpl <em>OSM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.OSMElementImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getOSMElement()
	 * @generated
	 */
	int OSM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__USER = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__TAGS = 4;

	/**
	 * The number of structural features of the '<em>OSM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.NodeImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = OSM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VISIBLE = OSM_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TIMESTAMP = OSM_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__USER = OSM_ELEMENT__USER;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TAGS = OSM_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LATITUDE = OSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LONGITUDE = OSM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = OSM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.WayImpl <em>Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.WayImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getWay()
	 * @generated
	 */
	int WAY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__ID = OSM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__VISIBLE = OSM_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__TIMESTAMP = OSM_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__USER = OSM_ELEMENT__USER;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__TAGS = OSM_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__NODES = OSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_FEATURE_COUNT = OSM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.TagImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.RelationImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = OSM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VISIBLE = OSM_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TIMESTAMP = OSM_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__USER = OSM_ELEMENT__USER;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TAGS = OSM_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MEMBERS = OSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = OSM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.MemberImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.BoundsImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 6;

	/**
	 * The feature id for the '<em><b>Min Latitute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MIN_LATITUTE = 0;

	/**
	 * The feature id for the '<em><b>Min Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MIN_LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Max Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MAX_LATITUDE = 2;

	/**
	 * The feature id for the '<em><b>Max Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MAX_LONGITUDE = 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openstreetmap.osm.impl.OSMImpl <em>OSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openstreetmap.osm.impl.OSMImpl
	 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getOSM()
	 * @generated
	 */
	int OSM = 7;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__NODES = 0;

	/**
	 * The feature id for the '<em><b>Ways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__WAYS = 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__BOUNDS = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__GENERATOR = 5;

	/**
	 * The number of structural features of the '<em>OSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.openstreetmap.osm.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Node#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.openstreetmap.osm.Node#getLatitude()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Node#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.openstreetmap.osm.Node#getLongitude()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Longitude();

	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.Way <em>Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way</em>'.
	 * @see org.openstreetmap.osm.Way
	 * @generated
	 */
	EClass getWay();

	/**
	 * Returns the meta object for the reference list '{@link org.openstreetmap.osm.Way#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see org.openstreetmap.osm.Way#getNodes()
	 * @see #getWay()
	 * @generated
	 */
	EReference getWay_Nodes();

	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.OSMElement <em>OSM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSM Element</em>'.
	 * @see org.openstreetmap.osm.OSMElement
	 * @generated
	 */
	EClass getOSMElement();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.OSMElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openstreetmap.osm.OSMElement#getId()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.OSMElement#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.openstreetmap.osm.OSMElement#isVisible()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.OSMElement#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.openstreetmap.osm.OSMElement#getTimestamp()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.OSMElement#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.openstreetmap.osm.OSMElement#getUser()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_User();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openstreetmap.osm.OSMElement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.openstreetmap.osm.OSMElement#getTags()
	 * @see #getOSMElement()
	 * @generated
	 */
	EReference getOSMElement_Tags();

	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.openstreetmap.osm.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Tag#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.openstreetmap.osm.Tag#getKey()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openstreetmap.osm.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.openstreetmap.osm.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openstreetmap.osm.Relation#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.openstreetmap.osm.Relation#getMembers()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Members();

	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.openstreetmap.osm.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the reference '{@link org.openstreetmap.osm.Member#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.openstreetmap.osm.Member#getReference()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Member#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openstreetmap.osm.Member#getType()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Member#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.openstreetmap.osm.Member#getRole()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Role();

	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see org.openstreetmap.osm.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Bounds#getMinLatitute <em>Min Latitute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Latitute</em>'.
	 * @see org.openstreetmap.osm.Bounds#getMinLatitute()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MinLatitute();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Bounds#getMinLongitude <em>Min Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Longitude</em>'.
	 * @see org.openstreetmap.osm.Bounds#getMinLongitude()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MinLongitude();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Bounds#getMaxLatitude <em>Max Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Latitude</em>'.
	 * @see org.openstreetmap.osm.Bounds#getMaxLatitude()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MaxLatitude();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.Bounds#getMaxLongitude <em>Max Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Longitude</em>'.
	 * @see org.openstreetmap.osm.Bounds#getMaxLongitude()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MaxLongitude();

	/**
	 * Returns the meta object for class '{@link org.openstreetmap.osm.OSM <em>OSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSM</em>'.
	 * @see org.openstreetmap.osm.OSM
	 * @generated
	 */
	EClass getOSM();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openstreetmap.osm.OSM#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.openstreetmap.osm.OSM#getNodes()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openstreetmap.osm.OSM#getWays <em>Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ways</em>'.
	 * @see org.openstreetmap.osm.OSM#getWays()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Ways();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openstreetmap.osm.OSM#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.openstreetmap.osm.OSM#getRelations()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Relations();

	/**
	 * Returns the meta object for the reference '{@link org.openstreetmap.osm.OSM#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounds</em>'.
	 * @see org.openstreetmap.osm.OSM#getBounds()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.OSM#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openstreetmap.osm.OSM#getVersion()
	 * @see #getOSM()
	 * @generated
	 */
	EAttribute getOSM_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openstreetmap.osm.OSM#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.openstreetmap.osm.OSM#getGenerator()
	 * @see #getOSM()
	 * @generated
	 */
	EAttribute getOSM_Generator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsmFactory getOsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.NodeImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LATITUDE = eINSTANCE.getNode_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LONGITUDE = eINSTANCE.getNode_Longitude();

		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.WayImpl <em>Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.WayImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getWay()
		 * @generated
		 */
		EClass WAY = eINSTANCE.getWay();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAY__NODES = eINSTANCE.getWay_Nodes();

		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.OSMElementImpl <em>OSM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.OSMElementImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getOSMElement()
		 * @generated
		 */
		EClass OSM_ELEMENT = eINSTANCE.getOSMElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__ID = eINSTANCE.getOSMElement_Id();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__VISIBLE = eINSTANCE.getOSMElement_Visible();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__TIMESTAMP = eINSTANCE.getOSMElement_Timestamp();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__USER = eINSTANCE.getOSMElement_User();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_ELEMENT__TAGS = eINSTANCE.getOSMElement_Tags();

		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.TagImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__KEY = eINSTANCE.getTag_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.getTag_Value();

		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.RelationImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MEMBERS = eINSTANCE.getRelation_Members();

		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.MemberImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__REFERENCE = eINSTANCE.getMember_Reference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__TYPE = eINSTANCE.getMember_Type();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ROLE = eINSTANCE.getMember_Role();

		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.BoundsImpl <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.BoundsImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>Min Latitute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MIN_LATITUTE = eINSTANCE.getBounds_MinLatitute();

		/**
		 * The meta object literal for the '<em><b>Min Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MIN_LONGITUDE = eINSTANCE.getBounds_MinLongitude();

		/**
		 * The meta object literal for the '<em><b>Max Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MAX_LATITUDE = eINSTANCE.getBounds_MaxLatitude();

		/**
		 * The meta object literal for the '<em><b>Max Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MAX_LONGITUDE = eINSTANCE.getBounds_MaxLongitude();

		/**
		 * The meta object literal for the '{@link org.openstreetmap.osm.impl.OSMImpl <em>OSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openstreetmap.osm.impl.OSMImpl
		 * @see org.openstreetmap.osm.impl.OsmPackageImpl#getOSM()
		 * @generated
		 */
		EClass OSM = eINSTANCE.getOSM();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__NODES = eINSTANCE.getOSM_Nodes();

		/**
		 * The meta object literal for the '<em><b>Ways</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__WAYS = eINSTANCE.getOSM_Ways();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__RELATIONS = eINSTANCE.getOSM_Relations();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__BOUNDS = eINSTANCE.getOSM_Bounds();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM__VERSION = eINSTANCE.getOSM_Version();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM__GENERATOR = eINSTANCE.getOSM_Generator();

	}

} //OsmPackage
