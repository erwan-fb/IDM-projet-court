/**
 */
package fr.n7.petri.impl;

import fr.n7.petri.PetriPackage;
import fr.n7.petri.Place;

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
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.petri.impl.PlaceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.n7.petri.impl.PlaceImpl#getJetons <em>Jetons</em>}</li>
 *   <li>{@link fr.n7.petri.impl.PlaceImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends MinimalEObjectImpl.Container implements Place {
	/**
	 * The default value of the '{@link #getJetons() <em>Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetons()
	 * @generated
	 * @ordered
	 */
	protected static final int JETONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJetons() <em>Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetons()
	 * @generated
	 * @ordered
	 */
	protected int jetons = JETONS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReseauPetri getParent() {
		if (eContainerFeatureID() != PetriPackage.PLACE__PARENT)
			return null;
		return (ReseauPetri) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ReseauPetri newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, PetriPackage.PLACE__PARENT, msgs);
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
				|| (eContainerFeatureID() != PetriPackage.PLACE__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.PLACE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getJetons() {
		return jetons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJetons(int newJetons) {
		int oldJetons = jetons;
		jetons = newJetons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.PLACE__JETONS, oldJetons, jetons));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.PLACE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetriPackage.PLACE__PARENT:
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
		case PetriPackage.PLACE__PARENT:
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
		case PetriPackage.PLACE__PARENT:
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
		case PetriPackage.PLACE__PARENT:
			return getParent();
		case PetriPackage.PLACE__JETONS:
			return getJetons();
		case PetriPackage.PLACE__NOM:
			return getNom();
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
		case PetriPackage.PLACE__PARENT:
			setParent((ReseauPetri) newValue);
			return;
		case PetriPackage.PLACE__JETONS:
			setJetons((Integer) newValue);
			return;
		case PetriPackage.PLACE__NOM:
			setNom((String) newValue);
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
		case PetriPackage.PLACE__PARENT:
			setParent((ReseauPetri) null);
			return;
		case PetriPackage.PLACE__JETONS:
			setJetons(JETONS_EDEFAULT);
			return;
		case PetriPackage.PLACE__NOM:
			setNom(NOM_EDEFAULT);
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
		case PetriPackage.PLACE__PARENT:
			return getParent() != null;
		case PetriPackage.PLACE__JETONS:
			return jetons != JETONS_EDEFAULT;
		case PetriPackage.PLACE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
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
		result.append(" (jetons: ");
		result.append(jetons);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
