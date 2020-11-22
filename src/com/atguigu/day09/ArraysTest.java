package com.atguigu.day09;

import java.util.Arrays;

/*
 * Arrays:
 * 1. java.util包下
 * 2. Arrays:操作数组的工具类，提供了一系列操作数组的方法
 * 3. 常见方法
 * boolean equals(int[] a, int[] b)
 * String toString(int[] a)
 * void fill(int[] a, int val)
 * void sort(int[] a)
 * int binarySearch(int[] a, int key)
 * copyOf(原数组, 新数组长度)
 * copyOfRange(原数组,from,to)
 * 
 * 
 */
public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[] {7,6,8,1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		
		//boolean equals(int[] a, int[] b):判断两个数组是否相等。--系列重载方法。
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		//String toString(int[] a):输出数组信息。--系列重载方法。
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//void fill(int[] a, int val):将指定值填充到数组中。--系列重载方法。
		//Arrays.fill(arr1, 3);
		//System.out.println(Arrays.toString(arr1));
		
		//void sort(int[] a):排序，底层使用快速排序法实现
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//int binarySearch(int[] a, int key):二分法查找，要先排序
		int index = Arrays.binarySearch(arr1, 8);
		System.out.println(index);
	}

}
