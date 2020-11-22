package com.atguigu.exercise;
/*
 * 在Rectangle方法中提供m和n两个参数，方法中打印一个m*n的*型矩阵，并计算该矩形的面积
 * 将其作为方法的返回值。在main方法中调用该方法，接受返回的面积值并打印
 * 
 */
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			double m = scanner.nextDouble();
			double n = scanner.nextDouble();
			
			Rectangle r1 = new Rectangle();
			
			double area = r1.area(m, n);
			System.out.println("矩形的面积为：" + area);
			
		}
		
		scanner.close();
	}

}

class Rectangle{
	
	public double area(double m, double n) {
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		return m * n;
	}
	
}