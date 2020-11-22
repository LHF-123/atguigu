package com.atguigu.day08;
/*
 * 二维数组的使用：
 * 1.如果数组的元素，又是数组类型的，则构成了多维数组。
 * 2.调用数组的元素：使用角标的方式
 * 3.数组的长度
 * 4.二维数组的遍历
 * 5-6见TwoArrayTest2
 * 
 */

public class TwoArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//一维初始化
		int[] arr = new int[] {1,2,3};
		//静态初始化：数组的赋值和数组元素的赋值同时进行
		int[][] arr1 = new int[][] {{1,2,3},{4,5},{7,8}};
		
		//动态初始化：数组的初始化和数组元素的赋值分开进行。
		//动态初始化方式1：
		int[][] arr2 = new int[3][2];
		//动态初始化方式1：
		int[][] arr3 = new int[3][];
		arr3[0] = new int[3];
		arr3[1] = new int[2];
		arr3[2] = new int[4];
		
		//错误的初始化方式：
		//int[][] arr4 = new int[][4];
		//int[][] arr5 = new int[3][] {{1,2,3},{4,5},{7,8}};
		//int[][] arr6 = new int[3][2] {{1,2},{3,4},{5,6}};
	
		//2.调用数组的元素：使用角标的方式
		System.out.println(arr1[1][0]);
		arr3[1][1] = 1;
		
		//3.数组的长度
		System.out.println(arr1.length);//3
		System.out.println(arr1[1].length);//2
		System.out.println(arr3.length);//3
		System.out.println(arr3[2].length);//4
		
		System.out.println("**************************");
		//4.二维数组的遍历
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
