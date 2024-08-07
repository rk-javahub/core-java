package com.rkjavahub.generics;
/*
In GenericMethods we can pass type parameter which can accept any type as argument
 */

public class GenericMethods {
    public static <E> void printArray(E[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        printArray(charArray);
        System.out.println();
        printArray(intArray);
    }
}
