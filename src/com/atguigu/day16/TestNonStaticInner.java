package com.atguigu.day16;

import com.atguigu.day16.Outer1.Inner1;

/*
 * 	一、静态内部类（非静态的）
 * 	1、如何声明？
 * 	【修饰符】 外部类 【extends 父类】【implements 父接口们】{
 * 	
 * 		【修饰符】 static class 内部类【extends 父类】【implements 父接口们】{
 * 
 * 		}
 * 	
 * 	}
 * 
 * 	说明：非静态内部类的修饰符
 * 	（1）权限修饰符4个
 * 	（2）static没有
 * 	（3）abstract可以有
 * 	（4）final可以有
 * 
 * 	2、成员
 * 	类的五大成员都可以，但是不允许有静态成员
 * 	（1）属性：非静态属性
 * 	（2）方法：非静态方法
 * 			在抽象的内部类中，还可以有抽象方法
 * 	（3）代码块：非静态
 * 	（4）构造器：无参、有参
 * 	（5）内部类：语法上可以，但是太复杂了，不这么写
 * 
 * 	3、使用
 * 	（1）在非静态内部类中允许使用外部类的非静态的成员
 * 	（2）在外部类中，使用非静态内部类有限制
 * 		在外部类的静态方法中不允许使用非静态的内部类
 * 	（3）在外部类的外面使用非静态内部类，声明变量和静态内部类的一样
 * 		Outer.Inner in;
 * 	（4）在外部类的外面要调用非静态内部类的非静态方法，需要外部类的对象和内部类的对象
 * 		例如：Outer1 outer1 = new Outer1();
 * 			Outer1.Inner1 inner1 = outer1.new Inner1();
 *			inner1.test();
 *	（5）在外部类的外面要调用静态内部类的静态方法，不需要静态内部类的对象
 *
 * 4、说明：
 * 	静态内部类也有自己的字节码文件
 * 	外部类$静态内部类.class
 */
public class TestNonStaticInner {
	
	public static void main(String[] args) {
//		Outer1.Inner1 in;
		
		//调用Inner的test()方法
		//（1）问？是否需要外部类Outer1的对象
		//答：要，因为Inner1是Outer1的非静态的成员
		Outer1 outer1 = new Outer1();
		//（2）问是否需要内部类Inner1的对象
		//答：要，因为test()是Inner的非静态
		Outer1.Inner1 inner1 = outer1.new Inner1();
		inner1.test();
		
		//因为“对象.new 内部类”太怪了，然后实际编写时，不这样写
		Outer1.Inner1 inner2 = outer1.getInner1();
		inner2.test();
		
		//如果想要简化Outer1.Inner1的写法
		//可以使用导包语句：import com.atguigu.day16.Outer1.Inner1;
		Inner1 inner3 = outer1.getInner1();
		inner3.test();
	}

}
class Outer1{
	private static int i;
	private int j;
	
	class Inner1{
		public void test() {
			System.out.println(i);
			System.out.println(j);
		}
	}
	
	//方法的作用：为外界提供内部类的对象
	public Inner1 getInner1() {
		Inner1 inner1 = new Inner1();
		return inner1;
	}
	
	//在外部类的静态方法中，不能使用非静态的内部类
//	public static Inner1 getInner2() {
//		Inner1 inner1 = new Inner1();
//		return inner1;
//	}
	
}
