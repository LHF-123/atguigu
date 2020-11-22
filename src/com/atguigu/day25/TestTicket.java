package com.atguigu.day25;

/*
 * 	卖票：同时两个窗口卖票
 * 
 * 	两个线程使用了共享的同一份数据，就有线程的安全问题。
 * 	如何判断？
 * 	（1）是否有多个线程使用同一份数据
 * 	（2）并且有多条语句来操作和访问这个共享数据
 * 
 * 	如何解决？加锁
 * 	同步：
 * 	（1）同步的锁对象可以是任意类型的对象
 * 	（2）使用共享数据的这些线程，使用（承认）同一个锁对象。
 * 
 * 	两种形式：
 * 	（1）同步代码块
 * 		语法格式：
 * 		synchronized(同步锁对象){
 * 			需要锁起来的代码：一个线程在运行这段代码期间，不想被别的线程半路插进来
 * 		}
 * 		和共享的数据相关的语句都要锁起来
 * 		
 * 	（2）同步方法
 * 		如果你的一次任务是在一个方法中完成的，那么可以直接锁一个方法。
 * 		
 * 		语法格式：
 * 		【修饰符】 synchronized 返回值类型 方法名 (【形参列表】)【throws 异常列表】{ }
 * 
 * 	同步方法的锁对象：
 * 	非静态方法：this		考量this是否可以做锁对象
 * 	静态方法：当前Class对象
 * 		每一次类型被加载到内存中后都会生成一个Class对象来表示这个类型，只要是同一种类型，Class对象就是同一个。
 * 	
 * 
 */
public class TestTicket {
	
	public static void main(String[] args) {
		TicketSaler t1 = new TicketSaler("窗口一");
		TicketSaler t2 = new TicketSaler("窗口二");
		
		t1.start();
		t2.start();
	}

}

class TicketSaler extends Thread{
	private static TicketService ts = new TicketService();
	
	public TicketSaler(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (true) {//是否结束循环
			if (ts.hasTicket()) {
				saleOneTicket();
			}else {
				break;
			}
		}

	}
	
	public synchronized static void saleOneTicket() {
	if (ts.hasTicket()) {//用于安全检查
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "卖出了：" + ts.sale());
	}
}
	
	//错误的，因为非静态方法的默认锁对象是this，继承这种方式，用this不行
//	public synchronized void saleOneTicket() {
//		if (ts.hasTicket()) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(getName() + "卖出了：" + ts.sale());
//		}
//	}
	
}

//class TicketSaler extends Thread{
//	private static TicketService ts = new TicketService();
//	
//	public TicketSaler(String name) {
//		super(name);
//	}
//
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (ts) {
//				if (ts.hasTicket()) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(getName() + "卖出了：" + ts.sale());
//				} else {
//					break;
//				}
//			}
//		}
//
//	}
//	
//}