package com.atguigu.day13;

public class TestOverride2 {

}

//Object是一个根父类，所有类的父亲
class A{
	
	//返回值类型是Object，是引用数据类型
	public Object test() {
		return null;
	}
	
}

class B extends A{
	
	//重写时，返回值类型可以和父类一样
//	@Override
//	public Object test() {
//		return null;
//	}
	
	//重写时，返回值类型可以和父类不一样，String < Object
	@Override
	public String test() {
		return "";
	}
	
}

class C{
	
	//A是引用数据类型
	public A test() {
		return null;
	}
	
}

class D extends C{
	
	//A是引用数据类型，和父亲一样
//	@Override
//	public A test() {
//		return null;
//	}
	
	//B < A
	@Override
	public B test() {
		return null;
	}
	
}