/**
 */
package fr.n7.petri.impl;

import fr.n7.petri.ArcLectureSeule;
import fr.n7.petri.ArcPondere;
import fr.n7.petri.ArcPondereEntrant;
import fr.n7.petri.ArcPondereSortant;
import fr.n7.petri.Composants;
import fr.n7.petri.PetriFactory;
import fr.n7.petri.PetriPackage;
import fr.n7.petri.Place;
import fr.n7.petri.ReseauPetri;
import fr.n7.petri.Temps;
import fr.n7.petri.Transition;

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
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcPondereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcPondereEntrantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcPondereSortantEClass = null;

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
	 * @see fr.n7.petri.PetriPackage#eNS_URI
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
		if (isInited)
			return (PetriPackage) EPackage.Registry.INSTANCE.getEPackage(PetriPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPetriPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PetriPackageImpl thePetriPackage = registeredPetriPackage instanceof PetriPackageImpl
				? (PetriPackageImpl) registeredPetriPackage
				: new PetriPackageImpl();

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
	public EClass getReseauPetri() {
		return reseauPetriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReseauPetri_Composants() {
		return (EReference) reseauPetriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReseauPetri_Nom() {
		return (EAttribute) reseauPetriEClass.getEStructuralFeatures().get(1);
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
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlace_Jetons() {
		return (EAttribute) placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlace_Nom() {
		return (EAttribute) placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Nom() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_IntervalleTemps() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcPondere() {
		return arcPondereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArcPondere_Ponderation() {
		return (EAttribute) arcPondereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcPondereEntrant() {
		return arcPondereEntrantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcPondereEntrant_Source() {
		return (EReference) arcPondereEntrantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcPondereEntrant_Destination() {
		return (EReference) arcPondereEntrantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcPondereSortant() {
		return arcPondereSortantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcPondereSortant_Source() {
		return (EReference) arcPondereSortantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcPondereSortant_Destination() {
		return (EReference) arcPondereSortantEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute) tempsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemps_TempsMaximum() {
		return (EAttribute) tempsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriFactory getPetriFactory() {
		return (PetriFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		reseauPetriEClass = createEClass(RESEAU_PETRI);
		createEReference(reseauPetriEClass, RESEAU_PETRI__COMPOSANTS);
		createEAttribute(reseauPetriEClass, RESEAU_PETRI__NOM);

		composantsEClass = createEClass(COMPOSANTS);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__JETONS);
		createEAttribute(placeEClass, PLACE__NOM);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NOM);
		createEReference(transitionEClass, TRANSITION__INTERVALLE_TEMPS);

		arcPondereEClass = createEClass(ARC_PONDERE);
		createEAttribute(arcPondereEClass, ARC_PONDERE__PONDERATION);

		arcPondereEntrantEClass = createEClass(ARC_PONDERE_ENTRANT);
		createEReference(arcPondereEntrantEClass, ARC_PONDERE_ENTRANT__SOURCE);
		createEReference(arcPondereEntrantEClass, ARC_PONDERE_ENTRANT__DESTINATION);

		arcPondereSortantEClass = createEClass(ARC_PONDERE_SORTANT);
		createEReference(arcPondereSortantEClass, ARC_PONDERE_SORTANT__SOURCE);
		createEReference(arcPondereSortantEClass, ARC_PONDERE_SORTANT__DESTINATION);

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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(this.getComposants());
		transitionEClass.getESuperTypes().add(this.getComposants());
		arcPondereEClass.getESuperTypes().add(this.getComposants());
		arcPondereEntrantEClass.getESuperTypes().add(this.getArcPondere());
		arcPondereSortantEClass.getESuperTypes().add(this.getArcPondere());
		arcLectureSeuleEClass.getESuperTypes().add(this.getArcPondereEntrant());

		// Initialize classes, features, and operations; add parameters
		initEClass(reseauPetriEClass, ReseauPetri.class, "ReseauPetri", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReseauPetri_Composants(), this.getComposants(), null, "composants", null, 0, -1,
				ReseauPetri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReseauPetri_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, ReseauPetri.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantsEClass, Composants.class, "Composants", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Jetons(), ecorePackage.getEInt(), "jetons", null, 1, 1, Place.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Place.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_IntervalleTemps(), this.getTemps(), null, "intervalleTemps", null, 0, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcPondereEClass, ArcPondere.class, "ArcPondere", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcPondere_Ponderation(), ecorePackage.getEInt(), "ponderation", null, 1, 1, ArcPondere.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcPondereEntrantEClass, ArcPondereEntrant.class, "ArcPondereEntrant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcPondereEntrant_Source(), this.getPlace(), null, "source", null, 1, 1,
				ArcPondereEntrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcPondereEntrant_Destination(), this.getTransition(), null, "destination", null, 1, 1,
				ArcPondereEntrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcPondereSortantEClass, ArcPondereSortant.class, "ArcPondereSortant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcPondereSortant_Source(), this.getTransition(), null, "source", null, 1, 1,
				ArcPondereSortant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcPondereSortant_Destination(), this.getPlace(), null, "destination", null, 1, 1,
				ArcPondereSortant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcLectureSeuleEClass, ArcLectureSeule.class, "ArcLectureSeule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tempsEClass, Temps.class, "Temps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemps_TempsMinimum(), ecorePackage.getEInt(), "tempsMinimum", null, 1, 1, Temps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemps_TempsMaximum(), ecorePackage.getEInt(), "tempsMaximum", null, 0, 1, Temps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PetriPackageImpl
