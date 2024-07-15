/*Program to remove duplicate elements from ArrayList*/
package com.rkjavahub.CollectionFramework.collection.list.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(5);
		System.out.println("ArrayList with duplicate elements: " + al);

		HashSet<Integer> hs = new HashSet<Integer>(al);

		al.clear();
		al.addAll(hs);
		System.out.println("ArrayList without duplicate elements: " + al);

	}

}
