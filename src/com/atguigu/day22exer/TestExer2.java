package com.atguigu.day22exer;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	2、练习2：
 * 	把本组学员的对象（Student）存储到一个ArrayList中，并且用foreach和Iterator分别遍历
 */
public class TestExer2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "张三", 89));
		list.add(new Student(2, "李四", 56));
		list.add(new Student(3, "王五", 66));
		
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println();
		
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student stu = iterator.next();
			System.out.println(stu.getId() + "," + stu.getName());
		}
		
		
	}

}
class Student {
	private int id;
	private String name;
	private int score;
	
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
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
	
}