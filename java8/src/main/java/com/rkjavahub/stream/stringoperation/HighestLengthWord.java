package com.rkjavahub.stream.stringoperation;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLengthWord {
    public static void main(String[] args) {
        String str = "Hi my name is Rohit Kumbhar rahbmuK";

        System.out.println("Return first highest length word");
        Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).ifPresent(System.out::println);


        System.out.println("Return all highest length word");
        int maxLength = Arrays.stream(str.split(" ")).mapToInt(String::length).max().orElse(0);

        Arrays.stream(str.split(" ")).filter(s -> s.length() == maxLength).forEach(System.out::println);
    }
}
