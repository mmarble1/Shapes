/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author Marcus
 *
 */
public abstract class Shape implements Renderer {
	
	private Dialog messageBox;
	
	//public abstract void render();
	
	public abstract float surfaceArea();
	public abstract float volume();
	
	//getters and setters
	public Dialog getMessageBox() {
		return messageBox;
	}

	public void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}

	
	
	
	public Shape(Dialog messageBox) {
		super();
		this.messageBox = messageBox;
		
	}
	
	
}
