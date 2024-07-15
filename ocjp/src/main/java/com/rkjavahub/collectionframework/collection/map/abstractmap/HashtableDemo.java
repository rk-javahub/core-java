package com.rkjavahub.collectionframework.collection.map.abstractmap;

import java.util.Hashtable;

class Temp1 {
	int i;

	Temp1(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i;
	}

	public String toString() {
		return i + "";
	}
}

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Temp1, String> t = new Hashtable<Temp1, String>();
		t.put(new Temp1(5), "A");
		t.put(new Temp1(2), "B");
		t.put(new Temp1(6), "C");
		t.put(new Temp1(15), "D");
		t.put(new Temp1(23), "E");
		t.put(new Temp1(16), "F");
		System.out.println(t);
	}
}
