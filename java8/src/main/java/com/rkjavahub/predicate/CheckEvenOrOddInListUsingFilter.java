package com.rkjavahub.predicate;

import java.util.Arrays;
import java.util.List;

public class CheckEvenOrOddInListUsingFilter {
    public static void main(String[] args) {
        Integer[] list = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        List<Integer> arrayList = Arrays.asList(list);

        arrayList.stream().filter(x -> x % 2 == 0).forEach(t -> System.out.println("Print even: " + t));
    }
}
