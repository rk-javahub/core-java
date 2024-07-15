package com.rkjavahub.collectionframework.collection.set.sortedset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet ns = new TreeSet();
		ns.add(10000);
		ns.add(7000);
		ns.add(2000);
		ns.add(17000);
		
		System.out.println(ns);
		System.out.println(ns.ceiling(10000));
		System.out.println(ns.floor(7000));

	}

}
