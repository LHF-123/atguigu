package com.atguigu.day11;
/*
 * 类的成员之三：构造器(或构造方法)，Constructor
 * 		construct:建设、建造
 * 
 * 1.构造器的作用：创建类的对象; 初始化对象的属性
 * 
 * 
 * 2.说明：
 * 	① 如果我们没有显式的提供类的构造器的话，则系统会默认给一个类提供默认的构造器：无参数的。
 * 	② 我们如果显式的声明类的构造器的话，格式为：权限修饰符  类名 (形参列表){ }
 * 	③ 同一个类中的多个构造器之间构成重载。
 * 	④ 如果我们显式的提供了类的构造器，则系统不再提供默认的空参的构造器
 * 	⑤ Java的类中一定存在构造器
 * 
 */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.eat();
		person.age = 1;
		
		Person person2 = new Person("Tom");
		person2.show();
	}

}

class Person{
	
	//属性
	String name;
	int age;
	
	//构造器
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String n) {
		name = n;
	}
	
	public Person(int a) {
		age = a;
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	//方法
	public void eat() {
		System.out.println("吃美食");
	}
	
	public void show() {
		System.out.println("name = " + name + ",age = " + age);
	}
}