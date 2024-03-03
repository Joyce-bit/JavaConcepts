package org.controlstatements;

public class JumpStatement {
	
	//Break Statement
	
	private void break_statement() {
		
		System.out.println("Break Statement");
		
		for (int i=0; i<=10; i++) {
			
			System.out.println(i);
			
			if(i==5) {
				break;
			}
		}
		
	}
	// Continue Statement
	private void continue_statement() {
		
	
		System.out.println("Continue Statement");
		
		for (int i=0; i<=10; i++) {
			
			System.out.println(i);
			
			if(i==5) {
				continue;
			}
		}

	}
	
	public static void main(String[] args) {
		JumpStatement obj = new JumpStatement();
		obj.break_statement();
		obj.continue_statement();
		
	}
}
	
	
