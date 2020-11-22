package com.atguigu.day11;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderPublic = 2;
		//order.orderPrivate = 3;//出了Order类，private的结构不可以被调用
		
		order.methodDefault();
		order.methodPublic();
		//order.methodPrivate();//出了Order类，private的结构不可以被调用
		
	}

}
