package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class Display {
	public synchronized void showInt() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.print(i);
			;
		}
	}

	public synchronized void showChar() throws InterruptedException {
		for (int i = 65; i < 75; i++) {
			Thread.sleep(1000);
			System.out.print((char) i);
			;
		}
	}
}

class Mythread extends Thread {
	Display d;

	Mythread(Display d) {
		this.d = d;
	}

	public void run() {
		try {
			d.showInt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Mythread1 extends Thread {
	Display d;

	Mythread1(Display d) {
		this.d = d;
	}

	public void run() {
		try {
			d.showChar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronizedTest2 {

	public static void main(String[] args) {
		Display d = new Display();

		Mythread t = new Mythread(d);
		Mythread1 t1 = new Mythread1(d);
		t.start();
		t1.start();

	}

}
