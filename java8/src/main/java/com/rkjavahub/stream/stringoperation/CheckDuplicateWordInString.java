package com.rkjavahub.stream.stringoperation;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckDuplicateWordInString {
    public static void main(String[] args) {
        String str = "Hi how are you you";
        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);
    }
}
