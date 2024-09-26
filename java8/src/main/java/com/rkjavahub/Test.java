package com.rkjavahub;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Child thread");
            }
        };

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
            Thread.sleep(1000);
            r.run();
        }

    }

}
