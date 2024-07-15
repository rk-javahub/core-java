package com.rkjavahub.CollectionFramework.collection.set.sortedset;

import java.util.Comparator;
import java.util.TreeSet;
class myComparator4 implements Comparator
{
	public int compare(Object arg0, Object arg1)
	{
		String str1=arg0.toString();
		String str2=arg1.toString();
		return str1.compareTo(str2);
		//return -str1.compareTo(str2);	
		}
	}
public class TreesetComparatorStringBufferTest 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new myComparator4());
		t.add(new StringBuffer("Rohit"));
		t.add(new StringBuffer("Sachin"));
		t.add(new StringBuffer("Pramod"));
		t.add(new StringBuffer("Santosh"));
		t.add(new StringBuffer("Rahul"));
		t.add(new StringBuffer("Rohan"));		
		System.out.println(t);
	}
}
