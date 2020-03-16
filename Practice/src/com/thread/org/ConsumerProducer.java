package com.thread.org;

class A {

	int num;
	boolean valueSet = false;

	public synchronized void setNum(int num) {
		while (valueSet) {

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		this.num = num;
		System.out.println("Set :" + num);
		valueSet =true;
        notify();
	}

	public synchronized void getNum() {
		
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Get :" + num);
		System.out.println("--------------------");
		valueSet = false;
		notify();
		
	}
}

class Producer implements Runnable {

	A a;

	public Producer(A a) {
		this.a = a;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			a.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	A a;

	public Consumer(A a) {
		this.a = a;
		Thread t2 = new Thread(this, "Consumer");
		t2.start();
	}

	@Override
	public void run() {

		while (true) {
			a.getNum();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ConsumerProducer {

	public static void main(String[] args) {

		A a = new A();
		new Producer(a);
		new Consumer(a);

	}

}
