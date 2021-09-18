package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("I'm here to display the size of the desktop");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop d = new Desktop();
		
		d.computerModel();
		d.desktopSize();
		
		
	}

}
