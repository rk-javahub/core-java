package com.rkjavahub.Serialization.com.serialization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private static String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee(7, "Rohit");

		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();

		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1 = (Employee) ois.readObject();
		System.out.println(emp1.getId() + " " + emp1.getName());
		ois.close();

	}

}
