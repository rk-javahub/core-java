package com.rkjavahub.OOPs.com.oops.overloading.demo;

public class OverloadingDemo {
	public void m1() {
		System.out.println("m1()");
	}

	public void m1(String s) {
		System.out.println("m1() String version");
	}

	public void m1(Object obj) {
		System.out.println("m1() Object version");
	}

	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.m1();
		od.m1(null);
	}
}
