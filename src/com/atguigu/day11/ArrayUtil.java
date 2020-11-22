package com.atguigu.day11;
/*
 * 自定义的操作数组的工具类
 * 
 */
public class ArrayUtil {
	
	//获取int[]型数组的最大值
	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//获取int[]型数组的最小值
	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	//获取int[]型数组的总和
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//获取int[]型数组的平均值
	public int getAvg(int[] arr) {
		return getSum(arr) / arr.length;
	}
	
	//复制一个数组
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}
	
	//反转数组
	public void reverse(int[] arr) {
		for (int start = 0,end = arr.length - 1; start <end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	/**
	 * 排序数组,，默认从小到大
	 * @param arr
	 */
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {//只需要比较arr.length-1轮
			
			for (int j = 0; j < arr.length - 1 - i; j++) {//因为j还控制着arr[j+1]所以j取不到arr.length-1
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			
		}
	}
	
	/**
	 * 查找指定元素在指定数组中首次出现的位置
	 * @param arr 指定的数组
	 * @param value 指定的元素
	 * @return 首次出现的索引位置，如果没有找到，则返回-1
	 */
	public int getIndex(int[] arr, int value) {
		
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//遍历
	public void print(int[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("}");
	}
	
	/**
	 * 排序数组，默认从小到大
	 * @param arr 待排序数组
	 * @param sort 指定排序的方式  asc：从小到大排序  desc：从大到小排序
	 */
	public void sort(int[] arr, String sort) {
		if ("asc".equals(sort)) {
			for (int i = 0; i < arr.length - 1; i++) {//只需要比较arr.length-1轮
				
				for (int j = 0; j < arr.length - 1 - i; j++) {//因为j还控制着arr[j+1]所以j取不到arr.length-1
					if (arr[j] > arr[j + 1]) {
//						int temp = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = temp;
						
						//swap(arr[j], arr[j+1]);
						
						swap(arr, j, j+1);
					}
				}
				
			}
		}else if ("desc".equals(sort)) {
			for (int i = 0; i < arr.length - 1; i++) {//只需要比较arr.length-1轮
				
				for (int j = 0; j < arr.length - 1 - i; j++) {//因为j还控制着arr[j+1]所以j取不到arr.length-1
					if (arr[j] < arr[j + 1]) {
//						int temp = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = temp;
						
						//swap(arr[j], arr[j+1]);
						
						swap(arr, j, j+1);
					}
				}
				
			}
		}else {
			System.out.println("您指定的排序方式有误");
		}
		
	}
	
	//交换指定数组的指定索引位置上的两个变量
//	public void swap(int i, int j) {
//		int temp = i;
//		i = j;
//		j = temp;
//	}
	//此时交换的是i和j跟数组里并没有关系
	
	//交换指定数组的指定索引位置上的两个变量
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//在这把arr的地址值传了过来，里面的arr[i]和arr[j]跟sort方法里的
	//指向同一个数组在swap里交换后，在sort里的数组也会改变
}
