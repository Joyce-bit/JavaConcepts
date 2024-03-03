package org.oopsconceptsbasic.Methods;

public class NoParaNoReturn {
	
	int x = 10;
	int y = 20;
	
	// Method with no parameters and no return value
	
	void sum() {
		
			System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		NoParaNoReturn m1 = new NoParaNoReturn();
		
		m1.sum();
		
	}

}
