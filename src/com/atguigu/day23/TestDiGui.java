package com.atguigu.day23;

/*
 * 	求n的阶乘
 * 	n! = n * (n-1) * (n-2) * ....
 * 	
 * 	分解：
 * 	n! = n * (n-1)!
 * 	(n-1)! = (n-1) * (n-1-1)!
 * 
 * 	....
 * 
 * 	1! = 1 * 0!
 * 	0! = 1
 */
public class TestDiGui {
	
	public static void main(String[] args) {
		long jiecheng = jiecheng(5);
		System.out.println(jiecheng);
	}
	
	public static long jiecheng(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n * jiecheng(n-1);
		}
	}

}
