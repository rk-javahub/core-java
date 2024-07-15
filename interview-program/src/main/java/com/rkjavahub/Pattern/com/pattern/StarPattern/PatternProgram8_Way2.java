package com.rkjavahub.Pattern.com.pattern.StarPattern;

public class PatternProgram8_Way2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
