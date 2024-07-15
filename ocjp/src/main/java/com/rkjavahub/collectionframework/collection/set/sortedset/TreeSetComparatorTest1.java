package com.rkjavahub.collectionframework.collection.set.sortedset;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator77 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		// return i1.compareTo(i2); //Ascending order
		// return -i1.compareTo(i2); // Descending order
		// return 1; // Insertion order
		// return -1; // Reverse insertion order
		return 0; // Insert only first element
	}
}

public class TreeSetComparatorTest1 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator77());
		t.add(17);
		t.add(7);
		t.add(77);
		t.add(27);

		System.out.println(t);

	}
}
