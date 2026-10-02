/**
 */
package Petri;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Petri.PetriFactory
 * @model kind="package"
 * @generated
 */
public interface PetriPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Petri";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Petri";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriPackage eINSTANCE = Petri.impl.PetriPackageImpl.init();

	/**
	 * The meta object id for the '{@link Petri.impl.ComposantsImpl <em>Composants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.ComposantsImpl
	 * @see Petri.impl.PetriPackageImpl#getComposants()
	 * @generated
	 */
	int COMPOSANTS = 6;

	/**
	 * The number of structural features of the '<em>Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Petri.impl.PlacesImpl <em>Places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.PlacesImpl
	 * @see Petri.impl.PetriPackageImpl#getPlaces()
	 * @generated
	 */
	int PLACES = 0;

	/**
	 * The feature id for the '<em><b>Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACES__JETONS = COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACES__NOM = COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACES_FEATURE_COUNT = COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACES_OPERATION_COUNT = COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Petri.impl.TransitionsImpl <em>Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.TransitionsImpl
	 * @see Petri.impl.PetriPackageImpl#getTransitions()
	 * @generated
	 */
	int TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__NOM = COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intervalle temps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__INTERVALLE_TEMPS = COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS_FEATURE_COUNT = COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS_OPERATION_COUNT = COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Petri.impl.ArcsPonderesImpl <em>Arcs Ponderes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.ArcsPonderesImpl
	 * @see Petri.impl.PetriPackageImpl#getArcsPonderes()
	 * @generated
	 */
	int ARCS_PONDERES = 4;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES__PONDERATION = COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arcs Ponderes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_FEATURE_COUNT = COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arcs Ponderes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_OPERATION_COUNT = COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Petri.impl.ArcsPonderesEntrantsImpl <em>Arcs Ponderes Entrants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.ArcsPonderesEntrantsImpl
	 * @see Petri.impl.PetriPackageImpl#getArcsPonderesEntrants()
	 * @generated
	 */
	int ARCS_PONDERES_ENTRANTS = 2;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_ENTRANTS__PONDERATION = ARCS_PONDERES__PONDERATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_ENTRANTS__SOURCE = ARCS_PONDERES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_ENTRANTS__TRANSITION = ARCS_PONDERES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arcs Ponderes Entrants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_ENTRANTS_FEATURE_COUNT = ARCS_PONDERES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arcs Ponderes Entrants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_ENTRANTS_OPERATION_COUNT = ARCS_PONDERES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Petri.impl.ArcsPonderesSortantsImpl <em>Arcs Ponderes Sortants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.ArcsPonderesSortantsImpl
	 * @see Petri.impl.PetriPackageImpl#getArcsPonderesSortants()
	 * @generated
	 */
	int ARCS_PONDERES_SORTANTS = 3;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_SORTANTS__PONDERATION = ARCS_PONDERES__PONDERATION;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_SORTANTS__TRANSITION = ARCS_PONDERES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_SORTANTS__DESTINATION = ARCS_PONDERES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arcs Ponderes Sortants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_SORTANTS_FEATURE_COUNT = ARCS_PONDERES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arcs Ponderes Sortants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_SORTANTS_OPERATION_COUNT = ARCS_PONDERES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Petri.impl.ReseauPetriImpl <em>Reseau Petri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.ReseauPetriImpl
	 * @see Petri.impl.PetriPackageImpl#getReseauPetri()
	 * @generated
	 */
	int RESEAU_PETRI = 5;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI__NOM = 1;

	/**
	 * The number of structural features of the '<em>Reseau Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reseau Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Petri.impl.ArcLectureSeuleImpl <em>Arc Lecture Seule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.ArcLectureSeuleImpl
	 * @see Petri.impl.PetriPackageImpl#getArcLectureSeule()
	 * @generated
	 */
	int ARC_LECTURE_SEULE = 7;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__PONDERATION = ARCS_PONDERES_ENTRANTS__PONDERATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__SOURCE = ARCS_PONDERES_ENTRANTS__SOURCE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__TRANSITION = ARCS_PONDERES_ENTRANTS__TRANSITION;

	/**
	 * The number of structural features of the '<em>Arc Lecture Seule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE_FEATURE_COUNT = ARCS_PONDERES_ENTRANTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arc Lecture Seule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE_OPERATION_COUNT = ARCS_PONDERES_ENTRANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Petri.impl.TempsImpl <em>Temps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Petri.impl.TempsImpl
	 * @see Petri.impl.PetriPackageImpl#getTemps()
	 * @generated
	 */
	int TEMPS = 8;

	/**
	 * The feature id for the '<em><b>Temps Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPS__TEMPS_MINIMUM = 0;

	/**
	 * The feature id for the '<em><b>Temps Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPS__TEMPS_MAXIMUM = 1;

	/**
	 * The number of structural features of the '<em>Temps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Temps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Petri.Places <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Places</em>'.
	 * @see Petri.Places
	 * @generated
	 */
	EClass getPlaces();

	/**
	 * Returns the meta object for the attribute '{@link Petri.Places#getJetons <em>Jetons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jetons</em>'.
	 * @see Petri.Places#getJetons()
	 * @see #getPlaces()
	 * @generated
	 */
	EAttribute getPlaces_Jetons();

	/**
	 * Returns the meta object for the attribute '{@link Petri.Places#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Petri.Places#getNom()
	 * @see #getPlaces()
	 * @generated
	 */
	EAttribute getPlaces_Nom();

	/**
	 * Returns the meta object for class '{@link Petri.Transitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitions</em>'.
	 * @see Petri.Transitions
	 * @generated
	 */
	EClass getTransitions();

	/**
	 * Returns the meta object for the attribute '{@link Petri.Transitions#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Petri.Transitions#getNom()
	 * @see #getTransitions()
	 * @generated
	 */
	EAttribute getTransitions_Nom();

	/**
	 * Returns the meta object for the containment reference '{@link Petri.Transitions#getIntervalle_temps <em>Intervalle temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intervalle temps</em>'.
	 * @see Petri.Transitions#getIntervalle_temps()
	 * @see #getTransitions()
	 * @generated
	 */
	EReference getTransitions_Intervalle_temps();

	/**
	 * Returns the meta object for class '{@link Petri.ArcsPonderesEntrants <em>Arcs Ponderes Entrants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arcs Ponderes Entrants</em>'.
	 * @see Petri.ArcsPonderesEntrants
	 * @generated
	 */
	EClass getArcsPonderesEntrants();

	/**
	 * Returns the meta object for the reference '{@link Petri.ArcsPonderesEntrants#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Petri.ArcsPonderesEntrants#getSource()
	 * @see #getArcsPonderesEntrants()
	 * @generated
	 */
	EReference getArcsPonderesEntrants_Source();

	/**
	 * Returns the meta object for the reference '{@link Petri.ArcsPonderesEntrants#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see Petri.ArcsPonderesEntrants#getTransition()
	 * @see #getArcsPonderesEntrants()
	 * @generated
	 */
	EReference getArcsPonderesEntrants_Transition();

	/**
	 * Returns the meta object for class '{@link Petri.ArcsPonderesSortants <em>Arcs Ponderes Sortants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arcs Ponderes Sortants</em>'.
	 * @see Petri.ArcsPonderesSortants
	 * @generated
	 */
	EClass getArcsPonderesSortants();

	/**
	 * Returns the meta object for the reference '{@link Petri.ArcsPonderesSortants#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see Petri.ArcsPonderesSortants#getTransition()
	 * @see #getArcsPonderesSortants()
	 * @generated
	 */
	EReference getArcsPonderesSortants_Transition();

	/**
	 * Returns the meta object for the reference '{@link Petri.ArcsPonderesSortants#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see Petri.ArcsPonderesSortants#getDestination()
	 * @see #getArcsPonderesSortants()
	 * @generated
	 */
	EReference getArcsPonderesSortants_Destination();

	/**
	 * Returns the meta object for class '{@link Petri.ArcsPonderes <em>Arcs Ponderes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arcs Ponderes</em>'.
	 * @see Petri.ArcsPonderes
	 * @generated
	 */
	EClass getArcsPonderes();

	/**
	 * Returns the meta object for the attribute '{@link Petri.ArcsPonderes#getPonderation <em>Ponderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ponderation</em>'.
	 * @see Petri.ArcsPonderes#getPonderation()
	 * @see #getArcsPonderes()
	 * @generated
	 */
	EAttribute getArcsPonderes_Ponderation();

	/**
	 * Returns the meta object for class '{@link Petri.ReseauPetri <em>Reseau Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reseau Petri</em>'.
	 * @see Petri.ReseauPetri
	 * @generated
	 */
	EClass getReseauPetri();

	/**
	 * Returns the meta object for the containment reference list '{@link Petri.ReseauPetri#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see Petri.ReseauPetri#getElements()
	 * @see #getReseauPetri()
	 * @generated
	 */
	EReference getReseauPetri_Elements();

	/**
	 * Returns the meta object for the attribute '{@link Petri.ReseauPetri#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Petri.ReseauPetri#getNom()
	 * @see #getReseauPetri()
	 * @generated
	 */
	EAttribute getReseauPetri_Nom();

	/**
	 * Returns the meta object for class '{@link Petri.Composants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composants</em>'.
	 * @see Petri.Composants
	 * @generated
	 */
	EClass getComposants();

	/**
	 * Returns the meta object for class '{@link Petri.ArcLectureSeule <em>Arc Lecture Seule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Lecture Seule</em>'.
	 * @see Petri.ArcLectureSeule
	 * @generated
	 */
	EClass getArcLectureSeule();

	/**
	 * Returns the meta object for class '{@link Petri.Temps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temps</em>'.
	 * @see Petri.Temps
	 * @generated
	 */
	EClass getTemps();

	/**
	 * Returns the meta object for the attribute '{@link Petri.Temps#getTempsMinimum <em>Temps Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Minimum</em>'.
	 * @see Petri.Temps#getTempsMinimum()
	 * @see #getTemps()
	 * @generated
	 */
	EAttribute getTemps_TempsMinimum();

	/**
	 * Returns the meta object for the attribute '{@link Petri.Temps#getTempsMaximum <em>Temps Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Maximum</em>'.
	 * @see Petri.Temps#getTempsMaximum()
	 * @see #getTemps()
	 * @generated
	 */
	EAttribute getTemps_TempsMaximum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriFactory getPetriFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Petri.impl.PlacesImpl <em>Places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.PlacesImpl
		 * @see Petri.impl.PetriPackageImpl#getPlaces()
		 * @generated
		 */
		EClass PLACES = eINSTANCE.getPlaces();

		/**
		 * The meta object literal for the '<em><b>Jetons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACES__JETONS = eINSTANCE.getPlaces_Jetons();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACES__NOM = eINSTANCE.getPlaces_Nom();

		/**
		 * The meta object literal for the '{@link Petri.impl.TransitionsImpl <em>Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.TransitionsImpl
		 * @see Petri.impl.PetriPackageImpl#getTransitions()
		 * @generated
		 */
		EClass TRANSITIONS = eINSTANCE.getTransitions();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITIONS__NOM = eINSTANCE.getTransitions_Nom();

		/**
		 * The meta object literal for the '<em><b>Intervalle temps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIONS__INTERVALLE_TEMPS = eINSTANCE.getTransitions_Intervalle_temps();

		/**
		 * The meta object literal for the '{@link Petri.impl.ArcsPonderesEntrantsImpl <em>Arcs Ponderes Entrants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.ArcsPonderesEntrantsImpl
		 * @see Petri.impl.PetriPackageImpl#getArcsPonderesEntrants()
		 * @generated
		 */
		EClass ARCS_PONDERES_ENTRANTS = eINSTANCE.getArcsPonderesEntrants();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCS_PONDERES_ENTRANTS__SOURCE = eINSTANCE.getArcsPonderesEntrants_Source();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCS_PONDERES_ENTRANTS__TRANSITION = eINSTANCE.getArcsPonderesEntrants_Transition();

		/**
		 * The meta object literal for the '{@link Petri.impl.ArcsPonderesSortantsImpl <em>Arcs Ponderes Sortants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.ArcsPonderesSortantsImpl
		 * @see Petri.impl.PetriPackageImpl#getArcsPonderesSortants()
		 * @generated
		 */
		EClass ARCS_PONDERES_SORTANTS = eINSTANCE.getArcsPonderesSortants();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCS_PONDERES_SORTANTS__TRANSITION = eINSTANCE.getArcsPonderesSortants_Transition();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCS_PONDERES_SORTANTS__DESTINATION = eINSTANCE.getArcsPonderesSortants_Destination();

		/**
		 * The meta object literal for the '{@link Petri.impl.ArcsPonderesImpl <em>Arcs Ponderes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.ArcsPonderesImpl
		 * @see Petri.impl.PetriPackageImpl#getArcsPonderes()
		 * @generated
		 */
		EClass ARCS_PONDERES = eINSTANCE.getArcsPonderes();

		/**
		 * The meta object literal for the '<em><b>Ponderation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCS_PONDERES__PONDERATION = eINSTANCE.getArcsPonderes_Ponderation();

		/**
		 * The meta object literal for the '{@link Petri.impl.ReseauPetriImpl <em>Reseau Petri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.ReseauPetriImpl
		 * @see Petri.impl.PetriPackageImpl#getReseauPetri()
		 * @generated
		 */
		EClass RESEAU_PETRI = eINSTANCE.getReseauPetri();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEAU_PETRI__ELEMENTS = eINSTANCE.getReseauPetri_Elements();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESEAU_PETRI__NOM = eINSTANCE.getReseauPetri_Nom();

		/**
		 * The meta object literal for the '{@link Petri.impl.ComposantsImpl <em>Composants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.ComposantsImpl
		 * @see Petri.impl.PetriPackageImpl#getComposants()
		 * @generated
		 */
		EClass COMPOSANTS = eINSTANCE.getComposants();

		/**
		 * The meta object literal for the '{@link Petri.impl.ArcLectureSeuleImpl <em>Arc Lecture Seule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.ArcLectureSeuleImpl
		 * @see Petri.impl.PetriPackageImpl#getArcLectureSeule()
		 * @generated
		 */
		EClass ARC_LECTURE_SEULE = eINSTANCE.getArcLectureSeule();

		/**
		 * The meta object literal for the '{@link Petri.impl.TempsImpl <em>Temps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Petri.impl.TempsImpl
		 * @see Petri.impl.PetriPackageImpl#getTemps()
		 * @generated
		 */
		EClass TEMPS = eINSTANCE.getTemps();

		/**
		 * The meta object literal for the '<em><b>Temps Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPS__TEMPS_MINIMUM = eINSTANCE.getTemps_TempsMinimum();

		/**
		 * The meta object literal for the '<em><b>Temps Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPS__TEMPS_MAXIMUM = eINSTANCE.getTemps_TempsMaximum();

	}

} //PetriPackage
