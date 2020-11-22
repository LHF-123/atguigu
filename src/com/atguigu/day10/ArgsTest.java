package com.atguigu.day10;
/*
   *   新特性：可变个数形参的方法
 * 1.可变个数形参的格式：数据类型 ... 变量名
 * 2.当调用可变个数形参的方法时，可变个数的形参赋值时，可以赋值的变量个数为：0个，1个或多个。
 * 3.可变个数形参的方法与同一个类中的其他同名的方法之间构成重载
 * 4.可变个数形参的方法与同类型参数的数组结构，不可同时出现在类声明中
 * 5.规定：如果方法中存在可变个数形参，要求可变个数形参声明在方法形参的最后。
 * 6.推论：一个方法中最多只能有一个可变个数的形参
 * 
 * 
 */
public class ArgsTest {
	
	public static void main(String[] args) {
		ArgsTest test = new ArgsTest();
		test.method();
		test.method("AA","BB");
		test.method("CC");
		//test.method(new String[] {"AA","BB","CC"});
	}

	public void method(int i) {
		System.out.println("int型参数");
	}
	
	public void method(String s) {
		System.out.println("String型参数");
	}
	
	public void method(String ... strs ) {
		System.out.println("String型可变参数");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	//与对应的可变形参不能同时声明
//	private void method(String[] args) {
//		System.out.println("String型数组参数");
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
//	}
	
	public void method(int i, String...strs) {
		
	}
	
	//编译不通过
//	public void method(String...strs, int i) {
//		
//	}
	
}
