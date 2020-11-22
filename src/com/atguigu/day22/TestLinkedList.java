package com.atguigu.day22;

import java.util.LinkedList;

/*
 * 	LinkedList：
 * 	1、内部实现：链表
 * 	记录Node first
 * 		Node last
 * 
 * 	2、add(xx)
 * 	默认添加到链表的尾部linkLast(xx)
 * 
 * 	3、add(int index, xx)
 * 
 * 	4、remove(xx)
 */
public class TestLinkedList {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("xx");
		list.add(0, "ss");
		
		list.remove("xx");
		
	}

}
