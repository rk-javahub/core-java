package com.rkjavahub.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamStringDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		String str = "Hello world";
		byte b[] = str.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Success..");
	}
}
