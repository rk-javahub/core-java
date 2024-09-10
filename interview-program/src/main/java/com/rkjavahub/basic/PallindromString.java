/*program to check String is palindrome or not*/
package com.rkjavahub.basic;

import java.util.Scanner;

public class PallindromString {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		original = sc.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (reverse.equals(original)) {
			System.out.println(original + " is palindrome");
		} else {
			System.out.println(original + " is not pallindrome");
		}

	}

}
