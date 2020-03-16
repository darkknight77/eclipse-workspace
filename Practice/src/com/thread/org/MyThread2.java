package com.thread.org;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started........");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 mt=new MyThread2();
		Thread t1 = new Thread(mt);
		t1.start();
		
		
		
	}

	

}
