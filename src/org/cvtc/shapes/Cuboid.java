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

//Should all the shapes extend Renderer interface instead of Shape???
public class Cuboid extends Shape implements Renderer {
	
	//float variables for cuboid
	private float width = (float) 0.0; 
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	private Component frame;
	
	
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox);
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		
		if(width<0 || height<0 || depth<0) {
			throw new IllegalArgumentException("Number must not be negative!");
		
		}

	}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
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
	

	
	@Override
	public void render() {
		
		JOptionPane.showMessageDialog(frame, "The surface area of a Cuboid is " + surfaceArea() + "\n" +"The volume of a Cuboid is " + volume());
		
	}

	@Override
	public float surfaceArea() {
		
		double saCuboid = (2*depth*width)+(2*depth*height)+(2*height*width);
		
		return (float) saCuboid;
	}

	@Override
	public float volume() {
		
		float vCuboid = width*height*depth;
		
		return (float) vCuboid;
	}
	
	
}
