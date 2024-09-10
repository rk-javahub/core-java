/*Program to calculate factorial of a number*/
package com.rkjavahub.basic;

public class FactorialDemo {

	public static void main(String[] args) {
		int num = 7, fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
