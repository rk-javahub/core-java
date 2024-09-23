package com.rkjavahub.dsa.array.problems;

public class ArrayResizing {
    public static void main(String[] args) {
        int[] intArray = {12, 0, 2, 0, 7};
        int newCapacity = 10;
        resizeArray(intArray, newCapacity);
    }

    private static void resizeArray(int[] intArray, int newCapacity) {
        int[] temp = new int[newCapacity];
        System.arraycopy(intArray, 0, temp, 0, intArray.length);
        intArray = temp;
        System.out.println("New size of array:" + intArray.length);
    }
}
