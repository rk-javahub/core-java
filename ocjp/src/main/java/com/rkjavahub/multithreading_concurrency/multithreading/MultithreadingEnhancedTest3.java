package com.rkjavahub.multithreading_concurrency.multithreading;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread78 extends Thread
{
	ReentrantLock l=new ReentrantLock();	
	MyThread78(String name)
	{
		super(name);
	}
	public void run()
	{
		do
		{
			try {
				if(l.tryLock(3000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation");
					try
					{
					Thread.sleep(35000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
//				l.unlock();
					System.out.println(Thread.currentThread().getName()+" releases lock");
					break;
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+" unable to get lock and will try again");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(true);
	}
}

public class MultithreadingEnhancedTest3 
{
	public static void main(String[] args)
	{
		MyThread77 m1=new MyThread77("First thread");
		MyThread77 m2=new MyThread77("Second thread");
		m1.start();
		m2.start();
	}
}
