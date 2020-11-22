package com.atguigu.interview;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Children();//创建了一个匿名对象
	}

}
class Parent{
	
	{
		System.out.println("A");
	}
	
	static {
		System.out.println("B");
	}
	
	public Parent() {
		System.out.println("C");
	}
	
}
class Children extends Parent{
	
	{
		System.out.println("1");
	}
	
	static {
		System.out.println("2");
	}
	
	public Children() {
		System.out.println("3");
	}
	
}