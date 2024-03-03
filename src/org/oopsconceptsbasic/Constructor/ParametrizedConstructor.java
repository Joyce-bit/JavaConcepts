package org.oopsconceptsbasic.Constructor;

public class ParametrizedConstructor {
	
	int a;
	int b;
	
	ParametrizedConstructor(int x, int y){   // Paramertized Constructor
		
		a = x;
		b = y;
	}
	
	void result() {
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		DefaultConstructor dc = new DefaultConstructor();
		dc.result();
	}

}
