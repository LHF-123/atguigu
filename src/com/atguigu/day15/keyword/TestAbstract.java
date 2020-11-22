package com.atguigu.day15.keyword;

/*
 * abstract:抽象的
 * abstract也是修饰符，他可以修饰：类（包括内部类和外部类）、方法
 * 
 * 1、为什么要使用抽象类和抽象方法
 * 	当我们在设计父类时，发现某些方法是无法给出具体的实现，具体的实现应该在子类中实现。那么这样的方法，在父类中就可以设计为“抽象方法”
 * 	包含抽象方法的类，必须是一个“抽象类”
 * 
 * 2、抽象方法的语法格式
 * 	【权限修饰符】 abstract class 类名[extends 父类] {
 * 		【权限修饰符】 abstract 返回值类型  方法名(【形参列表】);
 * 	}
 * 
 * 3、抽象类的特点
 * 	（1）抽象类不能直接new对象
 * 	（2）抽象类就是用来被继承的，那么子类继承抽象类后，必须实现抽象类的所以抽象方法，否则子类也要是抽象类
 * 	（3）抽象类的变量可以与子类的对象构成多态引用，执行子类重写的方法
 * 	（4）抽象类可以和普通类一样，拥有：属性、构造器、代码块、非抽象的方法等成员，这些给子类可以用。
 * 	（5）一个类如果有抽象方法，这个类必须是抽象类，但一个抽象类也可以没有抽象方法，目的：不让你创建它的对象，让你创建它子类的对象
 * 
 * 	需求：
 * 	1、设计一个图形类Graphic
 * 	2、这个图形类有很多子类：Rectangle矩形、Circle圆形、Triangle三角形等
 * 	这些图形，有图形名称，图形的面积，图形的周长
 * 	既然所有的子类有共同的特征，那么这些共同的特征应该设计到父类图形Graphic中，因为父类就是代表所有子类共同的部分。
 * 
 * 	类：一类具有相同特征的事物的抽象描述。
 */
public class TestAbstract {
	public static void main(String[] args) {
//		Graphic g = new Graphic();//不能创建抽象类的对象
		
		Graphic g = new Circle(2);
		double area = g.getArea();
		System.out.println("面积：" + area);
	}
}
abstract class Graphic{
	private String name;
	
	
	
	public Graphic() {
		super();
	}

	public Graphic(String name) {
		super();
		this.name = name;
	}

	//在父类中，是无法给出统一的实现的
	public abstract double getArea();
	
	public abstract double getPrimeter();
}
class Circle extends Graphic{
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPrimeter() {
		return 2 * Math.PI * radius;
	}
	
}
//目的：不让你创建它的对象，让你创建它子类的对象
abstract class Person{
	
} 
class Man extends Person{
	
}