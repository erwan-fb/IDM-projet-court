/**
 */
package fr.n7.simplePDL.impl;

import fr.n7.simplePDL.SimplePDLPackage;
import fr.n7.simplePDL.WorkDefinition;
import fr.n7.simplePDL.WorkSequence;
import fr.n7.simplePDL.WorkSequenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.impl.WorkSequenceImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.WorkSequenceImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.WorkSequenceImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.n7.simplePDL.impl.WorkSequenceImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkSequenceImpl extends MinimalEObjectImpl.Container implements WorkSequence {
	/**
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkSequenceType LINK_TYPE_EDEFAULT = WorkSequenceType.START_TO_START;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected WorkSequenceType linkType = LINK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePDLPackage.Literals.WORK_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public fr.n7.simplePDL.Process getProcess() {
		if (eContainerFeatureID() != SimplePDLPackage.WORK_SEQUENCE__PROCESS)
			return null;
		return (fr.n7.simplePDL.Process) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(fr.n7.simplePDL.Process newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProcess, SimplePDLPackage.WORK_SEQUENCE__PROCESS, msgs);
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
				|| (eContainerFeatureID() != SimplePDLPackage.WORK_SEQUENCE__PROCESS && newProcess != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE__PROCESS, newProcess,
					newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkSequenceType getLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkType(WorkSequenceType newLinkType) {
		WorkSequenceType oldLinkType = linkType;
		linkType = newLinkType == null ? LINK_TYPE_EDEFAULT : newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE__LINK_TYPE,
					oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject) predecessor;
			predecessor = (WorkDefinition) eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(WorkDefinition newPredecessor, NotificationChain msgs) {
		WorkDefinition oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR, oldPredecessor, newPredecessor);
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
	public void setPredecessor(WorkDefinition newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject) predecessor).eInverseRemove(this,
						SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, WorkDefinition.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject) newPredecessor).eInverseAdd(this,
						SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, WorkDefinition.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR,
					newPredecessor, newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject) successor;
			successor = (WorkDefinition) eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR,
							oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(WorkDefinition newSuccessor, NotificationChain msgs) {
		WorkDefinition oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR, oldSuccessor, newSuccessor);
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
	public void setSuccessor(WorkDefinition newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject) successor).eInverseRemove(this,
						SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, WorkDefinition.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject) newSuccessor).eInverseAdd(this,
						SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, WorkDefinition.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR,
					newSuccessor, newSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePDLPackage.WORK_SEQUENCE__PROCESS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProcess((fr.n7.simplePDL.Process) otherEnd, msgs);
		case SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR:
			if (predecessor != null)
				msgs = ((InternalEObject) predecessor).eInverseRemove(this,
						SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, WorkDefinition.class, msgs);
			return basicSetPredecessor((WorkDefinition) otherEnd, msgs);
		case SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR:
			if (successor != null)
				msgs = ((InternalEObject) successor).eInverseRemove(this,
						SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, WorkDefinition.class, msgs);
			return basicSetSuccessor((WorkDefinition) otherEnd, msgs);
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
		case SimplePDLPackage.WORK_SEQUENCE__PROCESS:
			return basicSetProcess(null, msgs);
		case SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR:
			return basicSetPredecessor(null, msgs);
		case SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR:
			return basicSetSuccessor(null, msgs);
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
		case SimplePDLPackage.WORK_SEQUENCE__PROCESS:
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
		case SimplePDLPackage.WORK_SEQUENCE__PROCESS:
			return getProcess();
		case SimplePDLPackage.WORK_SEQUENCE__LINK_TYPE:
			return getLinkType();
		case SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR:
			if (resolve)
				return getPredecessor();
			return basicGetPredecessor();
		case SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR:
			if (resolve)
				return getSuccessor();
			return basicGetSuccessor();
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
		case SimplePDLPackage.WORK_SEQUENCE__PROCESS:
			setProcess((fr.n7.simplePDL.Process) newValue);
			return;
		case SimplePDLPackage.WORK_SEQUENCE__LINK_TYPE:
			setLinkType((WorkSequenceType) newValue);
			return;
		case SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR:
			setPredecessor((WorkDefinition) newValue);
			return;
		case SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR:
			setSuccessor((WorkDefinition) newValue);
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
		case SimplePDLPackage.WORK_SEQUENCE__PROCESS:
			setProcess((fr.n7.simplePDL.Process) null);
			return;
		case SimplePDLPackage.WORK_SEQUENCE__LINK_TYPE:
			setLinkType(LINK_TYPE_EDEFAULT);
			return;
		case SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR:
			setPredecessor((WorkDefinition) null);
			return;
		case SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR:
			setSuccessor((WorkDefinition) null);
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
		case SimplePDLPackage.WORK_SEQUENCE__PROCESS:
			return getProcess() != null;
		case SimplePDLPackage.WORK_SEQUENCE__LINK_TYPE:
			return linkType != LINK_TYPE_EDEFAULT;
		case SimplePDLPackage.WORK_SEQUENCE__PREDECESSOR:
			return predecessor != null;
		case SimplePDLPackage.WORK_SEQUENCE__SUCCESSOR:
			return successor != null;
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
		result.append(" (linkType: ");
		result.append(linkType);
		result.append(')');
		return result.toString();
	}

} //WorkSequenceImpl
