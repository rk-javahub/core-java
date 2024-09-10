package com.rkjavahub.basic;

public class Print1to10withoutloop {

	public static void print(int num) {
		if (num <= 10) {
			System.out.print(num+" ");
			print(num + 1);
		}
	}
	public static void main(String[] args) {
		print(1);
	}
}
