package com.atguigu.day22;

import java.util.ArrayList;

/*
 * ArrayList：动态数组
 * 	内部实现：数组
 * 
 * 	1、初始化大小：10
 * 	如果JDK 1.8时new ArrayList()，发现数组初始化为一个DEFAULTCAPACITY_EMPTY_ELEMENTDATA，长度为0的空数组。
 * 	如果JDK 1.6时new ArrayList()，发现数组初始化为一个长度为10的Object[]
 * 	如果JDK 1.7时new ArrayList()，发现数组初始化为一个EMPTY_ELEMENTDATA，长度为0的空数组。
 * 
 * 	2、添加元素时，如果数组满了，如何扩容？
 * 	扩容为原来的1.5倍
 * 
 * 	JDK 1.7和JDK 1.8时，因为一开始是空数组，那么第一次扩展长度为10的数组
 * 	然后不够了再扩容为原来的1.5倍
 * 
 * 	3、删除元素时，数组会不会缩小？
 * 		不会
 * 	但是像ArrayList有一个trimToSize()可以调整大小
 * 	
 */
public class TestArrayList {
	
	@SuppressWarnings("all")
	public void test18() {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("11");
		
		list.remove("1");
		
	}
	
}
