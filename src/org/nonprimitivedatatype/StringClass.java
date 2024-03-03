package org.nonprimitivedatatype;

public class StringClass {
	
	public static void main(String[] args) {
		
		// Declare String without using new operator 
		String str = "welcome"; 
		
		// Declare String using new operator 
		String str1 = new String("to java"); 
		
		System.out.println(str);
		System.out.println(str1);
		
		
		String s = "welcome";
		String s1 = "to java";
		
		System.out.println(s.length()); // to find the length of the string
		System.out.println(s.concat(s1)); //concatenate two strings
		
		s = "   welcome   ";
		System.out.println(s);
		System.out.println("Extra spaces are trimmed : " + s.trim());
		
		s="welcome";
		System.out.println(s.charAt(4)); //return charcter based on index number
		
		s="Welcome";
		System.out.println(s.contains("Wel"));  // check the mentioned character contains in string
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
		System.out.println(s.equals("Wel"));  //return true
		System.out.println(s.equals("wel"));  //return false
		System.out.println(s.equals("welcome"));  //return false
		
		System.out.println(s.equalsIgnoreCase("Welcome")); //return true	
		
		s="Welcome to Java";
		System.out.println(s.replace('l', 'i'));  //	Weicome to Java
		System.out.println(s.replace("Java", "Selenium"));	
		
		s="welcome";
		System.out.println(s.substring(0, 2));  //extracting substring from a string
		
		s="WELCOME";
		System.out.println(s.toLowerCase());  // converting to lower case
		
		s="welcome";
		System.out.println(s.toUpperCase());  // converting to upper case
	
      
	}

}
