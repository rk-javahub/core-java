package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

import static com.rkjavahub.MultithreadingAndConcurrency.Multithreading.VolatileKeywordDemo.flag;

class VolatileDemo{



}

public class VolatileKeywordDemo extends Thread {
    public static volatile boolean flag = false;
    public static void main(String[] args) {
        VolatileKeywordDemo demo1 = new VolatileKeywordDemo();
        VolatileKeywordDemo demo2 = new VolatileKeywordDemo();
        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo2);

        public void run() {

        }


        thread1.start();
        thread2.start();
    }
}
