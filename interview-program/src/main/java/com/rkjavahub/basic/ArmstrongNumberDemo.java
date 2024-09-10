/*Program to check number is armstrong or not*/
package com.rkjavahub.basic;

public class ArmstrongNumberDemo {

	public static void main(String[] args) {
		int num = 153, temp, lnum, sum = 0;
		temp = num;

		while (num > 0) {
			lnum = num % 10;// Calculate last number
			sum = sum + (lnum * lnum * lnum);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}
	}
}
