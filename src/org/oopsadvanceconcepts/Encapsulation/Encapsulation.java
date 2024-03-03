package org.oopsadvanceconcepts.Encapsulation;

class student{   // Parent Class
	// Encapsulating the name and age only approachable and used using methods defined
	
	private String name;
	private int age;
	// getter
	public String getName() {
		return name;
	}
	// setter
	public void setName(String setname) {
			this.name = setname;
	}
	// getter
	public int getAge() {
		return age;
	}
	// setter
	public void setAge(int setage) {
		this.age = setage;
	}
	
}

public class Encapsulation {  // Driver Class
	
	public static void main(String[] args) {
		
		// Object created for the student class
		student stu = new student();
		stu.setName("John");
		stu.setAge(30);
		
		// Using methods to get the values from the variables
		System.out.println("Name : " + stu.getName());
		System.out.println("Age : " + stu.getAge());
		
	}

}	
