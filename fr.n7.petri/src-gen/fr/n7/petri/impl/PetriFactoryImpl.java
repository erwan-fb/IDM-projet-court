/**
 */
package fr.n7.petri.impl;

import fr.n7.petri.*;

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
			PetriFactory thePetriFactory = (PetriFactory) EPackage.Registry.INSTANCE.getEFactory(PetriPackage.eNS_URI);
			if (thePetriFactory != null) {
				return thePetriFactory;
			}
		} catch (Exception exception) {
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
		case PetriPackage.RESEAU_PETRI:
			return createReseauPetri();
		case PetriPackage.COMPOSANTS:
			return createComposants();
		case PetriPackage.PLACE:
			return createPlace();
		case PetriPackage.TRANSITION:
			return createTransition();
		case PetriPackage.ARC_PONDEDE:
			return createArcPondede();
		case PetriPackage.ARC_PONDERE_ENTRANT:
			return createArcPondereEntrant();
		case PetriPackage.ARC_PONDERE_SORTANT:
			return createArcPondereSortant();
		case PetriPackage.ARC_LECTURE_SEULE:
			return createArcLectureSeule();
		case PetriPackage.TEMPS:
			return createTemps();
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
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcPondede createArcPondede() {
		ArcPondedeImpl arcPondede = new ArcPondedeImpl();
		return arcPondede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcPondereEntrant createArcPondereEntrant() {
		ArcPondereEntrantImpl arcPondereEntrant = new ArcPondereEntrantImpl();
		return arcPondereEntrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcPondereSortant createArcPondereSortant() {
		ArcPondereSortantImpl arcPondereSortant = new ArcPondereSortantImpl();
		return arcPondereSortant;
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
		return (PetriPackage) getEPackage();
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
