package org.operators;

public class Operators {
	
	int a = 20;
	int b = 10;
	int number = 20;
	
	// Arithmetic operators
	private void arithmetic() {
		
		System.out.println("a + b : " +  (a+b));
		System.out.println("a - b : " + (a-b));
		System.out.println("a * b : " + (a*b));
		System.out.println("a / b : " + (a/b));
		System.out.println("Mod of a%b : " + (a%b));
	
	}
	// Relational operators
	private void relational() {
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
	
	}
	//Logical operators
	private void logical() {
		
		//range of number accepted from 18 to 35
		
		if (number>=18 && number<=35) {
			
			System.out.println("The given number is within the range");
			
		}
		
		else if (number>18 || number>35){
			
			System.out.println("The given number is not in the range");
		}
		
	}
	
	//Unary Operators
	private void unary() {
		
		System.out.println("Post Increment : " + (a++));
		System.out.println("Pre Increment : " + (++a));
		
		System.out.println("Post Decrement : " + (a--));
		System.out.println("Pre Decrement : " + (--a));
		
		
	}
	// Assignment Operator
	private void assignment() {
		
		String s = "Hello";   // = is a assignment operator
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		
		Operators obj = new Operators();
		
		obj.arithmetic();
		obj.relational();
		obj.logical();
		obj.unary();
		obj.assignment();
		
	}
	
	
}
	