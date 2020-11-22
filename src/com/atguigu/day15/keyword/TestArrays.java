package com.atguigu.day15.keyword;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("张三", 89);
		students[1] = new Student("李四", 56);
		students[2] = new Student("王五", 78);
		
		Arrays.sort(students);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

}
