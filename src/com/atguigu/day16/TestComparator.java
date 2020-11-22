package com.atguigu.day16;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 
 */
public class TestComparator {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student(2, "王二小", 89);
		arr[1] = new Student(3, "张三", 87);
		arr[2] = new Student(1, "李四", 56);
		
		//再按照成绩顺序重新进行排序
		
		//在Arrays的类中
		//public static void sort(Object[] a, Comparator c)
		Arrays.sort(arr, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				return s1.getScore() - s2.getScore();
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
