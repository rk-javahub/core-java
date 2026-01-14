package com.rkjavahub;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        names.stream().filter(n -> n.startsWith("C")).forEach(System.out::println);

        names.stream().sorted().forEach(System.out::println);

        names.stream().map(String::toUpperCase).forEach(System.out::println);


        String demo = "ABCCDDEEFFGGHHIIJJ";

        Arrays.asList(demo.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> System.out.println(k + "=" + v));


    }
}
