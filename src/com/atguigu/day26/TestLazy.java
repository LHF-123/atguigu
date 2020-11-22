package com.atguigu.day26;

/*
 * 	二、懒汉式
 */
//public class TestLazy {
//	
//	public static void main(String[] args) {
//		Lazy l1 = Lazy.getInstance();
//		Lazy l2 = Lazy.getInstance();
//		
//		System.out.println(l1 == l2);
//		System.out.println(l1);
//		System.out.println(l2);
//	}
//
//}

//public class TestLazy {
//	private static Lazy l1;
//	private static Lazy l2;
//	
//	public static void main(String[] args) {
//		
//		Thread t1 = new Thread() {
//			public void run() {
//				l1 = Lazy.getInstance();
//			}
//		};
//		
//		Thread t2 = new Thread() {
//			public void run() {
//				l2 = Lazy.getInstance();
//			}
//		};
//		
//		t1.start();
//		t2.start();
//		
//		//加这个代码的作用是，保证l1和l2都赋值完成之后再比较
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(l1);
//		System.out.println(l2);
//		System.out.println(l1 == l2);
//	}
//
//}

public class TestLazy {
	
	public static void main(String[] args) {
//		LazyDemo.test();
		
		LazyDemo instance = LazyDemo.getInstance();
	}

}

class Lazy {
	//（2）用一个静态的变量来保存这个唯一的实例
	private static Lazy instance;//这里不能new
	
	//(1)构造器私有化
	private Lazy() {
		
	}
	
	//对的
	//（3）当你获取这个对象的时候，再来创建
//	public synchronized static Lazy getInstance() {
//		if (instance == null) {
//			instance = new Lazy();
//		}
//		return instance;
//	}
	
	//（3）当你获取这个对象的时候，再来创建
	public static Lazy getInstance() {
		if (instance == null) {//外面这个条件的作用是为了提高效率	当对象已经创建过了，那么后面的线程，无论多少个，都没比必要等待锁
			synchronized (Lazy.class) {//Lazy.class获取当前类的Class对象
				if (instance == null) {//里面的条件是为了安全
					instance = new Lazy();
				}
			}
		}
		return instance;
	}
	
}
class LazyDemo {
	
	//(1)构造器私有化
	private LazyDemo() {
		
	}
		
	//内部类
	private static class Inner {
		//(2)用静态内部类的一个静态的常量来保存这个唯一的对象
		public static final LazyDemo INSTANCE = new LazyDemo();
		
		static {
			System.out.println("内部类的静态代码块");
		}
	}
	
	//当我们调用这个方法时，获取内部类对象，才会导致内部类的加载和初始化，才会导致INSTANCE对象创建，所以也属于懒汉式
	public static LazyDemo getInstance() {
		return Inner.INSTANCE;
	}
	
	//为了测试内部类是否被加载的方法
	public static void test() {
		System.out.println("外部类的静态方法");
	}
	
}
