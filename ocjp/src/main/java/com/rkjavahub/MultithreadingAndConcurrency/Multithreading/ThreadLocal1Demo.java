package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

public class ThreadLocal1Demo extends Thread 
{
	static Integer value=0;
	ThreadLocal1Demo(String name)
	{
		super(name);
	}
	private static ThreadLocal<Integer> t=new ThreadLocal()
	{
		public Integer initValue()
		{
			t.set(++value);
			return value;
		}
	};
	public void run()
	{
		System.out.println("Theard "+Thread.currentThread().getName()+" has an id "+t.get());
	}
	public static void main(String[] args) 
	{
		ThreadLocal1Demo t1=new ThreadLocal1Demo("Rohit");
		ThreadLocal1Demo t2=new ThreadLocal1Demo("Sachin");
		ThreadLocal1Demo t3=new ThreadLocal1Demo("Pramod");
		ThreadLocal1Demo t4=new ThreadLocal1Demo("Raju");
		ThreadLocal1Demo t5=new ThreadLocal1Demo("Akshay");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
