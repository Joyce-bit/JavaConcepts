package org.controlstatements;

public class DecisionMakingStatement {
	// Simple IF Statement
	private void simple_if_statement() {
		
		int x = 10;
		if(x==10) {
			System.out.println("X value is : " + x);
		}
			
	}
	// If-Else Statement
	private void if_else_statement() {
		
		int age = 10;
		
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
			
		}
	}
	// If-Else-If Ladder Statement
	private void if_else_if_statement() {
		
		String day = "Monday";
		
		if(day=="Saturday") {
			System.out.println("Enjoy weekend");
		}
		else if(day=="Sunday")
		{
			System.out.println("Enjoy weekend");
		}
		else{
			System.out.println("Working Day");
			
		}
		
	}
	// Nested-If Statement
	private void nested_if_statement() {
		
		int x = 10;
		int y = 30;
		
		if(x==10) {
			if(y==20) {
				System.out.println("Nested IF");
			}
			else {
				System.out.println("Not a nested-if statement");
			}
		}
		
	}
	//Switch Statement
	private void switch_statement() {
	
	char grade = 'A';
	
	switch(grade) {
	
	case 'A':
		System.out.println("Excellent");
		break;
	case 'B':
		System.out.println("Good");
		break;
	case 'C':
		System.out.println("Average");
		break;
	case 'F':
		System.out.println("Need Improvement");
		break;
	default:
		System.out.println("Invalide Grade");
	}
			
	}
	//main method
	public static void main(String[] args) {
		
		DecisionMakingStatement obj = new DecisionMakingStatement();
		
		obj.simple_if_statement();
		obj.if_else_statement();
		obj.if_else_if_statement();
		obj.nested_if_statement();
		obj.switch_statement();
		
	}
}
