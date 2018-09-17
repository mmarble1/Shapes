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
	

	public Sphere(float radius) {
		super();
		this.radius = radius;
		
		if(radius<0) {
			throw new IllegalArgumentException("Number must not be negative!");
		}
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	
	

	@Override
	public void render() {
	
		JOptionPane.showMessageDialog(frame, "The surface area of a Sphere is " + surfaceArea() + "\n" +"The volume of a Sphere is " + volume());
	
	}


	@Override
	public float surfaceArea() {
		
		double saSphere = 4*Math.PI*Math.pow(radius, 2);
		
		return (float) saSphere;
	}


	@Override
	public float volume() {
		
		double vSphere = (4.0/3.0)*(Math.PI*Math.pow(radius, 3));
		
		return (float) vSphere;
	}

}
