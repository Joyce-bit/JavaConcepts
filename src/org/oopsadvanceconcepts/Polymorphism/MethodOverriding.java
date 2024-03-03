package org.oopsadvanceconcepts.Polymorphism;

// Method Overriding in Run Time Polymorphism with Multiple Inheritance

class Bank{  // parent class
	
		double RateOfInterest() {
			
			return 0;	
		}
}

class SBI extends Bank{  // child class
	
	double RateOfInterest() {
		
		return 10.5;	
	}
}

class ICICI extends Bank{  // child class
	
	double RateOfInterest() {
		
		return 13.5;	
	}
}	

class Axis extends Bank{  //  child class
	
	double RateOfInterest() {
		
		return 12.5;	
	}
}


public class MethodOverriding {
	
	public static void main(String[] args) {
		
		SBI s = new SBI();
		System.out.println(s.RateOfInterest());
		
		ICICI i = new ICICI();
		System.out.println(i.RateOfInterest());
		
		Axis a = new Axis();
		System.out.println(a.RateOfInterest());
	}
	
}
