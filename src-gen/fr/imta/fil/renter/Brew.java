/**
 */
package fr.imta.fil.renter;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.renter.Brew#getIdBrew <em>Id Brew</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Brew#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Brew#getProdQuantity <em>Prod Quantity</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Brew#getBrewDate <em>Brew Date</em>}</li>
 *   <li>{@link fr.imta.fil.renter.Brew#getBrewers <em>Brewers</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.renter.RenterPackage#getBrew()
 * @model
 * @generated
 */
public interface Brew extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Brew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Brew</em>' attribute.
	 * @see #setIdBrew(Integer)
	 * @see fr.imta.fil.renter.RenterPackage#getBrew_IdBrew()
	 * @model unique="false"
	 * @generated
	 */
	Integer getIdBrew();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Brew#getIdBrew <em>Id Brew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Brew</em>' attribute.
	 * @see #getIdBrew()
	 * @generated
	 */
	void setIdBrew(Integer value);

	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' attribute.
	 * @see #setRecipe(String)
	 * @see fr.imta.fil.renter.RenterPackage#getBrew_Recipe()
	 * @model unique="false"
	 * @generated
	 */
	String getRecipe();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Brew#getRecipe <em>Recipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe</em>' attribute.
	 * @see #getRecipe()
	 * @generated
	 */
	void setRecipe(String value);

	/**
	 * Returns the value of the '<em><b>Prod Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Quantity</em>' attribute.
	 * @see #setProdQuantity(Float)
	 * @see fr.imta.fil.renter.RenterPackage#getBrew_ProdQuantity()
	 * @model unique="false"
	 * @generated
	 */
	Float getProdQuantity();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Brew#getProdQuantity <em>Prod Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Quantity</em>' attribute.
	 * @see #getProdQuantity()
	 * @generated
	 */
	void setProdQuantity(Float value);

	/**
	 * Returns the value of the '<em><b>Brew Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brew Date</em>' attribute.
	 * @see #setBrewDate(Date)
	 * @see fr.imta.fil.renter.RenterPackage#getBrew_BrewDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getBrewDate();

	/**
	 * Sets the value of the '{@link fr.imta.fil.renter.Brew#getBrewDate <em>Brew Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brew Date</em>' attribute.
	 * @see #getBrewDate()
	 * @generated
	 */
	void setBrewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Brewers</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.renter.Brewer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brewers</em>' reference list.
	 * @see fr.imta.fil.renter.RenterPackage#getBrew_Brewers()
	 * @model
	 * @generated
	 */
	EList<Brewer> getBrewers();

} // Brew
