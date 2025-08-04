package com.thread;
class Second implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("This is Second Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class RunnableInterface {
public static void main(String[] args) throws InterruptedException {
	Second sc=new Second();
	Thread t1=new Thread(sc);
	t1.start();
	for (int i = 0; i <5; i++) {
		System.out.println("This is main Thread");
		Thread.sleep(2000);
	}
}
}
