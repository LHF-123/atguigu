package com.atguigu.day11exer;
/*
 *  定义一个类PassObject，在类中定义一个方法printAreas(),该方法的定义如下：
 *  public void printAreas(Circle c, int time)
 *  在printAreas方法中打印出1到time之间每个整数的半径值，以及对应的面积。
 *  例如，time为5.则输出半径1,2,3,4,5，以及对应的圆面积。
 *  在main方法调用printAreas()方法，调用完毕后输出当前半径值。
 * 
 */
public class PassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		//Circle circle = null;//空指针异常
		
		PassObject pObject = new PassObject();
		
		int time = 5;

		pObject.printAreas(circle, time);
	}
	
	public void printAreas(Circle c, int time) {
		System.out.println("Radius\t\tArea");
		
		for (int i = 1; i <= time; i++) {
			c.setRadius(i);
			//方式一：
			//System.out.println(c.getRadius() + "\t\t" + c.findArea());
			
			//方式二：
			double r = c.getRadius();
			double area = c.findArea();
			System.out.println(r + "\t\t" + area);
		}
		
		double now = (double)time + 1;
		System.out.println("now radius is:" + now);
	}

}
