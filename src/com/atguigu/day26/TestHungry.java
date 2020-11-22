package com.atguigu.day26;

/*
 * 	一、饿汉式
 * 	1、用一个公共的静态的常量来保存这个唯一的实例对象
 * 	2、枚举类
 * 	3、用一个私有的静态的常量来保存这个唯一的实例对象，再用一个静态方法返回这个唯一的对象。
 */
public class TestHungry {
	
	public static void main(String[] args) {
//		Hungry h = new Hungry();//外面无法创建对象
		
		//如何获取这个单例的对象
		Hungry h = Hungry.INSTANCE;
		
		HungryEnum he = HungryEnum.INSTANCE;
		
		HungryDemo hd = HungryDemo.getInstance();
	}

}
class Hungry{
	//用一个静态变量，来存储这个唯一的对象
	//这个对象是在类初始化时就创建了
	public static final Hungry INSTANCE = new Hungry();
	
	//(1)构造器私有化
	private Hungry() {
		
	}
}

enum HungryEnum {
	INSTANCE
}

class HungryDemo{
	//用一个静态变量，来存储这个唯一的对象
	//这个对象是在类初始化时就创建了
	private static final HungryDemo INSTANCE = new HungryDemo();
	
	//(1)构造器私有化
	private HungryDemo() {
		
	}
	
	public static HungryDemo getInstance() {
		return INSTANCE;
	}
	
}