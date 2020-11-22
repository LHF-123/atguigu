package com.atguigu.day09;

import java.util.Scanner;

/*
 * 类的设计：创建类，并提供类中的结构：属性、方法
 * 
 * 属性 - 成员变量 - field - （域 - 字段）
 * 方法 - 成员方法 - 函数 - method
 * 
 * 创建类的对象 - 实例化类 - 类的实例化
 * 
 * 二、类的实例化及功能的调用（面向对象的落地的实现一）：
 * 1.创建类及提供类的成员：属性、方法
 * 2.类的实例化（创建类的对象）
 * 3.调用对象的相关结构："对象.属性" 或 "对象.方法"
 * 
 * 三、说明
 * 1.如果创建一个类的多个对象，则每个对象独立拥有一份类中声明的属性。如果修改对象a中的属性值，
 * 不会影响属性b中相同属性的值。
 * 2.对象的内存解析
 */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//创建类的对象（实例化类、类的实例化）
		Person p1 = new Person();
		
		//可以调用对象的相关结构
		System.out.println(p1);
		//调用属性：对象.属性
		p1.name = "小明";
		p1.age = 18;
		
		System.out.println(p1.name + "的年龄为：" + p1.age);
		
		//调用方法：对象.方法
		p1.eat();
		p1.study();
		p1.showNation("CHN");
		
		p1.name = "小华";
		System.out.println(p1.name + "的年龄为：" + p1.age);
		System.out.println();
		
		Person p2 = new Person();
		System.out.println(p2.name + "的年龄为：" + p2.age);
		
	}

}

class Person{
	//1.属性：数据类型 变量名 = 变量值
	String name = null;
	int age = 1;
	
	//2.方法
	public void eat() {
		System.out.println("人吃饭");
	}
	
	public void study() {
		System.out.println("人学习");
	}
	
	public void showNation(String nation) {
		System.out.println("你好，我来自于：" + nation);
	}
}