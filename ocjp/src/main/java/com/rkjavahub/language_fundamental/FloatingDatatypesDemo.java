package com.rkjavahub.language_fundamental;

public class FloatingDatatypesDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Floating Data type Demo */

		/* float demo (range=-3.4e^38 to 3.4e^38) */
		float b = 10;
		System.out.println(b);// O/P:10.0

		float b1 = 'a';
		System.out.println(b1);// O/P:97.0

		// float b2 = "abc"; //Error:Type mismatch: cannot convert from String
		// to
		// float

		// float b3 = true;//Error:Type mismatch: cannot convert from boolean to
		// float

		// byte b4 = 10.56f;//Error:Type mismatch: cannot convert from float to
		// byte

		float b5 = 127.0f;
		System.out.println(b5);// O/P:127

		// float b6 = 127.0;//Error:Type mismatch: cannot convert from double to
		// float

		// float b7 = null;// Error:Type mismatch: cannot convert from null to
		// float

		float b8 = 0x253;
		System.out.println(b8);// O/P=595.0 Hexadecimal

	}

}
