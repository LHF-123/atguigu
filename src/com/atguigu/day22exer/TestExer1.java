package com.atguigu.day22exer;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *	1、练习1：
 *	把学员的姓名（String）存储到一个ArrayList中，并且用foreach和Iterator分别遍历
 *
 *	JDK 1.7之前：
 *	ArrayList<String> list = new ArrayList<String>();
 *	JDK 1.7之后
 *	ArrayList<String> list = new ArrayList<>();
 *
 */
public class TestExer1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
	}

}
