//Descending sorting order (Customized) on integer

package com.rkjavahub.CollectionFramework.collection.set.sortedset;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator6 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer num1 = (Integer) obj1;
		Integer num2 = (Integer) obj2;
		if (num1 < num2)

			return +1;

		else if (num1 > num2)

			return -1;

		else
			return 0;
	}
}

public class TreesetComparatorTest {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(7);
		t.add(17);
		t.add(4);
		t.add(47);
		t.add(12);
		t.add(10);
		System.out.println(t);
	}
}
