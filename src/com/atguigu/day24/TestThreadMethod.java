package com.atguigu.day24;

import org.junit.Test;

/*
 * 	线程类Thread类，有很多方法
 * 	（1）构造器
 * 		Thread()
 * 		Thread(Runnable target)
 * 		Thread(Runnable target, String name)
 * 
 * 	2、方法
 * 	（1）getName()/setName
 * 		默认线程名称：Thread-0，Thread-1
 * 	（2）获取当前线程对象
 * 		Thread.currentThread()
 * 	（3）设置或获取线程的优先级
 * 		setPriority(int newPriority)
 * 		getPriority
 * 
 * 	Java线程优先级一共有10个等级：1~10
 * 	Thread类中预定义了三级基本的优先级：
 * 	MIN_PRIORITY：1
 * 	NORM_PRIORITY：5
 * 	MAX_PRIORITY：10
 * 		java.lang.IllegalArgumentException：如果优先级不在MIN_PRIORITY和MAX_PRIORITY范围内
 * 
 * 	优先级高和低，影响了被调用的概率，但是不代表低优先级就完全没有机会。
 * 		
 * 	（4）sleep(xx)
 * 	
 * 	面试题：如何获取第二天的时间（笑话）
 * 		Thread.sleep(24 * 60 * 60 * 1000);
 * 		Date date = new Date();
 * 
 * 	（5）join()
 * 
 * 	（6）yield()暂停当前线程，让出本次CPU的资源
 * 
 * 	其中三个是静态方法：
 * 		Thread.currentThread()
 * 		Thread.sleep()
 * 		Thread.yield()
 * 		
 */
public class TestThreadMethod {
	
	@Test
	public void test4() {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		
		for (int i = 1; i <= 1000; i++) {
			if (i == 5) {
				Thread.yield();
			}
			System.out.println("main: i " + i);
		}
	}
	
	@Test
	public void test3() {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		
		for (int i = 1; i <= 10; i++) {
			try {
				if (i == 5) {
					t1.join();//main线程被t1线程给加塞了，阻塞了，只有等到他t1线程结束，才轮到main线程
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main: i " + i);
		}
	}
	
	@Test
	public void test2() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);//毫秒 1000毫秒 = 1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i = " + i);
		}
	}
	
	@Test
	public void test1() {
		ThreadDemo t = new ThreadDemo();
//		t.setPriority(100);
		t.start();
		
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
class ThreadDemo extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName() + ":" + i);
		}
	}
	
}
class RunnableDemo implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
}
