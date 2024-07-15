package com.rkjavahub.collectionframework.collection.map.abstractmap;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Login.properties");	
		Properties p = new Properties();
		p.load(fr);
		String name=p.getProperty("username");
		String password=p.getProperty("password");
		System.out.println(name+" "+password);
	}
}
