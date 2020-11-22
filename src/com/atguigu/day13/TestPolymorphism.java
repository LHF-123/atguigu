package com.atguigu.day13;

/*
 * 	面向对象的基本特征：
 * 	1、封装
 * 	2、继承
 * 	3、多态
 * 
 * 	面向对象的特征：封装、继承、多态、抽象
 * 
 * 	三、多态（Polymorphism）
 * 	方法的多种形态
 * 
 * 	1、方法的重载和重写
 * 	方法的重载：同一个功能在同一个类中，有多种形式
 * 	方法的重写：同一个功能在父子类中，多个子类中多种形式
 * 
 * 	2、对象的多态性
 * 	对象有两种形态：（1）编译时类型（2）运行时类型
 * 	前提条件：（1）类的继承关系（2）多态引用（3）方法的重写
 * 	表现出来的特征：编译时按照父类编译，运行时执行的是子类重写的方法体
 * 
 */
public class TestPolymorphism {
	
	public static void main(String[] args) {
		//本态引用
		Person1 person1  = new Person1();
		person1.walk();
		
		//多态引用
		//Person的变量可以赋值给Man对象，因为Man继承了Person
		Person1 person = new Man();
		person.walk();
		//person.smoke();  编译时，按照父类Person编译，所以无法找到子类的smoke()方法
		
	}
}

class Person1{
	
	public void walk() {
		System.out.println("走路");
	}
	
}

class Man extends Person1{
	
	public void walk() {
		System.out.println("大摇大摆的走路");
	}
	
	public void smoke() {
		System.out.println("吞云吐雾");
	}
	
}

class Woman extends Person1{
	
	public void walk() {
		System.out.println("婀娜多姿的走路");
	}
	
}