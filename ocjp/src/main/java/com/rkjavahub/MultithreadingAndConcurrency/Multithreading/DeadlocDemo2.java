package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class A2 implements Runnable {

	@Override
	public void run() {
		synchronized (String.class) {
			try {
				System.out.println("Synchronized String block A2 class");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Object.class) {
				System.out.println("Synchronized Object block A2 class");
			}
		}
	}
}

class B2 implements Runnable {
	@Override
	public void run() {
		synchronized (Object.class) {
			try {
				System.out.println("Synchronized String block B2 class");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("Synchronized String block B2 class");
			}
		}
	}
}

public class DeadlocDemo2 {
	public static void main(String[] args) {
		A2 a = new A2();
		B2 b = new B2();

		Thread t = new Thread(a);
		Thread t1 = new Thread(b);
		t.start();
		t1.start();
	}
}
