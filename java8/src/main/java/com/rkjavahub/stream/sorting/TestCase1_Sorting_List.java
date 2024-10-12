/**
 *
 */
package com.rkjavahub.stream.sorting;

import com.rkjavahub.stream.dto.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Rohit
 */
public class TestCase1_Sorting_List {
    public static void main(String[] args) {
        naturalObjectSorting();
        customObjectSorting();
    }

    private static void naturalObjectSorting() {
        List<Integer> ls = new ArrayList<>();
        ls.add(12);
        ls.add(4);
        ls.add(26);
        ls.add(89);
        ls.add(104);
        ls.add(75);

        System.out.println("Natural sorting");
        List<Integer> ls1 = ls.stream().sorted().collect(Collectors.toList());
        System.out.println(ls1);

        System.out.println("Customized sorting");
        List<Integer> ls2 = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ls2);
    }


    private static void customObjectSorting() {
        Employee e = new Employee("Rohit", "Java Developer","IT", 70000, "Pune");
        Employee e1 = new Employee("Sachin", "Manager", "IT",90000, "Banglore");
        Employee e2 = new Employee("Vignesh", "Tester", "IT",40000, "Pune");
        Employee e3 = new Employee("Radhika", "Java Developer", "IT",70000, "Hyderabad");
        Employee e4 = new Employee("Aayush", "QA", "Quality",50000, "Chennai");
        Employee e5 = new Employee("Raj", "Analyst", "Quality",60000, "Pune");
        Employee e6 = new Employee("Ratan", "CEO","Management", 5000000, "Banglore");
        

        List<Employee> employees;
        employees = Stream.of(e, e1, e2, e3, e4, e5, e6).toList();

        // Get employee who have designation as Manager
        System.out.println("employee with designation as Manager are: ");
        employees.stream().filter(p1 -> p1.getDesignation().equals("Manager")).toList().forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who have designation as Manager
        System.out.println("employee from Pune city are: ");
        employees.stream().filter(p1 -> p1.getCity().equals("Pune")).toList().forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who's salary > 50000
        System.out.println("employee who's salary > 50000 are: ");
        employees.stream().filter(p1 -> p1.getSalary() > 50000).toList().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who's salary < 50000
        System.out.println("employee who's salary < 50000 are: ");
        employees.stream().filter(p1 -> p1.getSalary() < 50000).toList().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who are not Manager
        System.out.println("employee who are not Managers: ");
        employees.stream().filter(p1 -> !p1.getDesignation().equals("Manager")).toList().forEach(System.out::println);
        // display(p1.negate(), employee);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Sorting employee based on name
        System.out.println("employee sorting based on employee name way 1: ");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("employee sorting based on employee salary way 1: ");
        employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("employee sorting based on employee name way 2 using method reference: ");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Sorting employee based on name descending
        System.out.println("employee sorting based on employee name descending: ");
        System.out.println("---- One way ----");
        employees.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);
        System.out.println("---- Second way ----");
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Get employee based on location and sort by salary ascending
        System.out.println("Get employee based on lacation and sorting based on salary descending: ");
        employees.stream().filter(l -> l.getCity().equals("Pune")).sorted(Comparator.comparingInt(Employee::getSalary).reversed()).forEach(System.out::println);

        // Group employee based on city

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Get employee based on grouping by city: ");
        employees.stream().collect(Collectors.groupingBy(Employee::getCity)).entrySet().forEach(System.out::println);


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Get employee based on grouping by city and count: ");
        employees.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting())).entrySet().forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Get employee with highest salary based on department: ");
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

    }
}