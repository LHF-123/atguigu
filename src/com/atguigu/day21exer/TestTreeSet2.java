package com.atguigu.day21exer;

import java.util.Comparator;
import java.util.TreeSet;

//添加到一个集合中，要求不可重复，但是要求这次价格按照从低到高排序
//提示：TreeSet
/*
 * 	因为在上一题中，默认实现是销量从高到低，我们就不方便再次修改Book类的compareTo方法
 * 	说明,Book类的自然排序规则，无法满足本题的要求。
 * 
 * 	要求：给TreeSet对象要多传一个"定制比较器对象"，即java.util.Comparator
 * 	
 * 	Arrays.sort(arr)：按照元素的自然排序
 * 	Arrays.sort(arr, 定制比较器对象)
 * 
 * 	TreeSet set = new TreeSet();：按照元素的自然排序
 * 	TreeSet set = new TreeSet(定制比较器对象);：按照定制比较器排序
 * 
 */
public class TestTreeSet2 {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Book b1 = (Book) o1;
				Book b2 = (Book) o2;
				//按照价格从低到高排序
//				return (int)(b1.getPrice() - b2.getPrice());//错误的
				
				//方法一：
//				if (b1.getPrice() > b2.getPrice()) {
//					return 1;
//				}else if (b1.getPrice() < b2.getPrice()) {
//					return -1;
//				}else {
//					return 0;
//				}
				
				//方法二：
//				return Double.compare(b1.getPrice(), b2.getPrice());
				
				//方法三：
				Long p1 = Double.doubleToLongBits(b1.getPrice());
				Long p2 = Double.doubleToLongBits(b2.getPrice());
				return Long.compare(p1, p2);
				
				//方法从一到三，严格程度递增
				
			}
		});
		
		set.add(new Book(1, "《从入门到精通》", "宋老师", 99.9, 10000));
		set.add(new Book(2, "《从入门到放弃》", "刘老师", 66.6, 20000));
		set.add(new Book(3, "《从精通到癫疯》", "刘尚坤", 88.8, 30000));
		
		for (Object object : set) {
			System.out.println(object);
		}
		
	}

}
