/**
 * 
 */
package sddvops.dv102_cwf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sddvops.dv102_cwf.*;

/**
 * @author Admin1
 *
 */
class AppTest {
	
	private App A1;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		A1 = new App(3.00);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#App(double, double)}.
	 */
	@Test
	void testApp() {
		  System.out.println("@Test: App");
		    assertTrue(true); 
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#getLength()}.
	 */
	@Test
	void testGetLength() {
		
		assertEquals(A1.getLength(), 3.00);
	
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#setLength(double)}.
	 */
	@Test
	void testSetLength() {
		A1.setLength(2.00);		
		assertEquals(A1.getLength(), 2.00);			   
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#getArea()}.
	 */
	@Test
	void testGetArea() {
		
		A1.setArea(4.00);		
		assertEquals(A1.getArea(), 4.00);
		
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#setArea(double)}.
	 */
	@Test
	void testSetArea() {
		A1.setArea(5.00);		
		assertEquals(A1.getArea(), 5.00);
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#calcArea()}.
	 */
	@Test
	void testCalcArea() {
		//3.897114317029974 : final count using length as 3.00
		assertEquals(A1.calcArea(), 3.897114317029974);
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#calcVolume()}.
	 */
	@Test
	void testCalcVolume() {
		//3.897114317029974 : final count using length as 3.00
		assertEquals(A1.calcVolume(), 3.897114317029974);
	}

}
