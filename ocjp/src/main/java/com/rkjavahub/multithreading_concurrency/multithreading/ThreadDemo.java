package com.rkjavahub.multithreading_concurrency.multithreading;

class MyThread17 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread17 mt = new MyThread17();
		mt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
