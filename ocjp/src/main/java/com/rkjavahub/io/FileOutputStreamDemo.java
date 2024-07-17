package com.rkjavahub.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		int a=100;
		fos.write(a);
		fos.close();
		System.out.println("Success..");
	}
}
