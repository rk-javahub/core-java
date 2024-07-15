package com.rkjavahub.collectionframework.collection.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohit");
		al.add("Sachin");
		al.add("Pramod");
		al.add("Santosh");
		System.out.println(al);

		ListIterator<String> ltr = al.listIterator();
		while (ltr.hasNext()) {
			String name = (String) ltr.next();
			if (name.equals("Pramod")) {
				ltr.remove();
				ltr.add("Sanjay");
			} else if (name.equals("Santosh")) {
				ltr.add("Rohan");
			} else if (name.equals("Sachin")) {
				ltr.set("Sacchidanand");
			}
		}
		System.out.println(al);
	}
}
