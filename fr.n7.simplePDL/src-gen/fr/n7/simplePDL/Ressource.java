/**
 */
package fr.n7.simplePDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.Ressource#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.simplePDL.Ressource#getQuantityAvailable <em>Quantity Available</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.SimplePDLPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getRessource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.Ressource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Available</em>' attribute.
	 * @see #setQuantityAvailable(int)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getRessource_QuantityAvailable()
	 * @model required="true"
	 * @generated
	 */
	int getQuantityAvailable();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.Ressource#getQuantityAvailable <em>Quantity Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Available</em>' attribute.
	 * @see #getQuantityAvailable()
	 * @generated
	 */
	void setQuantityAvailable(int value);

} // Ressource
