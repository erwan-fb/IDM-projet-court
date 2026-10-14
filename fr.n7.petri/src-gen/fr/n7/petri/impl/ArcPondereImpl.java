/**
 */
package fr.n7.petri.impl;

import fr.n7.petri.ArcPondere;
import fr.n7.petri.PetriPackage;

import fr.n7.petri.ReseauPetri;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc Pondere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.impl.ArcPondereImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.n7.petri.impl.ArcPondereImpl#getPonderation <em>Ponderation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArcPondereImpl extends MinimalEObjectImpl.Container implements ArcPondere {
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
	protected ArcPondereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.ARC_PONDERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReseauPetri getParent() {
		if (eContainerFeatureID() != PetriPackage.ARC_PONDERE__PARENT)
			return null;
		return (ReseauPetri) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ReseauPetri newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, PetriPackage.ARC_PONDERE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(ReseauPetri newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != PetriPackage.ARC_PONDERE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, PetriPackage.RESEAU_PETRI__COMPOSANTS,
						ReseauPetri.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.ARC_PONDERE__PARENT, newParent,
					newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.ARC_PONDERE__PONDERATION, oldPonderation,
					ponderation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetriPackage.ARC_PONDERE__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((ReseauPetri) otherEnd, msgs);
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
		case PetriPackage.ARC_PONDERE__PARENT:
			return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PetriPackage.ARC_PONDERE__PARENT:
			return eInternalContainer().eInverseRemove(this, PetriPackage.RESEAU_PETRI__COMPOSANTS, ReseauPetri.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriPackage.ARC_PONDERE__PARENT:
			return getParent();
		case PetriPackage.ARC_PONDERE__PONDERATION:
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
		case PetriPackage.ARC_PONDERE__PARENT:
			setParent((ReseauPetri) newValue);
			return;
		case PetriPackage.ARC_PONDERE__PONDERATION:
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
		case PetriPackage.ARC_PONDERE__PARENT:
			setParent((ReseauPetri) null);
			return;
		case PetriPackage.ARC_PONDERE__PONDERATION:
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
		case PetriPackage.ARC_PONDERE__PARENT:
			return getParent() != null;
		case PetriPackage.ARC_PONDERE__PONDERATION:
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

} //ArcPondereImpl
