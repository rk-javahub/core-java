package com.rkjavahub.CollectionFramework.collection.set.sortedset;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	public int compareTo(Object arg0) {
		int id = this.id;
		Employee emp = (Employee) arg0;
		int id1 = emp.id;
		if (id < id1)
			return 1;
		else if (id > id1)
			return -1;
		else
			return 0;
	}
}

class EmployeeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String name = e1.name;
		String name1 = e2.name;
		return name.compareTo(name1);
	}
}

public class TreeSetEmployeeComparator {
	public static void main(String[] args) {
		Employee e = new Employee(7, "Rohit");
		Employee e1 = new Employee(17, "Sachin");
		Employee e2 = new Employee(27, "Pramod");
		Employee e3 = new Employee(37, "Akshay");
		Employee e4 = new Employee(47, "Rahul");

		TreeSet t = new TreeSet();
		t.add(e);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);

		TreeSet t1 = new TreeSet(new EmployeeComparator());
		t1.add(e);
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
	}
}
