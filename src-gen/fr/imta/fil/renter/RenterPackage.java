/**
 */
package fr.imta.fil.renter;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imta.fil.renter.RenterFactory
 * @model kind="package"
 * @generated
 */
public interface RenterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "renter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.imta.fil.renter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "renter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RenterPackage eINSTANCE = fr.imta.fil.renter.impl.RenterPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.RenterImpl <em>Renter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.RenterImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getRenter()
	 * @generated
	 */
	int RENTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTER__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTER__VEHICLES = 2;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTER__CLIENTS = 3;

	/**
	 * The number of structural features of the '<em>Renter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Renter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.ClientImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Id Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ID_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__BIRTH_DATE = 2;

	/**
	 * The feature id for the '<em><b>Rent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__RENT = 3;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.VehicleImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 2;

	/**
	 * The feature id for the '<em><b>Id Vehicle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID_VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Holding Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__HOLDING_CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Rent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__RENT = 3;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.CarImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 3;

	/**
	 * The feature id for the '<em><b>Id Vehicle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ID_VEHICLE = VEHICLE__ID_VEHICLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Holding Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__HOLDING_CAPACITY = VEHICLE__HOLDING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Rent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__RENT = VEHICLE__RENT;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.TruckImpl <em>Truck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.TruckImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getTruck()
	 * @generated
	 */
	int TRUCK = 4;

	/**
	 * The feature id for the '<em><b>Id Vehicle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUCK__ID_VEHICLE = VEHICLE__ID_VEHICLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUCK__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Holding Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUCK__HOLDING_CAPACITY = VEHICLE__HOLDING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Rent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUCK__RENT = VEHICLE__RENT;

	/**
	 * The number of structural features of the '<em>Truck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUCK_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Truck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUCK_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.PickUpImpl <em>Pick Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.PickUpImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getPickUp()
	 * @generated
	 */
	int PICK_UP = 5;

	/**
	 * The feature id for the '<em><b>Id Vehicle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP__ID_VEHICLE = VEHICLE__ID_VEHICLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Holding Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP__HOLDING_CAPACITY = VEHICLE__HOLDING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Rent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP__RENT = VEHICLE__RENT;

	/**
	 * The number of structural features of the '<em>Pick Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pick Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.RentImpl <em>Rent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.RentImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getRent()
	 * @generated
	 */
	int RENT = 6;

	/**
	 * The feature id for the '<em><b>Id Rent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENT__ID_RENT = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENT__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENT__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENT__CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENT__VEHICLE = 4;

	/**
	 * The number of structural features of the '<em>Rent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.EmployeeImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BIRTH_DATE = 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.ManagerImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__FIRST_NAME = EMPLOYEE__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__BIRTH_DATE = EMPLOYEE__BIRTH_DATE;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Renter <em>Renter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renter</em>'.
	 * @see fr.imta.fil.renter.Renter
	 * @generated
	 */
	EClass getRenter();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Renter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.renter.Renter#getName()
	 * @see #getRenter()
	 * @generated
	 */
	EAttribute getRenter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.fil.renter.Renter#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see fr.imta.fil.renter.Renter#getEmployees()
	 * @see #getRenter()
	 * @generated
	 */
	EReference getRenter_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.fil.renter.Renter#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicles</em>'.
	 * @see fr.imta.fil.renter.Renter#getVehicles()
	 * @see #getRenter()
	 * @generated
	 */
	EReference getRenter_Vehicles();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.fil.renter.Renter#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see fr.imta.fil.renter.Renter#getClients()
	 * @see #getRenter()
	 * @generated
	 */
	EReference getRenter_Clients();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see fr.imta.fil.renter.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Client#getIdClient <em>Id Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Client</em>'.
	 * @see fr.imta.fil.renter.Client#getIdClient()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_IdClient();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.renter.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Client#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see fr.imta.fil.renter.Client#getBirthDate()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_BirthDate();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.renter.Client#getRent <em>Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rent</em>'.
	 * @see fr.imta.fil.renter.Client#getRent()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Rent();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see fr.imta.fil.renter.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Vehicle#getIdVehicle <em>Id Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Vehicle</em>'.
	 * @see fr.imta.fil.renter.Vehicle#getIdVehicle()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_IdVehicle();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.renter.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Vehicle#getHoldingCapacity <em>Holding Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holding Capacity</em>'.
	 * @see fr.imta.fil.renter.Vehicle#getHoldingCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_HoldingCapacity();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.renter.Vehicle#getRent <em>Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rent</em>'.
	 * @see fr.imta.fil.renter.Vehicle#getRent()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Rent();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see fr.imta.fil.renter.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Truck <em>Truck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truck</em>'.
	 * @see fr.imta.fil.renter.Truck
	 * @generated
	 */
	EClass getTruck();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.PickUp <em>Pick Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick Up</em>'.
	 * @see fr.imta.fil.renter.PickUp
	 * @generated
	 */
	EClass getPickUp();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Rent <em>Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rent</em>'.
	 * @see fr.imta.fil.renter.Rent
	 * @generated
	 */
	EClass getRent();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Rent#getIdRent <em>Id Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Rent</em>'.
	 * @see fr.imta.fil.renter.Rent#getIdRent()
	 * @see #getRent()
	 * @generated
	 */
	EAttribute getRent_IdRent();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Rent#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see fr.imta.fil.renter.Rent#getStartDate()
	 * @see #getRent()
	 * @generated
	 */
	EAttribute getRent_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Rent#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see fr.imta.fil.renter.Rent#getEndDate()
	 * @see #getRent()
	 * @generated
	 */
	EAttribute getRent_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.renter.Rent#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client</em>'.
	 * @see fr.imta.fil.renter.Rent#getClient()
	 * @see #getRent()
	 * @generated
	 */
	EReference getRent_Client();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.renter.Rent#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicle</em>'.
	 * @see fr.imta.fil.renter.Rent#getVehicle()
	 * @see #getRent()
	 * @generated
	 */
	EReference getRent_Vehicle();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see fr.imta.fil.renter.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.renter.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Employee#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see fr.imta.fil.renter.Employee#getFirstName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Employee#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see fr.imta.fil.renter.Employee#getBirthDate()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_BirthDate();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see fr.imta.fil.renter.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RenterFactory getRenterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.RenterImpl <em>Renter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.RenterImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getRenter()
		 * @generated
		 */
		EClass RENTER = eINSTANCE.getRenter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTER__NAME = eINSTANCE.getRenter_Name();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTER__EMPLOYEES = eINSTANCE.getRenter_Employees();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTER__VEHICLES = eINSTANCE.getRenter_Vehicles();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTER__CLIENTS = eINSTANCE.getRenter_Clients();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.ClientImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Id Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__ID_CLIENT = eINSTANCE.getClient_IdClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__BIRTH_DATE = eINSTANCE.getClient_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Rent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__RENT = eINSTANCE.getClient_Rent();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.VehicleImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Id Vehicle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__ID_VEHICLE = eINSTANCE.getVehicle_IdVehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Holding Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__HOLDING_CAPACITY = eINSTANCE.getVehicle_HoldingCapacity();

		/**
		 * The meta object literal for the '<em><b>Rent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__RENT = eINSTANCE.getVehicle_Rent();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.CarImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.TruckImpl <em>Truck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.TruckImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getTruck()
		 * @generated
		 */
		EClass TRUCK = eINSTANCE.getTruck();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.PickUpImpl <em>Pick Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.PickUpImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getPickUp()
		 * @generated
		 */
		EClass PICK_UP = eINSTANCE.getPickUp();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.RentImpl <em>Rent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.RentImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getRent()
		 * @generated
		 */
		EClass RENT = eINSTANCE.getRent();

		/**
		 * The meta object literal for the '<em><b>Id Rent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENT__ID_RENT = eINSTANCE.getRent_IdRent();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENT__START_DATE = eINSTANCE.getRent_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENT__END_DATE = eINSTANCE.getRent_EndDate();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENT__CLIENT = eINSTANCE.getRent_Client();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENT__VEHICLE = eINSTANCE.getRent_Vehicle();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.EmployeeImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FIRST_NAME = eINSTANCE.getEmployee_FirstName();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__BIRTH_DATE = eINSTANCE.getEmployee_BirthDate();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.ManagerImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

	}

} //RenterPackage
