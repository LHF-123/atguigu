package com.atguigu.day16exer;

//请声明一个员工类Employee，有编号，姓名，薪资，实现java.lang.Comparable接口，按照编号升序排列
public class Employee implements Comparable{
	private int eid;
	private String name;
	private int salary;
	
	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee employee = (Employee) o;
		return this.eid - employee.eid;
	}
	
	

}
