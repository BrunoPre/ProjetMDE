/**
 */
package fr.imta.fil.renter;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.Client#getIdClient <em>Id Client</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Client#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Client#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Client#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Client#getRent <em>Rent</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.renter.RenterPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Client</em>' attribute.
	 * @see #setIdClient(Integer)
	 * @see fr.imta.fil.renter.RenterPackage#getClient_IdClient()
	 * @model unique="false"
	 * @generated
	 */
	Integer getIdClient();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Client#getIdClient <em>Id Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Client</em>' attribute.
	 * @see #getIdClient()
	 * @generated
	 */
	void setIdClient(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.fil.renter.RenterPackage#getClient_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Client#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(Integer)
	 * @see fr.imta.fil.renter.RenterPackage#getClient_PhoneNumber()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPhoneNumber();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Client#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #setBirthDate(Date)
	 * @see fr.imta.fil.renter.RenterPackage#getClient_BirthDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Client#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Rent</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.renter.Rent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rent</em>' reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getClient_Rent()
	 * @model
	 * @generated
	 */
	EList<Rent> getRent();

} // Client
