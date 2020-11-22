package com.atguigu.day13exer;

/*
 * 1、声明一个Person类，有姓名和年龄
 * 
 * 	选择生成哪些构造器
 * 	（1）没有特殊情况，一般无参构造都保留
 * 	（2）至于其他的有参构造，我们都可以灵活的自己选择
 * 	标准：让别人调用我们的构造器，有多种方式来创建对象
 */
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	
	

	public Person(String name) {
		super();
		this.name = name;
	}



	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getInfo() {
		return "姓名：" + name + "，年龄：" + age;
	}
	
}
