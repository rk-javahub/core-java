/**
 *
 */
package com.rkjavahub.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rohit
 *
 */
public class TestCase4_Sorting_Map {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 7);
        map.put("D", 4);
        map.put("E", 3);
        map.put("F", 6);
        map.put("G", 9);

        System.out.println("Sorting by value");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("Sorting by Key");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);




    }
}
