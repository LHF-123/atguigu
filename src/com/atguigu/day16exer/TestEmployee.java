package com.atguigu.day16exer;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 5、编写代码，
 * 	请声明一个员工类Employee，有编号，姓名，薪资，实现java.lang.Comparable接口，按照编号升序排列
 * 	（1）先遍历显示一遍
 * 	（2）再调用Arrays.sort(Object[] arr)排序，然后再遍历一遍
 * 	（3）再调用Arrays.sort(Object[] arr, Comparator c)排序，然后遍历一遍，按照薪资降序排列
 * 
 */
public class TestEmployee {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Employee[] all = new Employee[5];
		all[0] = new Employee(2, "张三", 10000);
		all[1] = new Employee(1, "李四", 30000);
		all[2] = new Employee(3, "王五", 40000);
		all[3] = new Employee(4, "赵六", 20000);
		all[4] = new Employee(5, "钱七", 60000);
		
		//（1）先遍历显示一遍
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		System.out.println("----------------------------------");
		
		//（2）再调用Arrays.sort(Object[] arr)排序，然后再遍历一遍
		Arrays.sort(all);
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		System.out.println("---------------------------------");
		
		//（3）再调用Arrays.sort(Object[] arr, Comparator c)排序，然后遍历一遍，按照薪资降序排列
		//方式一
		Arrays.sort(all, new Comparator() {
			
			//方法1
			@Override
			public int compare(Object o1, Object o2) {
				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o2;
				return e2.getSalary() - e1.getSalary();
			}
			
			//方法2
//			@Override
//			public int compare(Object o1, Object o2) {
//				Employee e1 = (Employee) o1;
//				Employee e2 = (Employee) o2;
//				if (e1.getSalary() > e2.getSalary()) {
//					return -1;
//				}else if (e1.getSalary() < e2.getSalary()) {
//					return 1;
//				}
//				return 0;
//			}
			
		});
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		System.out.println("----------------------------------------");
		
		//方式二
		Arrays.sort(all, new SalaryCompare());
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		
		
	}

}
class SalaryCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return e2.getSalary() - e1.getSalary();
	}
	
}
