/**
 */
package fr.n7.petri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Pondere Sortant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.ArcPondereSortant#getSource <em>Source</em>}</li>
 *   <li>{@link fr.n7.petri.ArcPondereSortant#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getArcPondereSortant()
 * @model
 * @generated
 */
public interface ArcPondereSortant extends ArcPondede {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Transition)
	 * @see fr.n7.petri.PetriPackage#getArcPondereSortant_Source()
	 * @model required="true"
	 * @generated
	 */
	Transition getSource();

	/**
	 * Sets the value of the '{@link fr.n7.petri.ArcPondereSortant#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Transition value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Place)
	 * @see fr.n7.petri.PetriPackage#getArcPondereSortant_Destination()
	 * @model required="true"
	 * @generated
	 */
	Place getDestination();

	/**
	 * Sets the value of the '{@link fr.n7.petri.ArcPondereSortant#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Place value);

} // ArcPondereSortant
