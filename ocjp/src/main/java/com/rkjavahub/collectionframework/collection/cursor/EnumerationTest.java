package com.rkjavahub.collectionframework.collection.cursor;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String[] args) 
	{
		 Vector v=new Vector();
		  for(int i=0;i<=10;i++)
		  {
			  v.addElement(i);
		  }
		  System.out.println(v);
		  Enumeration e=v.elements();
          while(e.hasMoreElements())
          {
        	int i=(Integer)e.nextElement();
        	if(i%2==0)
        	{
        	   System.out.print(i);
        	}
          }
          System.out.println();
		  System.out.println(v);
	}
}
