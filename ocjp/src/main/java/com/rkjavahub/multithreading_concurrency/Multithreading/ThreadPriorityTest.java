package com.rkjavahub.multithreading_concurrency.Multithreading;

class MyThread13 extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("Child Thread");
	}
}
}

public class ThreadPriorityTest
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getPriority());
		MyThread13 mt=new MyThread13();
		mt.setPriority(10);
		System.out.println(mt.getPriority());
		mt.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
		}
	}
}


