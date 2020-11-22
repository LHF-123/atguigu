package com.atguigu.day11exer;
/*
 * 1.创建程序，在其中定义两个类：Person和PersonTest类，定义如下：
 * 	用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。在PersonTest类的中实例化Person类的对象b，
 * 	调用setAge()和getAge()方法，体会Java的封装性
 */
public class PersonTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setAge(-10);
		
		System.out.println(person.getAge());
		
		//System.out.println(person.show());
	}
	
	
	
}

//在同一个包下不能定义同名的类
//class person{
//	
//} 

