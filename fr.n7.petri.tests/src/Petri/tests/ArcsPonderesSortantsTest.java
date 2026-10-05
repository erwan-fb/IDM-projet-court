/**
 */
package Petri.tests;

import Petri.ArcsPonderesSortants;
import Petri.PetriFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arcs Ponderes Sortants</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcsPonderesSortantsTest extends ArcsPonderesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArcsPonderesSortantsTest.class);
	}

	/**
	 * Constructs a new Arcs Ponderes Sortants test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcsPonderesSortantsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arcs Ponderes Sortants test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArcsPonderesSortants getFixture() {
		return (ArcsPonderesSortants)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetriFactory.eINSTANCE.createArcsPonderesSortants());
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

} //ArcsPonderesSortantsTest
