package com.atguigu.day14;

import com.atguigu.day12.ThisTest;

/*
 * 1、static是一个关键字，同时是一个修饰符。
 * 2、static可以修饰什么？
 * 	（1）属性
 * 	（2）方法
 * 	（3）代码块
 * 	（4）内部类
 * 
 * 3、static修饰属性
 * 	用static修饰的属性，称为静态变量、类变量。
 * 	静态变量和非静态变量的属性：
 * 	（1）值的存储位置不同
 * 		非静态变量：堆
 * 		静态变量：方法区
 * 
 * 	（2）值的初始化（赋值）的时机不同
 * 		非静态的属性：创建实例对象时，在<init>()实例初始化方法中完成初始化
 * 		静态变量：类初始化时，在<clinit>()类初始化方法中完成初始化
 * 
 * 		静态变量的初始化比非静态的属性要早。
 * 		
 * 	（3）共享型不同
 * 		非静态的属性：每一个对象都是独立的，各自存了一份
 * 		静态变量：所有该类的对象共享同一份
 * 
 * 	（4）生命周期不同
 * 		非静态的属性：随着对象的创建而存在，当对象被垃圾回收器回收就消失
 * 		静态变量：随着类的初始化而初始化，随着类的卸载
 * 
 * 		静态变量的生命周期 = 类的生命周期
 * 		非静态的属性的生命周期 = 对象生命周期，每一个对象的生命周期都是独立的
 * 
 * 	（5）get/set不同
 * 		非静态的属性：对应get/set也是非静态的，如果局部变量与属性名重名了，用"this."区别
 * 		静态变量：对应get/set也是静态的，如果局部变量与属性重名了，用"类名."区别
 * 
 * 4、static修饰方法
 * 	static修饰方法，称为静态方法，类方法
 * 
 * 	（1）可以通过"类名."调用，可以不通过"对象."调用，当然也可以通过"对象."调用
 * 	（2）静态方法中不可以出现this，super这些关键字
 * 	（3）静态方法中不能直接使用本类的非静态的成员（属性、方法、内部类）
 * 	（4）静态方法是不能被重写的
 * 
 * 5、static修饰代码块
 * 	（1）作用：
 * 		代码块的作用：为属性初始化
 * 		代码块是分为非静态代码块和静态代码块。
 * 		非静态代码块的作用：为非静态的属性初始化
 * 		静态代码块的作用：为静态的属性，静态变量初始化
 * 	
 * 	（2）语法结构
 *  	【修饰符】 class 类名 【extends 父类】{
 * 
 * 			{
 * 				非静态代码块
 * 			}
 * 
 * 			static{
 * 				静态代码块
 * 			}
 * 
 * 		}
 * 
 * 	（3）执行的特点
 * 		A：无论创建几个对象，静态代码块只执行一次，如果有多个，那么就按顺序执行
 * 		B：静态代码块优先于非静态代码块的执行
 * 			因为静态代码块的执行是在类初始化时执行，类初始化执行的是一个叫做<clinit>的类初始化方法，
 * 			类初始化的<clinit>()方法由如下两个部分组成
 * 			第一：静态变量的显式赋值
 * 			第二：静态代码块
 * 			第三：第二部分谁在上面谁先执行，按顺序执行
 * 		C：子类的初始化时，如果发现父类还没有初始化，会先初始化父类，即先执行父类的<clinit>方法
 * 
 * 
 * 	
 * 	回忆：
 * 	局部变量：栈
 * 
 * 	回忆：
 * 	Math.sqrt()：静态的
 * 	
 * 	Scanner input = new Scanner(System.in);
 * 	input.next();非静态的
 * 
 */
public class TestStatic {
	
	private int i;//非静态的
	private static int j;//静态的

	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		Chinese c2 = new Chinese();
		
		c1.name = "张三";
		c2.name = "李四";
		
		c1.country = "中国";
		//c2.country = "中华人民共和国";
		
		System.out.println("c1.country = " + c1.country);
		System.out.println("c2.country = " + c2.country);
		
		System.out.println("c1.name = " + c1.name);
		System.out.println("c2.name = " + c2.name);
		
		//System.out.println("i = " + i);
		//System.out.println("i = " + this.i);
		//test();
		
	}
	
	public void test() {
		System.out.println("非静态的方法");
		System.out.println("j = " + j);//在非静态方法中，可以用静态的
	}
	
}
class Chinese{
	static String country;
	String name;
	
	static {
		System.out.println("静态代码块1");
	}
	
	static {
		System.out.println("静态代码块2");
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Chinese.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
