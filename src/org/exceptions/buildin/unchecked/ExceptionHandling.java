package org.exceptions.buildin.unchecked;

public class ExceptionHandling {
	
	// Exception Handling using multiple try catch block with finally
	// We can use single try and catch block for each exception
		
		public static void main(String[] args) {
			
			System.out.println("Program starts");
			
			int x = 50;
			int a[] = new int[5];
			String s = null;
			String word = "abc";
			
			
			try {
				System.out.println(x/0);    // Throw an arithmetic exception
				a[6] = 100;                 // Throw a Index out of bound exception
				System.out.println(s.length());  // Throw Null Pointer exception
				int i = Integer.parseInt(word);   // Throw Number Format exception
			}
			catch(ArithmeticException e){
				
				System.out.println("Arithmetic exception is caught");
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Index out of bound exception is caught");
			}
			catch(NullPointerException e) {
				System.out.println("Null pointer exception is caught");
			}
			catch(NumberFormatException e) {
				System.out.println("Number Format exception is caught");
			}
			finally {
				System.out.println("Program ends");
			}
		
		}

}
