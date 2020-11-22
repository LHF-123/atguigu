package com.atguigu.day25;

/*
 * 	一、线程的概念
 * 	线程是进程的其中一条执行路径，有的时候也称为轻量级进程。
 * 	线程是CPU调度的最小单位，进程是操作系统分配资源的最小单位。
 * 	同一个进程的多个线程存在共享的内存，比如：堆、方法区是共享的，而栈（虚拟机栈、本地方法栈）、程序计数器。
 * 
 * 	二、线程的生命周期	
 * 	1、新建
 * 	2、就绪（从新建到就绪，用start）
 * 		可以被调度
 * 	3、运行（正在被调度）
 * 	4、阻塞
 * 	5、死亡
 * 
 * 	三、Thread的一些方法
 * 	1、构造器
 * 	Thread()
 * 	Thread(Runnable)
 * 	Thread(Runnable, name)
 * 
 * 	2、方法
 * 	get/setName()
 * 	get/setPriority()：优先级范围是[1, 10]
 * 	Thread.currentThread()
 * 	Thread.sleep()
 * 	Thread.yield()
 * 	join()
 * 
 * 	四、两种启动线程的方法
 * 	1、继承Thread类
 * 	（1）extends Thread类
 * 	（2）重写run()
 * 	（3）创建自定义线程类对象
 * 	（4）调用start()
 * 	2、实现Runnable接口
 * 	（1）implements Runnable
 * 	（2）重写Run()
 * 	（3）创建自定义线程类对象
 * 	（4）借助Thread类对象调用start()
 * 
 */
public class TestThread {

}
