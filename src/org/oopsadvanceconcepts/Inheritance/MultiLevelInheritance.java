package org.oopsadvanceconcepts.Inheritance;

class X {  // Parent Class
	
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class Y extends X{  // Child Class
	
	int b;
	void print() {
		
		System.out.println(b);
	}
	
}

class Z extends Y{   // Child Class
	
	int c;
	void show() {
		System.out.println(c);
	}
}

public class MultiLevelInheritance {
	
public static void main(String[] args) {
		
		Z objc = new Z();  // object created only for Class Z as Z extends Y and Y extends X
		objc.a = 10;
		objc.b = 20;
		objc.c = 30;
		
		objc.display();
		objc.print();
		objc.show();
		
	}
}
