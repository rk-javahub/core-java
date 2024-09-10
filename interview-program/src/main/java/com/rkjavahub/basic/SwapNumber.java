package com.rkjavahub.basic;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10, b = 20, c;

		System.out.println("First way");
		System.out.println("----------------------------------------------");
		System.out.println("Before swap a=" + a + " b=" + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After swap a=" + a + " b=" + b);

		System.out.println();
		System.out.println("Second way");
		System.out.println("----------------------------------------------");
		a = 10;
		b = 20;
		System.out.println("Before swap a=" + a + " b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap a=" + a + " b=" + b);
	}
}
