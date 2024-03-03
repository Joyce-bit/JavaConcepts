package org.oopsconceptsbasic.Methods;

public class ParaAndReturnValue {
	// Method with parameters and reutrn value
	
	int div(int x, int y) {
		
		return(x/y);
	}
	
		
	public static void main(String[] args) {
		
		ParaAndReturnValue m4 = new ParaAndReturnValue();
		int res;
		res = m4.div(10, 2);
		System.out.println(res);
		
	}

}
