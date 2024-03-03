package org.oopsadvanceconcepts.Polymorphism;

public class ConstructorOverloading {
	
	// Constructor Overloading
	
	ConstructorOverloading(int a, int b) {
		
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, double b) {
		
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
	
	ConstructorOverloading(int a, int b, double c, double d) {
		
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading c1 = new ConstructorOverloading(10, 20);
		ConstructorOverloading c2 = new ConstructorOverloading(10, 12.5);
		ConstructorOverloading c3 = new ConstructorOverloading(10, 0, 30);
		ConstructorOverloading c4 = new ConstructorOverloading(10, 20, 12.5, 14.5);
	}
	
}
