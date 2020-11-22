package com.atguigu.day11exer;

public class Person {

	private int age;
	private String name;
	
	//1.在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。
	public Person() {
		age = 18;
	}
	
	//2.修改上题中的类和构造器，增加name属性，使得每次创建Person对象的同时初始化对象的age和name属性值
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		if (age < 0 || age > 130) {
			System.out.println("您输入的数据非法！");
			return;
		}
		
		this.age = age;//this后面的类里面定义的，没有this的是方法里面定义的
	}
	
	public void show() {
		
	}

}
