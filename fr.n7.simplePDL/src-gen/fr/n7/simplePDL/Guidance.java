/**
 */
package fr.n7.simplePDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.Guidance#getElement <em>Element</em>}</li>
 *   <li>{@link fr.n7.simplePDL.Guidance#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.SimplePDLPackage#getGuidance()
 * @model
 * @generated
 */
public interface Guidance extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ProcessElement)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getGuidance_Element()
	 * @model
	 * @generated
	 */
	ProcessElement getElement();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.Guidance#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ProcessElement value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getGuidance_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.Guidance#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Guidance
