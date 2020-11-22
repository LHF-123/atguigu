package com.study.extra;

public class DoWhileTest {
	
	public static void main(String[] args) {
		/*
		do-while至少会执行一次循环
		
		*/
		//遍历100以内所有的奇数
		int i = 1;
		int sum = 0;//记录总和
		int count = 0;//记录个数
		do {
			if (i % 2 != 0) {
				System.out.println(i);
				sum += i;
				count++;
			}
			i++;
		} while (i <= 100);
		System.out.println("100以内所有奇数的总和为：" + sum);
		System.out.println("100以内所有奇数的个数为：" + count);
		
	}
	
}
