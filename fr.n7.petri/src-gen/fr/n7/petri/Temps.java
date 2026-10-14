/**
 */
package fr.n7.petri;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.Temps#getTempsMinimum <em>Temps Minimum</em>}</li>
 *   <li>{@link fr.n7.petri.Temps#getTempsMaximum <em>Temps Maximum</em>}</li>
 *   <li>{@link fr.n7.petri.Temps#isEstBorne <em>Est Borne</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getTemps()
 * @model
 * @generated
 */
public interface Temps extends EObject {
	/**
	 * Returns the value of the '<em><b>Temps Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Minimum</em>' attribute.
	 * @see #setTempsMinimum(int)
	 * @see fr.n7.petri.PetriPackage#getTemps_TempsMinimum()
	 * @model required="true"
	 * @generated
	 */
	int getTempsMinimum();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Temps#getTempsMinimum <em>Temps Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Minimum</em>' attribute.
	 * @see #getTempsMinimum()
	 * @generated
	 */
	void setTempsMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Temps Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Maximum</em>' attribute.
	 * @see #setTempsMaximum(int)
	 * @see fr.n7.petri.PetriPackage#getTemps_TempsMaximum()
	 * @model required="true"
	 * @generated
	 */
	int getTempsMaximum();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Temps#getTempsMaximum <em>Temps Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Maximum</em>' attribute.
	 * @see #getTempsMaximum()
	 * @generated
	 */
	void setTempsMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Est Borne</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Borne</em>' attribute.
	 * @see #setEstBorne(boolean)
	 * @see fr.n7.petri.PetriPackage#getTemps_EstBorne()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEstBorne();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Temps#isEstBorne <em>Est Borne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Borne</em>' attribute.
	 * @see #isEstBorne()
	 * @generated
	 */
	void setEstBorne(boolean value);

} // Temps
