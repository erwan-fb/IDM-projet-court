/**
 */
package fr.n7.simplePDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.ProcessElement#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.SimplePDLPackage#getProcessElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProcessElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.n7.simplePDL.Process#getProcessElements <em>Process Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(fr.n7.simplePDL.Process)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getProcessElement_Process()
	 * @see fr.n7.simplePDL.Process#getProcessElements
	 * @model opposite="processElements" required="true" transient="false"
	 * @generated
	 */
	fr.n7.simplePDL.Process getProcess();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.ProcessElement#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(fr.n7.simplePDL.Process value);

} // ProcessElement
