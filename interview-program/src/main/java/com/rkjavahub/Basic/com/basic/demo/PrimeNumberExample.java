package com.rkjavahub.Basic.com.basic.demo;

/**
 * @author Rohit
 *
 *
 *         What is prime number? A prime number is a natural number greater than
 *         1 that has no positive divisors other than 1 and itself.
 * 
 */
public class PrimeNumberExample {

	public static void main(String[] args) {
		int num = 14, m, i, flag = 0;

		if (num == 1 || num == 0) {
			System.out.println(num + " number is not prime");
		} else {
			m = num / 2;
			for (i = 2; i < m; i++) {
				if (num % i == 0) {
					System.out.println(num + " number is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " number is prime");
			}
		}
	}
}
