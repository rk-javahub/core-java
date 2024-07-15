package com.rkjavahub.CollectionFramework.collection.queue;
import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator
{

	public int compare(Object arg0, Object arg1)
	{
		String str1=arg0.toString();
		String str2=arg1.toString();
		return str2.compareTo(str1);
	}
	
}
public class PriorityQueueCustomizedPriorityDemo 
{
	public static void main(String[] args) 
	{
		PriorityQueue q=new PriorityQueue(15,new MyComparator());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
	}

}
