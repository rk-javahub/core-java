package com.rkjavahub.CollectionFramework.collection.list.arraylist;

import java.util.Arrays;

/*
 * Steps 1. Create custom ArraList class. 2. Set variables such as intial size,
 * size, arraydata[] of Object 3. Intialize arraydata[] in constructor with
 * size. 4. Create Add(Object) and check condition ensurecapacity() first after
 * only add element. 5. Create get(index) and check condition whether index is
 * negative or not afterwords return object. 6. Create remove(index). 7. Create
 * ensureCapacity() to increase ArrayList size to double of original using
 * Arrays.copyOf() 8. Create display() to display ArrayList elements.
 * 
 * @author Rohit
 *
 */

class ArrayListCustom<E> {
	private int initial_capacity = 10;
	private int currentsize = 0;
	private Object arrayData[] = null;

	// Constructor to initialize Array.
	ArrayListCustom() {
		arrayData = new Object[initial_capacity];
	}

	// add() to add element in ArrayList.
	public Object add(E e) {
		if ((arrayData.length) >= initial_capacity) {
			ensureCapacity();
		}
		arrayData[currentsize++] = e;
		return e;
	}

	// get() to get element from ArrayList.
	public Object get(int index) {
		if (index < 0 || index > currentsize) {
			throw new IndexOutOfBoundsException("Index=" + index + " and size=" + currentsize);
		}
		return arrayData[index];
	}

	// remove() to remove element from ArrayList()
	public Object remove(int index) {
		if (index < 0 || index >= currentsize) {
			throw new IndexOutOfBoundsException("Index=" + index + " and size=" + currentsize);
		}
		Object removedData = arrayData[index];
		for (int i = index; i <= currentsize; i++) {
			arrayData[index] = arrayData[index + 1];
			index++;
		}
		currentsize--;
		return removedData;
	}

	// display() to display ArrayList elements.
	public void display() {
		System.out.print("ArrayList elements are :");
		for (int i = 0; i < currentsize; i++) {
			System.out.print(" " + arrayData[i]);
		}

	}

	// Method to increase ArrayList size after reaching threshold.
	private void ensureCapacity() {
		int newCapacity = arrayData.length * 2;
		arrayData = Arrays.copyOf(arrayData, newCapacity);
	}

}

public class CustomArrayList {
	public static void main(String[] args) {
		ArrayListCustom<Integer> ar = new ArrayListCustom<Integer>();
		ar.add(7);
		ar.add(17);
		ar.add(27);
		ar.add(37);
		ar.add(47);
		ar.add(57);
		ar.add(67);

		ar.display();

		System.out.println("\nGet element at index 2: " + ar.get(2));

		System.out.println("\nRemove element at index 2: " + ar.remove(2));

		ar.display();

	}
}
