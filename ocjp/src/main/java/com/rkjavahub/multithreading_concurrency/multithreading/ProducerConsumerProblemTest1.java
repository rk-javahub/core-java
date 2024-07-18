package com.rkjavahub.multithreading_concurrency.multithreading;

import java.util.LinkedList;
import java.util.List;

class Producer1 implements Runnable {
	private List<Integer> sharedQueue;
	private int maxSize = 2; // Maximum number of products sharedQueue can hold at a time

	public Producer1(List<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {// Produce 10 products
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void produce(int i) throws InterruptedException {
		synchronized (sharedQueue) {
			// If sharedQueue is full, wait until consumer consumes elements from shared
			// queue
			if (sharedQueue.size() == maxSize) {
				System.out.println("Queue is full, producerThread is waiting for "
						+ "consumerThread to consume, sharedQueue's size= " + maxSize);
				sharedQueue.wait();
			}

		}
		/*
		 * 2 Synchronized blocks have been used means before producer produces by
		 * entering below synchronized block consumer can consume.
		 */

		// as soon as producer produces (by adding in sharedQueue) it notifies
		// consumerThread.

		synchronized (sharedQueue) {
			System.out.println("Produced : " + i);
			sharedQueue.add(i);
			Thread.sleep((long) (Math.random() * 1000));
			sharedQueue.notify();
		}
	}
}

class Consumer1 implements Runnable {
	private List<Integer> sharedQueue;

	public Consumer1(List<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {

		synchronized (sharedQueue) {
			// if sharedQuey is empty wait until producer produces.
			while (sharedQueue.size() == 0) {
				System.out.println("Queue is empty, consumerThread is waiting for "
						+ "producerThread to produce, sharedQueue's size= 0");
				sharedQueue.wait();
			}
		}

		/*
		 * 2 Synchronized blocks have been used means before consumer start consuming by
		 * entering below synchronized block producer can produce.
		 */

		/*
		 * If sharedQueue not empty consumer will consume (by removing from sharedQueue)
		 * and notify the producerThread.
		 */
		synchronized (sharedQueue) {
			Thread.sleep((long) (Math.random() * 2000));
			System.out.println("CONSUMED : " + sharedQueue.remove(0));
			sharedQueue.notify();
		}
	}
}

public class ProducerConsumerProblemTest1 {
	public static void main(String[] args) {
		List<Integer> sharedQueue = new LinkedList<Integer>();
		Producer1 producer = new Producer1(sharedQueue);
		Consumer1 consumer = new Consumer1(sharedQueue);

		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");
		producerThread.start();
		consumerThread.start();
	}
}
