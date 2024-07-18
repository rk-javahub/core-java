package com.rkjavahub.multithreading_concurrency.multithreading;

public class ThreadLocalDemo {

	public static void main(String[] args) 
	{
		ThreadLocal t1=new ThreadLocal()
				{
			      public Object initialValue()
			      {
			    	return "abc";  
			      }
				};
		System.out.println(t1.get());
		t1.set("Rohit");
		System.out.println(t1.get());
		t1.remove();
		System.out.println(t1.get());
	}
}
