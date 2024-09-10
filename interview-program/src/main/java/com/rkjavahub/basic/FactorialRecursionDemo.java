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

public class FactorialRecursionDemo {
	static int factorial;

	static int factorialMethod(int num) {
		if (num == 0)
			return 1;
		else
			return (num * factorialMethod(num - 1));
	}

	public static void main(String[] args) {
		int num = 7, fact;
		fact = factorialMethod(num);
		System.out.println("Factorial of number is " + fact);

	}

}
