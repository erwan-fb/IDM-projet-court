/**
 */
package fr.n7.petri.impl;

import fr.n7.petri.ArcPondereEntrant;
import fr.n7.petri.ArcPondereSortant;
import fr.n7.petri.PetriPackage;
import fr.n7.petri.Temps;
import fr.n7.petri.Transition;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.impl.TransitionImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.n7.petri.impl.TransitionImpl#getIntervalleTemps <em>Intervalle Temps</em>}</li>
 *   <li>{@link fr.n7.petri.impl.TransitionImpl#getArcsEntrants <em>Arcs Entrants</em>}</li>
 *   <li>{@link fr.n7.petri.impl.TransitionImpl#getArcsSortants <em>Arcs Sortants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntervalleTemps() <em>Intervalle Temps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleTemps()
	 * @generated
	 * @ordered
	 */
	protected Temps intervalleTemps;

	/**
	 * The cached value of the '{@link #getArcsEntrants() <em>Arcs Entrants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcsEntrants()
	 * @generated
	 * @ordered
	 */
	protected EList<ArcPondereEntrant> arcsEntrants;

	/**
	 * The cached value of the '{@link #getArcsSortants() <em>Arcs Sortants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcsSortants()
	 * @generated
	 * @ordered
	 */
	protected EList<ArcPondereSortant> arcsSortants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.TRANSITION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temps getIntervalleTemps() {
		if (intervalleTemps != null && intervalleTemps.eIsProxy()) {
			InternalEObject oldIntervalleTemps = (InternalEObject) intervalleTemps;
			intervalleTemps = (Temps) eResolveProxy(oldIntervalleTemps);
			if (intervalleTemps != oldIntervalleTemps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriPackage.TRANSITION__INTERVALLE_TEMPS,
							oldIntervalleTemps, intervalleTemps));
			}
		}
		return intervalleTemps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temps basicGetIntervalleTemps() {
		return intervalleTemps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalleTemps(Temps newIntervalleTemps) {
		Temps oldIntervalleTemps = intervalleTemps;
		intervalleTemps = newIntervalleTemps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.TRANSITION__INTERVALLE_TEMPS,
					oldIntervalleTemps, intervalleTemps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArcPondereEntrant> getArcsEntrants() {
		if (arcsEntrants == null) {
			arcsEntrants = new EObjectWithInverseResolvingEList<ArcPondereEntrant>(ArcPondereEntrant.class, this,
					PetriPackage.TRANSITION__ARCS_ENTRANTS, PetriPackage.ARC_PONDERE_ENTRANT__DESTINATION);
		}
		return arcsEntrants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArcPondereSortant> getArcsSortants() {
		if (arcsSortants == null) {
			arcsSortants = new EObjectWithInverseResolvingEList<ArcPondereSortant>(ArcPondereSortant.class, this,
					PetriPackage.TRANSITION__ARCS_SORTANTS, PetriPackage.ARC_PONDERE_SORTANT__SOURCE);
		}
		return arcsSortants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetriPackage.TRANSITION__ARCS_ENTRANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getArcsEntrants()).basicAdd(otherEnd, msgs);
		case PetriPackage.TRANSITION__ARCS_SORTANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getArcsSortants()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetriPackage.TRANSITION__ARCS_ENTRANTS:
			return ((InternalEList<?>) getArcsEntrants()).basicRemove(otherEnd, msgs);
		case PetriPackage.TRANSITION__ARCS_SORTANTS:
			return ((InternalEList<?>) getArcsSortants()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriPackage.TRANSITION__NOM:
			return getNom();
		case PetriPackage.TRANSITION__INTERVALLE_TEMPS:
			if (resolve)
				return getIntervalleTemps();
			return basicGetIntervalleTemps();
		case PetriPackage.TRANSITION__ARCS_ENTRANTS:
			return getArcsEntrants();
		case PetriPackage.TRANSITION__ARCS_SORTANTS:
			return getArcsSortants();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PetriPackage.TRANSITION__NOM:
			setNom((String) newValue);
			return;
		case PetriPackage.TRANSITION__INTERVALLE_TEMPS:
			setIntervalleTemps((Temps) newValue);
			return;
		case PetriPackage.TRANSITION__ARCS_ENTRANTS:
			getArcsEntrants().clear();
			getArcsEntrants().addAll((Collection<? extends ArcPondereEntrant>) newValue);
			return;
		case PetriPackage.TRANSITION__ARCS_SORTANTS:
			getArcsSortants().clear();
			getArcsSortants().addAll((Collection<? extends ArcPondereSortant>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PetriPackage.TRANSITION__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case PetriPackage.TRANSITION__INTERVALLE_TEMPS:
			setIntervalleTemps((Temps) null);
			return;
		case PetriPackage.TRANSITION__ARCS_ENTRANTS:
			getArcsEntrants().clear();
			return;
		case PetriPackage.TRANSITION__ARCS_SORTANTS:
			getArcsSortants().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PetriPackage.TRANSITION__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case PetriPackage.TRANSITION__INTERVALLE_TEMPS:
			return intervalleTemps != null;
		case PetriPackage.TRANSITION__ARCS_ENTRANTS:
			return arcsEntrants != null && !arcsEntrants.isEmpty();
		case PetriPackage.TRANSITION__ARCS_SORTANTS:
			return arcsSortants != null && !arcsSortants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
