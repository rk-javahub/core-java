package com.rkjavahub.stream.cheatsheet;

import java.util.*;
import java.util.stream.Collectors;

import static com.rkjavahub.stream.cheatsheet.EmployeeDatabase.getAllEmployees;


public class Java8MethodCheatsheet {
    public static void main(String[] args) {
        System.out.println("Java 8 Method Reference Cheatsheet");

        List<Employee> employees = getAllEmployees();

        // 1 - Print all employee names and departments
       // System.out.println("All Employees name and department using foreach");
        //employees.forEach(e -> System.out.println(e.name() + " - " + e.department()));

       // System.out.println("\n");

        // 2 - Print all employee names based on department "Development"
       // System.out.println("Employees in Development Department:");
        //employees.stream().filter(e -> e.department().equals("Development")).toList().forEach(System.out::println);

        long employeeSet = employees.stream().filter(e -> e.department().startsWith("D") && e.salary() > 15000).collect(Collectors.toSet()).size();
        //System.out.println("Employee set size: "+employeeSet);


        Map<Integer, String> stringMap = employees.stream().collect(Collectors.toMap(Employee::id, Employee::name));
        //System.out.println("stringMap= "+stringMap);


        List<Employee> employeeList = employees.stream().sorted(Comparator.comparing(Employee::salary)).toList();
        //System.out.println(employeeList);

        Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::salary));
        System.out.println(max.get());


    }
}
