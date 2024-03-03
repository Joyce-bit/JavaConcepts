package org.keywords;

// super keyword in Hierarchal Inheritance 

class Dog{  // parent class
	
	String colour = "Dog is in Brown";  // class or instance variable which is overriding
	
	void eating() {  // method
		
		System.out.println("Dog is eating");
	}
	
	Dog(){  // Constructor of the parent class
		
		System.out.println("This is a constructor of the Dog parent class ");
	}
}

class pug extends Dog{  // child class 
	
	String colour = "Pug is in Black and Brown";
	
	void display() {  // method
		
		System.out.println(colour);
		System.out.println(super.colour);  //super keyword is used to invoke the instance variable of the immediate parent class 
		
	}
	
	void eating() {
		System.out.println("Pug is eating");
		super.eating();  // super keyword is used to invoke the method of the immediate parent class
	}
	
	pug(){  // Constructor of the child class
		
		super();  // super keyword is used to invoke the constructor of the parent class
		System.out.println("This is the constructor of the pug child class");
	}
	
}

public class SuperKeyword {
	
	public static void main(String[] args) {
		
		pug p = new pug();
		p.display();
		p.eating();
				
	}
}

