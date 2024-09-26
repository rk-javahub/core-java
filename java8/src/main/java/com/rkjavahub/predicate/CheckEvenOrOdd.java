package com.rkjavahub.predicate;

import java.util.function.Predicate;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (integer) -> integer % 2 == 0;
        System.out.println("Number is even : " + predicate.test(13)); // return true or false
    }
}
