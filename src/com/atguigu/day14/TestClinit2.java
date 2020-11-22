package com.atguigu.day14;

/*
 * 	1、这里就涉及到类的初始化<clinit>，由两部分：
 * 	（1）静态变量的显式初始化
 * 		i = getInt()
 * 	（2）静态代码块
 * 		System.out.println("静态代码块");
 * 
 * 	2、类的初始化只执行一次
 * 
 * 	3、子类初始化时，如果父类没有初始化，先初始化父类，就是执行父类的<clinit>
 * 
 * 
 */
public class TestClinit2 {
	public static void main(String[] args) {
		SubB s1 = new SubB();
		SubB s2 = new SubB();
	}
}
class B{
	private static int i = getInt();
	
	static {
		System.out.println("B类的静态代码块");
	}
	
	public static int getInt() {
		System.out.println("B类的getInt()方法");
		return 1;
	}
	
}
class SubB extends B{
	
	private static int i = getIntValue();
	
	static {
		System.out.println("SubB类的静态代码块");
	}
	
	public static int getIntValue() {
		System.out.println("SubB类的getIntValue()方法");
		return 1;
	}
}