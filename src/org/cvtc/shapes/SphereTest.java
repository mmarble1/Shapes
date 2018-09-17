package org.cvtc.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(314.1592, sphere1.surfaceArea(), .0002);
	}
	
	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(5);
		assertEquals(523.6, sphere1.volume(), .002);
	}
	
	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere((float) 5.25);
		assertEquals(5.25, sphere1.getRadius());
	}	
		
	
	//If  any one of the dimensions is inputed as a negative the test passes
		// this is the way to do it in junit 5. Will not work in junit 4s
	@Test 
	public void constructorExceptionTest() {
		
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			
				Sphere sphere1 = new Sphere(-1);
				sphere1.getRadius();
			});
			
			assertEquals("Number must not be negative!", exception.getMessage());
			
		}

}
