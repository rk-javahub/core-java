package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class MyThread18 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) 
	{
		MyThread18 mt=new MyThread18();
		mt.start();
		mt.start();

	}

}
