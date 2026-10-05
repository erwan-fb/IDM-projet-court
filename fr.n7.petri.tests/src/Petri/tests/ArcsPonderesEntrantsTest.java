/**
 */
package Petri.tests;

import Petri.ArcsPonderesEntrants;
import Petri.PetriFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arcs Ponderes Entrants</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcsPonderesEntrantsTest extends ArcsPonderesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArcsPonderesEntrantsTest.class);
	}

	/**
	 * Constructs a new Arcs Ponderes Entrants test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcsPonderesEntrantsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arcs Ponderes Entrants test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArcsPonderesEntrants getFixture() {
		return (ArcsPonderesEntrants)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetriFactory.eINSTANCE.createArcsPonderesEntrants());
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

} //ArcsPonderesEntrantsTest
