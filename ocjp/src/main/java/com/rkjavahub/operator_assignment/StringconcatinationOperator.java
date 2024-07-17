package com.rkjavahub.operator_assignment;

public class StringconcatinationOperator {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		String d = "rohit";
		System.out.println(a + b + c + d); // 60rohit
		System.out.println(a + b + d + c); // 30rohit30
		System.out.println(d + a + b + c); // rohit102030
		System.out.println(a + d + b + c); // 10rohit2030

		// a=b+d; //Type mismatch: cannot convert from String to int

		d = a + d;
		System.out.println(d); // 10rohit

		// d = a + b; //Type mismatch: cannot convert from int to String

	}

}
