package com.rkjavahub.String.com.string.demo;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		sc.close();
		System.out.println(str);

		String stringWithoutWhiteSpace = "";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] != ' ') && (ch[i] != '\t')) {
				stringWithoutWhiteSpace = stringWithoutWhiteSpace + ch[i];
			}
		}

		System.out.println("String is " + str);
		System.out.println("String without whitespace is " + stringWithoutWhiteSpace);
	}
}
