package com.rkjavahub.multithreading_concurrency.MultithreadingEnhanced;

class MyThread12 extends Thread
{

	public MyThread12(ThreadGroup pg, String name)
	{
		super(pg,name);
	}
	public void run()
	{
		System.out.println("Child thread");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
		}
	}
}

public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException
	{
	  ThreadGroup pg=new ThreadGroup("Parent group");
	  ThreadGroup cg=new ThreadGroup(pg,"Child group");
	  MyThread12 t1=new MyThread12(pg,"Child Thread1");
	  MyThread12 t2=new MyThread12(pg,"Child Thread2");
	  t1.start();
	  t2.start();
	  System.out.println(pg.activeCount());
	  System.out.println(pg.activeGroupCount());
	  pg.list();
	  Thread.sleep(7000);
	  System.out.println(pg.activeCount());
	  System.out.println(pg.activeGroupCount());
	}

}
