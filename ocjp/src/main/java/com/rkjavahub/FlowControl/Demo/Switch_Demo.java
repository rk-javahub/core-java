package com.rkjavahub.FlowControl.Demo;

public class Switch_Demo {

	public static void main(String[] args) {
		byte b = 7;
		switch (b) {

		}

		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println(ch);
			break;
		}

		short s = 10;
		switch (s) {

		}

		int a = 20;
		switch (a) {

		}

		/*
		 * long l = 255; switch (l) {
		 * 
		 * } java.lang.Error: Unresolved compilation problem: Cannot switch on a
		 * value of type long. Only convertible int values, strings or enum
		 * variables are permitted
		 */

		/*
		 * double d=2.5; switch(d){
		 * 
		 * } java.lang.Error: Unresolved compilation problem: Cannot switch on a
		 * value of type double. Only convertible int values, strings or enum
		 * variables are permitted
		 */
		/*
		 * byte b1 = 7; switch (b1) { case 1: System.out.println(1); break; case
		 * 2: System.out.println(2); break; case 70000: // Type mismatch: cannot
		 * convert from int to byte System.out.println(70000); break;
		 * 
		 * }
		 */

		int x = 10;
		int y = 20;
		final int z = 30;

		switch (x) {
		case 10:
			System.out.println(10);
			break;
		/*
		 * case y: // case expression must be constant expression
		 * System.out.println(y);
		 */
		case z: // final variable allowed
			System.out.println(30);
			break;
		}

		int r = 10;
		switch (r + 1) {
		case 10:
			System.out.println(10);
			break;
		case 10 + 1:
			System.out.println(11);
			break;
		}

		int n = 7;
		switch (n) {
		case 7:
			System.out.println(7);
		case 8:
			System.out.println(8);
			break;
		}

	}

}
