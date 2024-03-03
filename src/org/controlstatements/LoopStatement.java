package org.controlstatements;

public class LoopStatement {
	
	private void for_statement() {
		// print number from 0 to 9	
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
	}
	
	private void while_statement() {
		//Print Even number
		int i = 2;
		while(i<=10) {
			System.out.println(i);
			i=i+2;
			
		}
		System.out.println("----------------------");
	}
	
	private void do_while_statement() {
		// print number from 1 to 10 using while statement
		int i = 1;
		
		do {
			
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println("-------------------------");
		
	}
	private void for_each_statement() {
		// Print each elements in the array one by one
		String names[] = {"Joe", "John", "Sara"};
		
		for(String name:names) {
			System.out.println(name);
		
		}
	}
	
	public static void main(String[] args) {
		
		LoopStatement obj = new LoopStatement();
		
		obj.for_statement();
		obj.while_statement();
		obj.do_while_statement();
		obj.for_each_statement();
	}

}
