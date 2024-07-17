package com.rkjavahub.lang_package.demo;

/*Immutable and Mutable demo*/
public class StringDemo1 {
	public static void main(String[] args) {
		// String is immuable
		String s = new String("Rohit");
		s.concat("Kumbhar");
		System.out.println(s);

		// StringBuffer is Mutable
		StringBuffer sf = new StringBuffer("Rohit");
		sf.append("Kumbhar");
		System.out.println(sf);

	}
}
