package com.atguigu.day15.keyword;

/*
 * 	希望学生类的对象可以比较大小，遵循对象比大小的标准。
 * 	让学生类实现java.lang.Comparable接口
 * 
 * 	java.lang.Comparable接口中有一个抽象方法：int comparaTo(Object o)
 * 
 * 	一个类实现一个接口，必须实现这个接口的所有抽象方法，要不然这个类就要是抽象类
 */
public class Student implements Comparable{
	
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
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
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	//假设这里要求按照成绩比较大小，比较这两个学生对象：this和obj
	//如果this对象“大于”obj对象，那么返回正整数
	//如果this对象“小于”obj对象，那么返回负整数
	//如果this对象“等于”obj对象，那么返回0
	@Override
	public int compareTo(Object obj) {
		if (!(obj instanceof Student)) {
			//不能比较大小，应该是抛出异常，这里出现提示
			System.out.println("obj不是学生对象");
			return 0;//按理说返回0不合适
		}
		
		Student stu = (Student) obj;
		
		if (this.score > stu.score) {
			return 1;//正整数
		}else if (this.score < stu.score) {
			return -1;//负整数
		}
		
		return 0;
	}

}
