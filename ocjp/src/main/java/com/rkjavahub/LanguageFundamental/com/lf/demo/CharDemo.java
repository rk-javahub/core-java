package com.rkjavahub.LanguageFundamental.com.lf.demo;

public class CharDemo {

	public static void main(String[] args) {
		// Character datatype demo (Range 65535)
		char ch = 'a';
		System.out.println(ch);

		// char ch='ab'; //Error:Invalid character constant

		char ch1 = 97;
		System.out.println(ch1);// O/P:a

		char ch2 = 0xface;// Hexadecimal number
		System.out.println(ch2);

		char ch3 = 0777;
		System.out.println(ch3);

		char ch4 = 65535;
		System.out.println(ch4);

		// char ch5=65536;//Error:Type mismatch: cannot convert from int to char

		char ch6 = '\u0061';// unicode character
		System.out.println(ch6);// O/P:a
		
		char ch7='\n';

	}

}
