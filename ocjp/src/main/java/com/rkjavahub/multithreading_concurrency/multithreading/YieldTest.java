package com.rkjavahub.multithreading_concurrency.multithreading;

class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getPriority());
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class YieldTest {

	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		mt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getPriority());
			System.out.println("Main thread");
		}
	}

}
