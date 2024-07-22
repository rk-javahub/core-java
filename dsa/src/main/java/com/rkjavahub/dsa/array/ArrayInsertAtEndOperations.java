package com.rkjavahub.dsa.array;

public class ArrayInsertAtEndOperations {
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

        System.out.println("Array before inserting element");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arrayData[i] + " ");
        }

        int result = insertDataAtEnd(arrayData, currentSize, insertData, capacityOfArray);

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

    private static int insertDataAtEnd(int[] arrayData, int currentSize, int insertData, int capacityOfArray) {
        if (currentSize >= capacityOfArray) {
            return -1;
        } else {
            arrayData[currentSize] = insertData;
            return 1;
        }
    }
}
