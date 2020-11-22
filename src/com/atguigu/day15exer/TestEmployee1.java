package com.atguigu.day15exer;

import java.util.Arrays;

public class TestEmployee1 {

	public static void main(String[] args) {
		Employee1[] arr = new Employee1[5];
		arr[0] = new Employee1("张三", 13000);
		arr[1] = new Employee1("李四", 12000);
		arr[2] = new Employee1("王五", 11000);
		arr[3] = new Employee1("赵六", 16000);
		arr[4] = new Employee1("钱七", 14000);
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
