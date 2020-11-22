package com.atguigu.day22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
 * java.util.Iterator接口。
 * 	（1）boolean hasNext()
 * 	（2）E next()
 * 	（3）void remove()
 * 
 * 	所有的Collection系列的集合都包含一个：
 * 	Iterator iterator()
 * 
 * 	问？Iterator接口的实现类在哪里？
 * 		或Collection系列的集合中的iterator()是返回谁（哪个类）的对象？
 * 
 * 	例如：
 * 	ArrayList：内部有一个内部类，Itr implements Iterator接口
 * 	Vector：内部也有一个内部类，Itr implements Iterator接口
 * 	LinkedList：内部有一个Itr implements Iterator接口，还有ListItr implements ListIterator接口
 * 
 * 	结论：每一种Collection系列集合的实现类中都有一个内部类还实现Iterator接口。
 * 
 * 	为什么要这么做？
 * 	这个Iterator接口对象的作用就是遍历，迭代集合的元素用，设计为内部类的好处，就是可以方便的直接访问集合的内部元素。
 * 	比喻：公交车上售票员，火车上乘务员，飞机上空姐
 * 		即每一个集合的迭代器只为当前的集合服务。
 * 
 * 
 */
public class TestIterator {
	
	public void test3() {
		LinkedList list = new LinkedList();
		Iterator iterator = list.iterator();//new Itr
	}
	
	public void test2() {
		Vector list = new Vector();
		Iterator iterator = list.iterator();//new Itr
	}
	
	public void test1() {
		ArrayList list = new ArrayList();
		Iterator iterator = list.iterator();//new Itr
	}

}
