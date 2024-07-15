package com.rkjavahub.CollectionFramework.util.collections;

import java.util.ArrayList;
import java.util.Collections;

public class UnmodifiableCollectionDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Collections.unmodifiableCollection(al);

		modify(al);

		al.add(25);
		System.out.println(al);

	}
	public static <E> void modify(ArrayList<Integer> al) {
		al.add(1, 15);

	}

}
