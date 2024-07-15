	package com.rkjavahub.collectionframework.collection.map.abstractmap;
	
	import java.util.WeakHashMap;
	
	class Temp
	{
		public String toString()
		{
			return "temp";
		}
		protected void finalize()
		{
			System.out.println("Finalize called");
		}
	
	}
	public class WeakHashMap_Demo 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			WeakHashMap wm=new WeakHashMap();
			Temp t=new Temp();
			wm.put(t, "Rohit");
			System.out.println(wm); 
			t=null;
			Thread.sleep(3000);
			System.gc();
			System.out.println(wm);
		}
	}
