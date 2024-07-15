package com.rkjavahub.collectionframework.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Java program to generate ConcurrenModificationException in ArrayList

public class ConcurrentModificationExceptionArraylistDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rohit");
		list.add("Akshay");
		list.add("Ravi");
		list.add("Pankaj");

		Iterator itr = list.iterator();

		while (itr.hasNext()) {

			if (itr.next().equals("Ravi")) {
				list.remove("Ravi");
			}
			System.out.println(itr.next());

		}

	}

}
