/**
 */
package fr.imta.fil.renter.impl;

import fr.imta.fil.renter.Rent;
import fr.imta.fil.renter.RenterPackage;
import fr.imta.fil.renter.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.impl.VehicleImpl#getIdVehicle <em>Id Vehicle</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.VehicleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.VehicleImpl#getHoldingCapacity <em>Holding Capacity</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.VehicleImpl#getRent <em>Rent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
	/**
	 * The default value of the '{@link #getIdVehicle() <em>Id Vehicle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdVehicle()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_VEHICLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdVehicle() <em>Id Vehicle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdVehicle()
	 * @generated
	 * @ordered
	 */
	protected Integer idVehicle = ID_VEHICLE_EDEFAULT;

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
	 * The default value of the '{@link #getHoldingCapacity() <em>Holding Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldingCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Float HOLDING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoldingCapacity() <em>Holding Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldingCapacity()
	 * @generated
	 * @ordered
	 */
	protected Float holdingCapacity = HOLDING_CAPACITY_EDEFAULT;

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
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RenterPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIdVehicle() {
		return idVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdVehicle(Integer newIdVehicle) {
		Integer oldIdVehicle = idVehicle;
		idVehicle = newIdVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.VEHICLE__ID_VEHICLE, oldIdVehicle, idVehicle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.VEHICLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getHoldingCapacity() {
		return holdingCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldingCapacity(Float newHoldingCapacity) {
		Float oldHoldingCapacity = holdingCapacity;
		holdingCapacity = newHoldingCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.VEHICLE__HOLDING_CAPACITY, oldHoldingCapacity, holdingCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rent> getRent() {
		if (rent == null) {
			rent = new EObjectResolvingEList<Rent>(Rent.class, this, RenterPackage.VEHICLE__RENT);
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
			case RenterPackage.VEHICLE__ID_VEHICLE:
				return getIdVehicle();
			case RenterPackage.VEHICLE__NAME:
				return getName();
			case RenterPackage.VEHICLE__HOLDING_CAPACITY:
				return getHoldingCapacity();
			case RenterPackage.VEHICLE__RENT:
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
			case RenterPackage.VEHICLE__ID_VEHICLE:
				setIdVehicle((Integer)newValue);
				return;
			case RenterPackage.VEHICLE__NAME:
				setName((String)newValue);
				return;
			case RenterPackage.VEHICLE__HOLDING_CAPACITY:
				setHoldingCapacity((Float)newValue);
				return;
			case RenterPackage.VEHICLE__RENT:
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
			case RenterPackage.VEHICLE__ID_VEHICLE:
				setIdVehicle(ID_VEHICLE_EDEFAULT);
				return;
			case RenterPackage.VEHICLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RenterPackage.VEHICLE__HOLDING_CAPACITY:
				setHoldingCapacity(HOLDING_CAPACITY_EDEFAULT);
				return;
			case RenterPackage.VEHICLE__RENT:
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
			case RenterPackage.VEHICLE__ID_VEHICLE:
				return ID_VEHICLE_EDEFAULT == null ? idVehicle != null : !ID_VEHICLE_EDEFAULT.equals(idVehicle);
			case RenterPackage.VEHICLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RenterPackage.VEHICLE__HOLDING_CAPACITY:
				return HOLDING_CAPACITY_EDEFAULT == null ? holdingCapacity != null : !HOLDING_CAPACITY_EDEFAULT.equals(holdingCapacity);
			case RenterPackage.VEHICLE__RENT:
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
		result.append(" (idVehicle: ");
		result.append(idVehicle);
		result.append(", name: ");
		result.append(name);
		result.append(", holdingCapacity: ");
		result.append(holdingCapacity);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
