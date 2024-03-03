package org.oopsadvanceconcepts.Inheritance;

// Single Inheritance with Interface

interface F{
	
	int a = 10;   // static and final variable by default
	void method1();  // Abstract method by default
	
}

class D implements F{  // Class D implements interface F
	
	public void method1() {
		
		System.out.println(a);  // To print the value of final variable in interface
	
	}
}

public class SingleInheritanceWithInterface {
	
	public static void main(String[]	 args) {
		
		F ref=new D();
		ref.method1();
	
	}

}
