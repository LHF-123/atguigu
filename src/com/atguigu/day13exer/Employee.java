package com.atguigu.day13exer;

/*
 * 2、声明一个Employee继承Person类，有薪资
 */
public class Employee extends Person{
	
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getInfo() {
		return "姓名：" + getName() + "，年龄：" + getAge() + ",薪资：" + salary;
	}
	
}
