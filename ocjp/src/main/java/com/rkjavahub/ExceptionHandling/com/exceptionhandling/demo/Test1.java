package com.rkjavahub.ExceptionHandling.com.exceptionhandling.demo;

public class Test1 extends RuntimeException {
	Test1(String str){
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		
		throw new Test1("Rohit");

	}

}
