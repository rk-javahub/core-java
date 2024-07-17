package com.rkjavahub.exception_handling;

public class Test {

	public static void main(String[] args) {
		System.out.println("statement1");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			try {
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("Second catch");
			}

		}

		finally {
			try {
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("third catch");
			}

		}

	}

}
