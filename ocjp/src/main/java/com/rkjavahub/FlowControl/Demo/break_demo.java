package com.rkjavahub.FlowControl.Demo;

public class break_demo {

	public static void main(String[] args) {
		
		// break inside switch
		int a = 10;
		switch (a) {
		case 7:
			System.out.println(7);
			break;
		case 10:
			System.out.println(10);
			break;
		}

		// inside for loop
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		// inside label
		int j = 20;
		l1: {
			System.out.println("inside label");
			if (j == 20)
				break l1;
			System.out.println("Hello");
		}
		System.out.println("End");
	}
}
