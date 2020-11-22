package com.atguigu.interview;

class HelloA{
	public HelloA() {
		System.out.println("HelloA");//4
	}
	{
		System.out.println("I'm A class");//3
	}
	static {
		System.out.println("static A");//1
	}
}

public class HelloB extends HelloA{
	public HelloB() {
		System.out.println("HelloB");//6
	}
	{
		System.out.println("I'm B class");//5
	}
	static {
		System.out.println("static B");//2
	}
	public static void main(String[] args) {
		new HelloB();
	}
}
