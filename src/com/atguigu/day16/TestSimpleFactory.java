package com.atguigu.day16;

/*
 * 	接口在设计模式中的应用之一：简单工厂模式（了解）
 * 	
 * 	生活：
 * 	无工厂：手工
 * 		缺点：麻烦，鞋子，需要自己会缝，自己做
 * 		例如：衣服，鞋子，需要自己会缝，自己做
 * 		优点：个性化
 * 
 * 	工厂：生产产品
 * 		优点：批量生产
 * 		缺点：无法定制，如果要定制比较麻烦
 * 	
 * 	Java中创建对象比较麻烦时，或者是需要批量生产对象时，可以交给“工厂类”来生产。
 * 
 * 	学习难的、抽象的知识点：
 * 	（1）为什么
 * 	（2）什么意思
 * 	（3）怎么写
 * 
 * 	简单工厂类的作用：生产Java的对象，一般是用来生产某个接口的实现类对象。
 * 	好处：把对象的使用者与创建者分离，解耦合（把对象的使用者与具体的实现类解耦合）。
 * 	例如：TestSimpleFactory类是对象的使用者
 * 		SimpleFactory类是对象的创建者
 * 
 * 	生活中，生产衣服不是穿衣服的人
 */
public class TestSimpleFactory {
	
	public static void main(String[] args) {
		//没有工厂
		BMW bmw = new BMW();
		bmw.run();
		
		//现在用工具类
		Car car = SimpleFactory.getCar("bmw");
		car.run();
		
		Car a = SimpleFactory.getCar("audi");
		a.run();
		
		Car b = SimpleFactory.getCar("benz");
		b.run();
		
	}

}

//产品的标准
interface Car{
	void run();
}

//具体的产品类
class BMW implements Car{

	@Override
	public void run() {
		System.out.println("宝马车");
	}
	
}
class Benz implements Car{

	@Override
	public void run() {
		System.out.println("奔驰");
	}
	
}
class Audi implements Car{

	@Override
	public void run() {
		System.out.println("奥迪");
	}
	
}

//工厂类
class SimpleFactory{
	
	public static Car getCar(String type) {
		if ("bmw".equals(type)) {
			return new BMW();
		}else if ("benz".equals(type)) {
			return new Benz();
		}else {
			return new Audi();
		}
	}
	
}
