package com.atguigu.day18exer;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 	练习：
 * 	1、从命令行接收一个整数，作为int[]数组的长度
 * 	2、再从键盘输入几个整数，作为数组的元素赋值
 * 	3、找出最大值
 * 	4、给代码加上try...catch，看看可能发生哪些异常
 */
public class TestTryCatchExer {

	public static void main(String[] args) {
		try {
			//1、从命令行接收一个整数，作为int[]数组的长度
			int length = Integer.parseInt(args[0]);
			int[] arr = new int[length];
			
			//2、再从键盘输入几个整数，作为数组的元素赋值
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < arr.length; i++) {
				System.out.println("请输入第" + (i + 1) + "个整数");
				arr[i] = input.nextInt();
			}
			
			//3、找出最大值
			int max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println("最大值为：" + max);
		} catch (NumberFormatException e) {
			System.out.println("命令行参数不是整数类型");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("命令行参数个数少于1个");
		} catch (NegativeArraySizeException e) {
			System.out.println("数组的长度不能为负数");
		} catch (InputMismatchException e) {
			System.out.println("输入的类型不匹配");
		}

	}

}
