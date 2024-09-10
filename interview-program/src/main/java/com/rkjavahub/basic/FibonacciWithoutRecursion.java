
package com.rkjavahub.basic;

/**
 * @author Rohit
 * 
 *         Example of fibonacci series in java - 0 1 1 2 3 5 8 13 21 34 55 89.
 * 
 *         First number of series is 0 & second number of series is 1. So, logic
 *         behind the series generation is that the subsequent number generated
 *         is sum of previous two number of series.
 * 
 *         Example of fibonacci series in java - First number of series is 0 &
 *         second number of series is 1. So, third number will be 0+1=1 So,
 *         fourth number will be 1+1=2 So, fifth number will be 2+1=3 and so on
 *
 */
public class FibonacciWithoutRecursion {

	public static void main(String[] args) {
		int n = 10;
		generateFibonacciSeries(n);
	}

	private static void generateFibonacciSeries(int n) {
		int first = 0;
		int second = 1;
		int temp;
		for (int i = 0; i < n; i++) {
			temp = first + second;
			first = second;
			second = temp;
			System.out.print(temp + " ");
		}
	}
}
