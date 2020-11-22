package com.atguigu.day15exer2;

public class PingPangCoach extends Coach implements LearningEnglish{
	
	public PingPangCoach() {
		super();
	}

	public PingPangCoach(String name) {
		super(name);
	}

	@Override
	public void teach() {
		System.out.println("教授如何打乒乓球");
	}

	@Override
	public void learn() {
		System.out.println("学习关于用英语交流教学问题");
	}

}
