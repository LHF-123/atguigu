package com.atguigu.exercise;

import java.util.Scanner;

/*
 * 2.利用面向对象的编程方法，设计类计算圆的面积
 */
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			double R = scanner.nextDouble();
			
			Circle c1 = new Circle();
			c1.area(R);
			
		}
		
		scanner.close();
	}

}

class Circle{
	
	public String area(double R) {
		
		double area = Math.PI * R * R; 
		
		String result = "圆的面积为：" + area;
		System.out.println(result);
		return result;
	}
}
