package com.rkjavahub.String.com.string.demo;

// String reverse with better performance O(n/2)
public class StringReverseDemo1 {

	public static void main(String[] args) {
		String str = "Hello";
		char[] ch = str.toCharArray();
		char temp;
		for (int i = 0, j = (ch.length) - 1; i < (ch.length) / 2; i++, j--) {
			temp= ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		System.out.println(ch);
	}
}
