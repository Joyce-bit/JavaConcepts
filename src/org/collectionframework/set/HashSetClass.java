package org.collectionframework.set;

import java.util.*;

public class HashSetClass {
	
	public static void main(String[] args) {
		
		Set hs = new HashSet();
		
		// Adding elements into Hash Set
		 hs.add("A"); 
	     hs.add("B"); 
	     hs.add("C"); 
	     hs.add("B"); 
	     hs.add("D"); 
	     hs.add("E");
	     
	     // it will print the whole set exceeding all duplicate values
	     System.out.println(hs);
	     
	     hs.remove("B");
	     System.out.println(hs);
	     
	     }
	
	}


