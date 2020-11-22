package com.atguigu.day11exer;

import com.atguigu.day11.Order;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.orderPublic = 1;
		//在不同的包下，不能调用private和缺省权限的结构
//		order.orderDefault = 2;
//		order.orderPrivate = 3;
		
		order.methodPublic();
		//在不同的包下，不能调用private和缺省权限的结构
//		order.methodDefault();
//		order.methodPrivate();
	}

}
