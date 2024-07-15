package com.rkjavahub.CollectionFramework.collection.map.abstractmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(7, "Rohit");
		hm.put(17, "Sachin");
		hm.put(27, "Pramod");
		hm.put(37, "Santosh");

		System.out.println(hm);

		System.out.println(hm.put(37, "Raju"));

		Set<Integer> s = hm.keySet();
		System.out.println(s);

		Collection<String> value = hm.values();
		System.out.println(value);

		Set<?> s1 = hm.entrySet();
		System.out.println(s1);

		Iterator<?> it = s1.iterator();

		while (it.hasNext()) {
			@SuppressWarnings("unchecked")
			Entry<Integer, String> m = (Entry<Integer, String>) it.next();
			System.out.print(m + " ");
			System.out.print(m.getKey() + " ");
			System.out.print(m.getValue() + " ");
			System.out.println();

			if (m.getValue().equals("Raju")) {
				m.setValue("Rahul");
			}

			// Deletion
			if (m.getValue().equals("Pramod")) {
				it.remove();
			}
		}
		System.out.println();
		System.out.println(hm);
	}
}
