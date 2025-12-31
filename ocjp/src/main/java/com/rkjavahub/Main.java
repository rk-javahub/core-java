package com.rkjavahub;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee(7, "Rohit");

        System.out.println("Serialization started...");
        OutputStream os = new FileOutputStream("employee.txt");
        ObjectOutputStream os1 = new ObjectOutputStream(os);
        os1.writeObject(employee);
        os1.close();

        System.out.println("Deserialization started...");
        InputStream os2 = new FileInputStream("employee.txt");
        ObjectInputStream os3 = new ObjectInputStream(os2);
        Employee emp = (Employee) os3.readObject();
        System.out.println(emp.id());
        System.out.println(emp.name());

    }
}

record Employee(int id, String name) implements Serializable {

}