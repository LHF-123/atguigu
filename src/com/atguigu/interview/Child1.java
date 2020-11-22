package com.atguigu.interview;

public class Child1 extends Father1{
	
	public Child1() {
		System.out.println("Child Create");//3
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father1 father = new Father1();
		Child1 child = new Child1();
	}

}
