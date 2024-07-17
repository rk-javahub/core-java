package com.rkjavahub.exception_handling;

/*After throw statement we can't take any statement directly otherwise we will get
compile time error saying unreachable statement.*/

public class throwTestCase2 {

	public static void main(String[] args) {
		throw new ArithmeticException("/ by 0");
		// System.out.println("hello"); //Compile time exception: unreachable statement
	}
}
