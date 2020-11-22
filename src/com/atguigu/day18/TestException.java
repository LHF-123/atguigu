package com.atguigu.day18;

/*
 * 	异常：
 * 	程序正常情况下是可以运行的，只是偶然因为其他的原因，导致“异常”情况。
 * 		例如：用户输入的参数的问题，用户文件被删除，用户磁盘空间已满，网络中断。。。
 * 	程序的运行过程中，可能遇到了“不正常”的情况，导致程序暂停或崩溃了。
 * 
 * 	不是异常的情况：
 * 	（1）语法错误，编译都不通过
 * 	（2）逻辑错误
 * 
 * 	Java如何处理异常？或者Java的异常处理机制是什么样？
 * 	Java程序运行过程中，如果某句代码发生异常，Java会在这句代码处停下来
 * 	Java会创建一个“异常的对象”并且“抛”出来。
 * 	Java会检测在这句代码的外围是否有"try...catch"可以“捕获”它，如果可以“捕获”它，那么程序从这个"try...catch"后面继续往下运行.
 * 	如果外围没有"try...catch"可以“捕获”它，那么程序就会抛给“上级（调用者）”，上级也会检测是否有"try...catch"可以“捕获”它，如果可以“捕获”它，那么程序在上级的"try...catch"后面继续往下运行.
 * 	如果一路上都没有"try...catch"可以“捕获”他，那么程序就“挂了”。
 * 
 * 	简单说：Java的异常处理机制用“异常对象”来表示异常情况，如果有"try...catch"可以捕获，就继续执行，否则就挂了
 * 
 */
public class TestException {
	
	public static void main(String[] args) {
		//语法错误
//		System.out.println(a);
		
		System.out.println(getSum(1, 2));
		
		System.out.println(getDivide(2, 1));
		System.out.println(getDivide(9, 2));
		try {
			System.out.println(getDivide(9, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("...");
		
	}
	
	//求a和b的和
	public static int getSum(int a, int b) {
		return a*b;//逻辑错误
	}
	
	public static int getDivide(int a, int b) {
		int shang = 0;
		shang = a/b;//这里发生异常，会在这里停下来
		System.out.println("计算完毕");
		return shang;
	}

}
