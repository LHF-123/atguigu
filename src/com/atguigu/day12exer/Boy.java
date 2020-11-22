package com.atguigu.day12exer;

public class Boy {
	
	private String name;
	private int age;
	
	
	
	public Boy() {
		
	}

	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int age() {
		return age;
	}
	
	public void marry(Girl girl) {
		System.out.println("我一定要娶" + girl.getName());
	}
	
	public void shut() {
		if (age >= 22) {
			System.out.println("我终于可以结婚了！");
		}else {
			System.out.println("还可以多谈谈恋爱");
		}
	}
	
}
