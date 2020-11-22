package com.atguigu.day20;

public class TestMyArrayList {

	public static void main(String[] args) {
		//1、创建一个容器
		MyArrayList my = new MyArrayList();
		
		//2、可以装对象
		my.add("张三");
		my.add("李四");
		my.add(null);//null也是一个有效元素
		my.add("王五");
		
		//3、查看有几个元素
		System.out.println(my.size());
		
		//4、遍历元素
		Object[] all = my.toArray();
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		System.out.println();
		
		//5、获取index位置的元素
		Object object = my.get(0);
		System.out.println(object);
		
		//6、查找李四的位置
		int index = my.indexOf("李四");
		System.out.println(index);
		
	}

}
