package com.rkjavahub.collectionframework.collection.list.arraylist;

import java.util.ArrayList;

public class ListToArrayDemo {

	public static void main(String[] args) {

		/* One way */

		/* ArrayList declaration and initialization */
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Apple");
		arrlist.add("Banana");
		arrlist.add("Mango");
		arrlist.add("Pear");

		/* ArrayList to Array Conversion */
		String array[] = new String[arrlist.size()];
		for (int j = 0; j < arrlist.size(); j++) {
			array[j] = arrlist.get(j);
		}

		/* Displaying Array elements */
		for (String k : array) {
			System.out.println(k);
		}

		/* Second way */
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Boston");
		cities.add("Dallas");
		cities.add("San jose");
		cities.add("Chicago");

		/* ArrayList to Array Conversion */
		String citinames[] = cities.toArray(new String[cities.size()]);

		/* Displaying Array elements */
		for (String k : citinames) {
			System.out.println(k);
		}
	}
}
