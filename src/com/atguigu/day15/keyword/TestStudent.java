package com.atguigu.day15.keyword;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("张三", 90);
		Student s2 = new Student("李四", 80);
		
//		System.out.println(s1 > s2);
		System.out.println(s1.compareTo(s2));
		if (s1.compareTo(s2) == 0) {
			System.out.println(s1.getName() + "的成绩 等于 " + s2.getName() + "的成绩");
		}else if (s1.compareTo(s2) > 0) {
			System.out.println(s1.getName() + "的成绩 大于 " + s2.getName() + "的成绩");
		}else {
			System.out.println(s1.getName() + "的成绩 小于 " + s2.getName() + "的成绩");
		}
		
	}

}
