package com.rkjavahub.DeclarationAndAccessModifier.Demo;

public class variables_demo {
	public int a;
	private int b;
	protected int c;
	final int d = 10; // final variable need to be initialized

	// synchronized int e; //Illegal modifier for the field e; only public,
	// protected, private, static, final, transient & volatile are permitted

	public static void main(String[] args) {
		// public int a1=100; Illegal modifier for parameter a1; only final is
		// permitted
		
		final int b1=100;
		int z;

	}
}
