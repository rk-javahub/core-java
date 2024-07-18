package com.rkjavahub.multithreading_concurrency.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



class Mycallable implements Callable					
{
 int num;
 Mycallable(int num)
 {
	 this.num=num;
 }
public Object call() throws Exception 
{
	System.out.println(Thread.currentThread().getName()+" is responsible to calculate sum of first "+num);
	int sum=num*(num+1)/2;
	return sum;
}
}

public class CallableTest {

	public static void main(String[] args) throws Exception 
	{
		Mycallable[] job={new Mycallable(10),new Mycallable(20),new Mycallable(30),new Mycallable(40),new Mycallable(50)};
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(Mycallable job1:job)
		{
			Future f=service.submit(job1);	
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
