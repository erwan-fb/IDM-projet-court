/**
 */
package Petri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arcs Ponderes Sortants</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Petri.ArcsPonderesSortants#getTransition <em>Transition</em>}</li>
 *   <li>{@link Petri.ArcsPonderesSortants#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see Petri.PetriPackage#getArcsPonderesSortants()
 * @model
 * @generated
 */
public interface ArcsPonderesSortants extends ArcsPonderes {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transitions)
	 * @see Petri.PetriPackage#getArcsPonderesSortants_Transition()
	 * @model required="true"
	 * @generated
	 */
	Transitions getTransition();

	/**
	 * Sets the value of the '{@link Petri.ArcsPonderesSortants#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transitions value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Places)
	 * @see Petri.PetriPackage#getArcsPonderesSortants_Destination()
	 * @model required="true"
	 * @generated
	 */
	Places getDestination();

	/**
	 * Sets the value of the '{@link Petri.ArcsPonderesSortants#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Places value);

} // ArcsPonderesSortants
