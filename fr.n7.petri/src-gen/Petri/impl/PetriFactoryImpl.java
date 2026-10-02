/**
 */
package Petri.impl;

import Petri.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriFactoryImpl extends EFactoryImpl implements PetriFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetriFactory init() {
		try {
			PetriFactory thePetriFactory = (PetriFactory)EPackage.Registry.INSTANCE.getEFactory(PetriPackage.eNS_URI);
			if (thePetriFactory != null) {
				return thePetriFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetriFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PetriPackage.PLACES: return createPlaces();
			case PetriPackage.TRANSITIONS: return createTransitions();
			case PetriPackage.ARCS_PONDERES_ENTRANTS: return createArcsPonderesEntrants();
			case PetriPackage.ARCS_PONDERES_SORTANTS: return createArcsPonderesSortants();
			case PetriPackage.RESEAU_PETRI: return createReseauPetri();
			case PetriPackage.COMPOSANTS: return createComposants();
			case PetriPackage.ARC_LECTURE_SEULE: return createArcLectureSeule();
			case PetriPackage.TEMPS: return createTemps();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Places createPlaces() {
		PlacesImpl places = new PlacesImpl();
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transitions createTransitions() {
		TransitionsImpl transitions = new TransitionsImpl();
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcsPonderesEntrants createArcsPonderesEntrants() {
		ArcsPonderesEntrantsImpl arcsPonderesEntrants = new ArcsPonderesEntrantsImpl();
		return arcsPonderesEntrants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcsPonderesSortants createArcsPonderesSortants() {
		ArcsPonderesSortantsImpl arcsPonderesSortants = new ArcsPonderesSortantsImpl();
		return arcsPonderesSortants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReseauPetri createReseauPetri() {
		ReseauPetriImpl reseauPetri = new ReseauPetriImpl();
		return reseauPetri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composants createComposants() {
		ComposantsImpl composants = new ComposantsImpl();
		return composants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcLectureSeule createArcLectureSeule() {
		ArcLectureSeuleImpl arcLectureSeule = new ArcLectureSeuleImpl();
		return arcLectureSeule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temps createTemps() {
		TempsImpl temps = new TempsImpl();
		return temps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriPackage getPetriPackage() {
		return (PetriPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetriPackage getPackage() {
		return PetriPackage.eINSTANCE;
	}

} //PetriFactoryImpl
