package com.atguigu.day13;

public class Person {
	
	//属性
	private String name;
	private int age;
	
	//无参构造器
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("这是父类的无参构造");
	}
	
	//有参构造器
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//get/set方法
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
		return "姓名：" + name + ", 年龄：" + age;
	}
	
}
