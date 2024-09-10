package com.rkjavahub.dsa.array.problems;
/*
Input array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
Output odd number array = {1,3,5,7,9};

 */

import java.util.Arrays;

public class RemoveEvenFromArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        removeEvenFromArray(intArray);
    }

    private static void removeEvenFromArray(int[] intArray) {
        int oddCount = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddNumberArray = new int[oddCount];
        int countOddArray = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                oddNumberArray[countOddArray] = intArray[i];
                countOddArray++;
            }
        }
        Arrays.stream(oddNumberArray).forEach(System.out::print);
    }
}
