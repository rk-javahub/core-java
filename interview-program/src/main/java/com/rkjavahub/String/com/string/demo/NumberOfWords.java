package com.rkjavahub.String.com.string.demo;

/*Program to count number of words in string*/
public class NumberOfWords {

	public static void main(String[] args) {
		String s = "Sharma is a good player and he is so punctual";
		String words[] = s.split(" ");
		System.out.println("The Number of words present in the string are : " + words.length);
	}

}
