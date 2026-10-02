/**
 */
package Petri.impl;

import Petri.ArcLectureSeule;
import Petri.ArcsPonderes;
import Petri.ArcsPonderesEntrants;
import Petri.ArcsPonderesSortants;
import Petri.Composants;
import Petri.PetriFactory;
import Petri.PetriPackage;
import Petri.Places;
import Petri.ReseauPetri;
import Petri.Temps;
import Petri.Transitions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriPackageImpl extends EPackageImpl implements PetriPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcsPonderesEntrantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcsPonderesSortantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcsPonderesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reseauPetriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcLectureSeuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Petri.PetriPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetriPackageImpl() {
		super(eNS_URI, PetriFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PetriPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetriPackage init() {
		if (isInited) return (PetriPackage)EPackage.Registry.INSTANCE.getEPackage(PetriPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPetriPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PetriPackageImpl thePetriPackage = registeredPetriPackage instanceof PetriPackageImpl ? (PetriPackageImpl)registeredPetriPackage : new PetriPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePetriPackage.createPackageContents();

		// Initialize created meta-data
		thePetriPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetriPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetriPackage.eNS_URI, thePetriPackage);
		return thePetriPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaces() {
		return placesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaces_Jetons() {
		return (EAttribute)placesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaces_Nom() {
		return (EAttribute)placesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitions() {
		return transitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitions_Nom() {
		return (EAttribute)transitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitions_Intervalle_temps() {
		return (EReference)transitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcsPonderesEntrants() {
		return arcsPonderesEntrantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcsPonderesEntrants_Source() {
		return (EReference)arcsPonderesEntrantsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcsPonderesEntrants_Transition() {
		return (EReference)arcsPonderesEntrantsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcsPonderesSortants() {
		return arcsPonderesSortantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcsPonderesSortants_Transition() {
		return (EReference)arcsPonderesSortantsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcsPonderesSortants_Destination() {
		return (EReference)arcsPonderesSortantsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcsPonderes() {
		return arcsPonderesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArcsPonderes_Ponderation() {
		return (EAttribute)arcsPonderesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReseauPetri() {
		return reseauPetriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReseauPetri_Elements() {
		return (EReference)reseauPetriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReseauPetri_Nom() {
		return (EAttribute)reseauPetriEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposants() {
		return composantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcLectureSeule() {
		return arcLectureSeuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemps() {
		return tempsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemps_TempsMinimum() {
		return (EAttribute)tempsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemps_TempsMaximum() {
		return (EAttribute)tempsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriFactory getPetriFactory() {
		return (PetriFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		placesEClass = createEClass(PLACES);
		createEAttribute(placesEClass, PLACES__JETONS);
		createEAttribute(placesEClass, PLACES__NOM);

		transitionsEClass = createEClass(TRANSITIONS);
		createEAttribute(transitionsEClass, TRANSITIONS__NOM);
		createEReference(transitionsEClass, TRANSITIONS__INTERVALLE_TEMPS);

		arcsPonderesEntrantsEClass = createEClass(ARCS_PONDERES_ENTRANTS);
		createEReference(arcsPonderesEntrantsEClass, ARCS_PONDERES_ENTRANTS__SOURCE);
		createEReference(arcsPonderesEntrantsEClass, ARCS_PONDERES_ENTRANTS__TRANSITION);

		arcsPonderesSortantsEClass = createEClass(ARCS_PONDERES_SORTANTS);
		createEReference(arcsPonderesSortantsEClass, ARCS_PONDERES_SORTANTS__TRANSITION);
		createEReference(arcsPonderesSortantsEClass, ARCS_PONDERES_SORTANTS__DESTINATION);

		arcsPonderesEClass = createEClass(ARCS_PONDERES);
		createEAttribute(arcsPonderesEClass, ARCS_PONDERES__PONDERATION);

		reseauPetriEClass = createEClass(RESEAU_PETRI);
		createEReference(reseauPetriEClass, RESEAU_PETRI__ELEMENTS);
		createEAttribute(reseauPetriEClass, RESEAU_PETRI__NOM);

		composantsEClass = createEClass(COMPOSANTS);

		arcLectureSeuleEClass = createEClass(ARC_LECTURE_SEULE);

		tempsEClass = createEClass(TEMPS);
		createEAttribute(tempsEClass, TEMPS__TEMPS_MINIMUM);
		createEAttribute(tempsEClass, TEMPS__TEMPS_MAXIMUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placesEClass.getESuperTypes().add(this.getComposants());
		transitionsEClass.getESuperTypes().add(this.getComposants());
		arcsPonderesEntrantsEClass.getESuperTypes().add(this.getArcsPonderes());
		arcsPonderesSortantsEClass.getESuperTypes().add(this.getArcsPonderes());
		arcsPonderesEClass.getESuperTypes().add(this.getComposants());
		arcLectureSeuleEClass.getESuperTypes().add(this.getArcsPonderesEntrants());

		// Initialize classes, features, and operations; add parameters
		initEClass(placesEClass, Places.class, "Places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaces_Jetons(), ecorePackage.getEInt(), "jetons", null, 1, 1, Places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaces_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionsEClass, Transitions.class, "Transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitions_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitions_Intervalle_temps(), this.getTemps(), null, "intervalle_temps", null, 0, 1, Transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcsPonderesEntrantsEClass, ArcsPonderesEntrants.class, "ArcsPonderesEntrants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcsPonderesEntrants_Source(), this.getPlaces(), null, "source", null, 1, 1, ArcsPonderesEntrants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcsPonderesEntrants_Transition(), this.getTransitions(), null, "transition", null, 1, 1, ArcsPonderesEntrants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcsPonderesSortantsEClass, ArcsPonderesSortants.class, "ArcsPonderesSortants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcsPonderesSortants_Transition(), this.getTransitions(), null, "transition", null, 1, 1, ArcsPonderesSortants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcsPonderesSortants_Destination(), this.getPlaces(), null, "destination", null, 1, 1, ArcsPonderesSortants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcsPonderesEClass, ArcsPonderes.class, "ArcsPonderes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcsPonderes_Ponderation(), ecorePackage.getEInt(), "ponderation", null, 1, 1, ArcsPonderes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reseauPetriEClass, ReseauPetri.class, "ReseauPetri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReseauPetri_Elements(), this.getComposants(), null, "elements", null, 0, -1, ReseauPetri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReseauPetri_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, ReseauPetri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantsEClass, Composants.class, "Composants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcLectureSeuleEClass, ArcLectureSeule.class, "ArcLectureSeule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tempsEClass, Temps.class, "Temps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemps_TempsMinimum(), ecorePackage.getEInt(), "tempsMinimum", null, 1, 1, Temps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemps_TempsMaximum(), ecorePackage.getEInt(), "tempsMaximum", null, 0, 1, Temps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PetriPackageImpl
