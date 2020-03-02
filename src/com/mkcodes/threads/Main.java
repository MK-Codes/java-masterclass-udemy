package com.mkcodes.threads;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main thread starting.");
		MyThread thread1 = new MyThread("Thread#01");
		MyThread thread2 = new MyThread("Thread#02");
		MyThread thread3 = new MyThread("Thread#03");
		MyThread thread4 = new MyThread("Thread#04");

		try {
			thread1.thread.join();
			System.out.println("Child #1 joined"); // wait until specified thread ends
			thread2.thread.join();
			System.out.println("Child #2 joined");
			thread3.thread.join();
			System.out.println("Child #3 joined");
			thread4.thread.join();
			System.out.println("Child #4 joined");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/*
		 * do { System.out.print("."); try { Thread.sleep(100); } catch
		 * (InterruptedException e) { System.out.print("Main thread interrupted");
		 * e.printStackTrace(); } } while (thread1.thread.isAlive() ||
		 * thread2.thread.isAlive() || thread3.thread.isAlive() ||
		 * thread4.thread.isAlive());
		 */

		/*
		 * for (int i = 0; i < 50; i++) { System.out.print("."); try {
		 * Thread.sleep(100); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block System.out.println("Main thread interrupted");
		 * e.printStackTrace(); } }
		 */

		System.out.print("Main thread ending");

//		Thread newThread = new Thread(thread);
//		newThread.start();
	}

}

class MyThread implements Runnable {

	Thread thread;
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
		thread = new Thread(this, myThread);
		thread.start();
		this.myThread = myThread;
	}

}