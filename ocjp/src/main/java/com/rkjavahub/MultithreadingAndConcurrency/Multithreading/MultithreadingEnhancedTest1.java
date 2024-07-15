package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Display3
{
	String name;
	ReentrantLock l=new ReentrantLock();
	
	public void show(String name)
	{
		l.lock();
		
	
		for(int i=0;i<10;i++)
		{
			
			System.out.println("Good morning");
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name);
			
		}
		l.unlock();
	}
}

class ThreadDemo1 extends Thread
{
	Display3 d;
	String name;
	ThreadDemo1(Display3 d,String name)
	{
		this.name=name;
		this.d=d;
	}
	
	public void run()
	{
		d.show(name);
	}
}
public class MultithreadingEnhancedTest1 {

	public static void main(String[] args) 
	{
		Display3 d=new Display3();
		ThreadDemo1 t1=new ThreadDemo1(d,"Dhoni");
		ThreadDemo1 t2=new ThreadDemo1(d,"Yuvraj");
		t1.start();
		t2.start();

	}

}
