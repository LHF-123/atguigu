package com.atguigu.day13;

import com.atguigu.day13exer.Employee;

/*
 * 1、为什么需要继承？
 * 	（1）代码的复用
 * 		延续父类的一些特性
 * 	（2）代码的扩展
 * 		扩展父类没有的一些特性
 * 	（3）表示is-a的关系
 * 		Person
 * 		Student is a Person.
 * 
 * 2、如何实现继承？
 * 	在声明一个类时去继承它的父类
 * 	语法格式：
 * 	【修饰符】 class 子类名 extends 父类名{
 * 
 * 	}
 * 
 * 
 * 	子类(SubClass)：又称为派生类
 * 	父类(SuperClass)：又称为基类、超类
 * 	extends：扩展
 * 
 * 
 * 3、继承的要求
 * 	        子类在继承父类时，一定会在子类的构造器中调用父类的构造器。
 * 	（1）默认是调用父类的无参构造。
 * 		super()：可以省略
 * 	（2）如果父类没有无参构造，那么子类可以显式的调用父类的有参构造
 * 		super(实参列表)，调用父类的有参构造
 * 
 * 
 * 
 * 4、继承的特点
 * 	（1）子类不会继承父类的构造器，但是在子类的构造器中一定会调用父类构造器。super()或super(实参列表)
 * 	（2）子类可以继承父类所有的方法、属性，如果父类中关于这个方法和属性是私有的话，在子类中不能直接使用
 * 	（3）子类可以扩展父类没有的属性和方法。
 * 	（4）如果父类的方法的方法体不适应子类，那么我们的子类可以选择重写
 * 	（5）Java有单继承限制，不支持多重继承
 * 		如何理解：一个之类只能有一个直接父类，换句话说，不能同时继承好几个父类
 * 		class Manager extends Employee{}  对的
 * 		class Manager extends Employee, Person{}  错的
 * 	（6）Java支持多层继承
 * 		如何理解：父类可以有父类，然后父类的父类也是我的父类
 * 		class Manager extends Employee{}
 * 		class Employee extends Person{}
 * 		
 * 		Manager把Person也成为父类
 * 		为了区别：Manager把Employee称为直接父类，把Person称为间接父类
 * 	（7）Java中一个父类可以同时有多个子类
 * 		class Student extends Person{}
 * 		class Employee extends Person{}
 * 
 * 		Person同时有两个子类Employee、Student
 * 
 */
public class TestInherite {
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student("李四", 20, 90);
		
		student.setName("张三");
		student.setAge(19);
		System.out.println(student.getInfo());
		
		student.setScore(89);
		System.out.println("成绩：" + student.getScore());
		
		System.out.println(student.getInfo());
		System.out.println(student2.getInfo());
	}
}
