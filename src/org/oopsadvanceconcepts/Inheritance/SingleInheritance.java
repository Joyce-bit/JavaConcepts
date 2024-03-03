package org.oopsadvanceconcepts.Inheritance;

class A{  // A is a Parent Class
	
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A{  // B is a Child Class of Parent Class A
	
	int b;
	void print() {
		
		System.out.println(b);
	}
	
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		
		B objb = new B();  // object created only for Class B as B extends A
		objb.a = 10;
		objb.b = 20;
		
		objb.display();
		objb.print();
		
	}

}
