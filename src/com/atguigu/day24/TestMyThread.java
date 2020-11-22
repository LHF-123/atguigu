package com.atguigu.day24;

/*
 * 	一、继承java.lang.Thread类
 * 	1、步骤：
 * 	（1）声明线程类，继承Thread类
 * 	（2）重写run()方法
 * 		public void run() {}
 * 
 * 	这个run()的方法体，就是线程体，就是当前要完成的任务代码。
 * 	（3）创建线程对象	
 * 	（4）启动线程
 * 		调用线程的start()方法
 * 
 */
public class TestMyThread {
	
	public static void main(String[] args) {
		//创建自定义线程对象
		MyThread my = new MyThread();
//		my.run();//不能手动调用run()，这个run()不是程序员调用的，线程调度器会自动调用
		my.start();
		
		for (int i = 1; i < 100; i+=2) {
			System.out.println("奇数：" + i);
		}
	}

}
class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 2; i <= 100; i+=2) {
			System.out.println("偶数：" + i);
		}
	}
	
}
