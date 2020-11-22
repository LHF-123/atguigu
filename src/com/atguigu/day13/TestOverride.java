package com.atguigu.day13;

/*
 * 	回忆：方法的重载Overload
 * 	在同一个类中，出现了相同方法名，形参列表不同的两个或多个方法构成了方法的重载，和返回值无关。
 * 
 * 	方法的重写：Override
 * 	在子类继承父类时，如果父类的某个方法的方法体实现不适用子类，那么子类可以选择进行重写。
 * 
 * 	例如：
 * 	Person类
 * 	public String getInfo() {
		return "姓名：" + name + "，年龄：" + age;
	}
 * 	员工Employee类
 * 	public String getInfo() {
		return "姓名：" + getName() + "，年龄：" + getAge() + ",薪资：" + salary;
	}
 * 
 * 	例如：父类：圆类，有半径属性，求面积方法
 * 		子类：圆柱体，增加高属性，求表面积
 * 
 * 
 * 	方法重写的要求：
 * 	（1）子类重写的方法的方法名必须与父类被重写的方法的方法名相同
 * 	（2）子类重写的方法的形参列表必须与父类被重写的方法的形参列表相同
 * 	（3）子类重写的方法的返回值类型与父类被重写的方法的返回值类型的关系
 * 		A：如果返回值类型是void或基本数据类型（8种），要求必须相同
 * 		B：如果返回值类型是引用数据类型，可以 <= 的关系      子类重写的方法的返回值类型<=父类被重写的方法的返回值类型
 * 	（4）子类重写的方法的权限修饰符  >=  父类被重写的方法的权限修饰符
 * 		public > protected > 缺省 > private
 * 
 * 	暂时可以手动添加@Override辅助我们检查
 * 
 */
public class TestOverride {

}

class Circle{
	
	private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
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


	public double getArea() {
		return Math.PI * radius * radius;
	}
	
}

class Cylinder extends Circle{
	
	private double height;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//求面积的方法，重写父类的方法
	@Override
	public double getArea() {
		return 2 * Math.PI * getRadius() * getRadius() + 2 * Math.PI * getRadius() * height;
	}
	
}

