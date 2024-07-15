package com.rkjavahub.Generics.com.generics.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Type_String {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Solapur");
		al.add("Pune");
		// al.add(7); It will generate compile time error as incompatible type
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		
		for(String str:al) {
			System.out.println(str);
		}

	}

}
