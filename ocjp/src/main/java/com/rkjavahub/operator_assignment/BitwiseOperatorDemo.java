package com.rkjavahub.operator_assignment;

public class BitwiseOperatorDemo {
	public static void main(String[] args) {
		System.out.println(4 | 5); // 5 bitwise or
		System.out.println(4 & 5); // 4 bitise and
		System.out.println(4 ^ 5); // 1 bitwise xor

		// we can use ~ operator for int only
		// System.out.println(~true); //The operator ~ is undefined for the
		// argument type(s) boolean
		System.out.println(~4); // -5

		System.out.println('a' | 'b');// 99

		// System.out.println("Rohit" | "Kumbhar");//The operator | is undefined
		// for the argument type(s) java.lang.String, java.lang.String

		// System.out.println(~4.5);//The operator ~ is undefined for the
		// argument type(s)
		// double

		// We can apply ! operator for boolean operator only
		// System.out.println(!true);

		// System.out.println(!7);//he operator ! is undefined for the argument
		// type(s) int
	}
}
