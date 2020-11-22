package com.atguigu.exercise;
/*
 * 2.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 	三个方法分别接受一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，
 * 	输出字符串信息。在主类main()方法中分别用参数区别调用三个方法。
 * 
 * 3.定义三个重载方法max(),第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，
 * 	第三个方法求三个double值中的最大值
 */
public class OverloadExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadExer overload = new OverloadExer();
		
		System.out.println(overload.mOL(5));
		System.out.println(overload.mOL(2, 5));
		System.out.println(overload.mOL("字符串！"));
		
		overload.max(8, 4);
		overload.max(4.5, 3.6);
		overload.max(2.4, 2.8, 1.7);
		
	}
	
	//如下三个方法构成重载
	public int mOL(int i) {
		return i * i;
	}
	
	public int mOL(int m, int n) {
		return m * n;
	}
	
	public String mOL(String str) {
		return str;
	}
	
	//如下三个方法构成重载
	public void max(int m, int n) {
		int max = (m > n)?m:n;
		System.out.println(max);
	}
	
	public void max(double d1, double d2) {
		double max = (d1 > d2)?d1:d2;
		System.out.println(max);
	}
	
	public void max(double d1, double d2, double d3) {
		
		double temp;
		temp = (d1 > d2)?d1:d2;
		double max;
		max = (temp > d3)?temp:d3;
		System.out.println(max);
		
	}
	
	//return (a != b)?a:b;
	//优化：return a;
	//当a和b不相等是return a，当a和b相等时return b，此时a == b，相当于return a

}
