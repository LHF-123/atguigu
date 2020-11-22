package com.atguigu.day10;
/*
 * 变量的值传递
 * 规则：不管是基本数据类型变量，还是引用数据类型变量，变量本身存的什么值，就传递什么值！
 */
public class ValueTransferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.以基本数据类型为例
		int m = 10;
		int n = m;
		System.out.println(n);//10
		
		n = 20;
		System.out.println(m);//10
		
		//2.引用数据类型
		Order o1 = new Order();
		o1.orderId = 1001;
		//讲o1变量保存的堆空间的对象的地址赋给o2变量。使得o1和o2变量都指向堆空间中同一个对象。
		Order o2 = o1;
		System.out.println(o2.orderId);//1001
		
		o2.orderId = 1002;
		System.out.println(o1.orderId);//1002
	}

}

class Order{
	
	int orderId;
	
}