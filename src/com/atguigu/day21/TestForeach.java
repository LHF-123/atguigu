package com.atguigu.day21;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/*
 * foreach：成为增强版for循环
 * 	语法结构：
 * 	for(元素的类型 元素名 : 可迭代的容器名){
 * 	
 * 	}
 * 
 * 	可迭代的容器名：例如 数组和集合
 * 
 * 	把元素名"看成"形参，每循环一次，把数组或集合的元素一次作为实参赋值给它。
 * 	即，如果元素是基本数组类型，那么把数组或集合的元素"数据值"赋值给它，那么对它怎么修改和实参无关。
 * 	       如果元素是引用数组类型，那么把数组或集合的元素"地址值"赋值给它，那么对它的属性修改和实参有关。
 * 																	对它的地址值修改和实参无关。
 * 	结论：如果你只是查看数组或集合的元素，用foreach比较简单，如果涉及到删除，修改，就考虑其它的。
 * 
 */
public class TestForeach {
	
	@Test
	public void test4() {
		int[] arr = {1,2,3,4,5};
		
		//把数组的元素修改为原来的2倍
		for (int num : arr) {
			num = num * 2;
		}
		
		for (int num : arr) {
			System.out.println(num);
		}
		
	}
	
	@Test
	@SuppressWarnings("all")
	public void test3() {
		Collection c = new ArrayList();
		c.add("张三");
		c.add("李四");
		c.add("王五");
		c.add("赵六");
		c.add("钱七");
		
		for (Object object : c) {
			System.out.println(object);
		}
	}
	
	@Test
	public void test2() {
		String[] names = {"张三", "李四", "王五"};
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	@Test
	public void test1() {
		int[] arr = {1,2,3,4,5};
		
		//这个数组的元素类型:int
		//元素名：自己取
		//可迭代的容器名：数组名
		for (int num : arr) {
			System.out.println(num);
		}
		
	}

}
