package com.atguigu.day15exer;

/*
 * 1、定义一个Employee类，该类包含：
 * private成员变量number编号，姓名：name，生日birthday，其中birthday为MyDate类的对象
 * abstract方法double earning(); toString()方法输出对象的name，number和birthday。
 */
public abstract class Employee {
	private int number;
	private String name;
	private MyDate birthday;
	
	//角度：让使用者更方便
	public Employee(int number, String name, MyDate birthday) {
		super();
		this.number = number;
		this.name = name;
		this.birthday = birthday;
	}
	
	public Employee() {
		super();
	}
	
	public Employee(int number, String name, int year, int month, int day) {
		super();
		this.number = number;
		this.name = name;
		this.birthday = new MyDate(year, month, day);
	}
	
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "编号：" + number + ", 姓名：" + name + ", 生日：" + birthday.toDateString();
	}

	//抽象方法
	public abstract double earnings();//快捷键ctrl + 1
	
}
