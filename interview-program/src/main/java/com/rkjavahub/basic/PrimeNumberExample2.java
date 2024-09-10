package com.rkjavahub.basic;

/**
 * @author Rohit
 *
 *
 *         What is prime number? A prime number is a natural number greater than
 *         1 that has no positive divisors other than 1 and itself.
 * 
 * 
 *         I have seen at many places iteration starting from i=2 to i<=n/2
 *         which offers time complexity of O(n/2). But, we will start iterating
 *         from i=2 to i<=Math.sqrt(n). Q. why i<=Math.sqrt(n)? A.It will help
 *         us in reducing time complexity from O(n/2) to O(√ N).
 */
public class PrimeNumberExample2 {

	public static void main(String[] args) {
		int num = 14, m, i, flag = 0;

		if (num == 1 || num == 0) {
			System.out.println(num + " number is not prime");
		} else {
			for (i = 2; i < Math.sqrt(num); i++) {
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
