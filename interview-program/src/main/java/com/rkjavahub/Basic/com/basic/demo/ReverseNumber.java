package com.rkjavahub.Basic.com.basic.demo;

import java.util.Scanner;

/**
 * @author Rohit
 * 
 *         Logic : Execute code inside while loop as number>0 (i.e. 123)
 *         remainder=number%10; number=number/10; reverse=reverse*10+remainder;
 *
 */
public class ReverseNumber {
	static int reverse(int num) {
		int reminder = 0;
		int reverse = 0;
		while (num > 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println("Enter number which you want to reverse");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("reverse of num " + num + " is " + reverse(num));
	}
}
