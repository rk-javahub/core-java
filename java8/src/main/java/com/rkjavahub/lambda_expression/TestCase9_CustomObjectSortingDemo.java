package com.rkjavahub.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCase9_CustomObjectSortingDemo {

    public static void main(String[] args) {
        ArrayList<Employee> al = getEmployee();

        System.out.println("Employee before sorting " + al);

        al.sort(Comparator.comparing(Employee::getEmpName));

        System.out.println("Employee after sorting based on name " + al);

        al.sort(Comparator.comparing(Employee::getEmpId));

        System.out.println("Employee after sorting based on employee id " + al);
    }

    private static ArrayList<Employee> getEmployee() {
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
