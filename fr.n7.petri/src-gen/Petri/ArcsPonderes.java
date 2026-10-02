/**
 */
package Petri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arcs Ponderes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Petri.ArcsPonderes#getPonderation <em>Ponderation</em>}</li>
 * </ul>
 *
 * @see Petri.PetriPackage#getArcsPonderes()
 * @model abstract="true"
 * @generated
 */
public interface ArcsPonderes extends Composants {
	/**
	 * Returns the value of the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ponderation</em>' attribute.
	 * @see #setPonderation(int)
	 * @see Petri.PetriPackage#getArcsPonderes_Ponderation()
	 * @model required="true"
	 * @generated
	 */
	int getPonderation();

	/**
	 * Sets the value of the '{@link Petri.ArcsPonderes#getPonderation <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ponderation</em>' attribute.
	 * @see #getPonderation()
	 * @generated
	 */
	void setPonderation(int value);

} // ArcsPonderes
