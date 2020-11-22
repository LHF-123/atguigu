package com.atguigu.day13;

/*
 * 	回忆：基本数据类型的转换
 * 	（1）自动类型转换
 * 	byte, short, char -> int -> long -> float -> double
 * 
 * 	（2）强制类型转换
 * 	double -> float -> long -> int -> byte, short, char
 * 
 * 	现在：引用数据类型，编译时类型
 * 	（1）向上转型upcasting
 * 	当出现多态引用时，子类的对象就会向上转型为父类的类型
 * 
 * 	一旦向上转型，通过父类的变量，就无法调用子类“扩展”的方法。
 * 
 * 	（2）向下转型downcasting
 * 	当把存在的父类的变量的对象，重新赋值给子类的变量时，就需要向下转型
 * 
 * 	向下转型有风险，可能会发生ClassCastException：类型转换异常
 * 
 * 	如何避免向下转型的异常？
 * 	
 * 	instanceof
 * 	对象instanceof类型：判断这个对象是否属于这个类型
 * 
 */
public class TestClassCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Person1 p = new Man();//多态引用，向上转型 Man m = new Man();//本态引用
		 * 
		 * Man m2 = (Man)p;
		 * 
		 * Graphic g = new Circle_1(2);//多态引用，向上转型 Circle_1 c = new Circle_1(2);//本态引用
		 * Circle_1 c2 = (Circle_1) g;
		 */
		
		DoorMan d = new DoorMan();
		
		Chinese chinese = new Chinese();
		d.welcome(chinese);//实参是子类的对象
		
		American american = new American();
		d.welcome(american);
		
	}

}
class DoorMan{
	public void welcome(Human h) {
		h.say();
		
		//h是父类的类型，无法调用子类扩展的方法
//		h.eat();
		if (h instanceof Chinese) {
			Chinese c = (Chinese) h;
			c.eat();
		}else if(h instanceof American){
			American a = (American) h;
			a.meet();
		}
		
	}
}
class Human{
	public void say() {
		System.out.println("呵呵");
	}
}
class Chinese extends Human{
	public void say() {
		System.out.println("你好");
	}
	public void eat() {
		System.out.println("你吃了吗？");
	}
}
class American extends Human{
	public void say() {
		System.out.println("Hello");
	}
	public void meet() {
		System.out.println("Nice to meet you");
	}
}
