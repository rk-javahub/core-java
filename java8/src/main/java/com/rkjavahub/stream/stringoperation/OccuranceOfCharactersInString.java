package com.rkjavahub.stream.stringoperation;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharactersInString {
    public static void main(String[] args) {
        String str = "Rohit is a java developer";
        Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).filter(ch -> !Character.isWhitespace(ch)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
/*
        for (Map.Entry e : collect.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue());
        }
        System.out.println();
*/

        Map<String, Long> collect1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry e : collect.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue());
            System.out.println();
        }

    }
}
