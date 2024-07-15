package com.rkjavahub.DeclarationAndAccessModifier.Demo;

public class sysoutDemo {

	public static void main(String[] args) {
		int a;
		// System.out.println(a); CE:The local variable a may not have been initialized
		System.out.println(123);
		// System.out.println(12345678912); CE:The literal 12345678912 of type
		// int is out of range
		System.out.println('c');
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println(3.5f);
		// System.out.println(null); CE:The method println(char[]) is ambiguous
		// for the type PrintStream

	}

}
