package org.oopsadvanceconcepts.Inheritance;

// Multiple Inheritance is possible with interface

interface number1{   // Interface
	int a  = 10;
	void m1();
}

interface number2{  // Interface
	int b = 20;
	void m2();
}

public class MultipleInheritance implements number1, number2 {  // Class that implements both the interfaces
	
	public void m1() {
		System.out.println(a);
	}
	
	public void m2() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance i = new MultipleInheritance();
		i.m1();
		i.m2();
	}

}
