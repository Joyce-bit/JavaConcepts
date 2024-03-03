package org.accessmodifier1;

// Private Access Modifier is accessible only within the class

class A{
	
		private int a = 10;
		private void display() {
			System.out.println(a);
		}
	
}

public class Private {
	
	public static void main(String[] args) {
		
		A obj = new A();
		// obj.a=20;   Compile time error as we cannot access the variable which is declared as private
		// obj.display();  Compile time error as we cannot access the private method 
	}

}
