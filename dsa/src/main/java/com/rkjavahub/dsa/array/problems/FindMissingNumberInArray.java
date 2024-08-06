package com.rkjavahub.dsa.array.problems;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		pringMissingNumber(new int[] { 1, 2, 3, 5, 6, 8, 9, 10 }, 10);
	}

	private static void pringMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		System.out.println("Missing count " + missingCount);
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),
				count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
}
