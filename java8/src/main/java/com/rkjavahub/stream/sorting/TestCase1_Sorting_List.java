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
        Employee e = new Employee("Rohit", "Java Developer", 70000, "Pune");
        Employee e1 = new Employee("Sachin", "Manager", 90000, "Banglore");
        Employee e2 = new Employee("Vignesh", "Tester", 40000, "Pune");
        Employee e3 = new Employee("Radhika", "Java Developer", 70000, "Hyderabad");
        Employee e4 = new Employee("Aayush", "QA", 50000, "Chennai");
        Employee e5 = new Employee("Raj", "Analyst", 60000, "Pune");
        Employee e6 = new Employee("Ratan", "CEO", 5000000, "Banglore");

        List<Employee> employee;
        employee = Stream.of(e, e1, e2, e3, e4, e5, e6).toList();

        // Get employee who have designation as Manager
        System.out.println("employee with designation as Manager are: ");
        employee.stream().filter(p1 -> p1.getDesignation().equals("Manager")).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who have designation as Manager
        System.out.println("employee from Pune city are: ");
        employee.stream().filter(p1 -> p1.getCity().equals("Pune")).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who's salary > 50000
        System.out.println("employee who's salary > 50000 are: ");
        employee.stream().filter(p1 -> p1.getSalary() > 50000).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who's salary < 50000
        System.out.println("employee who's salary < 50000 are: ");
        employee.stream().filter(p1 -> p1.getSalary() < 50000).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Get employee who are not Manager
        System.out.println("employee who are not Managers: ");
        employee.stream().filter(p1 -> !p1.getDesignation().equals("Manager")).collect(Collectors.toList()).forEach(System.out::println);
        // display(p1.negate(), employee);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Sorting employee based on name
        System.out.println("employee sorting based on employee name way 1: ");
        employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("employee sorting based on employee salary way 1: ");
        employee.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("employee sorting based on employee name way 2 using method reference: ");
        employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Sorting employee based on name descending
        System.out.println("employee sorting based on employee name descending: ");
        System.out.println("---- One way ----");
        employee.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);
        System.out.println("---- Second way ----");
        employee.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Get employee based on location and sort by salary ascending
        System.out.println("Get employee based on lacation and sorting based on salary descending: ");
        employee.stream().filter(l -> l.getCity().equals("Pune")).sorted(Comparator.comparingInt(Employee::getSalary).reversed()).forEach(System.out::println);

        // Group employee based on city

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Get employee based on grouping by city: ");
        Map<Object, List<Employee>> EmployeeMap = employee.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(EmployeeMap);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Get employee based on grouping by city and count: ");
        Map<Object, Long> EmployeeMap1 = employee.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
        System.out.println(EmployeeMap1);

    }
}

