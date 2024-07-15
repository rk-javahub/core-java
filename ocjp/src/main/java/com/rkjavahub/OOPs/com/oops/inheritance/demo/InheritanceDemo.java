package com.rkjavahub.OOPs.com.oops.inheritance.demo;

class A {
	public int a = 10;

	public void displayA() {
		System.out.println("A class");
	}
}

class B extends A {
	int b = 20;

	public void displayB() {
		System.out.println("B class");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		B b = new B();
		b.displayB();
		System.out.println("a= " + b.a + " b=" + b.b);

		A a = new B();
		((B) a).displayB();
		// System.out.println("a= " + a.a + " b=" + a.b);  //b cannot be resolved
		
		//B b1=new A(); //Type mismatch cannot convert from a to b

	}
}
