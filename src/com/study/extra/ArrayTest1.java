package com.study.extra;

import java.io.StreamCorruptedException;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 二、 一维数组的使用(知识点：5-6)
		 * 
		 * 5.不同类型的数组的默认初始化的情况：
		 * 		整型：0
		 * 		浮点型：0.0
		 * 		字符型：0
		 * 		布尔型：false
		 * 		引用类型：null
		 * 	此时的规范与后面的类的属性的默认初始化一致！
		 * 
		 * 6.一维数组的内存解析
		 * 
		 */
		
		
		// 5.1整型数组元素的默认初始化值为：0
		int[] arr1 = new int[4];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("********************");
		
		// 5.2浮点型数组元素的默认初始化值为：0.0
		double[] arr2 = new double[5];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("********************");
		
		// 5.3字符型数组元素的默认初始化值为：'\u0000'  0不是'0'
		char[] arr3 = new char[5];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("***" + arr3[i] + "***");
		}
		System.out.println("********************");
		
		// 5.4布尔类型数组元素的默认初始化值为：false
		boolean[] arr4 = new boolean[4];
		System.out.println(arr4[0]);
		System.out.println("********************");
		
		// 5.5引用数据类型数组元素的默认初始化值为：null
		String[] arr5 = new String[5];
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
		
		// 6.一维数组的内存解析
		System.out.println();
		System.out.println();
		String[] arr6 = new String[3];
		arr6[1] = "刘";//在长度为3的堆里面，如果重新分配，这里赋的值会被回收
		arr6 = new String[5];//此时在堆里会重新分配空间，栈里的变量名地址会指向堆，之前堆里的数组会被内存回收
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr5[i]);
		}
		
	}

}
