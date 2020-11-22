package com.atguigu.day12;
/*
 * this关键字的使用：
 * 1. 理解为：当前对象 或 当前正在创建的对象
 * 
 * 2. 使用范围：this可以使用在方法或构造器的内部
 * 
 * 3. 可以调用的结构：属性、方法 ; 构造器
 * 
 * 4. 在方法中使用this：
 * 	     我们可以在方法内，调用当前类的属性或方法，属性或方法前可以使用"this."的方式，表明调用的是当前对象的属性或方法。
 * 	     通常情况下，我们都习惯省略this关键字。
 * 	     但是如果方法的形参和类的属性名相同了，则必须使用"this.变量"的方式，表明我们调用的变量是当前对象的属性，而非形参。
 * 
 * 5. 在构造器中使用this：
 * 	    我们可以在构造器内，调用当前类的属性或方法，属性或方法前可以使用"this."的方式，表明调用的是当前正在创建的
 * 	    对象的属性或方法。
 * 	    通常情况下，我们都习惯省略this关键字。
 * 	    但是如果构造器的形参和类的属性名相同了，则必须使用"this.变量"的方式，表明我们调用的变量是当前正在创建的
 * 	    对象的属性，而非形参。
 * 
 * 6. this来调用构造器：
 * ① 我们可以在构造器中使用“this(参数列表)”方式，调用当前类中的指定构造器
 * ② 构造器中不可以使用“this(参数列表)”方式调用本身的构造器
 * ③ 如果类中声明了n个构造器，则最多可以有n - 1个构造器使用了“this(参数列表)”方式调用其他构造器
 * ④ 规定：要求将“this(参数列表)”声明在构造器的首行
 * ⑤ 一个构造器中最多声明一个“this(参数列表)”
 * 
 */
public class ThisTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.eat();
		
		person.show();
		
		Person person2 = new Person("Tom");
		person2.show();
		
		System.out.println();
		
		Person person3 = new Person(12);
		person3.show();
	}
	
}

class Person{
	
	private String name;
	private int age;
	
	public Person() {
		//100行初始化信息
		//this("Tom");
		System.out.println("100行初始化信息");
	}
	
	public Person(String name) {
		this();//调用空参时的初始化信息
		this.name = name;
	}
	
	public Person(int age) {
		this("小明");//调用String类型为形参的构造器
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;//就近原则
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("吃饭");
		
		this.study();
	}
	
	public void study() {
		System.out.println("学习");
	}
	
	public void show() {
		System.out.println("name : " + this.name + ", age : " + this.age);
	}
	
}