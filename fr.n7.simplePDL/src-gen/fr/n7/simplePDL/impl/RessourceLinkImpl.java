/**
 */
package fr.n7.simplePDL.impl;

import fr.n7.simplePDL.Ressource;
import fr.n7.simplePDL.RessourceLink;
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
 *   <li>{@link fr.n7.simplePDL.impl.RessourceLinkImpl#getRessourceNeeded <em>Ressource Needed</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.RessourceLinkImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.RessourceLinkImpl#getWorkDefinitionAssociate <em>Work Definition Associate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceLinkImpl extends MinimalEObjectImpl.Container implements RessourceLink {
	/**
	 * The cached value of the '{@link #getRessourceNeeded() <em>Ressource Needed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceNeeded()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressourceNeeded;

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
	 * The cached value of the '{@link #getWorkDefinitionAssociate() <em>Work Definition Associate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDefinitionAssociate()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workDefinitionAssociate;

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
	public Ressource getRessourceNeeded() {
		if (ressourceNeeded != null && ressourceNeeded.eIsProxy()) {
			InternalEObject oldRessourceNeeded = (InternalEObject) ressourceNeeded;
			ressourceNeeded = (Ressource) eResolveProxy(oldRessourceNeeded);
			if (ressourceNeeded != oldRessourceNeeded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePDLPackage.RESSOURCE_LINK__RESSOURCE_NEEDED, oldRessourceNeeded, ressourceNeeded));
			}
		}
		return ressourceNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessourceNeeded() {
		return ressourceNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessourceNeeded(Ressource newRessourceNeeded) {
		Ressource oldRessourceNeeded = ressourceNeeded;
		ressourceNeeded = newRessourceNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.RESSOURCE_LINK__RESSOURCE_NEEDED,
					oldRessourceNeeded, ressourceNeeded));
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
	public WorkDefinition getWorkDefinitionAssociate() {
		if (workDefinitionAssociate != null && workDefinitionAssociate.eIsProxy()) {
			InternalEObject oldWorkDefinitionAssociate = (InternalEObject) workDefinitionAssociate;
			workDefinitionAssociate = (WorkDefinition) eResolveProxy(oldWorkDefinitionAssociate);
			if (workDefinitionAssociate != oldWorkDefinitionAssociate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE, oldWorkDefinitionAssociate,
							workDefinitionAssociate));
			}
		}
		return workDefinitionAssociate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkDefinitionAssociate() {
		return workDefinitionAssociate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkDefinitionAssociate(WorkDefinition newWorkDefinitionAssociate,
			NotificationChain msgs) {
		WorkDefinition oldWorkDefinitionAssociate = workDefinitionAssociate;
		workDefinitionAssociate = newWorkDefinitionAssociate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE, oldWorkDefinitionAssociate,
					newWorkDefinitionAssociate);
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
	public void setWorkDefinitionAssociate(WorkDefinition newWorkDefinitionAssociate) {
		if (newWorkDefinitionAssociate != workDefinitionAssociate) {
			NotificationChain msgs = null;
			if (workDefinitionAssociate != null)
				msgs = ((InternalEObject) workDefinitionAssociate).eInverseRemove(this,
						SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE, WorkDefinition.class, msgs);
			if (newWorkDefinitionAssociate != null)
				msgs = ((InternalEObject) newWorkDefinitionAssociate).eInverseAdd(this,
						SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE, WorkDefinition.class, msgs);
			msgs = basicSetWorkDefinitionAssociate(newWorkDefinitionAssociate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE, newWorkDefinitionAssociate,
					newWorkDefinitionAssociate));
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
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE:
			if (workDefinitionAssociate != null)
				msgs = ((InternalEObject) workDefinitionAssociate).eInverseRemove(this,
						SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE, WorkDefinition.class, msgs);
			return basicSetWorkDefinitionAssociate((WorkDefinition) otherEnd, msgs);
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
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE:
			return basicSetWorkDefinitionAssociate(null, msgs);
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
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE_NEEDED:
			if (resolve)
				return getRessourceNeeded();
			return basicGetRessourceNeeded();
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			return getQuantity();
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE:
			if (resolve)
				return getWorkDefinitionAssociate();
			return basicGetWorkDefinitionAssociate();
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
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE_NEEDED:
			setRessourceNeeded((Ressource) newValue);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE:
			setWorkDefinitionAssociate((WorkDefinition) newValue);
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
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE_NEEDED:
			setRessourceNeeded((Ressource) null);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE:
			setWorkDefinitionAssociate((WorkDefinition) null);
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
		case SimplePDLPackage.RESSOURCE_LINK__RESSOURCE_NEEDED:
			return ressourceNeeded != null;
		case SimplePDLPackage.RESSOURCE_LINK__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION_ASSOCIATE:
			return workDefinitionAssociate != null;
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
