/**
 */
package fr.imta.fil.renter;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.Rent#getIdRent <em>Id Rent</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Rent#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Rent#getEndDate <em>End Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Rent#getClient <em>Client</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Rent#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.renter.RenterPackage#getRent()
 * @model
 * @generated
 */
public interface Rent extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Rent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Rent</em>' attribute.
	 * @see #setIdRent(Integer)
	 * @see fr.imta.fil.renter.RenterPackage#getRent_IdRent()
	 * @model unique="false"
	 * @generated
	 */
	Integer getIdRent();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Rent#getIdRent <em>Id Rent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Rent</em>' attribute.
	 * @see #getIdRent()
	 * @generated
	 */
	void setIdRent(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see fr.imta.fil.renter.RenterPackage#getRent_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Rent#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see fr.imta.fil.renter.RenterPackage#getRent_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Rent#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.renter.Client}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getRent_Client()
	 * @model
	 * @generated
	 */
	EList<Client> getClient();

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.renter.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getRent_Vehicle()
	 * @model
	 * @generated
	 */
	EList<Vehicle> getVehicle();

} // Rent
