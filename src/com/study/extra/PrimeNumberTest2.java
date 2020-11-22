package com.study.extra;

public class PrimeNumberTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 题目：输出100000以内的所有质数(主要看优化算法) 方式二
		 */
		
		//获取系统当前的时间
		//获取到从1970年1月1日 00:00:00到当前时间的毫秒数，所以使用long类型
		long start = System.currentTimeMillis();
		
		int count = 0;//记录质数的个数
		
		label:for (int i = 2; i <= 100000; i++) {//遍历所有从2到100的自然数
			
			//优化二：针对于本身就是质数的优化
			for (int j = 2; j <= Math.sqrt(i); j++) {//遍历从2开始，到比i小1的数为止
				
				if(i % j == 0) {
					continue label;
				}
				
			}
				//System.out.println(i);//注释输出语句会更快
				count++;
			
			
		}
		
		//获取系统当前时间
		long end = System.currentTimeMillis();
		
		System.out.println("质数的个数为：" + count);//优化前后质数个数均为9592
		
		System.out.println("所花费的时间为：" + (end - start));//无优化10201 - 优化一900 - 优化一、二68
		
	
	}
}
