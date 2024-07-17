package com.rkjavahub.operator_assignment;

public class RelationalOperator {

	public static void main(String[] args) {
		/*
		 * We can apply relational operator >,<,<=,>= for every primitive data
		 * type except boolean
		 */
		System.out.println(10 < 20); // true
		System.out.println(10 > 20); // false
		System.out.println(10 > 10.0); // false
		System.out.println('a' > 25); // true

		// System.out.println(true<false); //The operator < is undefined for the
		// argument type(s) boolean, boolean

		// System.out.println("rohit"<"shubhangi"); //The operator < is
		// undefined for the argument type(s) java.lang.String, java.lang.String

		// System.out.println(10 < 20 < 30); //The operator < is undefined for
		// the argument type(s) boolean, int
	}
}
