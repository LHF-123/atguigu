package com.atguigu.day17;

public class TestReview {

	public static void main(String[] args) {
		Runnable r1 = Gender.MAN;
		r1.run();
		
		Runnable r2 = Gender.WOMAN;
		r2.run();
		
		Walkable w1 = Gender.MAN;
		Walkable w2 = Gender.WOMAN;
		w1.walk();
		w2.walk();
	}
	
}
interface Runnable{
	void run();
}
interface Walkable{
	void walk();
}
enum Gender implements Runnable, Walkable{
	//每一个常量分别实现接口
	MAN{
		public void walk() {
			System.out.println("大步流星");
		}
	},WOMAN{
		public void walk() {
			System.out.println("婀娜多姿");
		}
	};
	
	//统一实现接口
	@Override
	public void run() {
		System.out.println("跑步");
	}
}