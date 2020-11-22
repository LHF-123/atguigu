package com.atguigu.day11exer;
/*
 * 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 */
public class Circle {
	
	private double radius;
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double findArea() {
		return radius * radius * Math.PI;
	}
	
}
