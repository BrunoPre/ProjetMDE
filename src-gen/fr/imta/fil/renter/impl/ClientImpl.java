/**
 */
package fr.imta.fil.renter.impl;

import fr.imta.fil.renter.Client;
import fr.imta.fil.renter.Rent;
import fr.imta.fil.renter.RenterPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.impl.ClientImpl#getIdClient <em>Id Client</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.ClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.ClientImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.ClientImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.ClientImpl#getRent <em>Rent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends MinimalEObjectImpl.Container implements Client {
	/**
	 * The default value of the '{@link #getIdClient() <em>Id Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClient()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_CLIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdClient() <em>Id Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClient()
	 * @generated
	 * @ordered
	 */
	protected Integer idClient = ID_CLIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRent() <em>Rent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRent()
	 * @generated
	 * @ordered
	 */
	protected EList<Rent> rent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RenterPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIdClient() {
		return idClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdClient(Integer newIdClient) {
		Integer oldIdClient = idClient;
		idClient = newIdClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.CLIENT__ID_CLIENT, oldIdClient, idClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.CLIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(Integer newPhoneNumber) {
		Integer oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.CLIENT__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.CLIENT__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rent> getRent() {
		if (rent == null) {
			rent = new EObjectResolvingEList<Rent>(Rent.class, this, RenterPackage.CLIENT__RENT);
		}
		return rent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RenterPackage.CLIENT__ID_CLIENT:
				return getIdClient();
			case RenterPackage.CLIENT__NAME:
				return getName();
			case RenterPackage.CLIENT__PHONE_NUMBER:
				return getPhoneNumber();
			case RenterPackage.CLIENT__BIRTH_DATE:
				return getBirthDate();
			case RenterPackage.CLIENT__RENT:
				return getRent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RenterPackage.CLIENT__ID_CLIENT:
				setIdClient((Integer)newValue);
				return;
			case RenterPackage.CLIENT__NAME:
				setName((String)newValue);
				return;
			case RenterPackage.CLIENT__PHONE_NUMBER:
				setPhoneNumber((Integer)newValue);
				return;
			case RenterPackage.CLIENT__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case RenterPackage.CLIENT__RENT:
				getRent().clear();
				getRent().addAll((Collection<? extends Rent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RenterPackage.CLIENT__ID_CLIENT:
				setIdClient(ID_CLIENT_EDEFAULT);
				return;
			case RenterPackage.CLIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RenterPackage.CLIENT__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case RenterPackage.CLIENT__BIRTH_DATE:
				setBirthDate(BIRTH_DATE_EDEFAULT);
				return;
			case RenterPackage.CLIENT__RENT:
				getRent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RenterPackage.CLIENT__ID_CLIENT:
				return ID_CLIENT_EDEFAULT == null ? idClient != null : !ID_CLIENT_EDEFAULT.equals(idClient);
			case RenterPackage.CLIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RenterPackage.CLIENT__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case RenterPackage.CLIENT__BIRTH_DATE:
				return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
			case RenterPackage.CLIENT__RENT:
				return rent != null && !rent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idClient: ");
		result.append(idClient);
		result.append(", name: ");
		result.append(name);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", birthDate: ");
		result.append(birthDate);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
