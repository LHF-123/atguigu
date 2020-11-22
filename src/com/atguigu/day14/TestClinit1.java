package com.atguigu.day14;

/*
 * 	这里就涉及到类的初始化<clinit>，由两部分：
 * 	（1）静态变量的显式初始化
 * 		i = getInt()
 * 	（2）静态代码块
 * 		System.out.println("静态代码块");
 * 
 * 	类的初始化只执行一次
 * 
 * 
 */
public class TestClinit1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
	}
}
class A{
	private static int i = getInt();
	
	static {
		System.out.println("静态代码块");
	}
	
	public static int getInt() {
		System.out.println("A类的getInt()方法");
		return 1;
	}
	
}