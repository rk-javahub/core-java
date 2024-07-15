package com.rkjavahub.collectionframework.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethodsDemo {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohit");
		al.add("Vijay");
		al.add("Sachin");
		al.add(null);// null insertion possible in ArrayList

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sanket");
		al2.add("Raj");
		al2.add("Rasika");

		// addAll()
		al.addAll(al2);

		// clone()
		@SuppressWarnings("unchecked")
		ArrayList<String> al3 = (ArrayList<String>) al.clone();
		System.out.println(al3); // [Rohit, Vijay, Sachin, Sanket, Raj, Rasika]

		// contains()
		System.out.println(al.contains("Rohit")); // true

		// containsAll()
		System.out.println(al.containsAll(al2)); // true

		// ensureCapacity()
		al.ensureCapacity(25);

		// indexOf()
		System.out.println(al.indexOf("Rasika")); // 5

		// isEmpty()
		System.out.println(al.isEmpty());// false

		// lastIndexOf()
		System.out.println(al.lastIndexOf("Rohit")); // 0

		// remove()
		System.out.println(al.remove("Sanket")); // true
		
		// retainAll()
		al.retainAll(al2);
		System.out.println("\n\nal.retainAll(al1)  " + al); // [Raj, Rasika]

		// remaining implementation. (1.8 feature)
		// al.removeIf(filter);

		System.out.println("\n\nIterating using Iterator");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");

			/*
			 * Since Iterator returned by ArrayList is fail fast exception is thrown if we
			 * try to modify ArrayList during iterating
			 */
			// al.add("Sachin"); O/P - java.util.ConcurrentModificationException
		}

		System.out.println("\n\nIterating using ListIterator");
		ListIterator<String> listIterator = al.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
			// System.out.println(listIterator.previous());
			/*
			 * ListIterator returned by ArrayList is also fail fast like Iterator.
			 */
			// al.add("Sachin"); O/P - java.util.ConcurrentModificationException
		}

		System.out.println("\n\nIterating using Enumeration");
		Enumeration<String> enumeration = Collections.enumeration(al);
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");

			/*
			 * Enumeration returned by ArrayList is also fail fast like Iterator.
			 */
			// al.add("Sachin"); O/P - java.util.ConcurrentModificationException
		}

		System.out.println("\n\nIterating using enhanced foreach loop");
		for (String name : al) {
			System.out.print(name + " ");

			/*
			 * Enhanced foreach is also fail fast like Iterator.
			 */
			// al.add("Sachin"); O/P - java.util.ConcurrentModificationException
		}

		/*
		 * Making ArrayList sysnchronized so no 2 thread access ArrayList object at the
		 * same time
		 */
		@SuppressWarnings("unused")
		List<String> synchronizedAL = Collections.synchronizedList(al);
	}
}
