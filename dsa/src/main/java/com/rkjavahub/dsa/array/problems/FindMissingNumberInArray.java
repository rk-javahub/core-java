package com.rkjavahub.dsa.array.problems;
/*
Find Missing Number in Array: Input - {1, 2, 3, 5, 6, 7, 8, 9, 10}
Output : Missing number is: 4
 */

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        pringMissingNumber(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}, 10);
    }

    private static void pringMissingNumber(int[] ints, int length) {
        int sum = length * (length + 1) / 2; // Formula of sum of n numbers
        for (int i = 0; i < ints.length; i++) {
            sum = sum - ints[i];
        }
        System.out.println("Missing number is: " + sum);
    }
}
