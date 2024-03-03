package org.oopsconceptsbasic.ClassLevelVariable;

public class UsingReferenceVariable2 {
	
	public static void main(String[] args) {
		
		UsingReferenceVariable1 r = new UsingReferenceVariable1();
		// Assigning values to variables using reference variable
		r.sid=1001;
		r.sname="Sara";
		r.grade = 'A';
		
		r.display();
	}

}
