package com.rkjavahub.basic;

public class largerof3num {

	public static void main(String[] args) {
		int a = 50, b = 30, c = 40;
		if (a > b) {
			if (a > c) {
				System.out.println("a is greater");
			} else {
				System.out.println("c is greater");
			}
		} else if (b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
	}
}
