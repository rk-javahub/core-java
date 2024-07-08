package com.rkjavahub.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetEvenElementFromListAndMultiplyItByTen {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);

		List<Integer> updatedList = ls.stream().filter(n -> (n % 2) == 0)
				                               .map(n -> n * 10)
				                               .collect(Collectors.toList());

		System.out.println(updatedList);

	}

}
