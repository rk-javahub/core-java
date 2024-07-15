package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class A {
	public synchronized void d1(B b) {
		System.out.println("In method d1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Caling last method of B class");
		b.last();
	}

	synchronized void last() {
		System.out.println("In last method of A class");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("In method d2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Caling last method of A class");
		a.last();
	}

	synchronized public void last() {
		System.out.println("In last method of B class");
	}
}

class DeadlockThread extends Thread {
	A a = new A();
	B b = new B();

	public void m() {
		this.start();
		a.d1(b);

	}

	public void run() {
		b.d2(a);
	}

}

public class DeadlocDemo {

	public static void main(String[] args) {
		DeadlockThread d = new DeadlockThread();
		d.m();
	}
}
