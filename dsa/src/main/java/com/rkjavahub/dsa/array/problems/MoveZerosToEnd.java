package com.rkjavahub.dsa.array.problems;
/*
Program to move zeros in array at end of the array.
For given array Ex: int[] intArray = {12, 0, 2, 0, 7, 0, 77, 57, 37, 97};
    Output : {12 2 7 77 57 37 97 0 0 0}
*/

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] intArray = {12, 0, 2, 0, 7, 0, 77, 57, 37, 97};
        int len = intArray.length;

        moveZerosToEnd(intArray, len);
    }

    private static void moveZerosToEnd(int[] intArray, int len) {
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (intArray[i] != 0 && intArray[j] == 0) {
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
            if (intArray[j] != 0) {
                j++;
            }
        }
        System.out.println("New array is: ");
        for (int i = 0; i < len; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
