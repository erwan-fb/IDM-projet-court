/**
 */
package fr.n7.petri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.Place#getJetons <em>Jetons</em>}</li>
 *   <li>{@link fr.n7.petri.Place#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Composant {
	/**
	 * Returns the value of the '<em><b>Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetons</em>' attribute.
	 * @see #setJetons(int)
	 * @see fr.n7.petri.PetriPackage#getPlace_Jetons()
	 * @model required="true"
	 * @generated
	 */
	int getJetons();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Place#getJetons <em>Jetons</em>}' attribute.
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
	 * @see fr.n7.petri.PetriPackage#getPlace_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Place#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Place
