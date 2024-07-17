package com.rkjavahub.oops.overriding.demo;

class Parent {
	void display() {
		System.out.println("Parent class");
	}

	void display1() {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("Child class");
	}
}

public class OverrdingScopeDemo {

	public static void main(String[] args) {
		Parent p = new Child();
		p.display1(); // O/P:Parent class
		p.display();// O/P:Child class
	}
}
