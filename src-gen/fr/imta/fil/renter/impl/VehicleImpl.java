/**
 */
package fr.imta.fil.renter.impl;

import fr.imta.fil.renter.Brew;
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
 *   <li>{@link fr.imta.fil.renter.impl.VehicleImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.VehicleImpl#getBrew <em>Brew</em>}</li>
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
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final Float VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected Float volume = VOLUME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBrew() <em>Brew</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrew()
	 * @generated
	 * @ordered
	 */
	protected EList<Brew> brew;

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
	public Float getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(Float newVolume) {
		Float oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.VEHICLE__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brew> getBrew() {
		if (brew == null) {
			brew = new EObjectResolvingEList<Brew>(Brew.class, this, RenterPackage.VEHICLE__BREW);
		}
		return brew;
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
			case RenterPackage.VEHICLE__VOLUME:
				return getVolume();
			case RenterPackage.VEHICLE__BREW:
				return getBrew();
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
			case RenterPackage.VEHICLE__VOLUME:
				setVolume((Float)newValue);
				return;
			case RenterPackage.VEHICLE__BREW:
				getBrew().clear();
				getBrew().addAll((Collection<? extends Brew>)newValue);
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
			case RenterPackage.VEHICLE__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case RenterPackage.VEHICLE__BREW:
				getBrew().clear();
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
			case RenterPackage.VEHICLE__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case RenterPackage.VEHICLE__BREW:
				return brew != null && !brew.isEmpty();
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
		result.append(", volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
