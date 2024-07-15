package com.rkjavahub.Serialization.com.serialization.demo;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee1 implements Externalizable {

	private static final long serialVersionUID = 1L;
	private int id;
	private static String name;
	
	public Employee1() {
		System.out.println("In default constructor..");
		
	}

	public Employee1(int id, String name) {
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("In writeExternal");
		out.writeInt(id);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("In readExternal");
		this.id = in.readInt();
		this.name = (String) in.readObject();
	}
}

public class ExternalizationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee1 emp = new Employee1(7, "Rohit");

		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();

		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee1 emp1 = (Employee1) ois.readObject();
		System.out.println(emp1.getId() + " " + emp1.getName());
		ois.close();

	}

}
