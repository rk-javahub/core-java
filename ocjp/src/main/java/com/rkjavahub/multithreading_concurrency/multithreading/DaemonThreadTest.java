package com.rkjavahub.multithreading_concurrency.multithreading;

class Mythread7 extends Thread
{
}
public class DaemonThreadTest {

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().isDaemon());
		// Thread.currentThread().setDaemon(true); Exception in thread "main" java.lang.IllegalThreadStateException
		Mythread7 t=new Mythread7();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}
