package com.rkjavahub.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		int i = fis.read();
		System.out.print((char) i);
		fis.close();
	}
}
