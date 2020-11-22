package com.atguigu.day11;
/*
 * 如果是基本数据类型变量赋值，将变量本身存储的数据传递过去
 * 如果是引用数据类型变量赋值，将变量本身存储的地址值传递过去
 */
public class ReviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc";
		String s2 = s1;//赋的地址值
		
		System.out.println(s2);
		
		s2 = "hello";
		
		System.out.println(s1);
		
		String s3 = new String("hello");
	}

}
