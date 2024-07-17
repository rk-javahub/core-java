package com.rkjavahub.declaration_and_access_modifier;

/* We cant access non static variable from static field */
public class Static_demo {
	static int a = 10;
	int b = 20;

	public static void display() {
		System.out.println("Display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		// System.out.println(b); //cannot make static reference to non static fields
		display();
	}

}
