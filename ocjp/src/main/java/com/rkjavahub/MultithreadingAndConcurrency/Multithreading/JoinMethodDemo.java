package com.rkjavahub.MultithreadingAndConcurrency.Multithreading;

class Demo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}

public class JoinMethodDemo {

    public static void main(String[] args) throws InterruptedException {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        Thread t = new Thread(d1);
        System.out.println(t.getName());
        Thread t1 = new Thread(d2);
        System.out.println(t1.getName());
        t.start();
        t.join();
        t1.start();
        t1.join();
    }
}
