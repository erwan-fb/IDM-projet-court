/**
 */
package fr.n7.petri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.Transition#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.n7.petri.Transition#getIntervalleTemps <em>Intervalle Temps</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Composants {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.n7.petri.PetriPackage#getTransition_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Transition#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Intervalle Temps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Temps</em>' reference.
	 * @see #setIntervalleTemps(Temps)
	 * @see fr.n7.petri.PetriPackage#getTransition_IntervalleTemps()
	 * @model
	 * @generated
	 */
	Temps getIntervalleTemps();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Transition#getIntervalleTemps <em>Intervalle Temps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Temps</em>' reference.
	 * @see #getIntervalleTemps()
	 * @generated
	 */
	void setIntervalleTemps(Temps value);

} // Transition
