package com.rkjavahub.CollectionFramework.collection.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add("B");
		lhs.add("C");
		lhs.add("E");

		Iterator itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
