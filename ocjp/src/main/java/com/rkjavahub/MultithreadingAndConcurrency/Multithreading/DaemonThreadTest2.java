package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class Mythread8 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Child thread");
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		}
	}
}
public class DaemonThreadTest2 {

	public static void main(String[] args) 
	{
		Mythread8 t=new Mythread8();
		//t.setDaemon(true);
		t.start();
		System.out.println("End of main thread");
	}
}
