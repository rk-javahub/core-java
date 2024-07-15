package com.rkjavahub.collectionframework.collection.map.abstractmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		hm.put(i1, "A");
		hm.put(i2, "B");

		System.out.println(hm);
		

		IdentityHashMap ihm = new IdentityHashMap();
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		ihm.put(i3, "A");
		ihm.put(i4, "B");

		System.out.println(ihm);
		

	}

}
