package com.rkjavahub.multithreading_concurrency.Multithreading;
class Parent extends Thread
{
	static InheritableThreadLocal itl=new InheritableThreadLocal()
{
	public Object childValue(Object p)
	{
		return "Child";
	}
};

   public void run()
   {
	   itl.set("Parent");
	   System.out.println("Parent thread value "+itl.get());
	   Child c=new Child();
	   c.start();
   }
}

class Child extends Thread
{
	public void run()
	{
		System.out.println("Child thread value "+Parent.itl.get());
	}
}

public class InheritableThreadLocalTest 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.start();
	}
}
