package com.atguigu.day17;

import java.util.Arrays;
import java.util.Comparator;

import com.atguigu.day17exer.Employee;
import com.atguigu.day17exer.Status;

/*
 * 	注解
 * 	长什么样？@注解名
 * 
 * 	注解是什么？
 * 	注解也是注释，这是代码级别的注释，用代码给代码注释
 * 
 * 	注解有三个部分？
 * 	（1）声明注解，定义注解
 * 		我们开发中，绝大多数都是别人定义好的。
 * 	（2）使用注解（重要）
 * 		我们开发中主要是这步
 * 	（3）读取注解的信息
 * 		我们把读取注解信息的代码称为“注解信息处理流程”，如果没有（3）前面两步都没有意义
 * 		读取注解的信息的代码基本也是别人写好的
 * 		读取注解信息的代码需要“反射”知识。
 * 
 * 	常见的注解：
 * 	一、系统预定义的三个最基本的注解
 * 	1、@Override
 * 	它是由JDK的核心库定义，读取它是由编译器，例如：javac.exe
 * 	作用：注释这个方法是一个“重写的方法”让编译器对这个方法签名进行格式检查，是否满足“重写”的要求。
 * 
 * 	重写的要求：
 * 	（1）方法名称和形参列表必须相同
 * 	（2）返回值类型：
 * 		基本数据类型和void：必须相同
 * 		引用数据类型：<=
 * 	（3）权限修饰符：>=
 * 
 * 	哪些方法不能重写：
 * 	（1）static
 * 	（2）final
 * 	（3）private
 * 
 * 	2、@SuppressWarnings(xxx)
 * 	它是由JDK的核心库定义，读取它是由编译器，例如：javac.exe
 * 	作用：抑制警告
 * 
 * 	3、@Deprecated
 * 	它是由JDK的核心库定义，读取它是由编译器，例如：javac.exe
 * 	作用：告知编译器和程序员这个方法、属性、类等已过时，不建议再使用，如果出了问题自己负责。
 */
public class TestAnnotation {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Employee[] all = new Employee[5];
		
		all[0] = new Employee(1, "张三", Status.FREE);
		all[1] = new Employee(2, "李四", Status.BUSY);
		all[2] = new Employee(3, "王五", Status.VOCATION);
		all[3] = new Employee(4, "赵六", Status.FREE);
		all[4] = new Employee(5, "钱七", Status.LEFT);
		
		Arrays.sort(all, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return 0;
			}
		});
		
		Father.method();
		
	}

}

class Father {
	public void print1n() {
		System.out.println("父类的打印方法");
	}

	public static void test() {
		System.out.println("父类的test");
	}
	
	@Deprecated
	public static void method() {
		System.out.println("xxx");
	}
}

class Son extends Father {

//	@Override
//	public void println() {
//		System.out.println("子类的打印方法");
//	}
	
//	@Override
//	public void print1n(String info) {
//		System.out.println("子类的打印方法");
//	}
	
//	@Override
//	public static void test() {
//		System.out.println("子类的test");
//	}

}