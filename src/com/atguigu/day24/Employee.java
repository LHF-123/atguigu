package com.atguigu.day24;

/*
 *  1、java.io.Serializable：是一个标识型接口，没有抽象方法等
 * 	
 * 	2、Serializable
 * 	实现了Serializable接口时，最好要加serialVersionUID（序列化版本ID），
 * 	如果不加，那么类只要重新编译，原来序列化的数据就无法反序列化了，因为每次编译都会自动随机产生一个serialVersionUID。
 * 	如果加了这个，那么就算类重新编译，serialVersionUID值不变，原来序列化的数据仍然可以反序列化。
 * 
 * 	3、如果Employee对象中某些属性的值不想要序列化，怎么办？
 * 	例如：一些属性的值是计算的值，多变的值
 * 	在属性前面加一个关键字transient，瞬时的
 * 
 * 	4、一个类的静态static的变量是不会序列化的
 * 	因为静态变量不属于某个对象，是所有对象共享的。
 * 	而序列化是保存对象状态信息。是每个对象独立的信息
 * 
 */
import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private transient double salary;
	private static String company = "atguigu";
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", company = " + company;
	}
	
	public void test() {
		System.out.println("xx");
	}
	
}
