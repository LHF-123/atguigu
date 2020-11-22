package com.atguigu.day16;

/*
 * 	默认方法的冲突问题
 * 1、当一个类实现了两个接口，这两个接口有方法签名相同的默认方法
 * 		方法签名：修饰符  返回值类型  方法名(形参列表)
 * 
 * 	如何解决？
 * 	（1）保留其中一个接口的默认实现
 * 		接口名.super.默认方法(..);
 * 	（2）完全重写
 * 
 * 2、当一个类继承父类，又实现这个接口，这个类中有与接口的默认方法的方法签名相同方法时
 * 	（1）默认保留的是父类的
 * 	（2）可以选择保留接口的默认实现
 * 		接口名.super.默认方法(..);
 * 	（3）完全重写
 * 
 */
public class TestDefaultMethod {

	public static void main(String[] args) {
		Person person = new Person();
		person.run();
		
		Sub sub = new Sub();
		sub.run();
				
		
	}

}
interface Runnable{
	public default void run() {
		System.out.println("Runnable的默认方法");
	}
}
interface Walkable{
	public default void run() {
		System.out.println("Walkable的默认方法");
	}
}
class Person implements Runnable, Walkable{
	
	//保留Runnable接口中的默认方法
//	@Override
//	public void run() {
//		Runnable.super.run();
//	}
	
	//保留Walkable接口中的默认方法
//	@Override
//	public void run() {
//		Walkable.super.run();
//	}
	
	//完全重写
//	@Override
//	public void run() {
//		System.out.println("找第三个");
//	}
	
	//逻辑上不同，语法上可以
	@Override
	public void run() {
		Runnable.super.run();
		Walkable.super.run();
	}
	
}
class Father{
	public void run() {
		System.out.println("Father类中的run()");
	}
}
class Sub extends Father implements Runnable{
	//默认保留的是父类的
}
class Daughter extends Father implements Runnable{
	//手动选择保留接口的默认实现
//	public void run() {
//		Runnable.super.run();
//	}
	
	public void run() {
		System.out.println("完全重写");
	}
	
}