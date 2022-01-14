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
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.VehicleImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 1;

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
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Brew</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__BREW = 3;

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
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.EmployeeImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 2;

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
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.BrewImpl <em>Brew</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.BrewImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getBrew()
	 * @generated
	 */
	int BREW = 3;

	/**
	 * The feature id for the '<em><b>Id Brew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREW__ID_BREW = 0;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREW__RECIPE = 1;

	/**
	 * The feature id for the '<em><b>Prod Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREW__PROD_QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Brew Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREW__BREW_DATE = 3;

	/**
	 * The feature id for the '<em><b>Brewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREW__BREWERS = 4;

	/**
	 * The number of structural features of the '<em>Brew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Brew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.renter.impl.BrewerImpl <em>Brewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.renter.impl.BrewerImpl
	 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getBrewer()
	 * @generated
	 */
	int BREWER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWER__FIRST_NAME = EMPLOYEE__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWER__BIRTH_DATE = EMPLOYEE__BIRTH_DATE;

	/**
	 * The number of structural features of the '<em>Brewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Brewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Vehicle#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see fr.imta.fil.renter.Vehicle#getVolume()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Volume();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.renter.Vehicle#getBrew <em>Brew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brew</em>'.
	 * @see fr.imta.fil.renter.Vehicle#getBrew()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Brew();

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
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Brew <em>Brew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brew</em>'.
	 * @see fr.imta.fil.renter.Brew
	 * @generated
	 */
	EClass getBrew();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Brew#getIdBrew <em>Id Brew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Brew</em>'.
	 * @see fr.imta.fil.renter.Brew#getIdBrew()
	 * @see #getBrew()
	 * @generated
	 */
	EAttribute getBrew_IdBrew();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Brew#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipe</em>'.
	 * @see fr.imta.fil.renter.Brew#getRecipe()
	 * @see #getBrew()
	 * @generated
	 */
	EAttribute getBrew_Recipe();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Brew#getProdQuantity <em>Prod Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Quantity</em>'.
	 * @see fr.imta.fil.renter.Brew#getProdQuantity()
	 * @see #getBrew()
	 * @generated
	 */
	EAttribute getBrew_ProdQuantity();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.renter.Brew#getBrewDate <em>Brew Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brew Date</em>'.
	 * @see fr.imta.fil.renter.Brew#getBrewDate()
	 * @see #getBrew()
	 * @generated
	 */
	EAttribute getBrew_BrewDate();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.renter.Brew#getBrewers <em>Brewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brewers</em>'.
	 * @see fr.imta.fil.renter.Brew#getBrewers()
	 * @see #getBrew()
	 * @generated
	 */
	EReference getBrew_Brewers();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.renter.Brewer <em>Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brewer</em>'.
	 * @see fr.imta.fil.renter.Brewer
	 * @generated
	 */
	EClass getBrewer();

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
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__VOLUME = eINSTANCE.getVehicle_Volume();

		/**
		 * The meta object literal for the '<em><b>Brew</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__BREW = eINSTANCE.getVehicle_Brew();

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
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.BrewImpl <em>Brew</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.BrewImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getBrew()
		 * @generated
		 */
		EClass BREW = eINSTANCE.getBrew();

		/**
		 * The meta object literal for the '<em><b>Id Brew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREW__ID_BREW = eINSTANCE.getBrew_IdBrew();

		/**
		 * The meta object literal for the '<em><b>Recipe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREW__RECIPE = eINSTANCE.getBrew_Recipe();

		/**
		 * The meta object literal for the '<em><b>Prod Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREW__PROD_QUANTITY = eINSTANCE.getBrew_ProdQuantity();

		/**
		 * The meta object literal for the '<em><b>Brew Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREW__BREW_DATE = eINSTANCE.getBrew_BrewDate();

		/**
		 * The meta object literal for the '<em><b>Brewers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREW__BREWERS = eINSTANCE.getBrew_Brewers();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.renter.impl.BrewerImpl <em>Brewer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.renter.impl.BrewerImpl
		 * @see fr.imta.fil.renter.impl.RenterPackageImpl#getBrewer()
		 * @generated
		 */
		EClass BREWER = eINSTANCE.getBrewer();

	}

} //RenterPackage
