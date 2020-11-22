package com.atguigu.day22;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * Set的底层实现，内部实现：
 * 
 * HashSet：内部实现是HashMap
 * 		添加(add)到HashSet的元素是作为HashMap的key，所有的value共享同一个Object类型的常量对象PRESENT
 * LinkedHashSet:内部实现是LinkedHashMap
 * 		添加(add)到LinkedHashSet的元素是作为LinkedHashMap的key，所有的value共享同一个Object类型的常量对象PRESENT
 * TreeSet：内部实现是TreeMap
 * 		添加(add)到TreeSet的元素是作为TreeMap的key，所有的value共享同一个Object类型的常量对象PRESENT
 */
public class TestSet {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("张三");
		
		LinkedHashSet lset = new LinkedHashSet();
		lset.add("李四");
		
		TreeSet tree = new TreeSet();
		
	}

}
