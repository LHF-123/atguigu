package com.atguigu.day24;

/*
 * 	二、实现java.lang.Runnable接口
 * 	1、步骤
 * 	（1）声明线程类，实现Runnable接口
* 	（2）重写,实现run()方法
 * 		public void run() {}
 * 	（3）创建线程对象
 * 	（4）启动线程
 * 		必须借用Thread类的对象，启动线程
 * 
 */
public class TestMyRunnable {
	
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
//		my.start();//错误的，因为Runnable中没有start方法
//		my.run();//错误的，这样就不是多线程了
		
		//只有Thread类中才有start方法，所以必须通过Thread类的对象才能启动线程
		Thread thread = new Thread(my);
		thread.start();
		
		Thread thread2 = new Thread(my);
		thread2.start();
		
		
		for (int i = 1; i < 100; i+=2) {
			System.out.println("main : 奇数：" + i);
		}
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 2; i <= 100; i+=2) {
			System.out.println("偶数：" + i);
		}
	}
	
}