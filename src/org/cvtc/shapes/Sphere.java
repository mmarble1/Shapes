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
public class Sphere extends Shape{
	
	private float radius = (float) 0.0;
	private Component frame;
	
	public Sphere() {
		super();
	}
	

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Sphere(float radius) {
		super();
		this.radius = radius;
	} 
	
	//method for calculating surface area and volume of a Sphere
	public float calculateSphere() {
		
		double saSphere;
		double vSphere;
		//surfaceArea() of a A=4*pie*r2
		//volume() of Sphere V=4/3*pie*r3
		saSphere = 4*Math.PI*Math.pow(radius, 2);
		vSphere = (4/3)*(3*Math.PI*Math.pow(radius, 3));
		
		JOptionPane.showMessageDialog(frame, "The surface area of a Sphere is " + saSphere + "\n" +"The volume of a Sphere is " + vSphere);
		//makes me have a return value 
		return 0;
	}


@Override
public void render() {
	// TODO Auto-generated method stub
	
}

}
