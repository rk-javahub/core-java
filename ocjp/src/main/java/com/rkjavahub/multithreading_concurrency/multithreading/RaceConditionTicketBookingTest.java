package com.rkjavahub.multithreading_concurrency.multithreading;

/* HERE RACE CONDITION OCCURS AND SINGLE TICKET IS BOOKED BY BOTHE THREADS */

class TicketBooking implements Runnable {
    public int ticketAvailable = 1;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        // Add synchronized block to handle race condition
        // synchronized (this)

        while (ticketAvailable > 0) {
            try {
                Thread.sleep(1000);
                System.out.println("Ticket booked by " + Thread.currentThread().getName());
                ticketAvailable--;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(ticketAvailable);
        }
    }
}

public class RaceConditionTicketBookingTest {
    public static void main(String[] args) {
        TicketBooking tb1 = new TicketBooking();
        Thread t = new Thread(tb1);
        Thread t1 = new Thread(tb1);
        t.start();
        t1.start();
    }
}
