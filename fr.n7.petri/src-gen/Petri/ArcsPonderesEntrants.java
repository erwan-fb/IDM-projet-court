/**
 */
package Petri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arcs Ponderes Entrants</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Petri.ArcsPonderesEntrants#getSource <em>Source</em>}</li>
 *   <li>{@link Petri.ArcsPonderesEntrants#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see Petri.PetriPackage#getArcsPonderesEntrants()
 * @model
 * @generated
 */
public interface ArcsPonderesEntrants extends ArcsPonderes {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Places)
	 * @see Petri.PetriPackage#getArcsPonderesEntrants_Source()
	 * @model required="true"
	 * @generated
	 */
	Places getSource();

	/**
	 * Sets the value of the '{@link Petri.ArcsPonderesEntrants#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Places value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transitions)
	 * @see Petri.PetriPackage#getArcsPonderesEntrants_Transition()
	 * @model required="true"
	 * @generated
	 */
	Transitions getTransition();

	/**
	 * Sets the value of the '{@link Petri.ArcsPonderesEntrants#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transitions value);

} // ArcsPonderesEntrants
