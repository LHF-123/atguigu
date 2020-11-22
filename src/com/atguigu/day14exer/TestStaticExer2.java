package com.atguigu.day14exer;

/*
 * 1、先完成类的初始化
 * 	（1）先执行父类的初始化
 * 		i = getNum("(1)i");								--> 执行完getNum()后，结果就是1
 * 			print(str);									
 * 				System.out.println(str + "->" + i);		--> (1)i->0默认值
 * 			return ++i;									--> i=1
 * 		print("(3)父类静态代码块");
 * 			System.out.println(str + "->" + i);			--> (3)父类静态代码块->1
 * 
 * 	（2）再执行子类的初始化
 * 		k = getNum("(6)k");								--> 执行完getNum()后，结果就是1
 * 			print(str);
 * 				System.out.println(str + "->" + k);		-->(6)k->0默认值
 * 			return ++k;									-->k=1
 * 		print("(8)子类静态代码块");
 * 			System.out.println(str + "->" + k);			-->(8)子类静态代码块->1
 * 
 * 2、再完成实例的初始化
 * 	（1）先执行的父类的实例初始化方法<init>：
 * 		j = getNum("(2)j");
 * 			print(str);
 * 				System.out.println(str + "->" + i);		--> (2)j->1
 * 			return ++i;									-->i=2
 * 		print("(4)父类构造代码块");
 * 			System.out.println(str + "->" + i);			-->(4)父类构造代码块->2
 * 		print("(5)父类构造器");
 * 			System.out.println(str + "->" + i);			-->(5)父类构造器->2
 * 
 * 	（2）子类的实例初始化方法<init>：
 * 		//super()的意义就是执行父类的实例初始化方法<init>
 * 		h = getNum("(7)h");
 * 			print(str);
 * 				System.out.println(str + "->" + k);		-->(7)h->1
 *			return ++k;									-->k=2
 * 		print("(9)子类构造代码块");
 * 			System.out.println(str + "->" + k);			-->(9)子类构造代码块->2
 * 		print("(10)子类构造器");
 * 			System.out.println(str + "->" + k);			-->(10)子类构造器->2
 * 		
 *
 */
public class TestStaticExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zi = new Zi();
	}

}
class Fu{
	private static int i = getNum("(1)i");
	private int j = getNum("(2)j");
	static {
		print("(3)父类静态代码块");
	}
	
	{
		print("(4)父类构造代码块");
	}
	
	public Fu() {
		print("(5)父类构造器");
	}
	
	public static void print(String str) {
		System.out.println(str + "->" + i);
	}
	
	public static int getNum(String str) {
		print(str);
		return ++i;
	}
	
}
class Zi extends Fu{
	private static int k = getNum("(6)k");
	private int h = getNum("(7)h");
	static {
		print("(8)子类静态代码块");
	}
	
	{
		print("(9)子类构造代码块");
	}
	
	public Zi() {
		//super();//目的调用父类的无参构造，本质上调用父类的实例初始化方法<init>()
				//super()必须在子类构造器的首行，本质上是在子类实例初始化的首行
		print("(10)子类构造器");
	}
	
	public static void print(String str) {
		System.out.println(str + "->" + k);
	}
	
	public static int getNum(String str) {
		print(str);
		return ++k;
	}
}
