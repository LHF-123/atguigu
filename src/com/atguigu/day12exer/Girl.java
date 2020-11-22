package com.atguigu.day12exer;

public class Girl {

	private String name;
	private int age;
	
	public Girl() {
		
	}

	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Boy boy) {
		System.out.println("我想嫁给：" + boy.getName());
		
		System.out.println("我也想娶：" + this.getName());
	}
	
	/**
	 * 比较两个对象的大小
	 * 即比较两个对象年龄的大小。
	 * @param girl
	 * @return 如果当前对象大，返回正数；如果当前对像小，返回负数。如果两个对象相等，返回0
	 */
	public int compare(Girl girl) {
		
		//方式一：
//		if (this.age > girl.age) {
//			return 1;
//		}else if (this.age < girl.age) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		//方式二：
//		return (this.age > girl.age)? 1 : ((this.age == girl.age)? 0 : -1);
		
		//方式三：
		return this.age - girl.age;
	}
	
}
