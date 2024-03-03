package org.exceptions.buildin.checked;

public class Interrupted {
	
	// Interrupted Exception
	
	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		// Thread.sleep(5000);  This will throw a compile time error
		
		System.out.println("Program is exited");
	}

}
