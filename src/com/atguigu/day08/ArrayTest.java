package com.atguigu.day08;
/*
 * 数组的常用算法：复制(excise里ArrayExer2练习也是)、反转、查找、遍历
 * 
 */
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[] {"GG","JJ","DD","MM","AA","BB"};
		
		//1.复制
		String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		
		//错误的：String[] arr1 = arr;
		
		//2.反转
		//方法一：
		/*
		for (int start = 0,end = arr.length - 1; start <end; start++,end--) {
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		*/
		
		//方法二：
		/*
		for (int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length -1 - i];
			arr[arr.length -1 - i] = temp;
		}
		*/
		
		//3.遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		//4.查找(或搜索)
		//方式一：线性查找
		String str = "MM";
		boolean isFlag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {//比较两个字符串的内容是否相等，使用equals()
				System.out.println("找到了！索引位置为：" + i);
				isFlag = false;
				break;
			}
		}
		
		if (isFlag) {
			System.out.println("不好意思，没找到");
		}
		
		//方式二：二分法查找
		//前提：数组要有序。
		int[] arr3 = new int[] {-99,-54,-2,0,2,33,43,256,999};
		boolean isFlag1 = true;
		int number = 256;
		//int number = 25;
		int head = 0;//首索引位置
		int end = arr3.length - 1;//尾索引位置
		while (head <= end) {
			int middle = (head + end) / 2;
			if (arr3[middle] == number) {
				System.out.println("找到指定元素，索引为：" + middle);
				isFlag1 = false;
				break;
			}else if (arr3[middle] > number) {
				end = middle - 1;
			}else {//arr3[middle] < number
				head = middle + 1;
			}
		}
		
		if (isFlag1) {
			System.out.println("未找到指定元素");
		}
	}

}
