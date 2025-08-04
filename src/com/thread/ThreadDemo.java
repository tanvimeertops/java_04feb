package com.thread;
/*
 * Thread: it is a Process
 * single thread
 * multi thread
 * main is a thread
 * thread life cycle
 *  Newborn
	Runnable
	Running
	Blocked (Non-Runnable)
	Dead (Terminated)
 */
class First extends Thread{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("This is First Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
	First fs=new First();
	fs.start();
	
	for (int i = 0; i <5; i++) {
		System.out.println("This is main Thread");
		Thread.sleep(2000);
	}
}
}
