package com.rkjavahub.basic;

public class largerof3num_Way2 {

	public static void main(String[] args) {
		int a = 20, b = 30, c = 40;
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else
			System.out.println("c is greater");
	}
}
