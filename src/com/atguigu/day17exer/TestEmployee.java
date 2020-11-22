package com.atguigu.day17exer;

/*
 * 1、声明一个枚举类型Status,
 * 	Status（员工状态），可以限定为4个：空闲（Free），忙（Busy），休假（Vocation），离职（Left）
 * 
 * 2、给Status声明一个属性，String desc,并在创建常量对象时，为desc赋值对应的意思，例如Busy对象赋值忙
 * 
 * 3、声明一个员工类型Employee，有属性：编号，姓名，状态
 * 
 * 4、在测试类中创建一个员工数组，五个对象，分别初始化为不同的状态，遍历显示
 */
public class TestEmployee {

	public static void main(String[] args) {
		Employee[] all = new Employee[5];
		
		all[0] = new Employee(1, "张三", Status.FREE);
		all[1] = new Employee(2, "李四", Status.BUSY);
		all[2] = new Employee(3, "王五", Status.VOCATION);
		all[3] = new Employee(4, "赵六", Status.FREE);
		all[4] = new Employee(5, "钱七", Status.LEFT);
		
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		
	}

}
