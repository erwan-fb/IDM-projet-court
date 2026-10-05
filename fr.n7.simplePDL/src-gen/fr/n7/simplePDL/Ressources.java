/**
 */
package fr.n7.simplePDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.Ressources#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.simplePDL.Ressources#getQuantityAvailable <em>Quantity Available</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.SimplePDLPackage#getRessources()
 * @model
 * @generated
 */
public interface Ressources extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getRessources_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.Ressources#getName <em>Name</em>}' attribute.
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
	 * @see fr.n7.simplePDL.SimplePDLPackage#getRessources_QuantityAvailable()
	 * @model required="true"
	 * @generated
	 */
	int getQuantityAvailable();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.Ressources#getQuantityAvailable <em>Quantity Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Available</em>' attribute.
	 * @see #getQuantityAvailable()
	 * @generated
	 */
	void setQuantityAvailable(int value);

} // Ressources
