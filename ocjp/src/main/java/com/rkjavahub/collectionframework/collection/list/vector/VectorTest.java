package com.rkjavahub.collectionframework.collection.list.vector;

import java.util.Vector;
public class VectorTest {
	public static void main(String[] args) 
	{
	  Vector v=new Vector();
	  v.addElement(10);
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	  
	  for(int i=0;i<10;i++)
	  {
		  v.addElement(i);
	  }
	  System.out.println(v.capacity());
	  v.addElement("A");
	  System.out.println(v.capacity());
	 System.out.println(v); 
	}
}
