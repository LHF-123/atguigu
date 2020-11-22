package com.atguigu.day17exer;

/*
 * 3、声明一个员工类型Employee，有属性：编号，姓名，状态
 */
public class Employee {
	private int eid;
	private String name;
	private Status status;
	
	public Employee(int eid, String name, Status status) {
		super();
		this.eid = eid;
		this.name = name;
		this.status = status;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", status=" + status + "]";
	}
	
}
