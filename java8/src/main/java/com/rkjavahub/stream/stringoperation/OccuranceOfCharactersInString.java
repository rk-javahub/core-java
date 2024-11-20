package com.rkjavahub.stream.stringoperation;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharactersInString {
    public static void main(String[] args) {
        String str = "Rohit is a java developer";
        Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).filter(ch -> !Character.isWhitespace(ch)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry e : collect.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
