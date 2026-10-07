/**
 */
package fr.n7.petri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Pondere Entrant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.ArcPondereEntrant#getSource <em>Source</em>}</li>
 *   <li>{@link fr.n7.petri.ArcPondereEntrant#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getArcPondereEntrant()
 * @model
 * @generated
 */
public interface ArcPondereEntrant extends ArcPondere {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Place)
	 * @see fr.n7.petri.PetriPackage#getArcPondereEntrant_Source()
	 * @model required="true"
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link fr.n7.petri.ArcPondereEntrant#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Place value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.n7.petri.Transition#getArcsEntrants <em>Arcs Entrants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Transition)
	 * @see fr.n7.petri.PetriPackage#getArcPondereEntrant_Destination()
	 * @see fr.n7.petri.Transition#getArcsEntrants
	 * @model opposite="arcsEntrants" required="true"
	 * @generated
	 */
	Transition getDestination();

	/**
	 * Sets the value of the '{@link fr.n7.petri.ArcPondereEntrant#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Transition value);

} // ArcPondereEntrant
