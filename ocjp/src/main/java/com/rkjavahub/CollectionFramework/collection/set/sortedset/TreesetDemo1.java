package com.rkjavahub.CollectionFramework.collection.set.sortedset;

import java.util.TreeSet;

public class TreesetDemo1 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		String s = "nil";
		// t.add(new Integer(10));//Exception in thread "main"
		// java.lang.ClassCastException: java.lang.String cannot be cast to
		// java.lang.Integer
		// t.add(null); //Exception in thread "main"
		// java.lang.NullPointerException
		System.out.println(t);
	}
}
