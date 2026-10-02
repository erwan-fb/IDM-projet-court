/**
 */
package fr.n7.petri.impl;

import fr.n7.petri.PetriPackage;
import fr.n7.petri.Temps;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.impl.TempsImpl#getTempsMinimum <em>Temps Minimum</em>}</li>
 *   <li>{@link fr.n7.petri.impl.TempsImpl#getTempsMaximum <em>Temps Maximum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TempsImpl extends MinimalEObjectImpl.Container implements Temps {
	/**
	 * The default value of the '{@link #getTempsMinimum() <em>Temps Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPS_MINIMUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempsMinimum() <em>Temps Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMinimum()
	 * @generated
	 * @ordered
	 */
	protected int tempsMinimum = TEMPS_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempsMaximum() <em>Temps Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPS_MAXIMUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempsMaximum() <em>Temps Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMaximum()
	 * @generated
	 * @ordered
	 */
	protected int tempsMaximum = TEMPS_MAXIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TempsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.TEMPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTempsMinimum() {
		return tempsMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempsMinimum(int newTempsMinimum) {
		int oldTempsMinimum = tempsMinimum;
		tempsMinimum = newTempsMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.TEMPS__TEMPS_MINIMUM, oldTempsMinimum,
					tempsMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTempsMaximum() {
		return tempsMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempsMaximum(int newTempsMaximum) {
		int oldTempsMaximum = tempsMaximum;
		tempsMaximum = newTempsMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.TEMPS__TEMPS_MAXIMUM, oldTempsMaximum,
					tempsMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriPackage.TEMPS__TEMPS_MINIMUM:
			return getTempsMinimum();
		case PetriPackage.TEMPS__TEMPS_MAXIMUM:
			return getTempsMaximum();
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
		case PetriPackage.TEMPS__TEMPS_MINIMUM:
			setTempsMinimum((Integer) newValue);
			return;
		case PetriPackage.TEMPS__TEMPS_MAXIMUM:
			setTempsMaximum((Integer) newValue);
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
		case PetriPackage.TEMPS__TEMPS_MINIMUM:
			setTempsMinimum(TEMPS_MINIMUM_EDEFAULT);
			return;
		case PetriPackage.TEMPS__TEMPS_MAXIMUM:
			setTempsMaximum(TEMPS_MAXIMUM_EDEFAULT);
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
		case PetriPackage.TEMPS__TEMPS_MINIMUM:
			return tempsMinimum != TEMPS_MINIMUM_EDEFAULT;
		case PetriPackage.TEMPS__TEMPS_MAXIMUM:
			return tempsMaximum != TEMPS_MAXIMUM_EDEFAULT;
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
		result.append(" (tempsMinimum: ");
		result.append(tempsMinimum);
		result.append(", tempsMaximum: ");
		result.append(tempsMaximum);
		result.append(')');
		return result.toString();
	}

} //TempsImpl
