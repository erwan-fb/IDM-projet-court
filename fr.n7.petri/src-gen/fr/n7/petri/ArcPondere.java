/**
 */
package fr.n7.petri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Pondere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.ArcPondere#getPonderation <em>Ponderation</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getArcPondere()
 * @model
 * @generated
 */
public interface ArcPondere extends Composant {
	/**
	 * Returns the value of the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ponderation</em>' attribute.
	 * @see #setPonderation(int)
	 * @see fr.n7.petri.PetriPackage#getArcPondere_Ponderation()
	 * @model required="true"
	 * @generated
	 */
	int getPonderation();

	/**
	 * Sets the value of the '{@link fr.n7.petri.ArcPondere#getPonderation <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ponderation</em>' attribute.
	 * @see #getPonderation()
	 * @generated
	 */
	void setPonderation(int value);

} // ArcPondere
