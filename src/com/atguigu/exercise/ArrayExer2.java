package com.atguigu.exercise;
/*
 * 拓展：修改题目，实现array2对array1数组的复制
 * 
 */
public class ArrayExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//声明
		int[] array1, array2;
		//初始化
		array1 = new int[] {2,3,5,7,11,13,17,19};
		//遍历array1
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		//复制array1得到array2
		array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		
		System.out.println("array1栈空间的地址值" + array1);
		System.out.println("array2栈空间的地址值" + array2);
		
		//修改array2
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = i;
			}
		}
		
		//遍历array1
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
