package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

import java.util.concurrent.locks.ReentrantLock;

class MyThread77 extends Thread
{
	ReentrantLock l=new ReentrantLock();	
	MyThread77(String name)
	{
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation");
			try
			{
			Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				l.unlock();
			}
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation");
		}
		
	}
}

public class MultithreadingEnhancedTest2 
{

	public static void main(String[] args)
	{
		MyThread77 m1=new MyThread77("First thread");
		MyThread77 m2=new MyThread77("Second thread");
		m1.start();
		m2.start();

	}

}
