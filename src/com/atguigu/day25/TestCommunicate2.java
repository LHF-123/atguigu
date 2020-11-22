package com.atguigu.day25;

/*
 * 	厨师和服务员都是多个
 * 
 * 	要点：
 * 	（1）notify和notifyAll()
 * 	（2）被notify唤醒后，要确保重写判断条件
 * 	
 * 	第一种：
 * 		while(条件){
 * 			xx.wait();
 * 		}
 * 		业务代码
 * 
 * 	第二种：
 * 		if(条件){
 * 			xx.wait();
 * 		}else{
 * 			业务代码
 * 		}
 * 
 * 	wait和notify方法都在Object类中声明，为什么？
 * 	因为我们要用“同步锁”对象，而“同步锁”对象可以是任意类型的。
 * 
 * 	notify：唤醒在此对象监视器上等待的单个线程，如果所有线程都在此对象上等待，则会选择唤醒其中一个线程。
 * 	notifyAll()：唤醒在此对象监视器上等待的所有线程
 * 
 */
public class TestCommunicate2 {

	public static void main(String[] args) {
		Workbench2 w = new Workbench2();//创建工作台
		
		//创建厨师线程和服务员线程
		Cook2 c1 = new Cook2(w);
		Cook2 c2 = new Cook2(w);
		Waiter2 wt1 = new Waiter2(w);
		Waiter2 wt2 = new Waiter2(w);
		Waiter2 wt3 = new Waiter2(w);
		
		//启动线程
		c1.start();
		c2.start();
		wt1.start();
		wt2.start();
//		wt3.start();
	}

}
class Cook2 extends Thread {
	private Workbench2 w;
	
	//传入Workbench的对象的目的是为了厨师和服务员，不管多少个，用同一个工作台
	public Cook2(Workbench2 w) {
		super();
		this.w = w;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			w.put();
		}
	}
	
}
class Waiter2 extends Thread {
	private Workbench2 w;
	
	//传入Workbench的对象的目的是为了厨师和服务员，不管多少个，用同一个工作台
	public Waiter2(Workbench2 w) {
		super();
		this.w = w;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			w.take();
		}
	}
	
}
//工作台：出菜的窗口平台

class Workbench2{
	private static final int MAX_VALUE = 10;//工作台最大容量
	private int num;//工作台上菜的数量
	
	//取走一份
	//非静态方法，锁对象都是this
	public synchronized void take() {
		if (num <= 0) {
//			return;//可以
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			num--;
			System.out.println("服务员又取走了一份菜，剩余：" + num);
			this.notifyAll();//通知在wait的线程，从阻塞状态回到就绪状态
		}
		
	}
	
	//放上一份
	//非静态方法，锁对象都是this
	public synchronized void put() {
		if (num >= MAX_VALUE) {
//			return;//可以
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			num++;
			System.out.println("厨师又做好了一份菜，剩余：" + num);
			this.notifyAll();//通知在wait的线程，从阻塞状态回到就绪状态
		}
		
	}
	
}

//class Workbench2{
//	private static final int MAX_VALUE = 10;//工作台最大容量
//	private int num;//工作台上菜的数量
//	
//	//取走一份
//	//非静态方法，锁对象都是this
//	public synchronized void take() {
//		while (num <= 0) {
////			return;//可以
//			
//			try {
//				this.wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		num--;
//		System.out.println("服务员又取走了一份菜，剩余：" + num);
//		this.notifyAll();//通知在wait的线程，从阻塞状态回到就绪状态
//	}
//	
//	//放上一份
//	//非静态方法，锁对象都是this
//	public synchronized void put() {
//		while (num >= MAX_VALUE) {
////			return;//可以
//			
//			try {
//				this.wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		num++;
//		System.out.println("厨师又做好了一份菜，剩余：" + num);
//		this.notifyAll();//通知在wait的线程，从阻塞状态回到就绪状态
//	}
//	
//}