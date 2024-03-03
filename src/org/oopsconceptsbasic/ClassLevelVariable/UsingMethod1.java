package org.oopsconceptsbasic.ClassLevelVariable;

public class UsingMethod1 {
	
	// Assigning values to variable using method
	
	int sid;
	String sname;
	char grade;
	
	void getValue(int id, String name, char grd) {
		
		sid=id;
		sname=name;
		grade=grd;
		
	}
	
	void display() {
		
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);
	}
	
}
