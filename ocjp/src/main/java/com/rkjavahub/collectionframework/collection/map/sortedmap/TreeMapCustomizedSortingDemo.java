package com.rkjavahub.collectionframework.collection.map.sortedmap;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator2 implements Comparator<Object> {
	public int compare(Object arg0, Object arg1) {
		String name = arg0.toString();
		String name1 = arg1.toString();
		return name.compareTo(name1);
		// return name1.compareTo(name); for reverse order
	}
}

public class TreeMapCustomizedSortingDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<String, Integer>(new MyComparator2());
		t.put("Rohit", 10);
		t.put("Sachin", 20);
		t.put("Pramod", 30);
		t.put("Raju", 40);
		System.out.println(t);
	}
}
