/**
 */
package fr.imta.fil.renter.impl;

import fr.imta.fil.renter.Client;
import fr.imta.fil.renter.Rent;
import fr.imta.fil.renter.RenterPackage;
import fr.imta.fil.renter.Vehicle;

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
 * An implementation of the model object '<em><b>Rent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.impl.RentImpl#getIdRent <em>Id Rent</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RentImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RentImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RentImpl#getClient <em>Client</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RentImpl#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentImpl extends MinimalEObjectImpl.Container implements Rent {
	/**
	 * The default value of the '{@link #getIdRent() <em>Id Rent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_RENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdRent() <em>Id Rent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRent()
	 * @generated
	 * @ordered
	 */
	protected Integer idRent = ID_RENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> client;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RenterPackage.Literals.RENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIdRent() {
		return idRent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRent(Integer newIdRent) {
		Integer oldIdRent = idRent;
		idRent = newIdRent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.RENT__ID_RENT, oldIdRent, idRent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.RENT__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.RENT__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClient() {
		if (client == null) {
			client = new EObjectResolvingEList<Client>(Client.class, this, RenterPackage.RENT__CLIENT);
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getVehicle() {
		if (vehicle == null) {
			vehicle = new EObjectResolvingEList<Vehicle>(Vehicle.class, this, RenterPackage.RENT__VEHICLE);
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RenterPackage.RENT__ID_RENT:
				return getIdRent();
			case RenterPackage.RENT__START_DATE:
				return getStartDate();
			case RenterPackage.RENT__END_DATE:
				return getEndDate();
			case RenterPackage.RENT__CLIENT:
				return getClient();
			case RenterPackage.RENT__VEHICLE:
				return getVehicle();
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
			case RenterPackage.RENT__ID_RENT:
				setIdRent((Integer)newValue);
				return;
			case RenterPackage.RENT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case RenterPackage.RENT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case RenterPackage.RENT__CLIENT:
				getClient().clear();
				getClient().addAll((Collection<? extends Client>)newValue);
				return;
			case RenterPackage.RENT__VEHICLE:
				getVehicle().clear();
				getVehicle().addAll((Collection<? extends Vehicle>)newValue);
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
			case RenterPackage.RENT__ID_RENT:
				setIdRent(ID_RENT_EDEFAULT);
				return;
			case RenterPackage.RENT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case RenterPackage.RENT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case RenterPackage.RENT__CLIENT:
				getClient().clear();
				return;
			case RenterPackage.RENT__VEHICLE:
				getVehicle().clear();
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
			case RenterPackage.RENT__ID_RENT:
				return ID_RENT_EDEFAULT == null ? idRent != null : !ID_RENT_EDEFAULT.equals(idRent);
			case RenterPackage.RENT__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case RenterPackage.RENT__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case RenterPackage.RENT__CLIENT:
				return client != null && !client.isEmpty();
			case RenterPackage.RENT__VEHICLE:
				return vehicle != null && !vehicle.isEmpty();
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
		result.append(" (idRent: ");
		result.append(idRent);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //RentImpl
