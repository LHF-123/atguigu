package com.atguigu.day15exer1;

/*
 * 	一、接口作业1：
 * 	1、声明一个接口Runnable接口，里面有void run()方法
 * 	2、声明一个Person类，实现Runnable接口，实现run()方法，打印“走路...”
 * 	3、声明一个Car类，实现Runnable接口，实现run()方法，打印“开车...”
 * 	4、声明一个Dog类，实现Runnable接口，实现run()方法，打印“乱窜...”
 * 	5、在测试类中声明一个Runnable数组，长度为5，里面存储各种实现类的对象
 *	遍历数组，调用元素的run()方法
 * 
 */
public class TestRunnable {
	
	public static void main(String[] args) {
		Runnable[] arr = new Runnable[5];
		arr[0] = new Person();
		arr[1] = new Car();
		arr[2] = new Dog();
		arr[3] = new Car();
		arr[4] = new Person();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].run();
		}
		
	}

}
