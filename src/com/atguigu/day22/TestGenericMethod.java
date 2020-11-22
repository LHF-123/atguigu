package com.atguigu.day22;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
 * 	二、泛型方法
 * 	1、为什么要声明泛型方法？
 * 	（1）当该方法是一个静态方法，而该方法的形参类型或返回值类型不确定，那么可以单独为这个方法设计（声明）一个泛型形参。
 * 	（2）当某个类不是泛型类，而它的某个非静态方法想要用泛型，也可以单独为这个方法设计（声明）泛型形参
 * 	（3）当某个类是泛型类，但是某个非静态方法不想用类上的泛型形参，而是想要单独设计一个自己的泛型，那么也可以
 * 
 * 	2、泛型的语法格式：
 * 	【修饰符】 <泛型形参类型列表>  返回值  方法名(【形参列表】)【throws 异常列表】{}
 * 
 * 	（1）泛型方法的<泛型形参类型列表>什么时候确定？当调用这个方法时，传了对应的实参，就可以确定类型。
 * 	（2）泛型方法的<泛型形参类型列表>也可以指定上限
 * 
 * 		【修饰符】 <T extends 上限>  返回值  方法名(【形参列表】)【throws 异常列表】{}
 * 
 * 	3、示例
 * 	（1）java.util.Arrays
 * 		public static  <T>  List<T> asList(T...a)
 * 	（2）public static <T> T[] copyOf(T[] original, int newLength)
 * 	（3）public static <T> void sort(T[] a, Comparator<? super T> c)
 * 		...
 * 
 * 
 */
public class TestGenericMethod {
	
	@Test
	public void test1() {
		List<String> asList = Arrays.asList("hello", "java");
		System.out.println(asList.getClass());
		
//		ArrayList<String> list = (ArrayList<String>) asList;
		//错误的，不是java.util.ArrayList，而是Arrays.ArrayList，是个内部类
		
//		asList.add("world");//错误的，因为Arrays.ArrayList是个只读的
		
//		List<Integer> asList2 = Arrays.asList(1, 2, 3, 4);
	}
	
}
