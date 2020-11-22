package com.atguigu.day23;

import java.util.ArrayList;

import org.junit.Test;

/*
 * 	泛型的擦除:
 * 	当某个类，接口是泛型类，接口时，使用时，没有指定泛型实参，那么这个时候就会发生泛型擦除
 * 	当泛型擦除时，这个泛型是按什么类型处理？
 * 		按照父类处理，如果没有指定父类，那么按照Object处理
 * 		这个父类可以是一个类，也可以是接口。如果既有类，又有接口，类在前，接口在后。
 * 			如果没有类，也可以多个接口。不管怎么样，只要有上限，就按照第一个上限处理
 */
public class TestErase {
	
	@Test
	public void test1() {
		//ArrayList<E>
		//没有指定ArrayList的泛型实参，这个E按照Object处理
		ArrayList list = new ArrayList();
	}
	
	@Test
	public void test2() {
		Student stu = new Student();
	}
	
	@Test
	public void test3() {
		MyClass stu = new MyClass();
	}
	
}
class Student<T extends Number>{
	private String name;
	private T score;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public T getScore() {
		return score;
	}
	
	public void setScore(T score) {
		this.score = score;
	}
	
}
interface Flyable{
	
}
interface Runnable{
	
}
class MyClass<T extends Number & Flyable & Runnable>{
	public void test(T t) {
		
	}
}
