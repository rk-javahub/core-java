/*Program to implement Fibonacci Series using recursion*/
package com.rkjavahub.basic;

public class FibonacciWithRecursion {
	static int n1 = 0, n2 = 1, n3, count = 10;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n2 + n1;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			count--;
			printFibonacci(count);
		}

	}

	public static void main(String[] args) {
		System.out.print(n1 + " " + n2);// Printing 0 and 1
		printFibonacci(count - 2);// n-2 because 2 numbers are already printed
	}
}
