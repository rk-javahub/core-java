package com.rkjavahub.collectionframework.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSettest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		System.out.println(hs.add("B"));// Returns false since B already present in HashSet
		hs.add("C");
		hs.add("D");
		hs.add("Z");
		hs.add(null);

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
