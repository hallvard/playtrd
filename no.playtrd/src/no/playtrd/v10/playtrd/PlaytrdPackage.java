/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see no.playtrd.v10.playtrd.PlaytrdFactory
 * @model kind="package"
 * @generated
 */
public interface PlaytrdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "playtrd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://playtrd.no/v10/playtrd.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "playtrd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlaytrdPackage eINSTANCE = no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.ScriptedImpl <em>Scripted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.ScriptedImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getScripted()
	 * @generated
	 */
	int SCRIPTED = 13;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED__SCRIPT_SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Scripted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.ObjectPositionImpl <em>Object Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.ObjectPositionImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getObjectPosition()
	 * @generated
	 */
	int OBJECT_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_POSITION__SCRIPT_SOURCE = SCRIPTED__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Globe Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_POSITION__GLOBE_POSITION = SCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Positioned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_POSITION__POSITIONED = SCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_POSITION_FEATURE_COUNT = SCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.Positioned <em>Positioned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.Positioned
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPositioned()
	 * @generated
	 */
	int POSITIONED = 9;

	/**
	 * The number of structural features of the '<em>Positioned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.PlayerImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = POSITIONED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = POSITIONED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.PlaytrdImpl <em>Playtrd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlaytrd()
	 * @generated
	 */
	int PLAYTRD = 2;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYTRD__SCRIPT_SOURCE = SCRIPTED__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYTRD__REGIONS = SCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYTRD__COMMUNITIES = SCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYTRD__SERVICES = SCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYTRD__GAMES = SCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYTRD__UIS = SCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Playtrd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYTRD_FEATURE_COUNT = SCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.POIImpl <em>POI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.POIImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPOI()
	 * @generated
	 */
	int POI = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI__NAME = POSITIONED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>POI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI_FEATURE_COUNT = POSITIONED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.RegionImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pois</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__POIS = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.GameImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 5;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCRIPT_SOURCE = SCRIPTED__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NAME = SCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = SCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__STATE_MACHINE = SCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__CURRENT_STATES = SCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = SCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.PlayerStateImpl <em>Player State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.PlayerStateImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlayerState()
	 * @generated
	 */
	int PLAYER_STATE = 6;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATE__SCRIPT_SOURCE = SCRIPTED__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATE__PLAYER = SCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Player State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATE_FEATURE_COUNT = SCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.CommunityImpl <em>Community</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.CommunityImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getCommunity()
	 * @generated
	 */
	int COMMUNITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNITY__PLAYERS = 1;

	/**
	 * The number of structural features of the '<em>Community</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.ServiceImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SCRIPT_SOURCE = SCRIPTED__SCRIPT_SOURCE;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = SCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.PositionServiceImpl <em>Position Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.PositionServiceImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPositionService()
	 * @generated
	 */
	int POSITION_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SERVICE__SCRIPT_SOURCE = SERVICE__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Object Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SERVICE__OBJECT_POSITIONS = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.MessageServiceImpl <em>Message Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.MessageServiceImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getMessageService()
	 * @generated
	 */
	int MESSAGE_SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SERVICE__SCRIPT_SOURCE = SERVICE__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SERVICE__MESSAGES = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.PlayerMessageImpl <em>Player Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.PlayerMessageImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlayerMessage()
	 * @generated
	 */
	int PLAYER_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_MESSAGE__SCRIPT_SOURCE = SCRIPTED__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_MESSAGE__PLAYER = SCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_MESSAGE__MESSAGE = SCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Player Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_MESSAGE_FEATURE_COUNT = SCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.LocationServiceImpl <em>Location Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.LocationServiceImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getLocationService()
	 * @generated
	 */
	int LOCATION_SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SERVICE__SCRIPT_SOURCE = SERVICE__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Object Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SERVICE__OBJECT_LOCATIONS = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.ObjectLocationImpl <em>Object Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.ObjectLocationImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getObjectLocation()
	 * @generated
	 */
	int OBJECT_LOCATION = 15;

	/**
	 * The feature id for the '<em><b>Positioned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LOCATION__POSITIONED = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LOCATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Object Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.ItemImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 16;

	/**
	 * The feature id for the '<em><b>Money Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MONEY_VALUE = POSITIONED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = POSITIONED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.WalletImpl <em>Wallet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.WalletImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getWallet()
	 * @generated
	 */
	int WALLET = 17;

	/**
	 * The feature id for the '<em><b>Money Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__MONEY_VALUE = ITEM__MONEY_VALUE;

	/**
	 * The number of structural features of the '<em>Wallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.OwnerImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 19;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.StoreImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 18;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.MoneyValuedImpl <em>Money Valued</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.MoneyValuedImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getMoneyValued()
	 * @generated
	 */
	int MONEY_VALUED = 21;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.TradeImpl <em>Trade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.TradeImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTrade()
	 * @generated
	 */
	int TRADE = 20;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.InventoryImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 22;

	/**
	 * The feature id for the '<em><b>Contained Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__CONTAINED_ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Contained Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__CONTAINED_ITEMS = INVENTORY__CONTAINED_ITEMS;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = INVENTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CONTAINED_ITEMS = OWNER__CONTAINED_ITEMS;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Money Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_VALUED__MONEY_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Money Valued</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_VALUED_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Money Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE__MONEY_VALUE = MONEY_VALUED__MONEY_VALUE;

	/**
	 * The feature id for the '<em><b>Seller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE__SELLER = MONEY_VALUED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buyer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE__BUYER = MONEY_VALUED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seller Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE__SELLER_WALLET = MONEY_VALUED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Seller Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE__SELLER_ITEMS = MONEY_VALUED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Buyer Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE__BUYER_ITEMS = MONEY_VALUED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Buyer Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE__BUYER_WALLET = MONEY_VALUED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Trade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_FEATURE_COUNT = MONEY_VALUED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.PropertiesImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 23;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.TagServiceImpl <em>Tag Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.TagServiceImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTagService()
	 * @generated
	 */
	int TAG_SERVICE = 24;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SERVICE__META_DATA = 0;

	/**
	 * The number of structural features of the '<em>Tag Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.TagDataImpl <em>Tag Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.TagDataImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTagData()
	 * @generated
	 */
	int TAG_DATA = 25;

	/**
	 * The feature id for the '<em><b>Poi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DATA__POI = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DATA__ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Tag Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.TagEntryImpl <em>Tag Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.TagEntryImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTagEntry()
	 * @generated
	 */
	int TAG_ENTRY = 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tag Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.ColocationServiceImpl <em>Colocation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.ColocationServiceImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getColocationService()
	 * @generated
	 */
	int COLOCATION_SERVICE = 27;

	/**
	 * The feature id for the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCATION_SERVICE__SCRIPT_SOURCE = SERVICE__SCRIPT_SOURCE;

	/**
	 * The feature id for the '<em><b>Object Colocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCATION_SERVICE__OBJECT_COLOCATIONS = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colocation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCATION_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.playtrd.v10.playtrd.impl.ObjectColocationImpl <em>Object Colocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.playtrd.v10.playtrd.impl.ObjectColocationImpl
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getObjectColocation()
	 * @generated
	 */
	int OBJECT_COLOCATION = 28;

	/**
	 * The feature id for the '<em><b>Positioned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COLOCATION__POSITIONED = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COLOCATION__TARGETS = 1;

	/**
	 * The number of structural features of the '<em>Object Colocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COLOCATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Globe Position</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jscience.geography.coordinates.LatLong
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getGlobePosition()
	 * @generated
	 */
	int GLOBE_POSITION = 29;


	/**
	 * The meta object id for the '<em>Money</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.Measurable
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 30;


	/**
	 * The meta object id for the '<em>IEditing Domain Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.edit.domain.IEditingDomainProvider
	 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getIEditingDomainProvider()
	 * @generated
	 */
	int IEDITING_DOMAIN_PROVIDER = 31;


	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.ObjectPosition <em>Object Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Position</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectPosition
	 * @generated
	 */
	EClass getObjectPosition();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.ObjectPosition#getGlobePosition <em>Globe Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Globe Position</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectPosition#getGlobePosition()
	 * @see #getObjectPosition()
	 * @generated
	 */
	EAttribute getObjectPosition_GlobePosition();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.ObjectPosition#getPositioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Positioned</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectPosition#getPositioned()
	 * @see #getObjectPosition()
	 * @generated
	 */
	EReference getObjectPosition_Positioned();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.playtrd.v10.playtrd.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.playtrd.v10.playtrd.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Playtrd <em>Playtrd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playtrd</em>'.
	 * @see no.playtrd.v10.playtrd.Playtrd
	 * @generated
	 */
	EClass getPlaytrd();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Playtrd#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see no.playtrd.v10.playtrd.Playtrd#getRegions()
	 * @see #getPlaytrd()
	 * @generated
	 */
	EReference getPlaytrd_Regions();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Playtrd#getCommunities <em>Communities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communities</em>'.
	 * @see no.playtrd.v10.playtrd.Playtrd#getCommunities()
	 * @see #getPlaytrd()
	 * @generated
	 */
	EReference getPlaytrd_Communities();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Playtrd#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see no.playtrd.v10.playtrd.Playtrd#getServices()
	 * @see #getPlaytrd()
	 * @generated
	 */
	EReference getPlaytrd_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Playtrd#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see no.playtrd.v10.playtrd.Playtrd#getGames()
	 * @see #getPlaytrd()
	 * @generated
	 */
	EReference getPlaytrd_Games();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Playtrd#getUis <em>Uis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uis</em>'.
	 * @see no.playtrd.v10.playtrd.Playtrd#getUis()
	 * @see #getPlaytrd()
	 * @generated
	 */
	EReference getPlaytrd_Uis();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.POI <em>POI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POI</em>'.
	 * @see no.playtrd.v10.playtrd.POI
	 * @generated
	 */
	EClass getPOI();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.POI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.playtrd.v10.playtrd.POI#getName()
	 * @see #getPOI()
	 * @generated
	 */
	EAttribute getPOI_Name();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see no.playtrd.v10.playtrd.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.playtrd.v10.playtrd.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Region#getPois <em>Pois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pois</em>'.
	 * @see no.playtrd.v10.playtrd.Region#getPois()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Pois();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see no.playtrd.v10.playtrd.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.Game#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.playtrd.v10.playtrd.Game#getName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.playtrd.v10.playtrd.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the containment reference '{@link no.playtrd.v10.playtrd.Game#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Machine</em>'.
	 * @see no.playtrd.v10.playtrd.Game#getStateMachine()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_StateMachine();

	/**
	 * Returns the meta object for the reference list '{@link no.playtrd.v10.playtrd.Game#getCurrentStates <em>Current States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current States</em>'.
	 * @see no.playtrd.v10.playtrd.Game#getCurrentStates()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_CurrentStates();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.PlayerState <em>Player State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player State</em>'.
	 * @see no.playtrd.v10.playtrd.PlayerState
	 * @generated
	 */
	EClass getPlayerState();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.PlayerState#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.playtrd.v10.playtrd.PlayerState#getPlayer()
	 * @see #getPlayerState()
	 * @generated
	 */
	EReference getPlayerState_Player();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Community <em>Community</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Community</em>'.
	 * @see no.playtrd.v10.playtrd.Community
	 * @generated
	 */
	EClass getCommunity();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.Community#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.playtrd.v10.playtrd.Community#getName()
	 * @see #getCommunity()
	 * @generated
	 */
	EAttribute getCommunity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Community#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.playtrd.v10.playtrd.Community#getPlayers()
	 * @see #getCommunity()
	 * @generated
	 */
	EReference getCommunity_Players();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.PositionService <em>Position Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Service</em>'.
	 * @see no.playtrd.v10.playtrd.PositionService
	 * @generated
	 */
	EClass getPositionService();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.PositionService#getObjectPositions <em>Object Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Positions</em>'.
	 * @see no.playtrd.v10.playtrd.PositionService#getObjectPositions()
	 * @see #getPositionService()
	 * @generated
	 */
	EReference getPositionService_ObjectPositions();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned</em>'.
	 * @see no.playtrd.v10.playtrd.Positioned
	 * @generated
	 */
	EClass getPositioned();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.MessageService <em>Message Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Service</em>'.
	 * @see no.playtrd.v10.playtrd.MessageService
	 * @generated
	 */
	EClass getMessageService();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.MessageService#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see no.playtrd.v10.playtrd.MessageService#getMessages()
	 * @see #getMessageService()
	 * @generated
	 */
	EReference getMessageService_Messages();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.PlayerMessage <em>Player Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Message</em>'.
	 * @see no.playtrd.v10.playtrd.PlayerMessage
	 * @generated
	 */
	EClass getPlayerMessage();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.PlayerMessage#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.playtrd.v10.playtrd.PlayerMessage#getPlayer()
	 * @see #getPlayerMessage()
	 * @generated
	 */
	EReference getPlayerMessage_Player();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.PlayerMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see no.playtrd.v10.playtrd.PlayerMessage#getMessage()
	 * @see #getPlayerMessage()
	 * @generated
	 */
	EAttribute getPlayerMessage_Message();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see no.playtrd.v10.playtrd.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Scripted <em>Scripted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted</em>'.
	 * @see no.playtrd.v10.playtrd.Scripted
	 * @generated
	 */
	EClass getScripted();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.Scripted#getScriptSource <em>Script Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Source</em>'.
	 * @see no.playtrd.v10.playtrd.Scripted#getScriptSource()
	 * @see #getScripted()
	 * @generated
	 */
	EAttribute getScripted_ScriptSource();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.LocationService <em>Location Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Service</em>'.
	 * @see no.playtrd.v10.playtrd.LocationService
	 * @generated
	 */
	EClass getLocationService();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.LocationService#getObjectLocations <em>Object Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Locations</em>'.
	 * @see no.playtrd.v10.playtrd.LocationService#getObjectLocations()
	 * @see #getLocationService()
	 * @generated
	 */
	EReference getLocationService_ObjectLocations();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.ObjectLocation <em>Object Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Location</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectLocation
	 * @generated
	 */
	EClass getObjectLocation();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.ObjectLocation#getPositioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Positioned</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectLocation#getPositioned()
	 * @see #getObjectLocation()
	 * @generated
	 */
	EReference getObjectLocation_Positioned();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.ObjectLocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectLocation#getTarget()
	 * @see #getObjectLocation()
	 * @generated
	 */
	EReference getObjectLocation_Target();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see no.playtrd.v10.playtrd.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wallet</em>'.
	 * @see no.playtrd.v10.playtrd.Wallet
	 * @generated
	 */
	EClass getWallet();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see no.playtrd.v10.playtrd.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see no.playtrd.v10.playtrd.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Trade <em>Trade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade</em>'.
	 * @see no.playtrd.v10.playtrd.Trade
	 * @generated
	 */
	EClass getTrade();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.Trade#getSeller <em>Seller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seller</em>'.
	 * @see no.playtrd.v10.playtrd.Trade#getSeller()
	 * @see #getTrade()
	 * @generated
	 */
	EReference getTrade_Seller();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.Trade#getBuyer <em>Buyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buyer</em>'.
	 * @see no.playtrd.v10.playtrd.Trade#getBuyer()
	 * @see #getTrade()
	 * @generated
	 */
	EReference getTrade_Buyer();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.Trade#getSellerWallet <em>Seller Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seller Wallet</em>'.
	 * @see no.playtrd.v10.playtrd.Trade#getSellerWallet()
	 * @see #getTrade()
	 * @generated
	 */
	EReference getTrade_SellerWallet();

	/**
	 * Returns the meta object for the reference list '{@link no.playtrd.v10.playtrd.Trade#getSellerItems <em>Seller Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seller Items</em>'.
	 * @see no.playtrd.v10.playtrd.Trade#getSellerItems()
	 * @see #getTrade()
	 * @generated
	 */
	EReference getTrade_SellerItems();

	/**
	 * Returns the meta object for the reference list '{@link no.playtrd.v10.playtrd.Trade#getBuyerItems <em>Buyer Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buyer Items</em>'.
	 * @see no.playtrd.v10.playtrd.Trade#getBuyerItems()
	 * @see #getTrade()
	 * @generated
	 */
	EReference getTrade_BuyerItems();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.Trade#getBuyerWallet <em>Buyer Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buyer Wallet</em>'.
	 * @see no.playtrd.v10.playtrd.Trade#getBuyerWallet()
	 * @see #getTrade()
	 * @generated
	 */
	EReference getTrade_BuyerWallet();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.MoneyValued <em>Money Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Money Valued</em>'.
	 * @see no.playtrd.v10.playtrd.MoneyValued
	 * @generated
	 */
	EClass getMoneyValued();

	/**
	 * Returns the meta object for the attribute '{@link no.playtrd.v10.playtrd.MoneyValued#getMoneyValue <em>Money Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Money Value</em>'.
	 * @see no.playtrd.v10.playtrd.MoneyValued#getMoneyValue()
	 * @see #getMoneyValued()
	 * @generated
	 */
	EAttribute getMoneyValued_MoneyValue();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see no.playtrd.v10.playtrd.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.Inventory#getContainedItems <em>Contained Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Items</em>'.
	 * @see no.playtrd.v10.playtrd.Inventory#getContainedItems()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_ContainedItems();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see no.playtrd.v10.playtrd.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.TagService <em>Tag Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Service</em>'.
	 * @see no.playtrd.v10.playtrd.TagService
	 * @generated
	 */
	EClass getTagService();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.TagService#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Data</em>'.
	 * @see no.playtrd.v10.playtrd.TagService#getMetaData()
	 * @see #getTagService()
	 * @generated
	 */
	EReference getTagService_MetaData();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.TagData <em>Tag Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Data</em>'.
	 * @see no.playtrd.v10.playtrd.TagData
	 * @generated
	 */
	EClass getTagData();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.TagData#getPoi <em>Poi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Poi</em>'.
	 * @see no.playtrd.v10.playtrd.TagData#getPoi()
	 * @see #getTagData()
	 * @generated
	 */
	EReference getTagData_Poi();

	/**
	 * Returns the meta object for the map '{@link no.playtrd.v10.playtrd.TagData#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see no.playtrd.v10.playtrd.TagData#getEntries()
	 * @see #getTagData()
	 * @generated
	 */
	EReference getTagData_Entries();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Tag Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getTagEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTagEntry()
	 * @generated
	 */
	EAttribute getTagEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTagEntry()
	 * @generated
	 */
	EAttribute getTagEntry_Value();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.ColocationService <em>Colocation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colocation Service</em>'.
	 * @see no.playtrd.v10.playtrd.ColocationService
	 * @generated
	 */
	EClass getColocationService();

	/**
	 * Returns the meta object for the containment reference list '{@link no.playtrd.v10.playtrd.ColocationService#getObjectColocations <em>Object Colocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Colocations</em>'.
	 * @see no.playtrd.v10.playtrd.ColocationService#getObjectColocations()
	 * @see #getColocationService()
	 * @generated
	 */
	EReference getColocationService_ObjectColocations();

	/**
	 * Returns the meta object for class '{@link no.playtrd.v10.playtrd.ObjectColocation <em>Object Colocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Colocation</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectColocation
	 * @generated
	 */
	EClass getObjectColocation();

	/**
	 * Returns the meta object for the reference '{@link no.playtrd.v10.playtrd.ObjectColocation#getPositioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Positioned</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectColocation#getPositioned()
	 * @see #getObjectColocation()
	 * @generated
	 */
	EReference getObjectColocation_Positioned();

	/**
	 * Returns the meta object for the reference list '{@link no.playtrd.v10.playtrd.ObjectColocation#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see no.playtrd.v10.playtrd.ObjectColocation#getTargets()
	 * @see #getObjectColocation()
	 * @generated
	 */
	EReference getObjectColocation_Targets();

	/**
	 * Returns the meta object for data type '{@link org.jscience.geography.coordinates.LatLong <em>Globe Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Globe Position</em>'.
	 * @see org.jscience.geography.coordinates.LatLong
	 * @model instanceClass="org.jscience.geography.coordinates.LatLong"
	 * @generated
	 */
	EDataType getGlobePosition();

	/**
	 * Returns the meta object for data type '{@link javax.measure.Measurable <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Money</em>'.
	 * @see javax.measure.Measurable
	 * @model instanceClass="javax.measure.Measurable<org.jscience.economics.money.Money>"
	 * @generated
	 */
	EDataType getMoney();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.edit.domain.IEditingDomainProvider <em>IEditing Domain Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IEditing Domain Provider</em>'.
	 * @see org.eclipse.emf.edit.domain.IEditingDomainProvider
	 * @model instanceClass="org.eclipse.emf.edit.domain.IEditingDomainProvider"
	 * @generated
	 */
	EDataType getIEditingDomainProvider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlaytrdFactory getPlaytrdFactory();

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
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.ObjectPositionImpl <em>Object Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.ObjectPositionImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getObjectPosition()
		 * @generated
		 */
		EClass OBJECT_POSITION = eINSTANCE.getObjectPosition();

		/**
		 * The meta object literal for the '<em><b>Globe Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_POSITION__GLOBE_POSITION = eINSTANCE.getObjectPosition_GlobePosition();

		/**
		 * The meta object literal for the '<em><b>Positioned</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_POSITION__POSITIONED = eINSTANCE.getObjectPosition_Positioned();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.PlayerImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.PlaytrdImpl <em>Playtrd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlaytrd()
		 * @generated
		 */
		EClass PLAYTRD = eINSTANCE.getPlaytrd();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYTRD__REGIONS = eINSTANCE.getPlaytrd_Regions();

		/**
		 * The meta object literal for the '<em><b>Communities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYTRD__COMMUNITIES = eINSTANCE.getPlaytrd_Communities();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYTRD__SERVICES = eINSTANCE.getPlaytrd_Services();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYTRD__GAMES = eINSTANCE.getPlaytrd_Games();

		/**
		 * The meta object literal for the '<em><b>Uis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYTRD__UIS = eINSTANCE.getPlaytrd_Uis();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.POIImpl <em>POI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.POIImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPOI()
		 * @generated
		 */
		EClass POI = eINSTANCE.getPOI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POI__NAME = eINSTANCE.getPOI_Name();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.RegionImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Pois</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__POIS = eINSTANCE.getRegion_Pois();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.GameImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NAME = eINSTANCE.getGame_Name();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__STATE_MACHINE = eINSTANCE.getGame_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Current States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__CURRENT_STATES = eINSTANCE.getGame_CurrentStates();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.PlayerStateImpl <em>Player State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.PlayerStateImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlayerState()
		 * @generated
		 */
		EClass PLAYER_STATE = eINSTANCE.getPlayerState();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_STATE__PLAYER = eINSTANCE.getPlayerState_Player();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.CommunityImpl <em>Community</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.CommunityImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getCommunity()
		 * @generated
		 */
		EClass COMMUNITY = eINSTANCE.getCommunity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNITY__NAME = eINSTANCE.getCommunity_Name();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNITY__PLAYERS = eINSTANCE.getCommunity_Players();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.PositionServiceImpl <em>Position Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.PositionServiceImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPositionService()
		 * @generated
		 */
		EClass POSITION_SERVICE = eINSTANCE.getPositionService();

		/**
		 * The meta object literal for the '<em><b>Object Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_SERVICE__OBJECT_POSITIONS = eINSTANCE.getPositionService_ObjectPositions();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.Positioned <em>Positioned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.Positioned
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPositioned()
		 * @generated
		 */
		EClass POSITIONED = eINSTANCE.getPositioned();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.MessageServiceImpl <em>Message Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.MessageServiceImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getMessageService()
		 * @generated
		 */
		EClass MESSAGE_SERVICE = eINSTANCE.getMessageService();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_SERVICE__MESSAGES = eINSTANCE.getMessageService_Messages();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.PlayerMessageImpl <em>Player Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.PlayerMessageImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getPlayerMessage()
		 * @generated
		 */
		EClass PLAYER_MESSAGE = eINSTANCE.getPlayerMessage();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_MESSAGE__PLAYER = eINSTANCE.getPlayerMessage_Player();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_MESSAGE__MESSAGE = eINSTANCE.getPlayerMessage_Message();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.ServiceImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.ScriptedImpl <em>Scripted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.ScriptedImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getScripted()
		 * @generated
		 */
		EClass SCRIPTED = eINSTANCE.getScripted();

		/**
		 * The meta object literal for the '<em><b>Script Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED__SCRIPT_SOURCE = eINSTANCE.getScripted_ScriptSource();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.LocationServiceImpl <em>Location Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.LocationServiceImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getLocationService()
		 * @generated
		 */
		EClass LOCATION_SERVICE = eINSTANCE.getLocationService();

		/**
		 * The meta object literal for the '<em><b>Object Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_SERVICE__OBJECT_LOCATIONS = eINSTANCE.getLocationService_ObjectLocations();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.ObjectLocationImpl <em>Object Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.ObjectLocationImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getObjectLocation()
		 * @generated
		 */
		EClass OBJECT_LOCATION = eINSTANCE.getObjectLocation();

		/**
		 * The meta object literal for the '<em><b>Positioned</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_LOCATION__POSITIONED = eINSTANCE.getObjectLocation_Positioned();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_LOCATION__TARGET = eINSTANCE.getObjectLocation_Target();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.ItemImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.WalletImpl <em>Wallet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.WalletImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getWallet()
		 * @generated
		 */
		EClass WALLET = eINSTANCE.getWallet();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.StoreImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.OwnerImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.TradeImpl <em>Trade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.TradeImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTrade()
		 * @generated
		 */
		EClass TRADE = eINSTANCE.getTrade();

		/**
		 * The meta object literal for the '<em><b>Seller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE__SELLER = eINSTANCE.getTrade_Seller();

		/**
		 * The meta object literal for the '<em><b>Buyer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE__BUYER = eINSTANCE.getTrade_Buyer();

		/**
		 * The meta object literal for the '<em><b>Seller Wallet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE__SELLER_WALLET = eINSTANCE.getTrade_SellerWallet();

		/**
		 * The meta object literal for the '<em><b>Seller Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE__SELLER_ITEMS = eINSTANCE.getTrade_SellerItems();

		/**
		 * The meta object literal for the '<em><b>Buyer Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE__BUYER_ITEMS = eINSTANCE.getTrade_BuyerItems();

		/**
		 * The meta object literal for the '<em><b>Buyer Wallet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE__BUYER_WALLET = eINSTANCE.getTrade_BuyerWallet();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.MoneyValuedImpl <em>Money Valued</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.MoneyValuedImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getMoneyValued()
		 * @generated
		 */
		EClass MONEY_VALUED = eINSTANCE.getMoneyValued();

		/**
		 * The meta object literal for the '<em><b>Money Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONEY_VALUED__MONEY_VALUE = eINSTANCE.getMoneyValued_MoneyValue();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.InventoryImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Contained Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__CONTAINED_ITEMS = eINSTANCE.getInventory_ContainedItems();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.PropertiesImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.TagServiceImpl <em>Tag Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.TagServiceImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTagService()
		 * @generated
		 */
		EClass TAG_SERVICE = eINSTANCE.getTagService();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_SERVICE__META_DATA = eINSTANCE.getTagService_MetaData();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.TagDataImpl <em>Tag Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.TagDataImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTagData()
		 * @generated
		 */
		EClass TAG_DATA = eINSTANCE.getTagData();

		/**
		 * The meta object literal for the '<em><b>Poi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_DATA__POI = eINSTANCE.getTagData_Poi();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_DATA__ENTRIES = eINSTANCE.getTagData_Entries();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.TagEntryImpl <em>Tag Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.TagEntryImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getTagEntry()
		 * @generated
		 */
		EClass TAG_ENTRY = eINSTANCE.getTagEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_ENTRY__KEY = eINSTANCE.getTagEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_ENTRY__VALUE = eINSTANCE.getTagEntry_Value();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.ColocationServiceImpl <em>Colocation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.ColocationServiceImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getColocationService()
		 * @generated
		 */
		EClass COLOCATION_SERVICE = eINSTANCE.getColocationService();

		/**
		 * The meta object literal for the '<em><b>Object Colocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOCATION_SERVICE__OBJECT_COLOCATIONS = eINSTANCE.getColocationService_ObjectColocations();

		/**
		 * The meta object literal for the '{@link no.playtrd.v10.playtrd.impl.ObjectColocationImpl <em>Object Colocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.playtrd.v10.playtrd.impl.ObjectColocationImpl
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getObjectColocation()
		 * @generated
		 */
		EClass OBJECT_COLOCATION = eINSTANCE.getObjectColocation();

		/**
		 * The meta object literal for the '<em><b>Positioned</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_COLOCATION__POSITIONED = eINSTANCE.getObjectColocation_Positioned();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_COLOCATION__TARGETS = eINSTANCE.getObjectColocation_Targets();

		/**
		 * The meta object literal for the '<em>Globe Position</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jscience.geography.coordinates.LatLong
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getGlobePosition()
		 * @generated
		 */
		EDataType GLOBE_POSITION = eINSTANCE.getGlobePosition();

		/**
		 * The meta object literal for the '<em>Money</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.Measurable
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getMoney()
		 * @generated
		 */
		EDataType MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '<em>IEditing Domain Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.edit.domain.IEditingDomainProvider
		 * @see no.playtrd.v10.playtrd.impl.PlaytrdPackageImpl#getIEditingDomainProvider()
		 * @generated
		 */
		EDataType IEDITING_DOMAIN_PROVIDER = eINSTANCE.getIEditingDomainProvider();

	}

} //PlaytrdPackage
