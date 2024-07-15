package com.rkjavahub.CollectionFramework.collection.set.sortedset;

import java.util.Comparator;
import java.util.TreeSet;

class myComparator5 implements Comparator {
	public int compare(Object arg0, Object arg1) {
		String str1 = (String) arg0;
		String str2 = (String) arg1;
		return str2.compareTo(str1);
		// return -str1.compareTo(str2);
	}
}

public class TreesetComparatorStringTest {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myComparator5());
		t.add("Rohit");
		t.add("Sachin");
		t.add("Pramod");
		t.add("Santosh");
		t.add("Rahul");
		t.add("Rohan");
		System.out.println(t);
	}
}
