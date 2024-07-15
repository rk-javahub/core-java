package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class Display1 {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning: ");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException occured");
			}
			System.out.println(name);
		}
	}
}

class MyThread10 extends Thread {
	Display1 d;
	String name;

	MyThread10(Display1 d, String name) {
		this.name = name;
		this.d = d;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizationTest1 {
	public static void main(String[] args) {
		Display1 d = new Display1();
		Display1 d1 = new Display1();
		MyThread10 mt = new MyThread10(d, "Dhoni");
		MyThread10 mt1 = new MyThread10(d1, "Virat");
		mt.start();
		mt1.start();
	}
}
