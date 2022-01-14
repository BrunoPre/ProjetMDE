/**
 */
package fr.imta.fil.renter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.Vehicle#getIdVehicle <em>Id Vehicle</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Vehicle#getHoldingCapacity <em>Holding Capacity</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Vehicle#getRent <em>Rent</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.renter.RenterPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Vehicle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Vehicle</em>' attribute.
	 * @see #setIdVehicle(Integer)
	 * @see fr.imta.fil.renter.RenterPackage#getVehicle_IdVehicle()
	 * @model unique="false"
	 * @generated
	 */
	Integer getIdVehicle();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Vehicle#getIdVehicle <em>Id Vehicle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Vehicle</em>' attribute.
	 * @see #getIdVehicle()
	 * @generated
	 */
	void setIdVehicle(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.fil.renter.RenterPackage#getVehicle_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Holding Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holding Capacity</em>' attribute.
	 * @see #setHoldingCapacity(Float)
	 * @see fr.imta.fil.renter.RenterPackage#getVehicle_HoldingCapacity()
	 * @model unique="false"
	 * @generated
	 */
	Float getHoldingCapacity();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Vehicle#getHoldingCapacity <em>Holding Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holding Capacity</em>' attribute.
	 * @see #getHoldingCapacity()
	 * @generated
	 */
	void setHoldingCapacity(Float value);

	/**
	 * Returns the value of the '<em><b>Rent</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.renter.Rent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rent</em>' reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getVehicle_Rent()
	 * @model
	 * @generated
	 */
	EList<Rent> getRent();

} // Vehicle
