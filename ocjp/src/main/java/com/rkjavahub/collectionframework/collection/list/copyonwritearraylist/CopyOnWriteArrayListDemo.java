package com.rkjavahub.collectionframework.collection.list.copyonwritearraylist;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Rohit");
        list.add("Sachin");
        list.add("Ganesh");
        list.add("Avadhut");


        // Iterating using iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            list.add("Sanket"); // No ConcurrentModificationException
        }

        System.out.println();
        // Iterating using List iterator
        Iterator<String> listItr = list.iterator();
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
            list.remove("Avadhut"); // No ConcurrentModificationException
        }

        System.out.println();
        // Iterating using for-each loop
        for (String name : list) {
            System.out.print(name + " ");
            list.add("Raj"); // No ConcurrentModificationException
        }
    }
}
