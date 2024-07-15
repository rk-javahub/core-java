package com.rkjavahub.CollectionFramework.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator1 implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		return i2.compareTo(i1);
	}
}

public class BinerySearchComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> q = new ArrayList<Integer>();
		q.add(15);
		q.add(0);
		q.add(20);
		q.add(10);
		q.add(5);
		System.out.println(q);
		Collections.sort(q, new MyComparator1());
		System.out.println(q);
		System.out.println(Collections.binarySearch(q, 10, new MyComparator1()));
		System.out.println(Collections.binarySearch(q, 13, new MyComparator1()));
		System.out.println(Collections.binarySearch(q, 17));
		System.out.println(q);
	}
}
