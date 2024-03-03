package org.oopsadvanceconcepts.Polymorphism;

public class MethodOverloading {
	
	// Method Overloading in Compile Time Polymorphism
	
	void sum(int a, int b){
		
			System.out.println(a+b);
	}
	
	void sum(int a, double b){
		
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c){
		
		System.out.println(a+b+c);
	}
	
	void sum(int a, int b, double c, double d){
		
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
			
		mo.sum(10, 20);
		mo.sum(10, 20.5);
		mo.sum(10, 20, 30);
		mo.sum(10, 20, 10.5, 10.7);
		
	}

}
