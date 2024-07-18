package com.rkjavahub.multithreading_concurrency.multithreading;

class MyThread6 extends Thread {
	static Thread m;

	public void run() {

		try {
			m.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child thread");
		}
	}
}

public class JoiningMainThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread6 mt = new MyThread6();
		MyThread6.m = Thread.currentThread();
		mt.start();

		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("Main thread");
		}
	}
}
