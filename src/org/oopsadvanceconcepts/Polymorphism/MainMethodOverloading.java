package org.oopsadvanceconcepts.Polymorphism;

public class MainMethodOverloading {
	
	public void main(int x) {
		
		System.out.println(x);
	}
	
	public void main(int x, int y) {
		
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		MainMethodOverloading m = new MainMethodOverloading();
		
		m.main(10);
		m.main(10, 30);
		
	}

}
