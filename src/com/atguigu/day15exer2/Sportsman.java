package com.atguigu.day15exer2;

/*
 * 3、声明运动员Sportsman抽象类，他继承Person类，并增加一个void play()抽象方法
 * 	他有两个子类：乒乓球运动员和篮球运动员，分别实现void play()方法
 * 	乒乓球运动员：打印“打乒乓球”
 * 	篮球运动员：打印“打篮球”
 */
public abstract class Sportsman extends Person {
	
	public Sportsman() {
		super();
	}

	public Sportsman(String name) {
		super(name);
	}

	public abstract void play();
}
