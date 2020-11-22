package com.atguigu.day16;

import java.util.Arrays;
import java.util.Comparator;

/*
 * java.lang.Comparable接口：比较对象的大小的标准接口，自然排序的接口
 * 	这种排序被成为类的自然排序，类的compareTo方法被成为他的自然比较方法
 * 
 * int compareTo(Object obj)
 * 
 * 	当前对象this比obj对象大，返回正整数
 * 	当前对象this比obj对象小，返回负整数
 * 	当前对象this与obj对象相等，返回0
 * 
 * java.util.Comparator接口：比较对象大小的标准接口2，定制排序的接口
 * 	int compare(Object o1, Object o2)
 * 
 * 	当o1比o2对象大，返回正整数
 * 	当o1比o2对象小，返回负整数
 * 	当o1与o2对象相等，返回0
 * 
 */
public class TestComparable {
	
	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student(2, "王二小", 89);
		arr[1] = new Student(3, "张三", 87);
		arr[2] = new Student(1, "李四", 56);
		
		//现在我用Arrays.sort()进行排序，先按照自然顺序进行排序
		Arrays.sort(arr);
		
		System.out.println("按照学号的自然顺序排序");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------------------------");
		//再按照成绩顺序重新进行排序
		class StudentScoreCompara implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				return s1.getScore() - s2.getScore();
			}
			
		}
		
		//在Arrays的类中
		//public static void sort(Object[] a, Comparator c)
		StudentScoreCompara sc = new StudentScoreCompara();//是Comparator接口的实现类对象
		Arrays.sort(arr, sc);
		System.out.println("按照成绩重新进行排序：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
class Student implements Comparable{
	private int id;
	private String name;
	private int score;
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
	//默认是按照学号进行排序的
	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		return this.id - student.id;
	}
	
}