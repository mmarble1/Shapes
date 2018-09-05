/**
 * 
 */
package org.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author Marcus
 *
 */
public class Cuboid extends Shape {
	
	//float variables for cuboid
	private float width = (float) 0.0; 
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	private Component frame;
	
	
	public Cuboid() {
		super();
	}
	
	//getters and setters
	//not using at the moment
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public Cuboid(float width, float height, float depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	//Method to calculate Cuboid surface area and volume 
	public float calculateCuboid() {
		
		double saCuboid;
		double vCuboid;
		//formula for Cuboid surface area
		//surfaceArea() of a Cuboid is SA=2dw+2dh+2hw
		saCuboid = (2*depth*width)+(2*depth*height)+(2*height*width);
		//formula for cuboid volume
		//volume() of a Cuboid is w*h*d
		vCuboid = width*height*depth;
		
		//dialog box displays surface area and volume of cuboid
		JOptionPane.showMessageDialog(frame, "The surface area of a Cuboid is " + saCuboid + "\n" +"The volume of a Cuboid is " + vCuboid);
		//jOptionPane frame makes me return something
		return 0;
	}

	//need more skill here and understanding
	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	
}
