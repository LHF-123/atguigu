package com.atguigu.day22;

import java.util.ArrayList;
import java.util.List;

/*
 * 	1、声明一个图形抽象父类：Graphic，有一个抽象方法，double getArea()
 * 	2、声明他的一个子类圆Circle
 * 	3、声明他的另一个子类矩形Rectangle
 * 	4、设计一个工具类GraphicTools，包含一个方法
 */
public class TestGenericMethod2 {
	
	public static void main(String[] args) {
		List<Graphic> list = new ArrayList<Graphic>();
		list.add(new  Circle(1.2));
		list.add(new Rectangle(1, 2));
		
		GraphicTools.printArea2(list);
		
		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle(2));
		circles.add(new Circle(3));
		
//		GraphicTools.printArea(circles);
		
	}

}
class GraphicTools{
	//List<Graphic> list形参，只能接收List<Graphic> list 实参
	//List<Graphic> list形参，不能接收List<Circle> circles 实参
	public static void printArea1(List<Graphic> list) {
		for (Graphic graphic : list) {
			System.out.println(graphic.getArea());
		}
	}
	
	public static <T extends Graphic> void printArea2(List<T> list) {
		for (T t : list) {
			System.out.println(t.getArea());
		}
	}
	
}

abstract class Graphic{
	public abstract double getArea();
}
class Circle extends Graphic{
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
}
class Rectangle extends Graphic{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
	
}
