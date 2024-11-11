package com.rkjavahub.stream.array_operation;

import java.util.Arrays;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 8, 5, 17, 4, 6, 7};

        Arrays.stream(intArray).sorted().skip(1).findFirst().ifPresent(System.out::println); // If no duplicates in Array it works correctly but if duplicates it will give wring output

        Arrays.stream(intArray).distinct().sorted().skip(1).findFirst().ifPresent(System.out::println); // Works correctly in case of duplicate records as well
    }
}
