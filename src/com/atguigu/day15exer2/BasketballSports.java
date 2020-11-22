package com.atguigu.day15exer2;

public class BasketballSports extends Sportsman {

	public BasketballSports() {
		super();
	}

	public BasketballSports(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("打篮球");
	}

}
