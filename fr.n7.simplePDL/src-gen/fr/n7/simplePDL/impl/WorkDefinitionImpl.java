/**
 */
package fr.n7.simplePDL.impl;

import fr.n7.simplePDL.RessourceLink;
import fr.n7.simplePDL.SimplePDLPackage;
import fr.n7.simplePDL.WorkDefinition;
import fr.n7.simplePDL.WorkSequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.impl.WorkDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.WorkDefinitionImpl#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.WorkDefinitionImpl#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.WorkDefinitionImpl#getLinkToRessource <em>Link To Ressource</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.WorkDefinitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkDefinitionImpl extends MinimalEObjectImpl.Container implements WorkDefinition {
	/**
	 * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToPredecessors;

	/**
	 * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToSuccessors;

	/**
	 * The cached value of the '{@link #getLinkToRessource() <em>Link To Ressource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToRessource()
	 * @generated
	 * @ordered
	 */
	protected EList<RessourceLink> linkToRessource;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePDLPackage.Literals.WORK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public fr.n7.simplePDL.Process getProcess() {
		if (eContainerFeatureID() != SimplePDLPackage.WORK_DEFINITION__PROCESS)
			return null;
		return (fr.n7.simplePDL.Process) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(fr.n7.simplePDL.Process newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProcess, SimplePDLPackage.WORK_DEFINITION__PROCESS, msgs);
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
				|| (eContainerFeatureID() != SimplePDLPackage.WORK_DEFINITION__PROCESS && newProcess != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_DEFINITION__PROCESS, newProcess,
					newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToPredecessors() {
		if (linksToPredecessors == null) {
			linksToPredecessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linksToPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToSuccessors() {
		if (linksToSuccessors == null) {
			linksToSuccessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linksToSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RessourceLink> getLinkToRessource() {
		if (linkToRessource == null) {
			linkToRessource = new EObjectWithInverseResolvingEList<RessourceLink>(RessourceLink.class, this,
					SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE,
					SimplePDLPackage.RESSOURCE_LINK__WORK_DEFINITION);
		}
		return linkToRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_DEFINITION__NAME, oldName,
					name));
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
		case SimplePDLPackage.WORK_DEFINITION__PROCESS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProcess((fr.n7.simplePDL.Process) otherEnd, msgs);
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToPredecessors()).basicAdd(otherEnd,
					msgs);
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToSuccessors()).basicAdd(otherEnd,
					msgs);
		case SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkToRessource()).basicAdd(otherEnd, msgs);
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
		case SimplePDLPackage.WORK_DEFINITION__PROCESS:
			return basicSetProcess(null, msgs);
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return ((InternalEList<?>) getLinksToPredecessors()).basicRemove(otherEnd, msgs);
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return ((InternalEList<?>) getLinksToSuccessors()).basicRemove(otherEnd, msgs);
		case SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE:
			return ((InternalEList<?>) getLinkToRessource()).basicRemove(otherEnd, msgs);
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
		case SimplePDLPackage.WORK_DEFINITION__PROCESS:
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
		case SimplePDLPackage.WORK_DEFINITION__PROCESS:
			return getProcess();
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return getLinksToPredecessors();
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return getLinksToSuccessors();
		case SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE:
			return getLinkToRessource();
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			return getName();
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
		case SimplePDLPackage.WORK_DEFINITION__PROCESS:
			setProcess((fr.n7.simplePDL.Process) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			getLinksToPredecessors().clear();
			getLinksToPredecessors().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			getLinksToSuccessors().clear();
			getLinksToSuccessors().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE:
			getLinkToRessource().clear();
			getLinkToRessource().addAll((Collection<? extends RessourceLink>) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			setName((String) newValue);
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
		case SimplePDLPackage.WORK_DEFINITION__PROCESS:
			setProcess((fr.n7.simplePDL.Process) null);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			getLinksToPredecessors().clear();
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			getLinksToSuccessors().clear();
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE:
			getLinkToRessource().clear();
			return;
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
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
		case SimplePDLPackage.WORK_DEFINITION__PROCESS:
			return getProcess() != null;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return linksToPredecessors != null && !linksToPredecessors.isEmpty();
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return linksToSuccessors != null && !linksToSuccessors.isEmpty();
		case SimplePDLPackage.WORK_DEFINITION__LINK_TO_RESSOURCE:
			return linkToRessource != null && !linkToRessource.isEmpty();
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkDefinitionImpl
