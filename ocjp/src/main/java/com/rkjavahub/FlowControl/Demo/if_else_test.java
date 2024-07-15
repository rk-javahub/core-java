package com.rkjavahub.FlowControl.Demo;

public class if_else_test {

	public static void main(String[] args) {
		int x = 0;
		/*
		 * if(x) java.lang.Error: Unresolved compilation problem: Type mismatch:
		 * cannot convert from int to boolean { System.out.println("Hello"); }
		 */

		/*
		 * if(x=20) java.lang.Error: Unresolved compilation problem: Type
		 * mismatch: cannot convert from int to boolean {
		 * System.out.println("Hello"); }
		 */

		if (x == 10) {
			System.out.println("Hello");
		} else {
			System.out.println("Hi"); // OUTPUT: Hi
		}

		boolean b = true;

		if (b = true) {
			System.out.println("Hello");
		} else {
			System.out.println("Hi");
		}

		boolean b1 = false;
		if (b1 == true) {
			System.out.println("Hello");
		} else {
			System.out.println("Hi");
		}

		if (true)
			System.out.println("Hello");

		/*
		 * if(true) int x=10; //compilation error: declaration statement not
		 * allowed
		 */

		if (true) {
			int x1 = 10;
		}
		
		if(true); // Valid

	}

}
