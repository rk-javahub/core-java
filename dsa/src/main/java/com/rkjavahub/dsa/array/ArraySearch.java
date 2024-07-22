package com.rkjavahub.dsa.array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arrayData = {10, 2, 89, 56, 77, 84, 36};
        int searchKey = 77;
        int lengthOfArray = arrayData.length;

        int result = checkForKeyInArray(arrayData, searchKey, lengthOfArray);

        if (result != -1) {
            System.out.println("Element " + searchKey + " found in array at " + result + " position.");
        } else {
            System.out.println("Element not found in array");
        }
    }

    private static int checkForKeyInArray(int[] arrayData, int searchKey, int lengthOfArray) {
        for (int i = 0; i < lengthOfArray; i++) {
            if (arrayData[i] == searchKey) {
                return i + 1;
            }
        }
        return -1;
    }
}
