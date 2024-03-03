package org.nonprimitivedatatype;

// Non primitive data types are Class, Objects, String, Array, Interface	

public class ClassandObject {   // Class name is user defined and it is non primitive
	
	int a = 20;
	int b = 10;
	int c;
	
	// defining the methods of class
	
	void add() {
		
		c = a + b;
		System.out.println("Additon is : " + c);
		
	}
	
	void sub() {
		
		c = a-b;
		System.out.println("subtraction is : " + c);
		
	}
	
	  // main method 
	
	public static void main (String args[]) {
		
		// creating the object of class
		
		ClassandObject n = new ClassandObject();
		
		 // calling the methods  
		
		n.add();
		n.sub();
		
		
	}

}
