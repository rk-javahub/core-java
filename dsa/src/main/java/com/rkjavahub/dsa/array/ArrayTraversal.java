package com.rkjavahub.dsa.array;

/*
Program to travers through array
*/
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        traverseArray(array);
    }

    public static void traverseArray(int[] array) {
        System.out.print("Array elements : ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
