package com.atguigu.interview;

class People{
	String name;
	public People() {
		System.out.println(1);//1
	}
	
	public People(String name) {
		System.out.println(2);
		this.name = name;
	}
	
}

class Child extends People{
	People father;

	public Child(String name) {
//		super();//省略了，在子类的构造器中，一定会调用父类的构造器，默认父类的无参构造
		System.out.println(3);//3
		this.name = name;
		father = new People(name + ":F");//调用父类的有参构造输出   2
	}
	public Child() {
		System.out.println(4);
	}
	
}

public class TestChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child("mike");
	}

}
