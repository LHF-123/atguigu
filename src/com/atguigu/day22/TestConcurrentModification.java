package com.atguigu.day22;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator迭代器和foreach遍历，多线程并发的问题。
 * 	用迭代器或foreach遍历时，再用集合对象的remove方法时会报ConcurrentModificationException异常
 * 	因为迭代器和集合两条线路同时操作元素。
 * 
 * 	在foreach或获取Iterator迭代器对象时，就会用expectedModCount != modCount，说明你用集合的add或remove
 * 	等方法修改了当前集合的元素就会报ConcurrentModificationException异常
 * 
 * 	如果你用Iterator迭代器自己的删除方法的话，那么他就会重新修改expectedModCount变量的值，保证与modCount的值一样
 * 
 * 	为了避免将来因为其他线程而修改了集合的元素，导致当前这个操作的数据不正确的风险，干脆快速失败，只要发现
 * 	expectedModCount != modCount，说明数据已经不是原来的数据，就快速失败。
 * 
 * 	旧版Enumration就不会快速失败，就有可能数据不一致性。
 */
public class TestConcurrentModification {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		
//		Iterator iterator = list.iterator();
//		while (iterator.hasNext()) {
//			Object next = iterator.next();
//			list.remove(next);
//		}
		
		for (Object object : list) {
			list.remove(object);
		}
		
	}

}
