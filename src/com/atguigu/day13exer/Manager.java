package com.atguigu.day13exer;

/*
 * 3、声明一个经理类Manager，继承员工类，有奖金
 */
public class Manager extends Employee{
	
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String getInfo() {
		return "姓名：" + getName() + "，年龄：" + getAge() + ",薪资：" + getSalary() + ",奖金：" + bonus;
	}
	
}
