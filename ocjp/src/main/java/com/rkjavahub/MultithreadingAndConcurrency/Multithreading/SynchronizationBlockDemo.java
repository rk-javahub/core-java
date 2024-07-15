package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class Display2 {
	void show(String name) throws InterruptedException {
		/// 1 lack lines of code
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello " + name);
				Thread.sleep(1000);
			}
		}
		/// 1 lack lines of code
	}
}

class Mythread3 extends Thread {
	Display2 d;
	String name;

	Mythread3(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		try {
			d.show(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronizationBlockDemo {

	public static void main(String[] args) {
		Display2 d = new Display2();
		Mythread3 mt = new Mythread3(d, "Dhoni");
		Mythread3 mt1 = new Mythread3(d, "Yuvraj");
		mt.start();
		mt1.start();

	}

}
