package com.rkjavahub.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FistNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbccddee";

        Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream().filter(s -> s.getValue() == 1).findFirst().ifPresent(System.out::println);
    }
}
