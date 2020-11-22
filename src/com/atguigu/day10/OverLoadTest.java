package com.atguigu.day10;
/*
 * 方法的重载(Overload)
 * 1.判别标准：“两同一不同”：同一个类中，相同的方法名，且方法名的参数列表不同的方法之间，构成方法的重载
 * 	参数列表不同：参数的个数不同，参数的类型不同，与参数名没有关系
 * 
 * 2.方法之间是否构成重载，与方法是否有返回值，权限修饰符是否不同，没有关系！
 * 
 * 
 * 
 * 补充1：不允许在一个类中定义相同的方法。何为相同的方法？
 * 		编译器会把同一个类中，相同方法名，且参数列表相同的方法，认定是相同的。跟权限返回值类型无关！
 * 
 * 补充2：如何确定调用的是某个确定的方法？ 通过方法名  --> 通过形参列表
 * 
 * 
 * 面试题：区分方法的重载和重写
 * 
 * 
 * Collection / Collections
 * finally / final / finalize
 * throw / throws
 * ....
 */
public class OverLoadTest {
	
	public static void main(String[] args) {
		OverLoadTest test = new OverLoadTest();
		test.getSum(1, 2);
	}

	//如下的三个方法彼此构成重载
	public void getSum(int i, int j) {
		System.out.println(i + j);
	}
	
	public void getSum(double d1, double d2) {
		System.out.println(d1 + d2);
	}
	
	public void getSum(int i, int j, int k) {
		System.out.println(i + j + k);
	}
	
	public String getSum(int i, String s) {
		return i + s;
	}
	
//	public void getSum(int m, int n) {
//		System.out.println(m + n);
//	}
	
//	public int getSum(int i, int j) {
//		return i + j;
//	}
	
	//如下的两个方法构成重载
	public void method(int i, String s) {
		System.out.println(i + s);
	}
	
	public void method(String s, int i) {
		System.out.println(i + s);
	}
	
}
