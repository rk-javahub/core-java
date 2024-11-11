package com.rkjavahub.stream.all_methods;

import com.rkjavahub.stream.all_methods.dto.Employee;
import com.rkjavahub.stream.all_methods.dto.EmployeeDataBase;
import com.rkjavahub.stream.all_methods.dto.Project;

import java.util.*;
import java.util.stream.Collectors;

/*
filter() is used to filter the elements
*/
public class FilterDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();

        // filter method
        System.out.println("------------------ Getting employees from Development department only -------------------------");
        employees.stream().filter(emp -> emp.getDept().equals("Development")).toList().forEach(System.out::println);

        System.out.println("------------------ Getting employees from Development department and salary>70000 -------------------------");
        Map<String, Double> empleeMap = employees.stream().filter(emp -> emp.getDept().equals("Development") && emp.getSalary() > 80000).collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(empleeMap);

        // map method
        System.out.println("------------------ Getting only employees names using map() -------------------------");
        employees.stream().map(Employee::getName).forEach(System.out::println);

        // distinct method
        System.out.println("------------------ Getting only employee department using map() -------------------------");
        employees.stream().map(Employee::getDept).distinct().forEach(System.out::println);

        // flatmap method
        System.out.println("------------------ Getting project names for employee flatmap() -------------------------");
        employees.stream().flatMap(e -> e.getProjects().stream().map(Project::getName)).distinct().forEach(System.out::println);

        // sorting method
        System.out.println("------------------ Getting employee based on salary in ascending order using sorted() -------------------------");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().forEach(System.out::println);

        System.out.println("------------------ Getting employee based on salary in descending order using sorted() -------------------------");
        employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).toList().forEach(System.out::println);

        // max method
        System.out.println("------------------ Getting employee with highest salary -------------------------");
        Optional<Employee> highestPaidEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(highestPaidEmployee);

        // min method
        System.out.println("------------------ Getting employee with lowet salary -------------------------");
        Optional<Employee> lowesttPaidEmployee = employees.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println(lowesttPaidEmployee);

        // grouping by gender
        System.out.println("------------------ Group by gender -------------------------");
        Map<String, List<Employee>> groupEmployee = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(groupEmployee);

        System.out.println("------------------ Group by gender and display gender and name only -------------------------");
        Map<String, List<String>> groupEmployee1 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(groupEmployee1);

        System.out.println("------------------ Group by gender and display gender and number of employees with that gender -------------------------");
        Map<String, Long> groupEmployee2 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(groupEmployee2);


    }
}
