/**
 */
package fr.n7.simplePDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.Process#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.simplePDL.Process#getProcessElements <em>Process Elements</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.SimplePDLPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.n7.simplePDL.ProcessElement}.
	 * It is bidirectional and its opposite is '{@link fr.n7.simplePDL.ProcessElement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Elements</em>' containment reference list.
	 * @see fr.n7.simplePDL.SimplePDLPackage#getProcess_ProcessElements()
	 * @see fr.n7.simplePDL.ProcessElement#getProcess
	 * @model opposite="process" containment="true"
	 * @generated
	 */
	EList<ProcessElement> getProcessElements();

} // Process
