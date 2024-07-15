/*program to check number is Pallindrome or not*/
package com.rkjavahub.Basic.com.basic.demo;

public class PallindromeNumber {

	public static void main(String[] args) {
		int num = 747, temp, rev = 0;
		temp = num;

		while (num > 0) {
			rev = (rev * 10) + (num % 10);// Reverse number
			num = num / 10;
		}

		if (temp == rev) {
			System.out.println(temp + " is pallindrome");
		} else {
			System.out.println(temp + " is not pallindrome");
		}

	}
}
