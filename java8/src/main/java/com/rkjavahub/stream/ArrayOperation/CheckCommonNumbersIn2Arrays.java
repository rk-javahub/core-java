package com.rkjavahub.stream.ArrayOperation;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckCommonNumbersIn2Arrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7};
        int[] secondArray = {8, 9, 10, 2, 11, 6, 4};

        Arrays.stream(firstArray).filter(farray -> Arrays.stream(secondArray).anyMatch(sArray -> sArray == farray)).boxed().toList().forEach(System.out::println);


    }
}
