package com.atguigu.day15exer2;

/*
 * 2、声明教练Coach抽象类，他继承Person类，并增加一个void teach()抽象方法
 * 	他有两个子类：乒乓球教练和篮球教练，分别实现void teach()方法
 * 	乒乓球教练：打印“教授如何打乒乓球”
 * 	篮球教练：打印“教授如何打篮球”
 */
public abstract class Coach extends Person {
	
	public Coach() {
		super();
	}

	public Coach(String name) {
		super(name);
	}

	public abstract void teach();
}
