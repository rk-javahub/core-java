package com.rkjavahub.lambda_expression;

import java.util.Set;
import java.util.TreeSet;

public class TestCase8_TreeSetSortingDemo {

	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<Integer>(Integer::compareTo);
		ts.add(9);
		ts.add(7);
		ts.add(29);
		ts.add(5);
		ts.add(15);

		System.out.println(ts);
	}

}
