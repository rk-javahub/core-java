package com.rkjavahub.flow_control;

public class for_demo {

	public static void main(String[] args) {
		int i = 0;
		/*
		 * for (System.out.println("Hello"); i < 3; i++) {
		 * System.out.println("Hi"); }
		 */

		for (System.out.println("Hello"); i < 3; System.out.println("Hi")) {
			i++;
		}

		/*
		 * for(;;) { System.out.println("Infinite loop"); // OUTPUT: Infinite
		 * loop }
		 */

		/*
		 * for (int j = 0; true; j++) { System.out.println("Hello"); }
		 * System.out.println("Hi"); //unreachable code
		 */
		
		

	}

}
