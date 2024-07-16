package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

import static com.rkjavahub.MultithreadingAndConcurrency.Multithreading.VolatileKeywordDemo.flag;

class VolatileDemo{

// Yet to complete

}

public class VolatileKeywordDemo extends Thread {
    public static volatile boolean flag = false;
    public static void main(String[] args) {
        VolatileKeywordDemo demo1 = new VolatileKeywordDemo();
        VolatileKeywordDemo demo2 = new VolatileKeywordDemo();
        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo2);




        thread1.start();
        thread2.start();

     /*   public void run() {
            for (int i = 0; i < 1000; i++) {
                flag = true;
                System.out.println("Child Thread");
            }
        }*/
    }
}
