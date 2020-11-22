package com.atguigu.day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/*
 * java.util.Iterator迭代器类型：用于遍历（迭代）Collection系列集合用的
 * 
 * 	步骤：
 * 	1、先通过Collection系列集合.对象拿到迭代器对象
 * 	2、在通过Iterator的方法进行迭代
 * 	boolean hasNext()：判断集合中是否有下一个元素需要迭代
 * 	Object next()：取出下一个元素
 * 	void remove()：删除刚刚迭代的元素，用于根据条件删除
 */
public class TestIterator {
	@Test
	@SuppressWarnings("all")
	public void test1() {
		Collection c = new ArrayList();
		c.add("张三");
		c.add("李四");
		c.add("王五");
		c.add("钱七");
		
		//(1)先通过Collection系列集合.对象拿到迭代器对象
		Iterator iterator = c.iterator();
		
		//(2)再通过Iterator的方法进行迭代
		while(iterator.hasNext()) {//判断集合中是否有下一个元素需要迭代
			Object next = iterator.next();
			System.out.println(next);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test2() {
		Collection c = new ArrayList();
		
		c.add(new Student(1, "张三", 89));
		c.add(new Student(2, "李四", 67));
		c.add(new Student(3, "王五", 90));
		c.add(new Student(4, "赵六", 45));
		
		//需求：删除不及格的学生
		//（1）方法一：直接删除，不行
//		c.remove(o);//通过Collection的remove(),一步不行
		
		//（2）方法二：用foreach，遍历，然后删除
//		for (Object object : c) {
//			Student stu = (Student) object;
//			if (stu.getScore() < 60) {
//				c.remove(stu);
//			}
//		}
		
		//（3）方法三：用Iterator遍历删除
		Iterator iterator = c.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			Student stu = (Student) next;
			if (stu.getScore() < 60) {
				iterator.remove();//调用迭代器的remove不是集合的remove
			}
		}
		
		for (Object object : c) {
			System.out.println(object);
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
