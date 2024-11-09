package com.rkjavahub.stream.all_methods.intermediate_operation;

import java.util.stream.Stream;

/*
filter() is used to filter the elements
*/
public class FilterDemo {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Rohit", "Akshay", "Sachin", "Ana");
        stringStream.filter(f -> f.length() > 5).toList().forEach(System.out::println);
    }
}
