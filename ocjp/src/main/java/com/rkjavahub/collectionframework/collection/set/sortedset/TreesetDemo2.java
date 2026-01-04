package com.rkjavahub.collectionframework.collection.set.sortedset;

import java.util.TreeSet;

public class TreesetDemo2 {
	public static void main(String[] args)
	{
		TreeSet<StringBuffer> t=new TreeSet<>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		//t.add(new Integer(10));//Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		//t.add(null); //Exception in thread "main" java.lang.NullPointerException
		System.out.println(t);
	}
}
