package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		// TODO Auto-generated method stub
		
		System.out.println("My desktopSize is 32In");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Single inheritance");
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}


}
