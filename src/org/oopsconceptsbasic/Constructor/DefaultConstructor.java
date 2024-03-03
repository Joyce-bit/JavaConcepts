package org.oopsconceptsbasic.Constructor;

public class DefaultConstructor {
	
	int x;
	int y;
	
	DefaultConstructor(){   // Default Constructor
		
		x = 20;
		y = 10;
	}
	
	void result() {
		
		System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {
		
		DefaultConstructor dc = new DefaultConstructor();
		dc.result();
	}

}
