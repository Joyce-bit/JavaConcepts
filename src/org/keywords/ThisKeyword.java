package org.keywords;

public class ThisKeyword {
	
	int a;  // class variable or instance variable
	int b;
	
	void getvalues(int a, int b) {  // Method Variable or external variable
		
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		
		ThisKeyword t = new ThisKeyword();
		
		t.getvalues(10, 20);
		t.display();
		
	}
}

