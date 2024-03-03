package org.oopsadvanceconcepts.Inheritance;

// Hybrid Inheritance possible through interface

interface B1 {  // Interface
	void m1();
}

interface B2{  // Interface
	void m2();
}

class A1{  // Class
	
	void m3() {
		System.out.println("This is a sub class");
	}
	
}

public class HybridInheritance extends A1 implements B1, B2 {  // Class with main method
	
	public void m1() {
		System.out.println("m1 is a method from interface B1");
	}
	
	public void m2() {
		System.out.println("m2 is a method from interface B2");
	}

	public static void main(String[] args) {
		HybridInheritance h = new HybridInheritance();
		h.m1();
		h.m2();
		h.m3();
	}
}
