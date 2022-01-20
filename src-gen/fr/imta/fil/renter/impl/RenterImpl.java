/**
 */
package fr.imta.fil.renter.impl;

import fr.imta.fil.renter.Client;
import fr.imta.fil.renter.Employee;
import fr.imta.fil.renter.Rent;
import fr.imta.fil.renter.Renter;
import fr.imta.fil.renter.RenterPackage;
import fr.imta.fil.renter.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.impl.RenterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RenterImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RenterImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RenterImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.RenterImpl#getRents <em>Rents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenterImpl extends MinimalEObjectImpl.Container implements Renter {
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
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * The cached value of the '{@link #getRents() <em>Rents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRents()
	 * @generated
	 * @ordered
	 */
	protected EList<Rent> rents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RenterPackage.Literals.RENTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.RENTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, RenterPackage.RENTER__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectContainmentEList<Vehicle>(Vehicle.class, this, RenterPackage.RENTER__VEHICLES);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList<Client>(Client.class, this, RenterPackage.RENTER__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rent> getRents() {
		if (rents == null) {
			rents = new EObjectContainmentEList<Rent>(Rent.class, this, RenterPackage.RENTER__RENTS);
		}
		return rents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RenterPackage.RENTER__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case RenterPackage.RENTER__VEHICLES:
				return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
			case RenterPackage.RENTER__CLIENTS:
				return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
			case RenterPackage.RENTER__RENTS:
				return ((InternalEList<?>)getRents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RenterPackage.RENTER__NAME:
				return getName();
			case RenterPackage.RENTER__EMPLOYEES:
				return getEmployees();
			case RenterPackage.RENTER__VEHICLES:
				return getVehicles();
			case RenterPackage.RENTER__CLIENTS:
				return getClients();
			case RenterPackage.RENTER__RENTS:
				return getRents();
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
			case RenterPackage.RENTER__NAME:
				setName((String)newValue);
				return;
			case RenterPackage.RENTER__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case RenterPackage.RENTER__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case RenterPackage.RENTER__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends Client>)newValue);
				return;
			case RenterPackage.RENTER__RENTS:
				getRents().clear();
				getRents().addAll((Collection<? extends Rent>)newValue);
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
			case RenterPackage.RENTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RenterPackage.RENTER__EMPLOYEES:
				getEmployees().clear();
				return;
			case RenterPackage.RENTER__VEHICLES:
				getVehicles().clear();
				return;
			case RenterPackage.RENTER__CLIENTS:
				getClients().clear();
				return;
			case RenterPackage.RENTER__RENTS:
				getRents().clear();
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
			case RenterPackage.RENTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RenterPackage.RENTER__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case RenterPackage.RENTER__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
			case RenterPackage.RENTER__CLIENTS:
				return clients != null && !clients.isEmpty();
			case RenterPackage.RENTER__RENTS:
				return rents != null && !rents.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RenterImpl
