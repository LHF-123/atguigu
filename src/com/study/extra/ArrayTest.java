package com.study.extra;

public class ArrayTest {

	/*
	 * 一、 数组相关知识：
	 * 1. 定义：是多个相同类型数据按一定的顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
	 * 2. 相关概念：
	 * 		2.1 元素
	 * 		2.2 下标、角标、索引
	 * 		2.3 数组名
	 * 		2.4 数组长度
	 * 3. 数组，属于引用数据变量。数组的元素，可以是基本数据类型，也可以是引用数据变量
	 * 4. 数组的分类：
	 * 		4.1 按照维度：一维数组、二维数组、三维数组、....
	 * 		4.2 按照元素类型：基本数据类型变量的数组。引用数据类型变量的数组
	 * 5. 数组一旦初始化完成，则数组的长度就确定了。长度一旦确定，就不可修改。
	 * 6. 数组中的元素在内存空间中是连续存储的。
	 * 
	 * 如果数组的元素是类类型的：对象数组
	 * 
	 * 二、 一维数组的使用(知识点：1-4)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.数组的声明和初始化
		
		//声明
		int[] arr1;
		
		//静态初始化：数组的初始化和数组元素的赋值同时进行。
		arr1 = new int[] {1,2,3,4};
		//合并声明和初始化
		int[] arr2 = new int[] {5,6,7,8};
		//或 int arr2[] = new int[] {5,6,7,8};
		//或 int[] arr2 = {5,6,7,8};//没有new int，这叫做类型推断,声明和初始化同时进行时可以
		
		//动态初始化：数组的初始化和数组元素的赋值分开进行
		String[] arr3 = new String[3];

		//2.如何调用数组的元素：通过角标的方式。角标从0开始，到长度 -1 结束
		arr3[0] = "第一个";
		arr3[1] = "第二个";
		arr3[2] = "第三个";
		
		arr3 = new String[5];
				
		//错误的声明方式
		//int[] arr4 = new int[4] {1,2,3,4};
		//int[4] arr4 = new int[] {1,2,3,4};
		
		// 3.数组的长度：使用length属性调用
		System.out.println(arr3.length);//5
		System.out.println(arr2.length);//4
		
		// 4.遍历数组元素
		//System.out.println(arr2[0]);
		//System.out.println(arr2[1]);
		//System.out.println(arr2[2]);
		//System.out.println(arr2[3]);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
