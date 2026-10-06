/**
 */
package fr.n7.petri;

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
 * @see fr.n7.petri.PetriFactory
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
	String eNAME = "petri";

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
	String eNS_PREFIX = "petri";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriPackage eINSTANCE = fr.n7.petri.impl.PetriPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.n7.petri.impl.ReseauPetriImpl <em>Reseau Petri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.ReseauPetriImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getReseauPetri()
	 * @generated
	 */
	int RESEAU_PETRI = 0;

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
	 * The meta object id for the '{@link fr.n7.petri.impl.ComposantsImpl <em>Composants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.ComposantsImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getComposants()
	 * @generated
	 */
	int COMPOSANTS = 1;

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
	 * The meta object id for the '{@link fr.n7.petri.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.PlaceImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__JETONS = COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NOM = COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.petri.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.TransitionImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NOM = COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intervalle Temps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INTERVALLE_TEMPS = COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.petri.impl.ArcPondereImpl <em>Arc Pondere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.ArcPondereImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getArcPondere()
	 * @generated
	 */
	int ARC_PONDERE = 4;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE__PONDERATION = COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc Pondere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_FEATURE_COUNT = COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arc Pondere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_OPERATION_COUNT = COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.petri.impl.ArcPondereEntrantImpl <em>Arc Pondere Entrant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.ArcPondereEntrantImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getArcPondereEntrant()
	 * @generated
	 */
	int ARC_PONDERE_ENTRANT = 5;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_ENTRANT__PONDERATION = ARC_PONDERE__PONDERATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_ENTRANT__SOURCE = ARC_PONDERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_ENTRANT__DESTINATION = ARC_PONDERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc Pondere Entrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_ENTRANT_FEATURE_COUNT = ARC_PONDERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arc Pondere Entrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_ENTRANT_OPERATION_COUNT = ARC_PONDERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.petri.impl.ArcPondereSortantImpl <em>Arc Pondere Sortant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.ArcPondereSortantImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getArcPondereSortant()
	 * @generated
	 */
	int ARC_PONDERE_SORTANT = 6;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_SORTANT__PONDERATION = ARC_PONDERE__PONDERATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_SORTANT__SOURCE = ARC_PONDERE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_SORTANT__DESTINATION = ARC_PONDERE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc Pondere Sortant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_SORTANT_FEATURE_COUNT = ARC_PONDERE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arc Pondere Sortant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_SORTANT_OPERATION_COUNT = ARC_PONDERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.petri.impl.ArcLectureSeuleImpl <em>Arc Lecture Seule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.ArcLectureSeuleImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getArcLectureSeule()
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
	int ARC_LECTURE_SEULE__PONDERATION = ARC_PONDERE_ENTRANT__PONDERATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__SOURCE = ARC_PONDERE_ENTRANT__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__DESTINATION = ARC_PONDERE_ENTRANT__DESTINATION;

	/**
	 * The number of structural features of the '<em>Arc Lecture Seule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE_FEATURE_COUNT = ARC_PONDERE_ENTRANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arc Lecture Seule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE_OPERATION_COUNT = ARC_PONDERE_ENTRANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.petri.impl.TempsImpl <em>Temps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.petri.impl.TempsImpl
	 * @see fr.n7.petri.impl.PetriPackageImpl#getTemps()
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
	 * Returns the meta object for class '{@link fr.n7.petri.ReseauPetri <em>Reseau Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reseau Petri</em>'.
	 * @see fr.n7.petri.ReseauPetri
	 * @generated
	 */
	EClass getReseauPetri();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.n7.petri.ReseauPetri#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.n7.petri.ReseauPetri#getElements()
	 * @see #getReseauPetri()
	 * @generated
	 */
	EReference getReseauPetri_Elements();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.petri.ReseauPetri#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.n7.petri.ReseauPetri#getNom()
	 * @see #getReseauPetri()
	 * @generated
	 */
	EAttribute getReseauPetri_Nom();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.Composants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composants</em>'.
	 * @see fr.n7.petri.Composants
	 * @generated
	 */
	EClass getComposants();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see fr.n7.petri.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.petri.Place#getJetons <em>Jetons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jetons</em>'.
	 * @see fr.n7.petri.Place#getJetons()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Jetons();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.petri.Place#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.n7.petri.Place#getNom()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Nom();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.n7.petri.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.petri.Transition#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.n7.petri.Transition#getNom()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Nom();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.petri.Transition#getIntervalleTemps <em>Intervalle Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intervalle Temps</em>'.
	 * @see fr.n7.petri.Transition#getIntervalleTemps()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_IntervalleTemps();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.ArcPondere <em>Arc Pondere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Pondere</em>'.
	 * @see fr.n7.petri.ArcPondere
	 * @generated
	 */
	EClass getArcPondere();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.petri.ArcPondere#getPonderation <em>Ponderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ponderation</em>'.
	 * @see fr.n7.petri.ArcPondere#getPonderation()
	 * @see #getArcPondere()
	 * @generated
	 */
	EAttribute getArcPondere_Ponderation();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.ArcPondereEntrant <em>Arc Pondere Entrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Pondere Entrant</em>'.
	 * @see fr.n7.petri.ArcPondereEntrant
	 * @generated
	 */
	EClass getArcPondereEntrant();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.petri.ArcPondereEntrant#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.n7.petri.ArcPondereEntrant#getSource()
	 * @see #getArcPondereEntrant()
	 * @generated
	 */
	EReference getArcPondereEntrant_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.petri.ArcPondereEntrant#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see fr.n7.petri.ArcPondereEntrant#getDestination()
	 * @see #getArcPondereEntrant()
	 * @generated
	 */
	EReference getArcPondereEntrant_Destination();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.ArcPondereSortant <em>Arc Pondere Sortant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Pondere Sortant</em>'.
	 * @see fr.n7.petri.ArcPondereSortant
	 * @generated
	 */
	EClass getArcPondereSortant();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.petri.ArcPondereSortant#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.n7.petri.ArcPondereSortant#getSource()
	 * @see #getArcPondereSortant()
	 * @generated
	 */
	EReference getArcPondereSortant_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.petri.ArcPondereSortant#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see fr.n7.petri.ArcPondereSortant#getDestination()
	 * @see #getArcPondereSortant()
	 * @generated
	 */
	EReference getArcPondereSortant_Destination();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.ArcLectureSeule <em>Arc Lecture Seule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Lecture Seule</em>'.
	 * @see fr.n7.petri.ArcLectureSeule
	 * @generated
	 */
	EClass getArcLectureSeule();

	/**
	 * Returns the meta object for class '{@link fr.n7.petri.Temps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temps</em>'.
	 * @see fr.n7.petri.Temps
	 * @generated
	 */
	EClass getTemps();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.petri.Temps#getTempsMinimum <em>Temps Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Minimum</em>'.
	 * @see fr.n7.petri.Temps#getTempsMinimum()
	 * @see #getTemps()
	 * @generated
	 */
	EAttribute getTemps_TempsMinimum();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.petri.Temps#getTempsMaximum <em>Temps Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Maximum</em>'.
	 * @see fr.n7.petri.Temps#getTempsMaximum()
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
		 * The meta object literal for the '{@link fr.n7.petri.impl.ReseauPetriImpl <em>Reseau Petri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.ReseauPetriImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getReseauPetri()
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
		 * The meta object literal for the '{@link fr.n7.petri.impl.ComposantsImpl <em>Composants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.ComposantsImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getComposants()
		 * @generated
		 */
		EClass COMPOSANTS = eINSTANCE.getComposants();

		/**
		 * The meta object literal for the '{@link fr.n7.petri.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.PlaceImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Jetons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__JETONS = eINSTANCE.getPlace_Jetons();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NOM = eINSTANCE.getPlace_Nom();

		/**
		 * The meta object literal for the '{@link fr.n7.petri.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.TransitionImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NOM = eINSTANCE.getTransition_Nom();

		/**
		 * The meta object literal for the '<em><b>Intervalle Temps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INTERVALLE_TEMPS = eINSTANCE.getTransition_IntervalleTemps();

		/**
		 * The meta object literal for the '{@link fr.n7.petri.impl.ArcPondereImpl <em>Arc Pondere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.ArcPondereImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getArcPondere()
		 * @generated
		 */
		EClass ARC_PONDERE = eINSTANCE.getArcPondere();

		/**
		 * The meta object literal for the '<em><b>Ponderation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_PONDERE__PONDERATION = eINSTANCE.getArcPondere_Ponderation();

		/**
		 * The meta object literal for the '{@link fr.n7.petri.impl.ArcPondereEntrantImpl <em>Arc Pondere Entrant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.ArcPondereEntrantImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getArcPondereEntrant()
		 * @generated
		 */
		EClass ARC_PONDERE_ENTRANT = eINSTANCE.getArcPondereEntrant();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_PONDERE_ENTRANT__SOURCE = eINSTANCE.getArcPondereEntrant_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_PONDERE_ENTRANT__DESTINATION = eINSTANCE.getArcPondereEntrant_Destination();

		/**
		 * The meta object literal for the '{@link fr.n7.petri.impl.ArcPondereSortantImpl <em>Arc Pondere Sortant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.ArcPondereSortantImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getArcPondereSortant()
		 * @generated
		 */
		EClass ARC_PONDERE_SORTANT = eINSTANCE.getArcPondereSortant();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_PONDERE_SORTANT__SOURCE = eINSTANCE.getArcPondereSortant_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_PONDERE_SORTANT__DESTINATION = eINSTANCE.getArcPondereSortant_Destination();

		/**
		 * The meta object literal for the '{@link fr.n7.petri.impl.ArcLectureSeuleImpl <em>Arc Lecture Seule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.ArcLectureSeuleImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getArcLectureSeule()
		 * @generated
		 */
		EClass ARC_LECTURE_SEULE = eINSTANCE.getArcLectureSeule();

		/**
		 * The meta object literal for the '{@link fr.n7.petri.impl.TempsImpl <em>Temps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.petri.impl.TempsImpl
		 * @see fr.n7.petri.impl.PetriPackageImpl#getTemps()
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
