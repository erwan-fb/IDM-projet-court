/**
 */
package fr.n7.simplePDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link fr.n7.simplePDL.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link fr.n7.simplePDL.WorkDefinition#getLinkToRessource <em>Link To Ressource</em>}</li>
 *   <li>{@link fr.n7.simplePDL.WorkDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.SimplePDLPackage#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Links To Predecessors</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.simplePDL.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link fr.n7.simplePDL.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessors</em>' reference list.
	 * @see fr.n7.simplePDL.SimplePDLPackage#getWorkDefinition_LinksToPredecessors()
	 * @see fr.n7.simplePDL.WorkSequence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToPredecessors();

	/**
	 * Returns the value of the '<em><b>Links To Successors</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.simplePDL.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link fr.n7.simplePDL.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successors</em>' reference list.
	 * @see fr.n7.simplePDL.SimplePDLPackage#getWorkDefinition_LinksToSuccessors()
	 * @see fr.n7.simplePDL.WorkSequence#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToSuccessors();

	/**
	 * Returns the value of the '<em><b>Link To Ressource</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.simplePDL.RessourceLink}.
	 * It is bidirectional and its opposite is '{@link fr.n7.simplePDL.RessourceLink#getWorkDefinitionAssociate <em>Work Definition Associate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Ressource</em>' reference list.
	 * @see fr.n7.simplePDL.SimplePDLPackage#getWorkDefinition_LinkToRessource()
	 * @see fr.n7.simplePDL.RessourceLink#getWorkDefinitionAssociate
	 * @model opposite="workDefinitionAssociate"
	 * @generated
	 */
	EList<RessourceLink> getLinkToRessource();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.simplePDL.SimplePDLPackage#getWorkDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.simplePDL.WorkDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WorkDefinition
