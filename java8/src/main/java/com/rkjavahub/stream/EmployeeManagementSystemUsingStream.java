package com.rkjavahub.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee {
    private String name;
    private String designation;
    private int salary;
    private String city;
}

public class EmployeeManagementSystemUsingStream {

    public static void main(String[] args) {
        Employees e = new Employees("Rohit", "Java Developer", 70000, "Pune");
        Employees e1 = new Employees("Sachin", "Manager", 90000, "Banglore");
        Employees e2 = new Employees("Vignesh", "Tester", 40000, "Pune");
        Employees e3 = new Employees("Radhika", "Java Developer", 70000, "Hyderabad");
        Employees e4 = new Employees("Aayush", "QA", 50000, "Chennai");
        Employees e5 = new Employees("Raj", "Analyst", 60000, "Pune");
        Employees e6 = new Employees("Ratan", "CEO", 5000000, "Banglore");

        List<Employees> employees = new ArrayList<Employees>();
        employees = Stream.of(e, e1, e2, e3, e4, e5, e6).toList();

        // Get employees who have designation as Manager
        System.out.println("Employees with designation as Manager are: ");
        employees.stream().filter(p1 -> p1.getDesignation().equals("Manager")).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who have designation as Manager
        System.out.println("Employees from Pune city are: ");
        employees.stream().filter(p1 -> p1.getCity().equals("Pune")).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who's salary > 50000
        System.out.println("Employees who's salary > 50000 are: ");
        employees.stream().filter(p1 -> p1.getSalary() > 50000).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who's salary < 50000
        System.out.println("Employees who's salary < 50000 are: ");
        employees.stream().filter(p1 -> p1.getSalary() < 50000).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who are not Manager
        System.out.println("Employees who are not Managers: ");
        employees.stream().filter(p1 -> !p1.getDesignation().equals("Manager")).collect(Collectors.toList()).forEach(System.out::println);
        // display(p1.negate(), employees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Sorting Employee based on name
        System.out.println("Employees sorting based on employee name way 1: ");
        employees.stream().sorted(Comparator.comparing(Employees::getName)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Employees sorting based on employee salary way 1: ");
        employees.stream().sorted(Comparator.comparingInt(Employees::getSalary)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Employees sorting based on employee name way 2 using method reference: ");
        employees.stream().sorted(Comparator.comparing(Employees::getName)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Sorting Employee based on name descending
        System.out.println("Employees sorting based on employee name descending: ");
        System.out.println("---- One way ----");
        employees.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);
        System.out.println("---- Second way ----");
        employees.stream().sorted(Comparator.comparing(Employees::getName).reversed()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Get employees based on location and sort by salary ascending
        System.out.println("Get Employee based on lacation and sorting based on salary descending: ");
        employees.stream().filter(l -> l.getCity().equals("Pune")).sorted(Comparator.comparingInt(Employees::getSalary).reversed()).forEach(System.out::println);

        // Group employees based on city

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Get Employees based on grouping by city: ");
        Map<Object, List<Employees>> employeesMap = employees.stream().collect(Collectors.groupingBy(Employees::getCity));
        System.out.println(employeesMap);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Get Employees based on grouping by city and count: ");
        Map<Object, Long> employeesMap1 = employees.stream().collect(Collectors.groupingBy(Employees::getCity, Collectors.counting()));
        System.out.println(employeesMap1);

    }
}