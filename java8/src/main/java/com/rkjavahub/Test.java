package com.rkjavahub;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employees {
    private String name;
    private String designation;
    private int salary;
    private String city;
}

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Employees e = new Employees("Rohit", "Java Developer", 70000, "Pune");
        Employees e1 = new Employees("Sachin", "Manager", 90000, "Banglore");
        Employees e2 = new Employees("Vignesh", "Tester", 40000, "Pune");
        Employees e3 = new Employees("Radhika", "Java Developer", 70000, "Hyderabad");
        Employees e4 = new Employees("Aayush", "QA", 50000, "Chennai");
        Employees e5 = new Employees("Raj", "Analyst", 60000, "Pune");
        Employees e6 = new Employees("Ratan", "CEO", 5000000, "Banglore");

        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(e);
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);
        employeesList.add(e5);
        employeesList.add(e6);

        System.out.println("Get employee who is manager");
        employeesList.stream().filter(emp -> emp.getDesignation().equals("Manager")).forEach(System.out::println);

        System.out.println("Sorting based on name");
        employeesList.stream().sorted(Comparator.comparing(Employees::getName)).forEach(System.out::println);

    }

}
