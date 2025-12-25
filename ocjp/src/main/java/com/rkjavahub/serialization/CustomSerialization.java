package com.rkjavahub.serialization;

import lombok.Setter;

import java.io.*;

class User implements Serializable {
	private String username;
	@Setter
    private String password;

	public String getUsername() {
		return username;
	}

	public void setUsernmae(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

    @Serial
    private void writeObject(ObjectOutputStream os) {
		System.out.println("In, writeObject() method.");
		try {
			os.writeObject(this.username);
			os.writeObject("123" + this.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Serial
    private void readObject(ObjectInputStream ois) {
		System.out.println("In, readObject() method.");
		try {
			username = (String) ois.readObject();
			password = (String) ois.readObject();
			password = password.substring(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class 	CustomSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User usr = new User();
		usr.setUsernmae("Rohit");
		usr.setPassword("abc");

		FileOutputStream fos = new FileOutputStream("user.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(usr);
		oos.close();

		FileInputStream fis = new FileInputStream("user.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User usr1 = (User) ois.readObject();
		System.out.println(usr1.getUsername() + " " + usr1.getPassword());
		ois.close();

	}
}
