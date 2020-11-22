package com.atguigu.day15exer;

/*
 * 4、参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。该类包括：
 * 	private成员变量wage和hour;
 * 	实现父类的抽象方法earnings()，该方法返回wage*hour值;toString()方法输出员工类型信息及员工的name，number，birthday，
 */
public class HourlyEmployee extends Employee {
	private int hour;//一共工作几个小时
	private double wage;//每小时多少钱
	
	public HourlyEmployee() {
		super();
	}



	public HourlyEmployee(int number, String name, int year, int month, int day, int hour, double wage) {
		super(number, name, year, month, day);
		this.hour = hour;
		this.wage = wage;
	}



	public HourlyEmployee(int number, String name, MyDate birthday, int hour, double wage) {
		super(number, name, birthday);
		this.hour = hour;
		this.wage = wage;
	}

	

	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public double getWage() {
		return wage;
	}



	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return super.toString() + ", 工作了" + hour + "小时, 每小时" + wage + "元";
	}



	@Override
	public double earnings() {
		return wage * hour;
	}

}
