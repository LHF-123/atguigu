package com.atguigu.day25;

/*
 * 	了解，什么情况会出现死锁？
 * 
 * 	当两个线程互相持有对象想要的锁，不放手，就会出现死锁
 * 
 * 	结论：
 * 		尽量避免嵌套同步
 * 
 */
public class TestDeadLock {

	public static void main(String[] args) {
		Object girl = new Object();
		Object money = new Object();
		
		Boy boy = new Boy(girl, money);
		Bang bang = new Bang(girl, money);
		
		boy.start();
		bang.start();
	}

}
class Boy extends Thread {
	private Object girl;
	private Object money;
	
	public Boy(Object girl, Object money) {
		super();
		this.girl = girl;
		this.money = money;
	}

	@Override
	public void run() {
		synchronized (money) {
			System.out.println("你放了我女朋友，我给你钱");
			synchronized (girl) {
				System.out.println("给绑匪500万");
			}
		}
	}
	
}
class Bang extends Thread {
	private Object girl;
	private Object money;
	
	public Bang(Object girl, Object money) {
		super();
		this.girl = girl;
		this.money = money;
	}

	@Override
	public void run() {
		synchronized (girl) {
			System.out.println("你给我500万，我放了她");
			synchronized (money) {
				System.out.println("放人");
			}
		}
	}
	
}
