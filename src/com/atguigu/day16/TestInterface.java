package com.atguigu.day16;

/*
 * JDK1.8之后，接口的语法有改动：
 * 	增加了两类成员：
 * 	（1）静态方法：public static, static不可以省略
 * 		通过“接口名.方法”来进行调用
 * 	说明：接口的静态方法不会继承到实现类，不能用接口的实现类的对象来调用。
 * 
 * 	（2）默认方法：public default, default不可以省略
 * 		通过“实现类的对象.方法”来进行调用
 * 	说明：实现类可以对接口的默认方法进行重写。重写时不需要加default
 * 
 * 	什么情况用静态方法？
 * 	因为原来API中，往往会设计为这样：
 * 	（1）集合的接口：Collection
 * 		集合的工具类：Collections
 * 	（2）文件
 * 		文件路径的接口：Path
 * 		工具类:Paths
 * 
 * 	觉得没必要我这个接口在增加一个工具类了，干脆把这些方法写到接口中，减少.class文件的 数量，减少API的类型数量
 * 
 * 	什么情况用到默认方法？
 * 	当这个接口的某个抽象方法，在很多实现类中的实现代码时一样的，那么可以吧这个实现挪到接口中，用默认方法进行实现。
 * 	如果对该抽象方法不一样的实现的实现类，那么可以对该默认方法进行重写
 */
public class TestInterface {
	
	public static void main(String[] args) {
		
		MyInter.print();
		
		MyImpl my = new MyImpl();
		my.test();
		my.method();
	}

}
interface MyInter{
	String INFO = "尚硅谷";//全局的静态的常量
	void test();//公共的抽象方法
	
	public static void print() {
		System.out.println("接口的静态方法");
	}
	
	public default void method() {
		System.out.println("接口的默认方法");
	}
	
}
class MyImpl implements MyInter{

	@Override
	public void test() {
		System.out.println("实现接口的抽象方法");
	}
	
}

interface B{
	
		public default void b() {
			System.out.println("aa");
		}
		
}

class SubA1 implements B{
	
}
class SubB1 implements B{
	
}
class SubC1 implements B{
	
}
class SubD1 implements B{

	@Override
	public void b() {
		System.out.println("dd");
	}
	
}

interface A{
	
	void a();
	
}

class SubA implements A{

	@Override
	public void a() {
		System.out.println("aa");
	}
	
}
class SubB implements A{

	@Override
	public void a() {
		System.out.println("aa");
	}
	
}
class SubC implements A{

	@Override
	public void a() {
		System.out.println("aa");
	}
	
}
class SubD implements A{

	@Override
	public void a() {
		System.out.println("dd");
	}
	
}
