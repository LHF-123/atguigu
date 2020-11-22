package com.atguigu.day08;
/*
 * 一、排序算法：
 * 	     选择排序
 * 		直接选择排序、堆排序
 * 	     交换排序
 * 		冒泡排序、快速排序
 * 	     插入排序
 * 		直接插入排序、折半插入排序、Shell排序
 * 	     归并排序
 * 	     桶式排序
 * 	     基数排序
 * 		
 * 二、使用冒泡排序实现数组元素的排序
 */
public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {23,445,32,65,-76,-43,0,2,99,445};
		
		//使用冒泡排序实现数组元素从小到大的顺序排列
		for (int i = 0; i < arr.length - 1; i++) {//只需要比较arr.length-1轮
			
			for (int j = 0; j < arr.length - 1 - i; j++) {//因为j还控制着arr[j+1]所以j取不到arr.length-1
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
