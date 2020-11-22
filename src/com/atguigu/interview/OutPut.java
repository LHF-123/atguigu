package com.atguigu.interview;

import java.io.PrintStream;

public class OutPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 10;
		method1(a, b);//需要在method方法被调用之后，仅打印出a=100，b=200，请写出method方法的代码
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	
	//方法一：在method直接输出，然后结束程序
	public static void method(int a, int b) {
		//在不改变原本题目的前提下，如何写这个函数才能在main函数中输出a=100，b=200？
		a = a * 10;
		b = b * 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.exit(0);
	}
	
	//方法二：如果System.out.println打印的是a=10，就改成a=100；b同理
	public static void method1(int a, int b) {
		
		PrintStream ps = new PrintStream(System.out) {
			@Override
			public void println(String x) {
				
				if ("a=10".equals(x)) {
					x = "a=100";
				}else if("b=10".equals(x)) {
					x = "b=200";
				}
				super.println(x);
			}
		};
		
		System.setOut(ps);
	}

}
