package com.rkjavahub.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rohit
 */
public class Filter_and_Map_on_String {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Rohit");
        ls.add("Sachin");
        ls.add("Nikhil");
        ls.add("Rasika");
        ls.add("Parth");
        ls.add("Samir");

        System.out.println("Filtering list elements with length greater than 5");
        filterStringBasedOnLength(ls);

        System.out.println("\nMapping list elements in upper case");
        mapStringtoUpperCase(ls);

        System.out.println("\nCount number of elemnts in list");
        countNumberOfElements(ls);

        System.out.println("\nCount number of elemnts in list with length greater than 5");
        countNumberOfElementsGreaterThan5(ls);

        System.out.println("\nPrint names which start with 'R'");
        printNamesStartWithR(ls);

        System.out.println("\nCount number of characters in words of string");
        printNumberOfCharactersInWordsString(ls);

    }

    private static void printNumberOfCharactersInWordsString(List<String> ls) {
        Map<String, Integer> collect = ls.stream().collect(Collectors.toMap(word -> word, String::length));
        System.out.println(collect);
    }

    private static void printNamesStartWithR(List<String> ls) {
        ls.stream().filter(s -> s.startsWith("R")).forEach(System.out::println);
    }

    private static void countNumberOfElementsGreaterThan5(List<String> ls) {
        long count = ls.stream().filter(str -> (str.length() > 5)).count();
        System.out.println(count);
    }

    private static void countNumberOfElements(List<String> ls) {
        long count = ls.stream().count();
        System.out.println(count);
    }

    private static void mapStringtoUpperCase(List<String> ls) {
        List<String> ls1 = ls.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ls1);

    }

    private static void filterStringBasedOnLength(List<String> ls) {
        List<String> ls1 = ls.stream().filter(str -> (str.length() > 5)).collect(Collectors.toList());
        System.out.println(ls1);
    }
}
