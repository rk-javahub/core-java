package com.rkjavahub.stream;

import com.rkjavahub.stream.dto.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        Employee e = new Employee("Rohit", "Java Developer", 70000, "Pune");
        Employee e1 = new Employee("Sachin", "Manager", 90000, "Banglore");
        Employee e2 = new Employee("Vignesh", "Tester", 40000, "Pune");
        Employee e3 = new Employee("Radhika", "Java Developer", 70000, "Hyderabad");
        Employee e4 = new Employee("Aayush", "QA", 50000, "Chennai");
        Employee e5 = new Employee("Raj", "Analyst", 60000, "Pune");
        Employee e6 = new Employee("Ratan", "CEO", 5000000, "Banglore");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);


        Map employeeMap = employees.stream().collect(Collectors.toMap(Employee::getName, Function.identity()));
        employeeMap.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
