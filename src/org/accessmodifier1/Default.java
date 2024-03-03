package org.accessmodifier1;

// Default Access Modifier is accessible only with the class and the same package

class B{
	
	int b = 10;
	
	void display() {
		System.out.println(b);
	}
}

public class Default {
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.b=20;
		obj.display();
	}

}
