package com.atguigu.day15exer2;

public class PingPangSports extends Sportsman implements LearningEnglish{

	public PingPangSports() {
		super();
	}

	public PingPangSports(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("打乒乓球");
	}

	@Override
	public void learn() {
		System.out.println("学习关于用英语交流比赛问题");
	}

}
