package com.atguigu.day13;

public class Student extends Person{
	
	private int score;//扩展父类中没有的
	
	public Student() {
		//super();//调用父类无参构造
	}
	
	public Student(String name, int age, int score) {
		//显式的调用父类的有参构造，为name和age属性赋值
		super(name, age);
		this.score = score;
	}
	
	//扩展父类没有的方法
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getInfo() {
		return "姓名：" + getName() + ", 年龄：" + getAge() + ", 成绩：" + score;
	}
	
	
}
