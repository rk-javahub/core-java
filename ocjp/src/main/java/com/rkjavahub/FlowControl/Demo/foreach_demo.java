package com.rkjavahub.FlowControl.Demo;

public class foreach_demo {

	public static void main(String[] args) {

		// One Dimensional array
		int a[] = { 10, 20, 30, 40 };

		for (int x : a) {
			System.out.println("One dimensional array" + x);
		}
		System.out.println("\n\n");
		// Two Dimensional array
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int x[] : b) {
			for (int y : x) {
				System.out.println("Two dimensional array " + y);
			}
		}
	}

}
