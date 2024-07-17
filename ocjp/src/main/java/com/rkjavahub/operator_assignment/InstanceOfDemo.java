package com.rkjavahub.operator_assignment;

public class InstanceOfDemo {

	public static void main(String[] args) {
		String s = "rohit";
		System.out.println(s instanceof String);// true

		Thread t = new Thread();
		System.out.println(t instanceof Thread);// true

		// We can apply instanceof operator for interfaces also which returns
		// true
		System.out.println(t instanceof Runnable);// true

		// We can apply instanceof operator for parent class also which returns
		// true
		System.out.println(t instanceof Object);// true

		// Whenever we are checking parent object is of child type we will get
		// fasle as output
		Object o = new Integer(7);
		System.out.println(o instanceof Object);// true
		System.out.println(o instanceof String);// false

		// null
		System.out.println(null instanceof String);// false

	}

}
