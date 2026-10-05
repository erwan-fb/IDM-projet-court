/**
 */
package Petri.tests;

import Petri.ArcLectureSeule;
import Petri.PetriFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arc Lecture Seule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcLectureSeuleTest extends ArcsPonderesEntrantsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArcLectureSeuleTest.class);
	}

	/**
	 * Constructs a new Arc Lecture Seule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcLectureSeuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arc Lecture Seule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArcLectureSeule getFixture() {
		return (ArcLectureSeule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetriFactory.eINSTANCE.createArcLectureSeule());
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

} //ArcLectureSeuleTest
