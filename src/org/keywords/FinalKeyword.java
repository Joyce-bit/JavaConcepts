package org.keywords;


final class Bike{  // Final keyword in Parent Class and child class cannot be extended
	
	final void run() {  // final keyword in method which can not override with child class
		
		System.out.println("Bike is Running");  
	}
}

/*class Honda extends Bike{  // Child Class
	
	void run() {    //Compile Time Error	
		
		System.out.println("Honda is running");
	}
}*/

public class FinalKeyword {
	
	 final int speed = 40;   // final keyword in variable and the value cannot be changed
	
	public static void main(String[] args) {
		
		//speed=50;   Compile time error	
		
		// Honda h = new Honda();
		// h.run();
		
	}

}
