/**
 */
package Petri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Places</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Petri.Places#getJetons <em>Jetons</em>}</li>
 *   <li>{@link Petri.Places#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see Petri.PetriPackage#getPlaces()
 * @model
 * @generated
 */
public interface Places extends Composants {
	/**
	 * Returns the value of the '<em><b>Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetons</em>' attribute.
	 * @see #setJetons(int)
	 * @see Petri.PetriPackage#getPlaces_Jetons()
	 * @model required="true"
	 * @generated
	 */
	int getJetons();

	/**
	 * Sets the value of the '{@link Petri.Places#getJetons <em>Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jetons</em>' attribute.
	 * @see #getJetons()
	 * @generated
	 */
	void setJetons(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see Petri.PetriPackage#getPlaces_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link Petri.Places#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Places
