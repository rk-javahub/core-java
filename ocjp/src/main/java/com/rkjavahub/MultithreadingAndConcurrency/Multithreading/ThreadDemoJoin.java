package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class MyThread5 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName() + "   Seeta");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemoJoin {

	public static void main(String[] args) throws InterruptedException {
		MyThread5 mt = new MyThread5();
		mt.setName("Thread mt");
		MyThread5 mt1 = new MyThread5();
		mt.setName("Thread mt1");
		mt.start();
		mt.join();
		mt1.start();
		mt1.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Ram");
		}
	}
}
