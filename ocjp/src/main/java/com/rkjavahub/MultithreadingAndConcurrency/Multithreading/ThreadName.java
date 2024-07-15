package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class Mythread2 extends Thread
{
	public void run()
	{
		System.out.println("run method executed by thread "+Thread.currentThread().getName());
	}
}
public class ThreadName {

	public static void main(String[] args)
	{
		 	Mythread2 t2=new Mythread2();
		 	t2.start();
		 	System.out.println("Main thread executed by "+Thread.currentThread().getName());
	}
}
