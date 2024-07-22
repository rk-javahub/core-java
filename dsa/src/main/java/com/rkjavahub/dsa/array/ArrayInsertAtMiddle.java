package com.rkjavahub.dsa.array;

public class ArrayInsertAtMiddle {
    public static void main(String[] args) {
        int[] arrayData = new int[20];
        arrayData[0] = 10;
        arrayData[1] = 15;
        arrayData[2] = 77;
        arrayData[3] = 47;
        arrayData[4] = 87;

        int insertData = 97;
        int capacityOfArray = 20;
        int currentSize = 5;
        int position = 3;

        System.out.println("Array before inserting element");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arrayData[i] + " ");
        }

        int result = insertDataAtMiddle(arrayData, currentSize, insertData, capacityOfArray, position);

        if (result == -1) {
            System.out.println("Unable to insert element since array reached its max limit");
        } else {
            System.out.println("\nElement added successfully");
            System.out.println("Array after inserting element");
            for (int i = 0; i <= currentSize; i++) {
                System.out.print(arrayData[i] + " ");

            }
        }
    }

    private static int insertDataAtMiddle(int[] arrayData, int currentSize, int insertData, int capacityOfArray, int position) {
        if (currentSize >= capacityOfArray) {
            return -1;
        } else {
            for (int i = currentSize - 1; i >= position; i--) {
                arrayData[i + 1] = arrayData[i];
            }
            arrayData[position] = insertData;
            return 1;
        }
    }
}
