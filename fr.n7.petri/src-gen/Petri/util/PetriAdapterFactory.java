/**
 */
package Petri.util;

import Petri.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Petri.PetriPackage
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriSwitch<Adapter> modelSwitch =
		new PetriSwitch<Adapter>() {
			@Override
			public Adapter casePlaces(Places object) {
				return createPlacesAdapter();
			}
			@Override
			public Adapter caseTransitions(Transitions object) {
				return createTransitionsAdapter();
			}
			@Override
			public Adapter caseArcsPonderesEntrants(ArcsPonderesEntrants object) {
				return createArcsPonderesEntrantsAdapter();
			}
			@Override
			public Adapter caseArcsPonderesSortants(ArcsPonderesSortants object) {
				return createArcsPonderesSortantsAdapter();
			}
			@Override
			public Adapter caseArcsPonderes(ArcsPonderes object) {
				return createArcsPonderesAdapter();
			}
			@Override
			public Adapter caseReseauPetri(ReseauPetri object) {
				return createReseauPetriAdapter();
			}
			@Override
			public Adapter caseComposants(Composants object) {
				return createComposantsAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Petri.Places <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.Places
	 * @generated
	 */
	public Adapter createPlacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.Transitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.Transitions
	 * @generated
	 */
	public Adapter createTransitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.ArcsPonderesEntrants <em>Arcs Ponderes Entrants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.ArcsPonderesEntrants
	 * @generated
	 */
	public Adapter createArcsPonderesEntrantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.ArcsPonderesSortants <em>Arcs Ponderes Sortants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.ArcsPonderesSortants
	 * @generated
	 */
	public Adapter createArcsPonderesSortantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.ArcsPonderes <em>Arcs Ponderes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.ArcsPonderes
	 * @generated
	 */
	public Adapter createArcsPonderesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.ReseauPetri <em>Reseau Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.ReseauPetri
	 * @generated
	 */
	public Adapter createReseauPetriAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.Composants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.Composants
	 * @generated
	 */
	public Adapter createComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.ArcLectureSeule <em>Arc Lecture Seule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.ArcLectureSeule
	 * @generated
	 */
	public Adapter createArcLectureSeuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Petri.Temps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Petri.Temps
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
