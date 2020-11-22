package com.atguigu.exercise;
/*
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，
 * 最小值，平均值，和值，并输出出来
 * 要求：所有的随机数都是两位数。[10,99]
 * 
 * Math.random() : [0.0,1)
 * 
 * Math.random() * 90 : [0.0,90.0)
 * (int)(Math.random() * 90) : [0,89]
 * (int)(Math.random() * 90) + 10 : [10,99]
 * 
 * 公式：获取[a,b]范围的随机数：(int)(Math.random() * (b - a + 1)) + a 
 * 
 * 比如：生成[1,30]范围的随机整数：
 * Math.random() : [0.0,1) ->
 * Math.random() * 30 : [0.0, 30.0) ->
 * (int)(Math.random() * 30) : [0,29] ->
 * (int)(Math.random() * 30) + 1 : [1,30]
 */
public class ArrayExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		//给数组所有元素赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 90) + 10;
		}
		
		//求数组的最大值
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("数组的最大值为：" + max);
		//求数组的最小值
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("数组的最小值为：" + min);
		
		//求数组的总和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println();
		System.out.println("数组的总和为：" + sum);
		
		//求数组的平均值
		double avg = (double)sum / arr.length;
		System.out.println("数组的平均数为：" + avg);
	}

}
