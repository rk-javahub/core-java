package com.rkjavahub.collectionframework.collection.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {

			int i = (Integer) itr.next();
			if (i % 2 == 0) {
				System.out.print(i);
			} else {
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(al);

	}
}
