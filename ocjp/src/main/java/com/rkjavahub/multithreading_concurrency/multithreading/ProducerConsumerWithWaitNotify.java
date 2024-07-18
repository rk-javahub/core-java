package com.rkjavahub.multithreading_concurrency.multithreading;

import java.util.LinkedList;
import java.util.List;

/**
 * Producer Class in java, Producer will allow consumer to consume only when 10
 * products have been produced (i.e. when production is over).
 */
class Producer implements Runnable {

	List<Integer> sharedQueue;

	Producer() {
		sharedQueue = new LinkedList<Integer>();
	}

	public void run() {
		// Producer will produce 10 products
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				sharedQueue.add(i);
				System.out.println("Producer is still produced " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			System.out.println("Production is over, consumer can consume");
			this.notify();
		}
	}
}

class Consumer extends Thread {
	Producer prod;

	Consumer(Producer prod) {
		this.prod = prod;
	}

	public void run() {
		/* Consumer will wait till producer is producing */
		synchronized (this.prod) {
			System.out.println("Consumer waiting for production to get over");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/* Production is over consumer starts consuming */
		int productSize = this.prod.sharedQueue.size();
		for (int i = 0; i < productSize; i++) {
			System.out.println("Consumed" + this.prod.sharedQueue.remove(0) + " ");
		}
	}
}

public class ProducerConsumerWithWaitNotify {
	public static void main(String[] args) {
		// Producer consumer problem solving using wait() and notify()
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);

		Thread prodThread = new Thread(producer, "ProdThread");
		Thread consumerThread = new Thread(consumer, "ConsThread");

		consumerThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prodThread.start();
	}
}
