/**
 */
package Petri.impl;

import Petri.PetriPackage;
import Petri.Temps;
import Petri.Transitions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Petri.impl.TransitionsImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link Petri.impl.TransitionsImpl#getIntervalle_temps <em>Intervalle temps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionsImpl extends ComposantsImpl implements Transitions {
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
	 * The cached value of the '{@link #getIntervalle_temps() <em>Intervalle temps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalle_temps()
	 * @generated
	 * @ordered
	 */
	protected Temps intervalle_temps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.TRANSITIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.TRANSITIONS__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temps getIntervalle_temps() {
		return intervalle_temps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalle_temps(Temps newIntervalle_temps, NotificationChain msgs) {
		Temps oldIntervalle_temps = intervalle_temps;
		intervalle_temps = newIntervalle_temps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriPackage.TRANSITIONS__INTERVALLE_TEMPS, oldIntervalle_temps, newIntervalle_temps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalle_temps(Temps newIntervalle_temps) {
		if (newIntervalle_temps != intervalle_temps) {
			NotificationChain msgs = null;
			if (intervalle_temps != null)
				msgs = ((InternalEObject)intervalle_temps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetriPackage.TRANSITIONS__INTERVALLE_TEMPS, null, msgs);
			if (newIntervalle_temps != null)
				msgs = ((InternalEObject)newIntervalle_temps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetriPackage.TRANSITIONS__INTERVALLE_TEMPS, null, msgs);
			msgs = basicSetIntervalle_temps(newIntervalle_temps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.TRANSITIONS__INTERVALLE_TEMPS, newIntervalle_temps, newIntervalle_temps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriPackage.TRANSITIONS__INTERVALLE_TEMPS:
				return basicSetIntervalle_temps(null, msgs);
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
			case PetriPackage.TRANSITIONS__NOM:
				return getNom();
			case PetriPackage.TRANSITIONS__INTERVALLE_TEMPS:
				return getIntervalle_temps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriPackage.TRANSITIONS__NOM:
				setNom((String)newValue);
				return;
			case PetriPackage.TRANSITIONS__INTERVALLE_TEMPS:
				setIntervalle_temps((Temps)newValue);
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
			case PetriPackage.TRANSITIONS__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case PetriPackage.TRANSITIONS__INTERVALLE_TEMPS:
				setIntervalle_temps((Temps)null);
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
			case PetriPackage.TRANSITIONS__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case PetriPackage.TRANSITIONS__INTERVALLE_TEMPS:
				return intervalle_temps != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //TransitionsImpl
