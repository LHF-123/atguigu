package com.atguigu.day25;

/*
 * 	线程通信：
 * 	什么情况需要用到线程通信？
 * 
 * 	当遇到“生产者——消费者”问题时，需要用到线程通信。线程通信就是用wait和notify方法来完成的。
 * 
 * 	所谓的“生产者——消费者”问题是：
 * 		当一个（些）线程负责往“数据缓冲区”添加数据，
 * 		而另一个（些）线程只负责从“数据缓冲区”取数据。
 * 		当生产者慢了，那么会导致消费者半天没法从“数据缓冲区”取数据，
 * 		当消费者慢了，那么会导致“数据缓冲区”满了，我们生产者没法放了。
 * 
 * 	这个时候就需要线程通信，当“缓冲区”满的时候，生产者线程应该停下来(wait)，等消费者取走了，就可以重新唤醒/通知(notify)
 * 	生产者继续生产。反过来，当“缓冲区”空的时候消费者应该停下来(wait)，等生产者重新生产了，就可以重新唤醒/通知(notify)
 * 	消费者继续取数据。
 * 
 * 	“生产者——消费者”问题：
 * 	（1）因为生产者与消费者要同时操作“数据缓冲区”，那么“数据缓冲区”就是共享数据，这个时候就会有线程安全问题。
 * 			必须要同步
 * 	（2）因为“数据缓冲区”的大小是有限的，那么就需要通信就要用wait和notify/notifyAll方法
 * 
 * 		当如果用“非同步锁”对象调用是，一定会报IllegalMonitorStateException异常，“同步锁”对象又称为“监视器”对象。
 * 
 * 	例如：把厨师当做一个线程，服务员当做一个线程，然后把“出菜的窗口平台”当做“数据缓冲区”，
 * 		厨师往“平台”放菜，服务员从“平台”取菜。
 * 
 */
public class TestCommunicate {
	
	public static void main(String[] args) {
		Workbench w = new Workbench();//创建工作台
		
		//创建厨师线程和服务员线程
		Cook c = new Cook(w);
		Waiter wt = new Waiter(w);
		
		//启动线程
		c.start();
		wt.start();
				
	}

}
class Cook extends Thread {
	private Workbench w;
	
	//传入Workbench的对象的目的是为了厨师和服务员，不管多少个，用同一个工作台
	public Cook(Workbench w) {
		super();
		this.w = w;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			w.put();
		}
	}
	
}
class Waiter extends Thread {
	private Workbench w;
	
	//传入Workbench的对象的目的是为了厨师和服务员，不管多少个，用同一个工作台
	public Waiter(Workbench w) {
		super();
		this.w = w;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			w.take();
		}
	}
	
}
//工作台：出菜的窗口平台
class Workbench{
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
		}
		num--;
		System.out.println("服务员又取走了一份菜，剩余：" + num);
		this.notify();//通知在wait的线程，从阻塞状态回到就绪状态
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
		}
		num++;
		System.out.println("厨师又做好了一份菜，剩余：" + num);
		this.notify();//通知在wait的线程，从阻塞状态回到就绪状态
	}
	
}
