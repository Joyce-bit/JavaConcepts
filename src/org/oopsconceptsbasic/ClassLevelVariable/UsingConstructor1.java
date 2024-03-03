package org.oopsconceptsbasic.ClassLevelVariable;

public class UsingConstructor1 {
	
	// Assigning values to variables using Constructor
	
	int sid;
	String sname;
	char grade;
	
	UsingConstructor1(int id, String name, char grd){
		
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
