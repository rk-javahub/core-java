package com.rkjavahub.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.function.Predicate;
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

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee e = new Employee("Rohit", "Java Developer", 70000, "Pune");
        Employee e1 = new Employee("Sachin", "Manager", 90000, "Banglore");
        Employee e2 = new Employee("Vignesh", "Tester", 40000, "Pune");
        Employee e3 = new Employee("Radhika", "Java Developer", 70000, "Hyderabad");
        Employee e4 = new Employee("Aayush", "QA", 50000, "Chennai");
        Employee e5 = new Employee("Raj", "Analyst", 60000, "Pune");
        Employee e6 = new Employee("Ratan", "CEO", 5000000, "Banglore");

        List<Employee> employees;
        employees = Stream.of(e, e1, e2, e3, e4, e5, e6).collect(Collectors.toList());

        // Get employees who have designation as Manager
        Predicate<Employee> p1 = emp -> emp.getDesignation().equals("Manager");
        System.out.println("Employees with designation as Manager are: ");
        display(p1, employees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who have designation as Manager
        Predicate<Employee> p2 = emp -> emp.getCity().equals("Pune");
        System.out.println("Employees from Pune city are: ");
        display(p2, employees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who's salary > 50000
        Predicate<Employee> p3 = emp -> emp.getSalary() > 50000;
        System.out.println("Employees who's salary > 50000 are: ");
        display(p3, employees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who's salary < 50000
        Predicate<Employee> p4 = emp -> emp.getSalary() < 50000;
        System.out.println("Employees who's salary < 50000 are: ");
        display(p4, employees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employees who are not Manager
        System.out.println("Employees who are not Managers: ");
        display(p1.negate(), employees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Check employee name is Rohit or not. (isEqual() come in contract.)
        Predicate<Employee> p5 = Predicate.isEqual(e);
        Employee e7 = new Employee("Rohit", "Java Developer", 70000, "Pune");
        Employee e8 = new Employee("Sachin", "Manager", 90000, "Banglore");
        System.out.println(p5.test(e7));
    }

    private static void display(Predicate<Employee> p1, List<Employee> employees) {
        for (Employee e : employees) {
            if (p1.test(e)) {
                System.out.println(e);
            }
        }
    }
}