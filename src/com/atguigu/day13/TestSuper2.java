package com.atguigu.day13;

public class TestSuper2 {
	public static void main(String[] args) {
		Son son = new Son();
		son.print();
		son.print("大硅谷");
	}
}

class Father{
	protected String info = "atguigu";//显式赋值
	
}

class Son extends Father{
	private String info = "尚硅谷";
	
	public void print() {
		System.out.println("父类继承的info = " + super.info);
		System.out.println("子类的info = " + this.info);
		System.out.println("局部变量的info = " + info);
	}
	
	public void print(String info) {
		System.out.println("父类继承的info = " + super.info);
		System.out.println("子类的info = " + this.info);
		System.out.println("局部变量的info = " + info);
	}
}