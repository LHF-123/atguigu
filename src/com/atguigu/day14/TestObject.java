package com.atguigu.day14;

/*
 * java.lang.Object：
 * 	类Object是类层次结构的根类。每个类都使用Object作为超类
 * 	所有对象（包括数组）都实现这个类的方法。
 * 	
 * Object是根父类，如何理解？
 * 	（一）从继承
 * 	（1）所以类都继承它
 * 		如果一个类没有显式声明他的父类，那么他的父类就是Object
 * 	（2）说明所有类，所有对象都拥有Object类中的方法
 * 	（3）每一个类的构造器，往上追踪都会调用到Object类中的无参构造
 * 		super();
 * 
 * 	（二）从多态
 * 	（1）Object的变量可以接收任意类型的对象
 * 	（2）Object的数组，可以存储任意类型的对象
 * 
 * 	数组也是引用数据类型，数组对象也拥有Object类的方法。
 * 
 */
public class TestObject {
	
	public TestObject() {
		// TODO Auto-generated constructor stub
		super();//调用的是Object的无参构造器
	}

	public static void main(String[] args) {
		TestObject tObject = new TestObject();
		
		Object obj = "hello";
		Object obj2 = new TestObject();
		
		Object[] arr = new Object[5];
		arr[0] = "hello";
		arr[1] = 12;
		arr[2] = new TestObject();
		
		int[] nums = new int[5];
		//nums是一个对象，类型是int[]
		
		
	}
	
	public static void test(Object obj) {
		
	}

}
