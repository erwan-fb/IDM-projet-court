/**
 */
package Petri.tests;

import Petri.PetriFactory;
import Petri.ReseauPetri;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reseau Petri</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReseauPetriTest extends TestCase {

	/**
	 * The fixture for this Reseau Petri test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReseauPetri fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReseauPetriTest.class);
	}

	/**
	 * Constructs a new Reseau Petri test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReseauPetriTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reseau Petri test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReseauPetri fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reseau Petri test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReseauPetri getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetriFactory.eINSTANCE.createReseauPetri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ReseauPetriTest
