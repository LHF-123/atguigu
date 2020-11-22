package com.atguigu.day14exer;

/*
 * 	按照标准来说：先声明后使用
 * 
 * 	类的结构：
 * 	（1）属性列表
 * 	（2）代码块
 * 	（3）构造器
 * 	（4）方法
 * 
 * 	类的初始化和实例初始化
 * 1、类的初始化
 * 	（1）i = 100;
 *		MyClass.i++;											-->i=101
 *		System.out.println("(1)静态代码块 i = " + MyClass.i);		-->(1)静态代码块 i = 101
 *	
 *	（2）i = getNum("(4)i");
 *		print(str);												-->(4)i->101
		return ++i;												-->i=102
 * 
 * 2、实例的初始化方法
 * 	（1）
 * 		j = 100;
		this.j++;												-->j=101
		System.out.println("(2)构造代码块 j = " + this.j);			-->(2)构造代码块 j = 101
 *	
 *	（2） j = getNum("(5)j");		
 *			print(str);											-->(5)j->102
			return ++i;											-->i=103
 *
 *	（3）
 *		j = 200;
		j++;													-->j=201
		System.out.println("(3)构造器 j = " + j);					-->(3)构造器 j = 201
 * 
 */
public class TestStaticExer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
	}

}
class MyClass{
	static {
		i = 100;//可以
		MyClass.i++;//如果非要对field(属性)进行向前引用，那么在静态属性前面+类名.   ，在非静态的属性前面+this.
		System.out.println("(1)静态代码块 i = " + MyClass.i);
	}
	{
		j = 100;
		this.j++;
		System.out.println("(2)构造代码块 j = " + this.j);
	}
	public MyClass() {
		j = 200;
		j++;
		System.out.println("(3)构造器 j = " + j);
	}
	private static int i = getNum("(4)i");
	private int j = getNum("(5)j");
	
	public static void print(String str) {
		System.out.println(str + "->" + i);
	}

	private static int getNum(String str) {
		print(str);
		return ++i;
	}
}

//class MyClass{
//	static {
//		i = 100;//可以
////		i++;//错误 i = i + 1
//		MyClass.i++;//如果非要对field(属性)进行向前引用，那么在静态属性前面+类名.   ，在非静态的属性前面+this.
////		System.out.println("(1)静态代码块 i = " + i);//错误
//		System.out.println("(1)静态代码块 i = " + MyClass.i);
//	}
//	{
//		j = 100;
////		j++;
//		this.j++;
////		System.out.println("(2)构造代码块 j = " + j);
//		System.out.println("(2)构造代码块 j = " + this.j);
//	}
//	public MyClass() {
//		j = 100;
//		j++;
//		System.out.println("(3)构造器 j = " + j);
//	}
//	private static int i = getNum("(4)i");
//	private int j = getNum("(5)j");
//	
//	public static void print(String str) {
//		System.out.println(str + "->" + i);
//	}
//
//	private static int getNum(String str) {
//		print(str);
//		return ++i;
//	}
//}
