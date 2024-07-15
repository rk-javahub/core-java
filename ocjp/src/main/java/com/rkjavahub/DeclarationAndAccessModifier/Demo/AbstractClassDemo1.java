package com.rkjavahub.DeclarationAndAccessModifier.Demo;

abstract class Calculate {
	abstract int multiply(int a, int b);
}

public class AbstractClassDemo1 {

	public static void main(String[] args) {
		int result = new Calculate() {

			@Override
			int multiply(int a, int b) {
				return a * b;
			}
		}.multiply(12, 32);
		System.out.println("Result :" + result);
	}
}
