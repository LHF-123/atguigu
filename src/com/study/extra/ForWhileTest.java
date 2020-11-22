package com.study.extra;

import java.util.Scanner;

public class ForWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 从键盘读入个数不确定的整数，并判断读入的在正数和负数的个数，输入0时结束程序
		 * 
		 * 总结：
		 * 如何结束一个循环？
		 * 方式一：当循环条件返回false时，结束循环
		 * 方式二：使用break关键字跳出循环结构
		 * 
		 * 如果一个循环结构，不能跳出循环的话，就是一个死循环！
		 * 我们写程序，要避免出现死循环！
		 * 
		 * 算法：有限性的特征
		 */
		Scanner scanner = new Scanner(System.in);
		int zCount = 0, fCount = 0;
		for(;true;) {//while (true) {
			System.out.println("请输入整数：");
			int num = scanner.nextInt();
			
			if(num > 0) {
				zCount++;
			}
			
			if(num < 0) {
				fCount++;
			}
			
			if (num == 0) {
				break;//跳出循环结构
			}
		}
		System.out.println("正数个数为：" + zCount);
		System.out.println("负数个数为：" + fCount);
		
		

	}

}
