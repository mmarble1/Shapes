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
//a child of shape 
public class Cylinder extends Shape {
	
	private float radius = (float) 0.0;
	private float height = (float) 0.0;
	private Component frame;

	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		this.radius = radius;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	//method to calculate surface area and volume
public double calculateCylinder() {
		
		double saCylinder;
		double vCylinder;
		//surfaceArea() of a Cylinder A=2*pie*rh+2*pie*r2
		//volume() of Cylinder aV=pie*r2h
		saCylinder = (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2));
		vCylinder = Math.PI*radius*2*height;
		//dialog box displays surface area and volume of cylinder
		JOptionPane.showMessageDialog(frame, "The surface area of a Cylinder is " + saCylinder + "\n" +"The volume of a Cylinder is " + vCylinder);
		return 0;
	}


@Override
public void render() {
	// TODO Auto-generated method stub
	
}

}
