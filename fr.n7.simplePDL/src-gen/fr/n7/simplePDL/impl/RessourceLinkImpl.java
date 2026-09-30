/**
 */
package fr.n7.simplePDL.impl;

import fr.n7.simplePDL.RessourceLink;
import fr.n7.simplePDL.Ressources;
import fr.n7.simplePDL.SimplePDLPackage;
import fr.n7.simplePDL.WorkDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.impl.RessourceLinkImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.RessourceLinkImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.RessourceLinkImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.RessourceLinkImpl#getWorkDefinition <em>Work Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceLinkImpl extends MinimalEObjectImpl.Container implements RessourceLink {
	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressources ressource;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkDefinition() <em>Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePDLPackage.Literals.RESSOURCE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public fr.n7.simplePDL.Process getProcess() {
		if (eContainerFeatureID() != SimplePDLPackage.RESSOURCE_LINK__PROCESS)
			return null;
		return (fr.n7.simplePDL.Process) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(fr.n7.simplePDL.Process newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProcess, SimplePDLPackage.RESSOURCE_LINK__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(fr.n7.simplePDL.Process newProcess) {
		if (newProcess != eInternalContainer()
				|| (eContainerFeatureID() != SimplePDLPackage.RESSOURCE_LINK__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject) newProcess).eInverseAdd(this, SimplePDLPackage.PROCESS__PROCESS_ELEMENTS,
						fr.n7.simplePDL.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.RESSOURCE_LINK__PROCESS, newProcess,
					newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressources getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject) ressource;
			ressource = (Ressources) eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePDLPackage.RESSOURCE_LINK__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressources basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessource(Ressources newRessource) {
		Ressources oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.RESSOURCE_LINK__RESSOURCE,
					oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.RESSOURCE_LINK__QUANTITY,
					oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getWorkDefinition() {
		if (workDefinition != null && workDefinition.eIsProxy()) {
			InternalEObject oldWorkDefinition = (InternalEObject) workDefinition;
			workDefinition = (WorkDefinition) eResolveProxy(oldWorkDefinition);
			if (workDefinition != oldWorkDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION, oldWorkDefinition, workDefinition));
			}
		}
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkDefinition() {
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkDefinition(WorkDefinition newWorkDefinition, NotificationChain msgs) {
		WorkDefinition oldWorkDefinition = workDefinition;
		workDefinition = newWorkDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION, oldWorkDefinition, newWorkDefinition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePDLPackage.RESSOURCE_LINK__PROCESS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProcess((fr.n7.simplePDL.Process) otherEnd, msgs);
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION:
			if (workDefinition != null)
				msgs = ((InternalEObject) workDefinition).eInverseRemove(this,
						SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE, WorkDefinition.class, msgs);
			return basicSetWorkDefinition((WorkDefinition) otherEnd, msgs);
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
		case SimplePDLPackage.RESSOURCE_LINK__PROCESS:
			return basicSetProcess(null, msgs);
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION:
			return basicSetWorkDefinition(null, msgs);
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
		case SimplePDLPackage.RESSOURCE_LINK__PROCESS:
			return eInternalContainer().eInverseRemove(this, SimplePDLPackage.PROCESS__PROCESS_ELEMENTS,
					fr.n7.simplePDL.Process.class, msgs);
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
		case SimplePDLPackage.RESSOURCE_LINK__PROCESS:
			return getProcess();
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE:
			if (resolve)
				return getRessource();
			return basicGetRessource();
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			return getQuantity();
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION:
			if (resolve)
				return getWorkDefinition();
			return basicGetWorkDefinition();
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
		case SimplePDLPackage.RESSOURCE_LINK__PROCESS:
			setProcess((fr.n7.simplePDL.Process) newValue);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE:
			setRessource((Ressources) newValue);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			setQuantity((Integer) newValue);
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
		case SimplePDLPackage.RESSOURCE_LINK__PROCESS:
			setProcess((fr.n7.simplePDL.Process) null);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE:
			setRessource((Ressources) null);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
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
		case SimplePDLPackage.RESSOURCE_LINK__PROCESS:
			return getProcess() != null;
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE:
			return ressource != null;
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION:
			return workDefinition != null;
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //RessourceLinkImpl
