package com.rkjavahub.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class WaysToCreateStream {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(10);
        intList.add(100);
        intList.add(1000);
        intList.add(10000);

        // Creating Stream from Collection object
        Stream<Integer> stream1 = intList.stream();

        // Creating Stream from Arrays
        Integer[] arrays = {10, 20, 30, 40};
        Stream<Integer> stream2 = Arrays.stream(arrays);

        // Creating stream from static methods
        Stream<Integer> stream3 = Stream.of(10, 20, 30);

        // By iterate
        Stream<Integer> stream4 = Stream.iterate(10, (Integer n) -> n + 100).limit(5);
    }
}
