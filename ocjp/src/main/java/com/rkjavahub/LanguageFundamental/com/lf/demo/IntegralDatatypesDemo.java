package com.rkjavahub.LanguageFundamental.com.lf.demo;

public class IntegralDatatypesDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Integral Data type Demo */

		/* byte demo (range=127 to -128) */
		byte b = 10;
		System.out.println(b);// O/P:10

		byte b1 = 'a';
		System.out.println(b1);// O/P:97

		// byte b2 = "abc"; //Error:Type mismatch: cannot convert from String to
		// byte

		// byte b3 = true;//Error:Type mismatch: cannot convert from boolean to
		// byte

		// byte b4 = 10.56f;//Error:Type mismatch: cannot convert from float to
		// byte

		byte b5 = 127;
		System.out.println(b5);// O/P:127

		// byte b6 = 128;//Error:Type mismatch: cannot convert from int to byte

		// byte b7 = 150.0;// Error:Type mismatch: cannot convert from double to
		// byte

		//byte b8 = null;// Error:Type mismatch: cannot convert from null to byte

		/* int demo (range=-2147483648 to 2147483647) */
		// Same as byte

	}

}
