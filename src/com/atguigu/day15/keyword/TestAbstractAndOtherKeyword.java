package com.atguigu.day15.keyword;

/*
 * 1、权限修饰符
 * public，protected，缺省，private
 * 	（1）private和abstract不能同时修饰方法，因为private的方法在子类中不可见，无法重写
 * 	（2）private和abstract可以同时修饰成员内部类
 * 
 * 2、static
 * static修饰属性、方法、代码块、内部类
 * abstract修饰类、方法
 * 
 * 	修饰内部类：可以
 * 	修饰方法：static和abstract不能同时修饰方法，因为static的方法不能被重写，并且static的方法直接用“类名.”调用，没有方法体执行
 * 
 * 3、final
 * 	修饰方法：final和abstract不能同时修饰方法，final表示不能被重写，abstract必须被重写
 * 	修饰类：final和abstract不能同时修饰类，final不能被继承，abstract就是用来继承的。
 * 
 * 4、native
 * 	修饰方法：native和abstract不能同时修饰方法，native是表示方法体由C语言实现，abstract表示无方法体，由子类实现
 */
public class TestAbstractAndOtherKeyword {
	
}
abstract class Father{
//	private abstract void test();//错误的，不能同时修饰方法，因为private的方法在子类中不可见，无法重写
	
//	public abstract static void test();
	//错误的，不能同时修饰方法，因为static的方法不能被重写，并且static的方法直接用“类名.”调用，没有方法体执行
	
//	public final abstract void test();//错误的，final表示不能被重写，abstract必须被重写
	
//	public native abstract void test();//错误的，native是表示方法体由C语言实现，abstract表示无方法体，由子类实现
	
	private abstract class Inner{
		
	}
}
class Son extends Father{
	
}