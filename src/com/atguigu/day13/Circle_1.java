package com.atguigu.day13;

public class Circle_1 extends Graphic{
	private double radius;

	public Circle_1() {
		super();
	}

	public Circle_1(double radius) {
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
		return radius * radius * Math.PI;
	}
	
}