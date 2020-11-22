package com.atguigu.day15exer;

/*
 * 3、定义一个SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。该类包括：
 * 	private成员变量monthSalary;//月薪
 * 	private成员变量workingDay;//本月出勤天数
 * 	private成员变量totalDays;//本月总工作日天数/本月总工作日;
 * 	实现父类的抽象方法earnings()，该方法返回月薪*出勤天数/本月总工作日;
 * 	toString()方法输出员工类型信息及员工name，number，birthday。
 */
public class SalariedEmployee extends Employee {
	private double monthSalary;
	private int workingDay;//实际工作天数
	private int totalDays;//应该工作天数，即工作日
	
	public SalariedEmployee() {
		super();
	}




	public SalariedEmployee(int number, String name, int year, int month, int day, double monthSalary, int workingDay,
			int totalDays) {
		super(number, name, year, month, day);
		this.monthSalary = monthSalary;
		this.workingDay = workingDay;
		this.totalDays = totalDays;
	}




	public SalariedEmployee(int number, String name, MyDate birthday, double monthSalary, int workingDay,
			int totalDays) {
		super(number, name, birthday);
		this.monthSalary = monthSalary;
		this.workingDay = workingDay;
		this.totalDays = totalDays;
	}



	//实现父类的抽象方法earnings()，该方法返回月薪*出勤天数/本月总工作日;
	@Override
	public double earnings() {
		return monthSalary * workingDay / totalDays;
	}




	@Override
	public String toString() {
		//toString()方法输出员工类型信息及员工name，number，birthday。
		return super.toString() + "，月薪：" + monthSalary + ", 出勤天数：" + workingDay + ", 本月工作日："
				+ totalDays;
	}
	
	

}
