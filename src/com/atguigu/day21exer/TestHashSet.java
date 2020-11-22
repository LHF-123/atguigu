package com.atguigu.day21exer;

import java.util.HashSet;

//添加到一个集合中，要求不可重复，规定编号相同就认为是同一本书
/*
 * 	要重写Book类的hashCode和equals
 * 	要求：
 * 	（1）必须一起重写
 * 	（2）hashCode值相同，不一定相同
 * 		 hashCode值不相同，equals一定不相同
 * 		 equals相同，hashCode值一定相同
 * 
 * 	要求：参与hashCode值计算的数组，就要参与equals的比较
 * 	（3）equals方法的重写遵循几个原则
 * 		对称性、自反性、传递性、一致性、非空与null比较返回false
 * 		参考：Object的equals的API
 */
public class TestHashSet {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new Book(1, "《从入门到精通》", "宋老师", 99.9, 10000));
		set.add(new Book(2, "《从入门到放弃》", "刘老师", 66.6, 20000));
		set.add(new Book(3, "《从精通到癫疯》", "刘尚坤", 88.8, 30000));
		set.add(new Book(3, "《从精通到》", "刘尚", 88.7, 3000));
		
		for (Object object : set) {
			System.out.println(object);
		}
		
	}

}
