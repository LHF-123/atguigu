package com.atguigu.day13exer;

public class TestExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建一个Person类
		Person person = new Person("张三", 19);
		System.out.println(person.getInfo());
		
		//创建一个Employee类
		Employee employee = new Employee("李四", 20, 10000);
		System.out.println(employee.getInfo());
		System.out.println(person.getInfo());
		
		//创建一个Manager类
		Manager manager = new Manager("王五", 21, 15000, 10000);
		System.out.println(manager.getInfo());
		
	}

}
