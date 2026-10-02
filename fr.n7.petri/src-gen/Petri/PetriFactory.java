/**
 */
package Petri;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Petri.PetriPackage
 * @generated
 */
public interface PetriFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriFactory eINSTANCE = Petri.impl.PetriFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Places</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Places</em>'.
	 * @generated
	 */
	Places createPlaces();

	/**
	 * Returns a new object of class '<em>Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transitions</em>'.
	 * @generated
	 */
	Transitions createTransitions();

	/**
	 * Returns a new object of class '<em>Arcs Ponderes Entrants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arcs Ponderes Entrants</em>'.
	 * @generated
	 */
	ArcsPonderesEntrants createArcsPonderesEntrants();

	/**
	 * Returns a new object of class '<em>Arcs Ponderes Sortants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arcs Ponderes Sortants</em>'.
	 * @generated
	 */
	ArcsPonderesSortants createArcsPonderesSortants();

	/**
	 * Returns a new object of class '<em>Reseau Petri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reseau Petri</em>'.
	 * @generated
	 */
	ReseauPetri createReseauPetri();

	/**
	 * Returns a new object of class '<em>Composants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composants</em>'.
	 * @generated
	 */
	Composants createComposants();

	/**
	 * Returns a new object of class '<em>Arc Lecture Seule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc Lecture Seule</em>'.
	 * @generated
	 */
	ArcLectureSeule createArcLectureSeule();

	/**
	 * Returns a new object of class '<em>Temps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temps</em>'.
	 * @generated
	 */
	Temps createTemps();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PetriPackage getPetriPackage();

} //PetriFactory
