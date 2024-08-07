package com.rkjavahub.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildCard {
    public static void sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum = sum + number.doubleValue();
        }
        System.out.println("Sum= " + sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        System.out.println("Sum of integers: ");
        sum(integerList);

        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(10.20);
        doubleList.add(20.69);
        doubleList.add(30.88);
        doubleList.add(40.25);
        System.out.println("Sum of doubles: ");
        sum(doubleList);


    }
}
