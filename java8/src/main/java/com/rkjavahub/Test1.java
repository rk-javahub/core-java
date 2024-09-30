package com.rkjavahub;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(4);
        integerList.add(26);
        integerList.add(89);
        integerList.add(104);
        integerList.add(75);

        integerList.stream().sorted().forEach(System.out::println);

        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
