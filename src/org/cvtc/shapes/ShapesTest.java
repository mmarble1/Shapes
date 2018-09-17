package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
	
		//create new instance of object
		Cuboid cuboidShape = new Cuboid(1,1,1);
		cuboidShape.render();
		//access method of calculating cuboid and running it in main
		//cuboidShape.calculateCuboid();
		
		//create new instance of object
		Cylinder cylinderShape = new Cylinder(1,1);
		cylinderShape.render();
		//access method of calculating cylinder and running it in main
		//cylinderShape.calculateCylinder();
		
		//create new instance of object
		Sphere sphereShape = new Sphere(1);
		sphereShape.render();
		//access method of calculating sphere and running it in main
		//sphereShape.calculateSphere();
		
		//call the render method for each object

	}

}
