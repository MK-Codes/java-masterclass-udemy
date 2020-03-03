package com.mkcodes.threads;

public class SynchronisedMethods {

	public static void main(String[] args) {

		First first = new First();
		Second one = new Second(first, "welcome");
		Second two = new Second(first, "new");
		Second three = new Second(first, "programmer");
	}

}

class First {
	// synchronized keyword ensures objects that are accessed by multiple threads
	// are not accessing it at the same time, so mutable objects are not changed
	// unexpectedly
	synchronized void display(String msg) {
		System.out.println(" [ " + msg);
		try {
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
			e.printStackTrace();
		}
		System.out.println(" ] ");
	}
}

class Second extends Thread {
	String msg;
	First fobj;

	Second(First fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	@Override
	public void run() {
		fobj.display(msg);
	}
}