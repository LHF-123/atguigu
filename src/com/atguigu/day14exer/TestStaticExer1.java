package com.atguigu.day14exer;

/*
 * 	initialize:初始化
 * 	class initialize:类的初始化
 * 	1、类的初始化<clinit>()
 * 	（1）类的初始化由两部分组成
 * 		A：静态变量的显式初始化（本题不涉及）
 * 		B：静态代码块
 * 	（2）子类的初始化过程中，发现父类没有初始化的话，会先初始化父类，也就再执行父类的<clinit>
 * 
 * 	2、实例的初始化<init>()
 * 	（1）实例的初始化<init>()由三个部分组成
 * 		A：非静态变量的显式初始化（本题不涉及）
 * 		B：非静态代码块
 * 		C：构造器
 * 	（2）在子类的实力初始化时，会先执行父类的实例初始化方法<init>
 * 
 * 	运行结果
 * 	（1）（4）（2）（3）（5）（6）
 * 
 * 	父类Father的实例初始化代码：
 * 	System.out.println("(2)父类的构造器");
 * 	System.out.println("(3)父类的无参构造");
 * 	子类Son的实例初始化代码：
 * 	System.out.println("(5)子类的构造器");
 * 	System.out.println("(6)子类的无参构造");
 * 
 * 
 */
public class TestStaticExer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son();
	}

}
class Father{
	static {
		System.out.println("(1)父类的静态代码块");
	}
	{
		System.out.println("(2)父类的构造器");//ps(postscript)补充：我觉得这是个代码块，而不是构造器
	}
	public Father() {
		System.out.println("(3)父类的无参构造");
	}
}
class Son extends Father{
	static {
		System.out.println("(4)子类的静态代码块");
	}
	{
		System.out.println("(5)子类的构造器");//ps(postscript)补充：我觉得这是个代码块，而不是构造器
	}
	public Son() {
		System.out.println("(6)子类的无参构造");
	}
}
