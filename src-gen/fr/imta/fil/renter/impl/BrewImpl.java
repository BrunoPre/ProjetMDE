/**
 */
package fr.imta.fil.renter.impl;

import fr.imta.fil.renter.Brew;
import fr.imta.fil.renter.Brewer;
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
 * An implementation of the model object '<em><b>Brew</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.impl.BrewImpl#getIdBrew <em>Id Brew</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.BrewImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.BrewImpl#getProdQuantity <em>Prod Quantity</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.BrewImpl#getBrewDate <em>Brew Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.impl.BrewImpl#getBrewers <em>Brewers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrewImpl extends MinimalEObjectImpl.Container implements Brew {
	/**
	 * The default value of the '{@link #getIdBrew() <em>Id Brew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBrew()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_BREW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdBrew() <em>Id Brew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBrew()
	 * @generated
	 * @ordered
	 */
	protected Integer idBrew = ID_BREW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipe() <em>Recipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected String recipe = RECIPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdQuantity() <em>Prod Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Float PROD_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdQuantity() <em>Prod Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdQuantity()
	 * @generated
	 * @ordered
	 */
	protected Float prodQuantity = PROD_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrewDate() <em>Brew Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BREW_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrewDate() <em>Brew Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrewDate()
	 * @generated
	 * @ordered
	 */
	protected Date brewDate = BREW_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBrewers() <em>Brewers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrewers()
	 * @generated
	 * @ordered
	 */
	protected EList<Brewer> brewers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RenterPackage.Literals.BREW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIdBrew() {
		return idBrew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdBrew(Integer newIdBrew) {
		Integer oldIdBrew = idBrew;
		idBrew = newIdBrew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.BREW__ID_BREW, oldIdBrew, idBrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipe() {
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipe(String newRecipe) {
		String oldRecipe = recipe;
		recipe = newRecipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.BREW__RECIPE, oldRecipe, recipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getProdQuantity() {
		return prodQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProdQuantity(Float newProdQuantity) {
		Float oldProdQuantity = prodQuantity;
		prodQuantity = newProdQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.BREW__PROD_QUANTITY, oldProdQuantity, prodQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBrewDate() {
		return brewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrewDate(Date newBrewDate) {
		Date oldBrewDate = brewDate;
		brewDate = newBrewDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RenterPackage.BREW__BREW_DATE, oldBrewDate, brewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brewer> getBrewers() {
		if (brewers == null) {
			brewers = new EObjectResolvingEList<Brewer>(Brewer.class, this, RenterPackage.BREW__BREWERS);
		}
		return brewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RenterPackage.BREW__ID_BREW:
				return getIdBrew();
			case RenterPackage.BREW__RECIPE:
				return getRecipe();
			case RenterPackage.BREW__PROD_QUANTITY:
				return getProdQuantity();
			case RenterPackage.BREW__BREW_DATE:
				return getBrewDate();
			case RenterPackage.BREW__BREWERS:
				return getBrewers();
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
			case RenterPackage.BREW__ID_BREW:
				setIdBrew((Integer)newValue);
				return;
			case RenterPackage.BREW__RECIPE:
				setRecipe((String)newValue);
				return;
			case RenterPackage.BREW__PROD_QUANTITY:
				setProdQuantity((Float)newValue);
				return;
			case RenterPackage.BREW__BREW_DATE:
				setBrewDate((Date)newValue);
				return;
			case RenterPackage.BREW__BREWERS:
				getBrewers().clear();
				getBrewers().addAll((Collection<? extends Brewer>)newValue);
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
			case RenterPackage.BREW__ID_BREW:
				setIdBrew(ID_BREW_EDEFAULT);
				return;
			case RenterPackage.BREW__RECIPE:
				setRecipe(RECIPE_EDEFAULT);
				return;
			case RenterPackage.BREW__PROD_QUANTITY:
				setProdQuantity(PROD_QUANTITY_EDEFAULT);
				return;
			case RenterPackage.BREW__BREW_DATE:
				setBrewDate(BREW_DATE_EDEFAULT);
				return;
			case RenterPackage.BREW__BREWERS:
				getBrewers().clear();
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
			case RenterPackage.BREW__ID_BREW:
				return ID_BREW_EDEFAULT == null ? idBrew != null : !ID_BREW_EDEFAULT.equals(idBrew);
			case RenterPackage.BREW__RECIPE:
				return RECIPE_EDEFAULT == null ? recipe != null : !RECIPE_EDEFAULT.equals(recipe);
			case RenterPackage.BREW__PROD_QUANTITY:
				return PROD_QUANTITY_EDEFAULT == null ? prodQuantity != null : !PROD_QUANTITY_EDEFAULT.equals(prodQuantity);
			case RenterPackage.BREW__BREW_DATE:
				return BREW_DATE_EDEFAULT == null ? brewDate != null : !BREW_DATE_EDEFAULT.equals(brewDate);
			case RenterPackage.BREW__BREWERS:
				return brewers != null && !brewers.isEmpty();
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
		result.append(" (idBrew: ");
		result.append(idBrew);
		result.append(", recipe: ");
		result.append(recipe);
		result.append(", prodQuantity: ");
		result.append(prodQuantity);
		result.append(", brewDate: ");
		result.append(brewDate);
		result.append(')');
		return result.toString();
	}

} //BrewImpl
