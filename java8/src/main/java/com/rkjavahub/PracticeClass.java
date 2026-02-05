package com.rkjavahub;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
       // names.stream().filter(n -> n.startsWith("C")).forEach(System.out::println);

      //  names.stream().sorted().forEach(System.out::println);

       // names.stream().map(String::toUpperCase).forEach(System.out::println);


        String demo = "ABCCDDEEFFGGHHIIJJ";

       // Arrays.asList(demo.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> System.out.println(k + "=" + v));


        /*int[] intArray={12,54,2,69,78,23};

        Integer list = Arrays.stream(intArray).boxed().sorted(Collections.reverseOrder()).toList().get(1);
        System.out.println(list);*/

        // Longest String from given

        String[] strArray={"Rohit","Akshay","Sachin","Pramod"};

        Map<Integer, List<String>> collect = Arrays.stream(strArray).collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        names.stream().filter()


    }
}
