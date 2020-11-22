package com.atguigu.day13;

public class Triangle extends Graphic{
	private double s1;
	private double s2;
	private double s3;
	public Triangle(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public Triangle() {
		super();
	}
	public double getS1() {
		return s1;
	}
	public void setS1(double s1) {
		this.s1 = s1;
	}
	public double getS2() {
		return s2;
	}
	public void setS2(double s2) {
		this.s2 = s2;
	}
	public double getS3() {
		return s3;
	}
	public void setS3(double s3) {
		this.s3 = s3;
	}
	@Override
	public double getArea() {
		
		if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) {//任意两边之和大于第三边
			//海伦公式
			double p = (s1 + s2 + s3)/2;
			double s = Math.sqrt(p * (p-s1) * (p-s2) * (p-s3));
			return s;
			
		}else {
			return 0;
		}
	}
	
	
	
}
