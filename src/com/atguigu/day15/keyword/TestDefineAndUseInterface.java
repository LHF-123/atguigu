package com.atguigu.day15.keyword;

/*
 * Ctrl+1:快速修复
 * 
 * 	接口和类是同一个级别的概念。
 * 	Java的数据类型：基本数据类型和引用数据类型
 * 	引用数据类型：类、接口、数组、枚举。。。
 * 
 * 1、如何声明一个接口
 * 	语法格式：
 * 	【修饰符】 interface 接口名{
 * 	}
 * 
 * 2、接口的成员有哪些？
 * JDK1.8之前：
 * 	（1）全局的静态的常量：public static final
 * 	（2）公共的抽象方法：public abstract
 * 
 * JDK1.8之后：
 * 	。。。
 * 
 * 	说明：接口是没有构造器，代码块，除了全局的静态的常量以外的普通的属性等。
 * 
 * 3、如何实现接口？
 * 	用来被实现
 * 	【修饰符】 class 实现类 【extends 父类】 implements 接口们{
 * 
 * 	}
 * 
 * 4、接口的特点：
 * 	（1）实现类在实现接口时，必须实现接口的所有抽象方法，否则这个实现类就必须是个抽象类
 * 	（2）一个类可以同时实现多个接口
 * 	（3）接口不能直接创建对象
 * 	（4）接口可以与实现类的对象构成多态引用
 * 	（5）一个类可以同时继承父类，又实现接口，但是要求，继承在前，接口在后。
 * 	（6）接口与接口之间支持多继承
 * 
 * 
 * 	理解：（2）
 * 	父类：亲生父亲，只有一个
 * 	接口：干爹，可以同时有很多个
 * 
 */
public class TestDefineAndUseInterface {
	
	public static void main(String[] args) {
		Flyable f = new Bird();
		f.fly();
	}
	
}

interface Flyable{
	int MAX_VALUE = 7900000;//最高速度，超过这个速度，就会脱离地心引力。public static final可以省略不写
	int MIN_VALUE = 0;//最低速度。public static final可以省略不写
	
	void fly();//public abstract可以省略不写
	
}

interface Jumpable{
	void jump();
}

class Animal{
	
}

class Bird extends Animal implements Flyable, Jumpable{

	@Override
	public void fly() {
		System.out.println("我要飞的更高，飞的更高....");
	}

	@Override
	public void jump() {
		System.out.println("双脚跳");
	}
	
}

/*
 * 	类与类之间：继承extends
 * 	类与接口之间：实现implements
 * 	接口与接口之间：继承extends
 */
interface A{
	void a();
}
interface B{
	void b();
}
interface C extends A, B{
	void c();
}
class MySubClass implements C{

	@Override
	public void a() {
	}

	@Override
	public void c() {
	}

	@Override
	public void b() {
	}
	
}