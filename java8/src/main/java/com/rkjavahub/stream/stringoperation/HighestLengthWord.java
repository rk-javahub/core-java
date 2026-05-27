package com.rkjavahub.stream.stringoperation;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLengthWord {
    public static void main(String[] args) {
        String str = "Hi my name is Rohit Kumbhar";

        Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).ifPresent(word -> System.out.println(word));
    }
}
