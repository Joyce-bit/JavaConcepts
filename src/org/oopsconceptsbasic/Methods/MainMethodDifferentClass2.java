package org.oopsconceptsbasic.Methods;

public class MainMethodDifferentClass2 {
	
public static void main(String[] args) {
		
		MainMethodSameClass e1 = new MainMethodSameClass();
		e1.eid=101;
		e1.ename="John";
		e1.sal=50000;
		e1.deptno=10;
		e1.desg="Manager";
		e1.display();
		
		
		MainMethodSameClass e2 = new MainMethodSameClass();
		e2.eid=102;
		e2.ename="Joe";
		e2.sal=30000;
		e2.deptno=9;
		e2.desg="Analyst";
		e2.display();
	}

}
