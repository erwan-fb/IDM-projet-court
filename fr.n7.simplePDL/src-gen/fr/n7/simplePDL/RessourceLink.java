/**
 */
package fr.n7.simplePDL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.RessourceLink#getRessourceNeeded <em>Ressource Needed</em>}</li>
 *   <li>{@link fr.n7.simplePDL.RessourceLink#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.n7.simplePDL.RessourceLink#getWorkDefinitionAssociate <em>Work Definition Associate</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.SimplePDLPackage#getRessourceLink()
 * @model
 * @generated
 */
public interface RessourceLink extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Ressource Needed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource Needed</em>' reference.
	 * @see #setRessourceNeeded(Ressource)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getRessourceLink_RessourceNeeded()
	 * @model required="true"
	 * @generated
	 */
	Ressource getRessourceNeeded();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.RessourceLink#getRessourceNeeded <em>Ressource Needed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource Needed</em>' reference.
	 * @see #getRessourceNeeded()
	 * @generated
	 */
	void setRessourceNeeded(Ressource value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getRessourceLink_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.RessourceLink#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Work Definition Associate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.n7.simplePDL.WorkDefinition#getLinkToRessource <em>Link To Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Definition Associate</em>' reference.
	 * @see #setWorkDefinitionAssociate(WorkDefinition)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getRessourceLink_WorkDefinitionAssociate()
	 * @see fr.n7.simplePDL.WorkDefinition#getLinkToRessource
	 * @model opposite="linkToRessource" required="true"
	 * @generated
	 */
	WorkDefinition getWorkDefinitionAssociate();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.RessourceLink#getWorkDefinitionAssociate <em>Work Definition Associate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Definition Associate</em>' reference.
	 * @see #getWorkDefinitionAssociate()
	 * @generated
	 */
	void setWorkDefinitionAssociate(WorkDefinition value);

} // RessourceLink
