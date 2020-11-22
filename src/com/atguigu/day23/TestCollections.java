package com.atguigu.day23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/*
 * 	数组的工具类：java.util.Arrays
 * 	集合的工具类：java.util.Collections
 * 
 * 	(1)
 * 	static <T> boolean addAll(Collection<? super T> c, T... elements) 
 * 	作用：添加elements这些对象到c这个集合中
 * 
 * 	(2)
 * 	static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) 
 * 	作用：在list集合中查找key的索引 
 * 		因为只有List系列才有索引信息，所以这里用List作为形参列表
 * 		因为List本身是不支持大小排序，所以List的泛型要支持比较大小
 * 		binarySearch：二分法查找，要求数组或集合必须有序的。
 * 
 * 	(3)
 * 	static boolean disjoint(Collection<?> c1, Collection<?> c2)  
 * 	作用：判断两个集合是否完全不同
 * 
 * 	(4)
 * 	static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)  
 * 	作用：找coll中最大值
 * 
 * 	问？<T extends Object & Comparable<? super T>>这里为什么要写Object
 * 		因为当擦除后，为了按照Object处理，是的返回值类型T，按照Object与老版本保持一致
 * 
 * 	(5)
 * 	static <T extends Comparable<? super T>> void sort(List<T> list) 
 * 		这个方法要求T或T的父类必须实现Comparable接口
 * 	static <T> void sort(List<T> list, Comparator<? super T> c)  
 * 		因为需要单独指定比较器
 * 	
 */
class Graphic implements Comparable<Graphic>{

	@Override
	public int compareTo(Graphic o) {
		return 0;
	}
	
}
class Circle extends Graphic{
	
}
class Fruit{
	
}
class Apple extends Fruit{
	
}
public class TestCollections {
	
	@Test
	public void test7() {
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple());
		list.add(new Apple());
		list.add(new Apple());
		
		Collections.sort(list, new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				return 0;
			}
			
		});
	}
	
	@Test
	public void test6() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("hello");
		list.add("world");
		
		Collections.sort(list);
	}
	
	@Test
	public void test5() {
		List<Circle> list = new ArrayList<Circle>();
		//...
		
		Circle max = Collections.max(list);
		
	}
	
	@Test
	public void test4() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("hello");
		list.add("world");
		
		String max = Collections.max(list);
		System.out.println(max);
		
	}
	
	@Test
	public void test3() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("hello");
		list.add("world");
		
//		List<Integer> list2 = new ArrayList<Integer>();
//		list2.add(1);
//		list2.add(2);
//		list2.add(3);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("hello");
		list2.add("world");
		
		boolean b = Collections.disjoint(list, list2);
		System.out.println(b);
		
	}
	
	@Test
	public void test2() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("hello");
		list.add("world");
		
		int index = Collections.binarySearch(list, "hello");
		System.out.println(index);
	}
	
	@Test
	public void test1() {
//		Collection<String> c = new ArrayList<String>();
		Collection<Object> c = new ArrayList<>();
		Collections.addAll(c, "hello", "java", "world");
		
		for (Object object : c) {
			System.out.println(object);
		}
	}

}
