package com.rkjavahub.lang_package.demo;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class equalsDemo {
	public static void main(String[] args) {

		// Comparison on Student object
		Student s1 = new Student(7, "Rohit");
		Student s2 = new Student(17, "Sachin");
		Student s3 = s1;

		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equals(s3));// true

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		// Comparison on String object
		String s11 = new String("Rohit");
		String s12 = new String("Sachin");
		String s13 = s11;
		String s14 = "Rohit";

		System.out.println(s11.equals(s12)); // false
		System.out.println(s11.equals(s13)); // true
		System.out.println(s11.equals(s14)); // true
		System.out.println(s11 == s14); // false
	}
}
