package com.atguigu.day14;

/*
 * 	调用D类的静态方法，先要初始化D类
 * 	类的初始化只需要一次
 * 	但是方法是调用一次，执行一次
 */
public class TestClinit3 {
	public static void main(String[] args) {
		D.test();
		D.test();
	}
}
class D{
	
	static {
		System.out.println("(1)静态代码块");
	}
	
	public static void test() {
		System.out.println("(2)静态方法");
	}
	
}