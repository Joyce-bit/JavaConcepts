package org.oopsconceptsbasic.Methods;

public class MainMethodSameClass {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String desg;
	
	void display() {
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(desg);
	}
	
	public static void main(String[] args) {
		
		MainMethodSameClass e = new MainMethodSameClass();
		e.eid=101;
		e.ename="John";
		e.sal=50000;
		e.deptno=10;
		e.desg="Manager";
		e.display();
		
	}
}
