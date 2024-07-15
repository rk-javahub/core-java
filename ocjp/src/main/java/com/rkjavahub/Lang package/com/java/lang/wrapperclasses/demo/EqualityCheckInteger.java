package com.rkjavahub.Lang;

public class EqualityCheckInteger {

	public static void main(String[] args) {
		Integer i = new Integer(12);
		Integer j = new Integer(12);
		System.out.println(i == j);// a1 == b1 returns false because they point to two different Integer objects
		System.out.println(i.equals(j));// true

		Integer a = Integer.valueOf("12");
		Integer b = Integer.valueOf("12");

		System.out.println(a == b);// a == b returns true because they point to same cached object Since
									// Integer.valueOf maintains a cache of Integer Objects with the value -128 to
									// 127 valueOf(String) returns the cached object, thus the == comparance results
									// in true.
		System.out.println(a.equals(b));// true
	}
}
