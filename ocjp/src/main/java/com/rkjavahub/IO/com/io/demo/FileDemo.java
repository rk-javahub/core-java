package com.rkjavahub.IO.com.io.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// Code to create new file in current directory
		File file = new File("demo.txt");
		file.createNewFile();

		// code to create a directory named with SaiCharan123 in current working
		// directory and create a file named with abc.txt in that directory.
		File file1 = new File("SaiCharan123");
		file1.mkdir();
		File file2 = new File("SaiCharan123", "abc.txt");
		file2.createNewFile();

	}

}
