package com.atguigu.day15exer;

import java.util.Scanner;

/*
 * 5、定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 	利用循环结构遍历数组元素，输出各个对象的类型，name，number，birthday，以及该对象的实发工资
 * 	当键盘输入本月月份时，如果本月是某个Employee对象的生日时，还要体现增加工资信息。
 */
public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[3];
		arr[0] = new SalariedEmployee(1001, "张三", 1993, 3, 3, 15000, 20, 22);
		arr[1] = new HourlyEmployee(1002, "李四", new MyDate(1994, 4, 4), 80, 100);
		arr[2] = new SalariedEmployee(1003, "王五", new MyDate(1995, 5, 5), 12000, 23, 22);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println("实发工资：" + arr[i].earnings());
		}
		
		System.out.println("---------------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本月的月份：");
		int month = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i].getBirthday().getMonth() == month) {
				System.out.println("实发工资：" + (arr[i].earnings() + 100));
			}else {
				System.out.println("实发工资：" + arr[i].earnings());
			}
		}
	}

}
