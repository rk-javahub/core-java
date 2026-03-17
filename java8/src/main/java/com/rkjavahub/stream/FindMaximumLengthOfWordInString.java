package com.rkjavahub.stream;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaximumLengthOfWordInString {
    public static void main(String[] args) {
        String str = "Hi my name is Rohit Ashok Kumbhar";
        String s = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(s);
    }
}
