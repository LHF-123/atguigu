package com.atguigu.day18;

/*
 * 	异常的处理：try...catch
 * 	1、语法结构
 * 	try{
 * 		可能发生异常的代码
 * 	}catch(异常的类型1  异常名称){
 * 		捕获到该异常，要如何处理的代码：（1）什么也不写（2）打印异常（3）其它的处理方式
 * 	}catch(异常的类型2  异常名称){
 * 		捕获到该异常，要如何处理的代码
 * 	}catch(异常的类型3  异常名称){
 * 		捕获到该异常，要如何处理的代码
 * 	}
 * 	......
 * 
 * 	finally{
 * 		无论try中是否发生异常，也不管catch是否可以捕获异常，都要执行的代码块。
 * 	}
 * 
 * 	说明：多个catch有要求，必须是小的类型在上面，大的类型在下面，如果没有大小关系，就随意。这里的小和大是继承关系，子类小于父类。
 * 
 * 	面试题：
 * 	final、finalize、finally的区别？
 * 	final是修饰符，可以修饰类（不能被继承）、方法（不能被重写）、变量（不能被修改值）
 * 	finalize：是一个Object中声明的方法，表示由GC（垃圾回收器）调用，在对象被回收之前调用
 * 	finally：是try...catch结构的一部分，无论try中是否发生异常，也不管catch是否可以捕获异常，都要执行的代码块。
 * 
 * 	2、try...catch的形式
 * 	（1）try...catch
 * 	（2）try...catch...finally
 * 	（3）try...finally
 * 
 */
public class TestTryCatchFinally {
	
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 0;
			int c = a/b;
			System.out.println("c = " + c);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("over");
		}
	}

}
