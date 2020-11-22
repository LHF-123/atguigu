package com.atguigu.day21exer;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * 1、声明一个Book类型，有编号、书名、作者、价格、销量
 * 2、添加到一个集合中，要求不可重复，规定编号相同就认为是同一本书
 * 		提示：HashSet
 * 3、添加到一个集合中，要求不可重复，但是要求按照销量从高到低排序
 * 		提示：TreeSet
 * 4、添加到一个集合中，要求不可重复，但是要求这次价格按照从低到高排序
 * 		提示：TreeSet
 * 5、添加到一个集合中，要求不可重复，但是要求按照添加顺序显示
 * 		提示：LinkedHashSet
 */
public class TestSetExer2 {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(new Book(1, "《从入门到精通》", "宋老师", 99.9, 10000));
		set.add(new Book(2, "《从入门到放弃》", "刘老师", 66.6, 20000));
		set.add(new Book(3, "《从精通到癫疯》", "刘尚坤", 88.8, 30000));
		set.add(new Book(3, "《从精通到》", "刘尚", 88.7, 3000));
		
		for (Object object : set) {
			System.out.println(object);
		}
	}

}
