/**
 */
package Petri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Petri.Transitions#getNom <em>Nom</em>}</li>
 *   <li>{@link Petri.Transitions#getIntervalle_temps <em>Intervalle temps</em>}</li>
 * </ul>
 *
 * @see Petri.PetriPackage#getTransitions()
 * @model
 * @generated
 */
public interface Transitions extends Composants {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see Petri.PetriPackage#getTransitions_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link Petri.Transitions#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Intervalle temps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle temps</em>' containment reference.
	 * @see #setIntervalle_temps(Temps)
	 * @see Petri.PetriPackage#getTransitions_Intervalle_temps()
	 * @model containment="true"
	 * @generated
	 */
	Temps getIntervalle_temps();

	/**
	 * Sets the value of the '{@link Petri.Transitions#getIntervalle_temps <em>Intervalle temps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle temps</em>' containment reference.
	 * @see #getIntervalle_temps()
	 * @generated
	 */
	void setIntervalle_temps(Temps value);

} // Transitions
