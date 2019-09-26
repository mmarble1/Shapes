package org.cvtc.shapes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea() {
		Cylinder cylinder1 = new Cylinder(null, 8, 6);
		//assertEquals(expected value, actual value,     )
		assertEquals(703.72, cylinder1.surfaceArea(),.02);
	}

	@Test
	public void testVolume() {
		Cylinder cylinder = new Cylinder(null, 4,4);
		assertEquals(201.06, cylinder.volume(),.02);
	}

	@Test
	public void testGetRadius() {
		Cylinder cylinder = new Cylinder(null, 4,0);
		assertEquals(4, cylinder.getRadius());
	}

	@Test
	public void testGetHeight() {
		Cylinder cylinder = new Cylinder(null, 0,10);
		assertEquals(10, cylinder.getHeight());
	}
	
	//If  any one of the dimensions is inputed as a negative the test passes
		// this is the way to do it in junit 5. Will not work in junit 4s
	@Test 
	public void constructorExceptionTest() {
		
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			
				Cylinder cylinder1 = new Cylinder(null, -1, 1);
				cylinder1.getRadius();
			});
			
			assertEquals("Number must not be negative!", exception.getMessage());
			
		}

}
