package com.rkjavahub.operator_assignment;

public class EqualityOperator {

	public static void main(String[] args) {
		/*
		 * We can apply equality operator for every primitive type including
		 * boolean
		 */
		System.out.println(10 == 10.0); // true
		System.out.println('a' == 97); // true
		System.out.println(true == false); // false
		System.out.println(true == true); // true

		/*
		 * We can apply equality operator even for object references also. for
		 * two object references r1 and r2, r1==r2 returns true iff both r1 and
		 * r2 are pointing to the same object.
		 */
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;

		System.out.println(t1 == t2); // false
		System.out.println(t2 == t3); // false
		System.out.println(t3 == t1); // true

		/*
		 * To apply equality operator between two object references compulsory
		 * there should be some relationship between argument types (Either
		 * parent to child or child to parent) otherwise we will get
		 * incompatible type error
		 */
		Object o1 = new Object();
		String s1 = new String();
		Thread t4 = new Thread();

		System.out.println(o1 == s1); // false
		System.out.println(o1 == t4); // false
		// System.out.println(s1==t4); //Incompatible operand types String and
		// Thread

		String s2 = null;
		System.out.println(s1 == s2); // false

		System.out.println(null == null); // true

	}

}
