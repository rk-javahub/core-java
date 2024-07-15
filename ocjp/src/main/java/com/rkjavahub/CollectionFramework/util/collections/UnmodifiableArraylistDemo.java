/*Java program to built unmodifiable ArrayList*/
package com.rkjavahub.CollectionFramework.util.collections;

import java.util.ArrayList;
import java.util.Collections;

public class UnmodifiableArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al = (ArrayList<Integer>) Collections.unmodifiableList(al);
		al.add(9);
		System.out.println(al);
	}
}
