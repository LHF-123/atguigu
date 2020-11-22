package com.atguigu.exercise;
/*
 * 要求：
 * (1)创建Person类的对象，设置该对象的name、age和sex属性，
 * 调用syudy方法，输出字符串“studying”，
 * 调用showAge()方法显示age值
 * 调用addAge()方法给对象的age属性值增加2岁。
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系
 * 
 * 
 */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.name = "小明";
		p1.age = 19;
		p1.sex = 1;
		
		p1.study();
		//p1.showAge(30);
		p1.showAge();//showAge()中的属性age即为调用此方法的对象的age。
		int age = p1.addAge(2);
		System.out.println("新的年龄为：" + age);
		
		Show show1 = new Show();
		Person p2 = new Person();
		p2.name = "小华";
		p2.age = 20;
		p2.sex = 1;
		show1.showPerson(p2);
	}

}

class Show{
	
	public void showPerson(Person person) {
		person.study();
		person.showAge();
		int age = person.addAge(2);
		System.out.println("新的年龄为：" + age);
	}
	
}

class Person{
	
	String name;
	int age;
	//0:女性 1：男性  其他：不确定
	int sex;
	
	public void study() {
		System.out.println("studying");
	}
	
//	public void showAge(int age) {
//		System.out.println("age = " + age);//age,就近原则，调用的是形参
//	}
	
	public void showAge() {
		System.out.println("age = " + age);
	}
	
	public int addAge(int a) {
		age += a;
		return age;
	}
}
