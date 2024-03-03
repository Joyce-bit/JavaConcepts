package org.nonprimitivedatatype;

public class ClassforInterface implements CalcInterface{
	
	// defining the variables of class  
	int a = 10;
	int b = 20;
	int c;
	
	// implementing the interface methods  
	public void multiply(){
		
		c = a*b;
		
		System.out.println("Multiplication result is " + c );
		
	}
	
	// implementing the interface methods  
	public void divide(){
		
		c = a/b;
		
		System.out.println("Division result is " + c );
		
	}
	
	// main method  
	public static void main(String[] args) {
		
	ClassforInterface obj = new ClassforInterface();
	
	obj.multiply();
	obj.divide();
	}

}
