package org.keywords;

public class StaticKeyword {

	static int a=10;   // static variable
	int b=20;   // non-static variable
	
	static void method1() {  // static method
		
		System.out.println("Method1 is a static method");
	}
	
	void method2() {
		System.out.println("Method2 is a non-static method");
		
	}
	
	void method3() {
		System.out.println("Method3 is a non-static method");
		System.out.println(a);  //static variable can be directly called into non-static method
		System.out.println(b);  // non-static variable can be direcly called into non-static method
		method1();	// static method is directly called into non-static method
		method2();  // non-static method is directly called into non-static method
	}
	
	public static void main(String[] args) {
		
		// Since a is static variable and method1 is a static method, object creation is not required
		System.out.println(a);
		StaticKeyword.method1();
		
		/* This below println line will through an error as non static varibale cannnot access directly. 
		 It need an object.*/
		  
		// System.out.println(b);
		
		StaticKeyword s = new StaticKeyword();
		s.method2();
		s.method3();
		
	}
	
}
