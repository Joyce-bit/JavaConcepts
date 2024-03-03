package org.oopsconceptsbasic.Methods;

public class ParaNoReturnValue {
	
	// Method with parameters but no return value
	
	void mul(int x, int y) {
		
		System.out.println(x*y);
	}
	
	
	public static void main(String[] args) {
		ParaNoReturnValue m3 = new ParaNoReturnValue();
		
		m3.mul(10, 10);
		
	}

}
