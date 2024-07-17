package com.rkjavahub.operator_assignment;

public class InstanceOfOperator {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t instanceof Object); // true

		// System.out.println(t instanceof String); //Incompatible conditional
		// operand types Thread and String

		System.out.println(t instanceof Runnable); // true

		Object obj = new Integer(10);
		System.out.println(obj instanceof Integer); // true
		System.out.println(obj instanceof Float); // false
		System.out.println(null instanceof String);// false
		
		
		

	}

}
