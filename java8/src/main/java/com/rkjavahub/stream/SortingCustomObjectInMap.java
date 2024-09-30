package com.rkjavahub.stream;

import com.rkjavahub.stream.dto.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingCustomObjectInMap {

    public static void main(String[] args) {
        Employee e = new Employee("Rohit", "Java Developer", 70000, "Pune");
        Employee e1 = new Employee("Sachin", "Manager", 90000, "Banglore");
        Employee e2 = new Employee("Vignesh", "Tester", 40000, "Pune");
        Employee e3 = new Employee("Radhika", "Java Developer", 70000, "Hyderabad");
        Employee e4 = new Employee("Aayush", "QA", 50000, "Chennai");
        Employee e5 = new Employee("Raj", "Analyst", 60000, "Pune");
        Employee e6 = new Employee("Ratan", "CEO", 5000000, "Banglore");

        Map<Employee, Integer> Employee = new HashMap<>();
        Employee.put(e, 27);
        Employee.put(e1, 28);
        Employee.put(e2, 26);
        Employee.put(e3, 25);
        Employee.put(e4, 29);
        Employee.put(e5, 30);
        Employee.put(e6, 31);

        Employee.entrySet().stream().sorted(Comparator.comparing(o -> o.getKey().getName())).forEach(System.out::println);


    }
}
