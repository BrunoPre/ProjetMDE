/**
 */
package fr.imta.fil.renter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.Renter#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Renter#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Renter#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Renter#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.renter.RenterPackage#getRenter()
 * @model
 * @generated
 */
public interface Renter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.fil.renter.RenterPackage#getRenter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Renter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.fil.renter.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getRenter_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.fil.renter.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' containment reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getRenter_Vehicles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vehicle> getVehicles();

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getRenter_Clients()
	 * @model type="org.eclipse.emf.ecore.EJavaObject" containment="true"
	 * @generated
	 */
	EList<Object> getClients();

} // Renter
