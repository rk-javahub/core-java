package com.rkjavahub.language_fundamental;

public class IdentifierDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* IIdentifier are case sensitive */
		String a = "Rohit";
		String A = "Rohit";

		/* identified cannot start with number */
		// String 123a="Rohit";

		/* No symbols other than $ and _ allowed */
		String $ = "abc";
		//String _ = "abc"; // Warning:'_' should not be used as an identifier,
							// since it is a reserved keyword from source level
							// 1.8 on
		//System.out.println(_);

		/* Reserved words are not allowed as identifier */
		// int if=10;
		// int int=12;

		/* Predefined classes and interface are allowed as identifier */
		int Thread = 25;
		int Runnable = 15;
		int Integer=25;

	}

}
