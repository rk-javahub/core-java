package com.rkjavahub.multithreading_concurrency.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread79 implements Runnable
{
   String name;
	MyThread79(String name)
	{
		this.name=name;
	}
	
	public void run() 
	{
		System.out.println(name+" job completed by"+Thread.currentThread().getName());
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}	
	}
}
public class ThreadPoolDemo {
	public static void main(String[] args)
	{
	  MyThread79[] job={new MyThread79("Rohit"),new MyThread79("Sachin"),new MyThread79("Pramod"),new MyThread79("Raju"),new MyThread79("Akshay"),new MyThread79("Prakash")};
	  ExecutorService service=Executors.newFixedThreadPool(3);
	  for(MyThread79 job1:job)
	  {
		  service.submit(job1);
	  }
	  service.shutdown();
	}
}
