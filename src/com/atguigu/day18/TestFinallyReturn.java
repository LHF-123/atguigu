package com.atguigu.day18;

/*
 * 	当finally和return一起出现时的情况：
 * 	（1）情况一：finally里面有return，结果就是返回finally中
 * 	（2）情况二：finally里面没有return，结果就是返回try或catch中的
 */
public class TestFinallyReturn {
	
	public static void main(String[] args) {
//		System.out.println(getNum());
		System.out.println(getInt());
	}

	public static int getNum() {
		int i = 10;
		
		try {
			i = 20;
			System.out.println("try");
			return i;
		} catch (Exception e) {
			i = 30;
			System.out.println("catch");
			return i;
		}finally {
			i = 40;
			System.out.println("finally");
			return i;
		}
		
	}
	
	public static int getInt() {
		int i = 10;
		
		try {
			i = 20;
			System.out.println("try i = " + i);
			System.out.println(1/0);
			return i;
		} catch (Exception e) {
			i = 30;
			System.out.println("catch i = " + i);
			return i;
		}finally {
			i = 40;
			System.out.println("finally i = " + i);
		}
		
	}
	
	
	
}
