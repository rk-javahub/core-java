package com.rkjavahub.collectionframework.collection.set.sortedset;

import java.util.Comparator;
import java.util.TreeSet;
class myComparator3 implements Comparator
{
	public int compare(Object arg0, Object arg1)
	{
		String str1=arg0.toString();
		String str2=arg1.toString();
		int length1=str1.length();
		int length2=str2.length();
		if(length1<length2)
			return -1;
			else
		if(length1>length2)
		return +1;
		else 
		return str1.compareTo(str2);
		}
	}
public class TreesetComparatorString_StringBufferTest 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new myComparator3());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");		
		System.out.println(t);
	}
}
