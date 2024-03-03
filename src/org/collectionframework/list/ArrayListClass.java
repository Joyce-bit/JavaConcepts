package org.collectionframework.list;

import java.util.*;

public class ArrayListClass {
	
	// ArrayLsit and its methods
	
	public static void main(String[] args) {
		
		// To declare arraylist with string value
		ArrayList<String> cars = new ArrayList<String>();
		//To declare arraylist with integer value
		ArrayList<Integer> num = new ArrayList<Integer>();
		// To declare arraylist with no specific datatype and the arrylist will accept all kinds of data
		ArrayList al = new ArrayList(); 
		
		// Adding  string elements into Arraylsit using add method (homogeneous data)
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Hyndai");	
		
		// Adding integers into Arrylist using add method (homogeneous data)
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		// Adding mixed data into Arraylist using add method(heterogeneous data)
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(cars);
		
		// printing each element in arraylist using for each loop
		for (int i: num) {
			System.out.println(i);
		}
		
		// printing each element in arraylist using for loop
		for(int i=0; i<al.size(); i++) {
			
				System.out.println(al.get(i));
		}
		
		//Finding the size of arraylist using size method
		System.out.println("The size of array list is : " + al.size());
		
		// To remove an element in arraylist using remove method
		al.remove(1);
		
		System.out.println("welcome is removed from arraylist");
		System.out.println(al);
		
		// insert a new element in a specific index number
		al.add(2, "Selenium");
		
		System.out.println(al);
		
		// Using a specific element from the arraylist using get method
		System.out.println(al.get(2));
		
		// Change or replace a particular element in arraylist using set method
		al.set(2, "C++");
		System.out.println(al);
		
		// To check whether a particular element contains in arraylist using contains method
		System.out.println(al.contains(100));
		
		// To check the arraylist is empty or not with isempty method
		System.out.println(al.isEmpty());
		
		// To duplicate or copy an arraylist into another one using addall method
		ArrayList dup = new ArrayList();
		dup.addAll(cars);	
		System.out.println(dup);
		
		// To sort the arraylist 
		Collections.sort(dup);
		System.out.println(dup);
		
		// To reverse the order of the arraylist
		Collections.reverse(dup);	
		System.out.println(dup);
		
		// To shuffle the arraylist
		Collections.shuffle(dup);
		System.out.println(dup);
		
		// To remove all the elements from the arraylist
		dup.removeAll(dup);
		System.out.println(dup);
		
	}

}
