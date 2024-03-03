package org.oopsadvanceconcepts.Polymorphism;

public class OperatorOverloading {
	
	// Operator Overloading in Compile Time Polymorphism
	
	void add(int a, int b) {
		
		int sum=a+b;
		System.out.println(sum);
	}
	
	void add(String s1, String s2) {
		
		String con_str = s1+s2;
		System.out.println(con_str);
		
	}
	
	public static void main(String[] args) {
		
		OperatorOverloading o = new OperatorOverloading();
		
		o.add(10, 10);
		o.add("Operator ", "Overloading");
		
	}

}
