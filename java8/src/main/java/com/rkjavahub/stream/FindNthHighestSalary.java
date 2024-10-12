package com.rkjavahub.stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindNthHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 150000);
        map.put("B", 200000);
        map.put("C", 300000);
        map.put("D", 400000);
        map.put("E", 700000);
        map.put("F", 700000);
        map.put("G", 700000);

        // Second Lowest salary
        Map.Entry<String, Integer> secondLowestSalary = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList().get(1);
        System.out.println("Second Lowest Salary: " + secondLowestSalary);

        // Second Highest salary
        Map.Entry<String, Integer> stringHighestEntry = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList().get(1);
        System.out.println("Second Highest Salary: " + stringHighestEntry);

        //findNthHighestSalaryWhereThereAreDuplicates(map);


    }
/*
    private static void findNthHighestSalaryWhereThereAreDuplicates(Map<String, Integer> map) {
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()

    }*/
}
