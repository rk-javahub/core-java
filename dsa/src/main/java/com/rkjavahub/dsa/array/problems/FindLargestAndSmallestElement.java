package com.rkjavahub.dsa.array.problems;

public class FindLargestAndSmallestElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 2, 23, 90, 67};
        int length = array.length;
        performLogic(array, length);
    }

    private static void performLogic(int[] array, int length) {
        int max = 0;
        int min = array[0];

        for (int i = 0; i < length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Max element is: " + max + " and minimum element is " + min);
    }
}

