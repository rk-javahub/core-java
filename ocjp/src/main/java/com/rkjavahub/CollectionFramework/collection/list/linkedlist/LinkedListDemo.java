package com.rkjavahub.CollectionFramework.collection.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0, "Software");
		l.add("rohit");
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l);

	}

}
