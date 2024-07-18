package com.rkjavahub.multithreading_concurrency.multithreading;

class MyThread19 extends Thread
{
	public void run()
	{
		try 
		{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am lazy Thread");
			Thread.sleep(5000);
		}
		}
		 catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class InterruptingThreadTest {

	public static void main(String[] args)
	{
		MyThread19 mt=new MyThread19();
		mt.start();
		mt.interrupt();
		System.out.println("I am main thread");

	}

}
