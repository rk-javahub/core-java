package com.rkjavahub.dsa.array.problems;

public class FindSecondMaximumNumberInArray {
    public static void main(String[] args) {
        int[] intArray = {12, 25, 2, 36, 7, 27, 77, 57, 37, 97};
        int len = intArray.length;

        int secondMax = findSecondMaxElement(intArray, len);
        System.out.println("Second maximum element i n array is: " + secondMax);
    }

    private static int findSecondMaxElement(int[] intArray, int len) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            if (intArray[i] > max) {
                secondMax = max;
                max = intArray[i];
            } else if (intArray[i] > secondMax && intArray[i] != max) {
                secondMax = intArray[i];
            }
        }
        return secondMax;
    }
}
