package com.atguigu.day21exer;

import java.util.TreeSet;

//添加到一个集合中，要求不可重复，但是要求按照销量从高到低排序
public class TestTreeSet {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		TreeSet set = new TreeSet();//要求放到TreeSet的元素必须实现java.util.Comparable接口
		
		//java.lang.ClassCastException:com.atguigu.day21exer.Book cannot be cast to java.util.Comparable
		set.add(new Book(1, "《从入门到精通》", "宋老师", 99.9, 10000));
		set.add(new Book(2, "《从入门到放弃》", "刘老师", 66.6, 20000));
		set.add(new Book(3, "《从精通到癫疯》", "刘尚坤", 88.8, 30000));
		
		for (Object object : set) {
			System.out.println(object);
		}

	}

}
