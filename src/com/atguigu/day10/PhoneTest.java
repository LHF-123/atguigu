package com.atguigu.day10;

/*
 * 一、匿名对象的使用
 * 因为匿名对象，在创建以后，没有显式的赋一个变量名，所以我们后续不能再次通过变量名，调用此对象：匿名对象只能调用一次。
 * 
 * 
 * 
 * 
 * 二、方法的使用（补充）
 * 1.方法内可以调用当前类的属性
 * 2.方法内可以调用当前类的方法
 * 		特别的，方法A里调用方法A：递归方法
 * 3.方法内不能定义方法
 */
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneFactory factory = new PhoneFactory();
		
		Phone phone1 = new Phone();
		phone1.name = "huawei mate 30pro";
		phone1.price = 5869;
		
		factory.usePhone(phone1);
		
		//匿名对象的使用
		new Phone().name = "xiaomi mix3";
		factory.usePhone(new Phone());//名称为空的原因：每次new出来的都是新的对象
	}

}

class PhoneFactory{
	
	public void usePhone(Phone phone) {
		phone.show();
//		phone.call();
//		phone.sendSMS();
	}
}

class Phone{
	
	String name;
	int price;
	
	public void call() {
		System.out.println("使用手机通话");
	}
	
	public void sendSMS() {
		System.out.println("发送短信");
	}
	
	public void show() {
		System.out.println("名称：" + name + " 价格：" + price);
		call();
	}
}
