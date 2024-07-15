package com.rkjavahub.collectionframework.collection.map.abstractmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestCase {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("India", "Delhi");
		hm.put("China", "Shanghai");
		hm.put("Shrilanka", "Colombo");

		Set<?> s = hm.entrySet();

		System.out.println(s);

		Iterator<?> itr = s.iterator();

		while (itr.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> m = (Map.Entry<String, String>) itr.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
}
