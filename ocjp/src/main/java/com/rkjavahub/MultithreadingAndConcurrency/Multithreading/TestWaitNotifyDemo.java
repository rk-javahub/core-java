package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class MyThread27 extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts execution");
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}
}

public class TestWaitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread27 t = new MyThread27();
		t.start();
		synchronized (t) {
			System.out.println("Main thread tryimg to call wait()");
			t.wait();
			System.out.println("Main thread got notification");
			System.out.println(t.total);
		}
	}
}
