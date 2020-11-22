package com.atguigu.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/*
 * 	异常的父类：java.lang.Throwable
 * 	 Throwable类是Java语言中所有错误或异常的超类。
 * 
 * 	Throwable:
 * 	（1）Error:Error是Throwable的子类，用于指示合理的应用程序不应该试图捕获的严重问题
 * 		例如：VirtualMachineError
 * 	（2）Exception
 * 		又分为两大类：
 * 		A：RuntimeException运行时异常（非受检异常）：只有RuntimeException类型或它的子类是属于运行时异常
 * 			凡是运行时异常，编译器不会要求你添加"try...catch"或"throws"
 * 
 * 			常见的运行时异常：ArrayIndexOutOfBoundsException（数组下标越界） 
 * 							NullPointerException（空指针异常）
 * 							ClassCastException（类型转换异常）
 * 							ArithmeticException（算数异常）
 * 	
 * 
 * 		B：编译时异常（受检异常）：除了运行时异常，剩下的全部是编译时异常
 * 			凡是编译时异常，编译器强制要求你添加"try...catch"或"throws"之一，否则编译不通过
 * 
 * 		常见的编译时异常：
 * 			InterruptedException：线程中断打扰异常
 * 			FileNotFoundException：文件找不到
 * 			...
 * 
 * 	
 * 
 * 	面试题：
 * 	1、编写代码，使得发生VirtualMachineError（OutOfMemoryError、StackOverflowError）
 * 	StackOverflowError示例：
 * 	OutOfMemoryError示例：
 * 
 * 	2、列出你开发中常见的异常类型（至少5个以上）
 * 		或
 * 		列出几种运行时异常
 * 		或
 * 		列出几种编译时异常
 * 
 */
public class TestExceptionType {
	
	@Test
	public void testFileNotFoundException() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
	}
	
//	@Test
//	public void testInterruptedException() throws InterruptedException{
//		Thread.sleep(1000);
//	}
	
	@Test
	public void testRuntimeException() {
		int[] arr = new int[5];
//		System.out.println(arr[6]);//ArrayIndexOutOfBoundsException
		
		String str = null;
//		System.out.println(str.length());//NullPointerException
		
		System.out.println(1/0);//ArithmeticException
	}
	
	@Test
	public void testOutOfMemoryError() {
		Object[] arr = new Object[Integer.MAX_VALUE];//Integer.MAX_VALUE整数的最大值
		System.out.println(arr.length);
	}
	
	@Test
	public void testStackOverflowError() {
		testStackOverflowError();
	}

}
