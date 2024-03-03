package org.oopsconceptsbasic.Methods;

public class NoParaReturnValue {
	
	int x = 20;
	int y = 10;
	
	// Method with no parameters but has a return value
	
	int sub() {
		
			return(x-y);
	}
	
	public static void main(String[] args) {
		
		NoParaReturnValue m2 = new NoParaReturnValue();
		
		int result;
		result = m2.sub();
		System.out.println(result);
		
	}

}
