package com.atguigu.day14;

/*
 * 	类的成员：（1）属性（2）方法（3）构造器
 * 
 * 	类的第四成员：代码块
 * 
 * 	作用：为属性初始化
 * 
 * 	1、语法格式：
 * 	【修饰符】 class 类名 【extends 父类】{
 * 
 * 		{
 * 			非静态代码块
 * 		}
 * 
 * 	}
 * 
 * 	2、执行的特点：
 * 	（1）在创建对象时自动执行，每创建一个对象就执行一次
 * 		如果有多个非静态代码块，按顺序依次执行
 * 	（2）先于构造器执行
 * 	（3）非静态代码块与属性的显式赋值他俩谁在上面谁先执行
 * 	（4）如果创建子类的对象，会先执行父类的“非静态代码块、父类的属性的显示赋值、父类的构造器”
 * 
 * 	3、实例初始化方法
 * 	（1）.java代码编译为.class时，会把代码重新组装，如果类中有n个构造器，就会重新组装为n个实例初始化方法。
 * 		无参构造  --->  <init>()
 * 		有参构造  --->  <init>(形参列表)
 * 	
 * 	（2）实例初始化方法由三部分代码组成
 * 		（A）属性的显式赋值语句
 * 		（B）非静态代码块的语句
 * 		（C）构造器的语句
 * 		其中（A）（B）是按顺序组装，但是（C）无论位置在哪里，都在最后
 * 
 * 	（3）创建子类对象时，会先调用父类的实力初始化方法
 * 
 * 
 */
public class TestNonStaticBlock {
	public static void main(String[] args) {
		Son son = new Son();//调用构造器，创建对象
		System.out.println(son.getNum());
	}
}

class Father{
	
	public Father() {
		System.out.println("父类的无参构造");
	}
	

	{
		System.out.println("父类的非静态代码块1");
	}
	
	{
		System.out.println("父类的非静态代码块2");
	}
	
	private int i = getNumberI();//为i属性赋值
	
	private int getNumberI() {
		System.out.println("父类的getNumberI()");
		return 1;
	}

	public int getI() {
		return i;
	}
}

class Son extends Father{
	

	
	public Son() {
		System.out.println("无参构造");
		num = 3;
	}
	

	{
		System.out.println("非静态代码块1");
		num = 2;
	}
	
	{
		System.out.println("非静态代码块2");
	}
	
	private int num = getNumber();//为num属性赋值
	
	private int getNumber() {
		System.out.println("getNumber()");
		return 1;
	}

	public int getNum() {
		return num;
	}
	
	
	
}
