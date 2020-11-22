package com.atguigu.day25;

/*
 * 	创建两个线程，一个打印奇数，一个打印偶数，保证偶数和奇数交替打印
 */
public class TestHomework1 {
	
	public static void main(String[] args) {
		PrintOdd p1 = new PrintOdd("奇数：----");
		PrintEven p2 = new PrintEven("偶数：");
		
		p1.start(); 
		p2.start(); 
	}

}
class PrintOdd extends Thread {

	
	public PrintOdd(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (true) {
			PrintNumber.odd();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class PrintEven extends Thread {

	
	public PrintEven(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while (true) {
			PrintNumber.even();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class PrintNumber{
	private static int num;
	private static Object lock = new Object();
	
	public static void odd() {
		synchronized (lock) {
			if (num % 2 == 0) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println(Thread.currentThread().getName() + ":" + num);
				num++;
				lock.notify();
			}
		}
		
	}
	
	public static void even() {
		synchronized (lock) {
			if (num % 2 != 0) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println(Thread.currentThread().getName() + ":" + num);
				num++;
				lock.notify();
			}
		}
	}
	
}
