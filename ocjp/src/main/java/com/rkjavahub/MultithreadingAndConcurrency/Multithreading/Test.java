package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class X extends Thread {
	void show() {
		System.out.println("In X class");
	}

	public void start() {
		super.start();
		System.out.println("Start method");
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i=" + i);
		}
	}
}

public class Test {
	public static void main(String[] args) {
		X x = new X();
		x.start();
		for (int j = 0; j < 5; j++) {
			System.out.println("j=" + j);
		}
	}
}
