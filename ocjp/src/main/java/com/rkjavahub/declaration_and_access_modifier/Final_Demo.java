package com.rkjavahub.declaration_and_access_modifier;



public class Final_Demo {

	final int a = 10;

	final void display() {
		System.out.println("Final method");
	}
}

class Demo1 extends Final_Demo {// The type Demo cannot subclass the final class
								// Final_Demo
	/*
	 * void display() { }
	 */// cannot override final method
}
