package com.rkjavahub.predicate;

import java.util.function.Predicate;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println("Number is even : " + predicate.test(14)); // return true or false
    }
}
