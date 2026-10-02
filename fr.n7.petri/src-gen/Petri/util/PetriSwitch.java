/**
 */
package Petri.util;

import Petri.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Petri.PetriPackage
 * @generated
 */
public class PetriSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetriPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriSwitch() {
		if (modelPackage == null) {
			modelPackage = PetriPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PetriPackage.PLACES: {
				Places places = (Places)theEObject;
				T result = casePlaces(places);
				if (result == null) result = caseComposants(places);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.TRANSITIONS: {
				Transitions transitions = (Transitions)theEObject;
				T result = caseTransitions(transitions);
				if (result == null) result = caseComposants(transitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.ARCS_PONDERES_ENTRANTS: {
				ArcsPonderesEntrants arcsPonderesEntrants = (ArcsPonderesEntrants)theEObject;
				T result = caseArcsPonderesEntrants(arcsPonderesEntrants);
				if (result == null) result = caseArcsPonderes(arcsPonderesEntrants);
				if (result == null) result = caseComposants(arcsPonderesEntrants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.ARCS_PONDERES_SORTANTS: {
				ArcsPonderesSortants arcsPonderesSortants = (ArcsPonderesSortants)theEObject;
				T result = caseArcsPonderesSortants(arcsPonderesSortants);
				if (result == null) result = caseArcsPonderes(arcsPonderesSortants);
				if (result == null) result = caseComposants(arcsPonderesSortants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.ARCS_PONDERES: {
				ArcsPonderes arcsPonderes = (ArcsPonderes)theEObject;
				T result = caseArcsPonderes(arcsPonderes);
				if (result == null) result = caseComposants(arcsPonderes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.RESEAU_PETRI: {
				ReseauPetri reseauPetri = (ReseauPetri)theEObject;
				T result = caseReseauPetri(reseauPetri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.COMPOSANTS: {
				Composants composants = (Composants)theEObject;
				T result = caseComposants(composants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.ARC_LECTURE_SEULE: {
				ArcLectureSeule arcLectureSeule = (ArcLectureSeule)theEObject;
				T result = caseArcLectureSeule(arcLectureSeule);
				if (result == null) result = caseArcsPonderesEntrants(arcLectureSeule);
				if (result == null) result = caseArcsPonderes(arcLectureSeule);
				if (result == null) result = caseComposants(arcLectureSeule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriPackage.TEMPS: {
				Temps temps = (Temps)theEObject;
				T result = caseTemps(temps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Places</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Places</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaces(Places object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitions(Transitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arcs Ponderes Entrants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arcs Ponderes Entrants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcsPonderesEntrants(ArcsPonderesEntrants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arcs Ponderes Sortants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arcs Ponderes Sortants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcsPonderesSortants(ArcsPonderesSortants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arcs Ponderes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arcs Ponderes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcsPonderes(ArcsPonderes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reseau Petri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reseau Petri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReseauPetri(ReseauPetri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposants(Composants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Lecture Seule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Lecture Seule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcLectureSeule(ArcLectureSeule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemps(Temps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PetriSwitch
