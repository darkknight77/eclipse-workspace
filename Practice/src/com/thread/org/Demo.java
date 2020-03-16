package com.thread.org;

public class Demo {

	public static int count = 0;
	public static  void getCount() {
		synchronized(Demo.class) { 
		count++;
		}
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t1 running");
				try {
					System.out.println("T1 sleeping");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 10000; i++) {
					getCount();
				}
				System.out.println("t1 sleep completed");
				System.out.println("t1 count++ : "+  count);
			}
		});
	
	Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t2 running");
				for (int i = 0; i < 10000; i++) {
					getCount();
				}	
				System.out.println("t2 count++ : "+  count);
			}
		});
	t1.start();
	
	try {
		System.out.println("t1 join start");
		t1.join();
		System.out.println("t1 join end");
		System.out.println("t2 join start");
		
		t2.start();
		t2.join();
		System.out.println("t2 join end");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(count);	
		
	}

}
