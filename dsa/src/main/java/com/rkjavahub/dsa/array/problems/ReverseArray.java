package com.rkjavahub.dsa.array.problems;
/*
Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}

Input: original_array[] = {4, 5, 1, 2}
Output: array_reversed[] = {2, 1, 5, 4}
 */


public class ReverseArray {
    static int[] array = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {

        int arrayLength = array.length;
        printArray(array);
        reverseArray(array, arrayLength);
        printArray(array);
    }

    private static int[] reverseArray(int[] array, int arrayLength) {
        // Use logic to replace first element with last element and goes on
        int start = 0;
        int end = arrayLength - 1;
        int temp;

        System.out.println();

        // check condition in while
        while (start < end) {
            temp = array[end]; // last element stored in temp
            array[end] = array[start]; // first element stored in last element of array
            array[start] = temp; // last element stored in first element of array
            start++;
            end--;
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
