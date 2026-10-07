/**
 */
package fr.n7.petri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.Transition#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.n7.petri.Transition#getIntervalleTemps <em>Intervalle Temps</em>}</li>
 *   <li>{@link fr.n7.petri.Transition#getArcsEntrants <em>Arcs Entrants</em>}</li>
 *   <li>{@link fr.n7.petri.Transition#getArcsSortants <em>Arcs Sortants</em>}</li>
 * </ul>
 *
 * @see fr.n7.petri.PetriPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Composant {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.n7.petri.PetriPackage#getTransition_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Transition#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Intervalle Temps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Temps</em>' reference.
	 * @see #setIntervalleTemps(Temps)
	 * @see fr.n7.petri.PetriPackage#getTransition_IntervalleTemps()
	 * @model
	 * @generated
	 */
	Temps getIntervalleTemps();

	/**
	 * Sets the value of the '{@link fr.n7.petri.Transition#getIntervalleTemps <em>Intervalle Temps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Temps</em>' reference.
	 * @see #getIntervalleTemps()
	 * @generated
	 */
	void setIntervalleTemps(Temps value);

	/**
	 * Returns the value of the '<em><b>Arcs Entrants</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.petri.ArcPondereEntrant}.
	 * It is bidirectional and its opposite is '{@link fr.n7.petri.ArcPondereEntrant#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs Entrants</em>' reference list.
	 * @see fr.n7.petri.PetriPackage#getTransition_ArcsEntrants()
	 * @see fr.n7.petri.ArcPondereEntrant#getDestination
	 * @model opposite="destination" required="true"
	 * @generated
	 */
	EList<ArcPondereEntrant> getArcsEntrants();

	/**
	 * Returns the value of the '<em><b>Arcs Sortants</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.petri.ArcPondereSortant}.
	 * It is bidirectional and its opposite is '{@link fr.n7.petri.ArcPondereSortant#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs Sortants</em>' reference list.
	 * @see fr.n7.petri.PetriPackage#getTransition_ArcsSortants()
	 * @see fr.n7.petri.ArcPondereSortant#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	EList<ArcPondereSortant> getArcsSortants();

} // Transition
