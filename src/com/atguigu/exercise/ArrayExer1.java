package com.atguigu.exercise;
/*
 * 使用简单数组
 * (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
 * (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
 * (3)显示array1的内容。
 * (4)赋值array2的变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
 * 	     打印出array1
 * 
 * 思考：array1和array2是什么关系？不同的变量，但是指向了对空间中同一个数组
 * 拓展：修改题目，实现array2对array1数组的复制
 * 
 */
public class ArrayExer1 {

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
		System.out.println("array1栈空间的地址值" + array1);
		//赋值array2的变量等于array1
		array2 = array1;//把array1的栈空间的地址值赋值给了array2，因此两个数组指向同一个堆空间内容
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
