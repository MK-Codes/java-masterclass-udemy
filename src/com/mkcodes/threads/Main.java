package com.mkcodes.threads;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main thread starting.");
		MyThread thread = new MyThread("Thread#01");

		Thread newThread = new Thread(thread);
		newThread.start();
	}

}

class MyThread implements Runnable {

	String myThread;

	@Override
	public void run() {

		System.out.println(myThread + " starting.");

		for (int count = 0; count < 10; count++) {
			try {
				Thread.sleep(400);
				System.out.println("In " + myThread + ", count is " + count + ".");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(myThread + " interrupted.");
				e.printStackTrace();
			}
		}
		System.out.println(myThread + " terminated.");
	}

	public MyThread(String myThread) {
		this.myThread = myThread;
	}

}