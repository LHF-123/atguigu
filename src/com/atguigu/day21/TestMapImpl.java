package com.atguigu.day21;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

/*
 * 	Map的实现类们：
 * 	1、HashMap:哈希表
 * 	2、Hashtable:哈希表
 * 	3、LinkedHashMap：
 * 		它是HashMap的子类，比HashMap多维护了添加的顺序。
 * 	4、TreeMap:映射关系的顺序会按照key的“大小”顺序排列
 * 		要求：映射关系的key必须支持排序，即实现java.util.Comparable接口，或者单独为TreeMap指定定制比较器对象
 * 	5、Properties:
 * 	（1）Properties是HashMap的子类
 * 	（2）Properties是key和value的类型是String
 * 
 * 	面试题：Hashtable和HashMap的区别？
 * 	Hashtable：最古老，线程安全的，它的key和value不允许为null
 * 	HashMap：相对新，线程不安全，它的key和value都允许为null
 * 
 * 	类同：StringBuffer和StringBuilder
 * 		Vector和ArrayList
 * 
 * 	
 */
public class TestMapImpl {
	
	@Test
	public void test1() {
		//获取系统属性
		Properties properties = System.getProperties();
		
		Set entrySet = properties.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test6() {
		Map map = new LinkedHashMap();
		
		map.put("梁山伯", "祝英台");
		map.put("单身狗", null);
		map.put("刘尚坤", new String[] {"如花", "芙蓉"});
		
		//遍历key和value
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
//			Map.Entry
			System.out.println(object);
		}
		
	}

}
