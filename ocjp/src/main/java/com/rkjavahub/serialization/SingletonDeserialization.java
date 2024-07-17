package com.rkjavahub.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDeserialization implements Serializable {

	private static final long serialVersionUID = 1L;

	SingletonDeserialization() {
		// System.out.println("In Constructor");
	}

	private static SingletonDeserialization INSTANCE;

	public static SingletonDeserialization getInstance() {
		synchronized (SingletonDeserialization.class) {
			if (INSTANCE == null) {
				INSTANCE = new SingletonDeserialization();
			}
		}
		return INSTANCE;
	}

	private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
		stream.defaultReadObject();
		// System.out.println("in readResolve()");
		synchronized (this) {
			if (INSTANCE == null) {
				INSTANCE = this;

			}
			// System.out.println(INSTANCE);
		}
	}

	// Method to not break Singleton Pattern
	private Object readResolve() throws ObjectStreamException {
		System.out.println("in readResolve()");
		return INSTANCE;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Serialization process
		System.out.println("Serialization started....");
		FileOutputStream fileOutputStream = new FileOutputStream("singleton.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(getInstance());
		objectOutputStream.close();
		System.out.println("SingletonDeserialization object after Serialization check: " + INSTANCE);

		// Deserialization Process
		System.out.println("Deserialization started....");
		FileInputStream fileInputStream = new FileInputStream("singleton.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		SingletonDeserialization deserialization = (SingletonDeserialization) objectInputStream.readObject();
		System.out.println("SingletonDeserialization object after Deserialization check: " + deserialization);
		objectInputStream.close();
	}
}
