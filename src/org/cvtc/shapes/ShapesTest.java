package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		//create new instance of object
		Cuboid cuboidShape = new Cuboid();
		//access method of calculating cuboid and running it in main
		cuboidShape.calculateCuboid();
		
		//create new instance of object
		Cylinder cylinderShape = new Cylinder();
		//access method of calculating cylinder and running it in main
		cylinderShape.calculateCylinder();
		
		//create new instance of object
		Sphere sphereShape = new Sphere();
		//access method of calculating sphere and running it in main
		sphereShape.calculateSphere();
		
		

	}

}
