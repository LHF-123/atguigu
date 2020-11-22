package com.atguigu.day11;
/*
 * 类的属性的赋值的先后顺序：① - ② - ③ - ④
 * 
 * ① 属性的默认初始化
 * ② 属性的显式初始化
 * ③ 构造器中给属性初始化
 * ④ 通过"对象.方法"或"对象.属性"的方法，给属性赋值
 * 
 * 	说明：上述的操作 ① ② ③ 在执行中只调用一次  ④ 可以根据用户需求多次调用
 */
public class UserTest {
	
	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.age);
		
		User user2 = new User(2);
		System.out.println(user2.age);//2
		
		user2.age = 5;
		System.out.println(user2.age);
	}
	
}

class User{
	
	String name;
	int age = 1;
	
	public User() {
		
	}
	
	public User(int a) {
		age = a;
	}
	
}