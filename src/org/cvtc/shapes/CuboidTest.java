package org.cvtc.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboidTest {


	@Test
	void testGetWidth() {
		Cuboid cube1 = new Cuboid(1, 0, 0);
		assertEquals(1, cube1.getWidth());
	}
	
	@Test
	void testGetHeight() {
		Cuboid cube1 = new Cuboid(0, 1, 0);
		assertEquals(1, cube1.getHeight());
	}
	
	@Test
	void testGetDepth() {
		Cuboid cube1 = new Cuboid(0, 0, 1);
		assertEquals(1, cube1.getDepth());
	}
	
	//??  if I put in a negative number here it will throw that exception in the constructor
	@Test
	void testCuboid() {
		Cuboid cube1 = new Cuboid(4, 5, 1);
		assertEquals(true, cube1.equals(cube1));

	}

	//If  any one of the dimensions is inputed as a negative the test passes
	// this is the way to do it in junit 5. Will not work in junit 4s
	@Test 
	public  void constructorExceptionTest() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Cuboid cube1 = new Cuboid(1, 1, -1);
			cube1.getWidth();
			cube1.getHeight();
			cube1.getDepth();
		});
		
		assertEquals("Number must not be negative!", exception.getMessage());
		
	}


	
	@Test
	public void testSurfaceArea() {
		Cuboid cube1 = new Cuboid(3,3,3);
		//assertEquals(expected value, actual value,     )
		assertEquals(54, cube1.surfaceArea(), .0002);	
	}
	
	@Test
	void testVolume() {
		Cuboid cube1 = new Cuboid(3,3,3);
		assertEquals(27, cube1.volume(), .0002);
	}

}
