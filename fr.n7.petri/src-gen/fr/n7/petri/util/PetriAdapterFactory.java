/**
 */
package fr.n7.petri.util;

import fr.n7.petri.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.n7.petri.PetriPackage
 * @generated
 */
public class PetriAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetriPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PetriPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriSwitch<Adapter> modelSwitch = new PetriSwitch<Adapter>() {
		@Override
		public Adapter caseReseauPetri(ReseauPetri object) {
			return createReseauPetriAdapter();
		}

		@Override
		public Adapter caseComposants(Composants object) {
			return createComposantsAdapter();
		}

		@Override
		public Adapter casePlace(Place object) {
			return createPlaceAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseArcPondede(ArcPondede object) {
			return createArcPondedeAdapter();
		}

		@Override
		public Adapter caseArcPondereEntrant(ArcPondereEntrant object) {
			return createArcPondereEntrantAdapter();
		}

		@Override
		public Adapter caseArcPondereSortant(ArcPondereSortant object) {
			return createArcPondereSortantAdapter();
		}

		@Override
		public Adapter caseArcLectureSeule(ArcLectureSeule object) {
			return createArcLectureSeuleAdapter();
		}

		@Override
		public Adapter caseTemps(Temps object) {
			return createTempsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.ReseauPetri <em>Reseau Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.ReseauPetri
	 * @generated
	 */
	public Adapter createReseauPetriAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.Composants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.Composants
	 * @generated
	 */
	public Adapter createComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.ArcPondede <em>Arc Pondede</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.ArcPondede
	 * @generated
	 */
	public Adapter createArcPondedeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.ArcPondereEntrant <em>Arc Pondere Entrant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.ArcPondereEntrant
	 * @generated
	 */
	public Adapter createArcPondereEntrantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.ArcPondereSortant <em>Arc Pondere Sortant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.ArcPondereSortant
	 * @generated
	 */
	public Adapter createArcPondereSortantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.ArcLectureSeule <em>Arc Lecture Seule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.ArcLectureSeule
	 * @generated
	 */
	public Adapter createArcLectureSeuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.n7.petri.Temps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.petri.Temps
	 * @generated
	 */
	public Adapter createTempsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PetriAdapterFactory
