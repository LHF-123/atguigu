package com.atguigu.day13;

public class Rectangle_1 extends Graphic{
	private double length;
	private double width;
	public Rectangle_1(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle_1() {
		super();
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double getArea() {
		return length * width;
	}
	
}