/**
 */
package fr.n7.petri.impl;

import fr.n7.petri.ArcPondede;
import fr.n7.petri.PetriPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc Pondede</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.impl.ArcPondedeImpl#getPonderation <em>Ponderation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcPondedeImpl extends ComposantsImpl implements ArcPondede {
	/**
	 * The default value of the '{@link #getPonderation() <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderation()
	 * @generated
	 * @ordered
	 */
	protected static final int PONDERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPonderation() <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderation()
	 * @generated
	 * @ordered
	 */
	protected int ponderation = PONDERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcPondedeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.ARC_PONDEDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPonderation() {
		return ponderation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPonderation(int newPonderation) {
		int oldPonderation = ponderation;
		ponderation = newPonderation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.ARC_PONDEDE__PONDERATION, oldPonderation,
					ponderation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriPackage.ARC_PONDEDE__PONDERATION:
			return getPonderation();
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
		case PetriPackage.ARC_PONDEDE__PONDERATION:
			setPonderation((Integer) newValue);
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
		case PetriPackage.ARC_PONDEDE__PONDERATION:
			setPonderation(PONDERATION_EDEFAULT);
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
		case PetriPackage.ARC_PONDEDE__PONDERATION:
			return ponderation != PONDERATION_EDEFAULT;
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
		result.append(" (ponderation: ");
		result.append(ponderation);
		result.append(')');
		return result.toString();
	}

} //ArcPondedeImpl
