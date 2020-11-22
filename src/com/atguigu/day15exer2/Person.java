package com.atguigu.day15exer2;

/*
 * 1、声明Person抽象类，没有抽象方法，
 * 	但有属性，姓名等，吃饭void eat()、睡觉void sleep()等
 */
public abstract class Person {
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}

	@Override
	public String toString() {
		return "姓名：" + name;
	}
	
}
