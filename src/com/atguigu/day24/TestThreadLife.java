package com.atguigu.day24;

/*
 * 	二、线程的生命周期
 * 	1、出生（新建）
 * 		当你new了一个线程对象时，他就出生了。此时线程对象和普通的Java对象没什么区别。
 * 
 * 	2、就绪
 * 		当线程启动(start)后，线程就会从出生状态到就绪状态。
 * 		比喻：被招入宫中，可能被“宠幸”		CPU就是皇上
 * 
 * 	每一个线程对象都只能start一次
 * 
 * 	就绪状态即为CPU可以调用状态。或者说等着被调度的状态
 * 
 * 	3、运行
 * 		正在被调度的状态，比喻，正在被“宠幸”的状态
 * 		这个状态时间非常短暂，时间一到，线程就回到了就绪状态，等着下次被翻牌。
 * 
 * 	运行状态中的线程有三个去向：
 * 	（1）回到就绪
 * 		A：时间一到，线程回到就绪状态（正常情况）
 * 		B：遇到yield()（暂停当前线程） 让出本次CPU资源，重新加入下次的抢夺大队
 * 	（2）死亡
 * 		A：异常还未处理
 * 		B：run()事情结束了，正常结束
 * 	（3）阻塞（冷宫）
 * 		A：遇到一些耗时的操作，例如：键盘输入等，网络连接等
 * 		B：遇到sleep()
 * 		C：遇到wait()等
 * 		D：遇到join()（加塞）
 * 		E：等待锁
 * 
 * 	4、阻塞
 * 		A：遇到一些耗时的操作，例如：键盘输入等，网络连接等		-->耗时的操作准备好了
 * 		B：遇到sleep()										-->醒了
 * 		C：遇到wait()等										-->导致wait的条件排除了
 * 		D：遇到join()（加塞）									-->加到你前面的线程结束了
 * 		E：等待锁
 * 
 * 	5、死亡											-->占着锁的线程，释放了锁
 * 	一旦死亡就彻底结束了。
 * 
 */
public class TestThreadLife {
	
	public static void main(String[] args) {
		ThreadDemo1 t = new ThreadDemo1();
		t.start();
//		t.start();//不能调用两次
	}

}
class ThreadDemo1 extends Thread{

	@Override
	public void run() {
		System.out.println("...");
	}
	
}
