package com.atguigu.day20;

import javax.management.RuntimeErrorException;

import org.junit.Test;

/*
 * 	常量：
 * 	1、PI
 * 	2、求平方根：sqrt(x)
 * 	3、求几次方pow(x, y)，求x的y次方
 * 	4、round(x)：四舍五入
 * 			(int)(x+0.5)
 * 		ceil(x)：向无穷大的方向取整，ceil天花板
 * 		floor(x)：向负无穷大的方向取整 floor地板
 * 	5、max(x, y)
 * 		min(x, y)
 * 
 * 	6、随机数：Math.random() -> [0, 1)
 * 		
 * 		Java中在设计很多方案时，右边界基本不包括
 * 
 * 	java.util.Random类：专门用来生产随机数
 * 	1、double nextDouble
 * 	2、int nextInt()：遍布所有int范围
 * 	3、int nextInt()：[0, n)
 */
public class TestMath {
	
	@Test
	public void test1() {
		System.out.println(Math.round(2.4));
		System.out.println(Math.ceil(2.4));
		System.out.println(Math.floor(2.4));
		System.out.println();
		
		System.out.println(Math.round(2.6));
		System.out.println(Math.ceil(2.6));
		System.out.println(Math.floor(2.6));
		System.out.println();
		
		System.out.println(Math.round(-2.4));
		System.out.println(Math.ceil(-2.4));
		System.out.println(Math.floor(-2.4));
		System.out.println();
		
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(-2.5));
		
	}
	
	
}
