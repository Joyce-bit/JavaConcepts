package org.nonprimitivedatatype;

public class Array {
	private void single_dimensional_array() {
		//Single Dimensional Array
		String names[] = {"Joe", "John", "Sara"};
		System.out.println("Lennth of names array is : " + names.length);
		// Printing single dimensional array using for loop
		/* for(int i=0; i<names.length; i++) {
			
			System.out.println(i);
			
		} */
		// Printing single dimensional array using for each loop
		for(String j:names) {
			
			System.out.println(j);
		}
	}
	
	private void multi_dimensional_array() {
		//Two Dimensional Array
		int numbers[][] = {{1,2}, {3,4}, {5,6}};
		System.out.println("Number of rows in two dimensional array : " + numbers.length);
		System.out.println("Number of columns in two dimensional array : " + numbers[0].length);
		//Printing the two dimensional array using for loop
		/* for(int i=0; i<=numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		
		} */
		// Printing two dimensional array using for each loop
		for (int i[]:numbers) {
			
			for(int j:i) {
			
			System.out.println(j);
		}
	}
	}
			
	public static void main(String[] args) {
		
		Array obj = new Array();
		obj.single_dimensional_array();
		obj.multi_dimensional_array();
		
	}
}
