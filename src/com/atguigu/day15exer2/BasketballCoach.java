package com.atguigu.day15exer2;

public class BasketballCoach extends Coach {

	public BasketballCoach() {
		super();
	}

	public BasketballCoach(String name) {
		super(name);
	}

	@Override
	public void teach() {
		System.out.println("教授如何打篮球");
	}

}
