package com.atguigu.day10;
/*
 * 1.
 * 形参：声明方法时，小括号内定义的变量，称为形参
 * 实参：调用方法时，给形参赋的值。
 * 
 * 方法的参数传递机制：值传递！
 * 如果形参是基本数据类型，则将基本数据类型变量存储的数据传递给形参。
 * 如果形参是引用数据类型，则将引用数据类型变量的地址值赋给形参。
 */
public class ValueTransferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 10;
		int n = 20;
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		
		//方式一：交换两个变量的值
//		int temp = m;
//		m = n;
//		n = temp;
		
		//方式二：
		ValueTransferTest1 v= new ValueTransferTest1();
		v.swap(m, n);
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}
	
	public void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}

}
