package org.cvtc.shapes;


public class ShapesTest {

	public static void main(String[] args) {
	
		//create new instance of object
		Renderer cuboidShape = new Cuboid(new MessageBox(),1,1,1);
		cuboidShape.render();
		//access method of calculating cuboid and running it in main
		//cuboidShape.calculateCuboid();
		
		//create new instance of object
		Renderer cylinderShape = new Cylinder(new MessageBox(),1,1);
		cylinderShape.render();
		//access method of calculating cylinder and running it in main
		//cylinderShape.calculateCylinder();
		
		//create new instance of object
		Renderer sphereShape = new Sphere(new MessageBox(),1);
		sphereShape.render();
		//access method of calculating sphere and running it in main
		//sphereShape.calculateSphere();
		
		//call the render method for each object

	}

}
