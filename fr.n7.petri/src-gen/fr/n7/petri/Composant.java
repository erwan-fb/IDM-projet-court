/**
 */
package fr.n7.petri;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.Composant#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getComposant()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Composant extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.n7.petri.ReseauPetri#getComposants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ReseauPetri)
	 * @see fr.n7.petri.PetriPackage#getComposant_Parent()
	 * @see fr.n7.petri.ReseauPetri#getComposants
	 * @model opposite="composants" transient="false"
	 * @generated
	 */
	ReseauPetri getParent();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Composant#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ReseauPetri value);
} // Composant
