package com.atguigu.day20;

public class TestSingleList {

	public static void main(String[] args) {
		//1、创建容器
		MySingleList my = new MySingleList();
		
		//2、添加元素
		my.add("张三");
		my.add("李四");
		my.add("王五");
		my.add("赵六");
		
		//3、元素个数
		System.out.println(my.size());
		
		//4、遍历
		Object[] arr = my.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		//5、删除
		my.remove("张三");
		arr = my.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		my.remove("王五");
		arr = my.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		my.remove("赵六");
		arr = my.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
