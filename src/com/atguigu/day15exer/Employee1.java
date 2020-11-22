package com.atguigu.day15exer;

/*
 * 1、声明一个员工类，有姓名和薪资
 * 2、实现java.lang.Compara接口，按照薪资从低到高排序
 * 3、在测试类，创建员工数组，创建几个员工对象，调用Arrays.sort排序
 */
public class Employee1 implements Comparable{
	private String name;
	private double salary;
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public Employee1() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee1 emp = (Employee1) o;
		if (this.salary > emp.salary) {
			return 1;
		}else if (this.salary < emp.salary) {
			return -1;
		}
		return 0;
	}
	
	
	
}
