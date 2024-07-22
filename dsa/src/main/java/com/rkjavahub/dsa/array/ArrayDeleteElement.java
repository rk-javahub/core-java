package com.rkjavahub.dsa.array;

public class ArrayDeleteElement {
    public static void main(String[] args) {
        int[] arrayData = {10, 20, 30, 40, 50};
        int deleteElement = 10;

        int pos = findElement(arrayData, deleteElement);

        if (pos != -1) {
            deleteElementFromArray(arrayData, deleteElement, pos);
        } else {
            System.out.println("Element not found in array");
        }

    }

    private static void deleteElementFromArray(int[] arrayData, int deleteElement, int pos) {
        for (int i = pos; i < arrayData.length - 1; i++) {
            arrayData[i] = arrayData[i + 1];
        }


        for (int i = 0; i < arrayData.length - 1; i++) {
            System.out.print(arrayData[i] + " ");
        }
    }

    private static int findElement(int[] arrayData, int deleteElement) {
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] == deleteElement) {
                return i;
            }
        }
        return -1;
    }
}
