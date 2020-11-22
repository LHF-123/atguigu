package com.atguigu.day25;

/*
 * 	继承Thread类和实现Runnable接口方式的区别：
 * 	（1）共享数据
 * 		Thread需要用静态
 * 		Runnable不需要静态，只要用同一个MyRunnable的对象就可以
 * 
 * 	（2）选择锁对象，比较方便
 * 		Runnable可以直接用this对象，继承Thread的方式不能用this。
 * 
 * 	（3）继承有单继承限制，实现没有限制
 * 
 */
public class TestRunnableTicket {
	
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		
		Thread t1 = new Thread(my, "窗口一");
		Thread t2 = new Thread(my, "窗口二");
		
		t1.start();
		t2.start();
	}

}

class MyRunnable implements Runnable{
	private TicketService ts = new TicketService();

	@Override
	public void run() {
		while (ts.hasTicket()) {
			saleOneTicket();
		}
	}
	
	//非静态方法，锁对象是this
	public synchronized void saleOneTicket() {
		if (ts.hasTicket()) {
			try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName() + "卖出了：" + ts.sale());
		}
	}
	
}

//class MyRunnable implements Runnable{
//	private TicketService ts = new TicketService();
//
//	@Override
//	public void run() {
//		while (true) {
////			synchronized (ts) {
//			synchronized (this) {//可以用this，因为this是my的对象，而t1，t2线程都使用my对象
//				if (ts.hasTicket()) {
//					try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					System.out.println(Thread.currentThread().getName() + "卖出了：" + ts.sale());
//				}else {
//					break;
//				}
//			}
//			
//		}
//	}
//	
//}
