package org.cvtc.shapes;

import org.junit.Test;

public class RendererTest {

	@Test
	public void test() {

	MessageBoxSub box1 = new MessageBoxSub();
	
	Cuboid cube1 = new Cuboid(box1, 1, 1, 1);
	Cylinder cylinder1 = new Cylinder(box1, 1, 1);
	Sphere sphere1 = new Sphere(box1, 1);
	
	cube1.render();
	cylinder1.render();
	sphere1.render();
	
	}
	
	
	
}
