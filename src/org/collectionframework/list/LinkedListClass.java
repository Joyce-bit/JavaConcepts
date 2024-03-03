package org.collectionframework.list;
import java.util.*;

public class LinkedListClass {
	public static void main(String[] args) {
		
		LinkedList link = new LinkedList();
		
		// To add elements into the linked list
		link.add("A"); 
		link.add("B"); 
		link.addLast("C"); 
		link.addFirst("D"); 
		link.add(2, "E");
		
		System.out.println(link);
		
		// To change a particular element in the linked list using set method
		link.set(1, "X");
		System.out.println(link);
		
		// To find the size of the linked list using size method
		System.out.println("The size of the linked list is : " + link.size());
		
		link.removeFirst();
		link.removeLast();
		System.out.println(link);
		
		for(int i = 0; i<link.size(); i++) {System.out.println(link.get(i));}
		
	}

}
