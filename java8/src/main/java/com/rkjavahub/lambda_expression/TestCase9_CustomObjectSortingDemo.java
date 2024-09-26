package com.rkjavahub.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;

public class TestCase9_CustomObjectSortingDemo {

    public static void main(String[] args) {
        ArrayList<Employee> al = getEmployees();

        System.out.println("Employees before sorting " + al);

        al.sort((emp1, emp2) -> emp1.getEmpName().compareTo(emp2.getEmpName()));

        System.out.println("Employees after sorting based on name " + al);

        al.sort((emp1, emp2) -> emp1.getEmpId().compareTo(emp2.getEmpId()));

        System.out.println("Employees after sorting based on employee id " + al);
    }

    private static ArrayList<Employee> getEmployees() {
        Employee e = new Employee();
        e.setEmpId(1);
        e.setEmpName("Rohit");

        Employee e1 = new Employee();
        e1.setEmpId(25);
        e1.setEmpName("Sachin");

        Employee e2 = new Employee();
        e2.setEmpId(12);
        e2.setEmpName("Raju");

        Employee e3 = new Employee();
        e3.setEmpId(7);
        e3.setEmpName("Ramesh");

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(e);
        al.add(e1);
        al.add(e2);
        al.add(e3);

        return al;
    }
}
