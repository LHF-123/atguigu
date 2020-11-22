package com.atguigu.day23;

import java.util.ArrayList;

import org.junit.Test;

/*
 * 	关于泛型的一些说明：
 * 	1、泛型类，泛型接口，在运行时，不管泛型实参指定为什么类型，运行时类型都一样
 * 	2、泛型类，泛型接口，在指定了不同的泛型实参时，编译时是按照不同的类型来处理的
 * 	3、instanceof后面的类型，不能这么用
 * 		if (list instanceof ArrayList<Object>)
 * 	只能这么写：
 * 		if (list instanceof ArrayList)，因为instanceof后面是判断他的运行时类型
 * 
 * 	4、泛型与数组
 * 	(1)People[] arr = new People[5];可以
 * 		People<String>[] arr = new People<String>[5];不可以
 * 
 * 	5、异常类型不能加泛型，也不能用泛型形参
 * 	try{
 * 	}catch(异常类型 e){
 * 	}
 * 
 * 	try{
 * 	}catch(T e){
 * 	}
 */
class People<T>{
	private T t;
}
public class TestGenericOther {
	
	@Test
	public void test5() {
		Object[] arr = new String[5];//多态引用
		
//		ArrayList<Object> list = new ArrayList<Integer>();//不能构成多态引用
		
		System.out.println(arr);//[Ljava.lang.String;@621be5d1
		
		Object[] arr2 = new Object[6];
		System.out.println(arr2);//[Ljava.lang.Object;@573fd745

	}
	
	@Test
	public void test4() {
//		People[] arr = new People[5];
		People<String>[] arr = new People[5];
	}
	
	@Test
	public void test3() {
		ArrayList<Object> list = new ArrayList<Object>();
//		if (list instanceof ArrayList<Object>) {
//			
//		}
		
		if (list instanceof ArrayList) {
			
		}
		
	}
	
	@Test
	public void test2() {
//		ArrayList<Object> list = new ArrayList<Integer>();
		
		ArrayList<Object> list2 = new ArrayList<Object>();
		method(list2);
		
		ArrayList<Integer> list3 = new ArrayList<>();
//		method(list3);
	}
	
	public void method(ArrayList<Object> list) {
		
	}
	
	@Test
	public void test1() {
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		System.out.println(list1.getClass());
		System.out.println(list2.getClass());
		System.out.println(list3.getClass());
	}
}
