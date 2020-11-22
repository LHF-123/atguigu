package com.atguigu.day21;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
 * 	java.util.Map：接口
 * 	和Collection最大的不同，就是它存储"键值对，映射关系"
 * 
 * 	常用方法：
 * 	1、添加
 * 		put(key, value)：一次添加一对映射关系
 * 		putAll(Map map)：一次添加多对映射关系
 * 			this = this ∪ map
 * 	2、删除
 * 		remove(Object key)：根据key删除一对
 * 		clear():清空
 * 	3、修改
 * 		通过put可以替换value，只要key相同，就会替换
 * 
 * 	4、查询
 * 	（1）containsKey(Object key)：判断某个key是否存在
 * 	（2）containsValue(Object value)：判断某个value是否存在
 * 	（3）V get(Object key)：根据key获取value
 * 	（4）boolean isEmpty()：是否为空
 * 
 * 	5、获取映射关系，键值对数：int size()
 * 
 * 	6、遍历
 * 	(1)Set KeySet()
 * 	(2)Collection values()
 * 	(3)Set entrySet()：由entry对象构成的set，因为key不重复，那么entry对象也不会重复
 * 
 * 	例如：存储男的和他的女朋友
 * 
 */
public class TestMap {
	
	@Test
	@SuppressWarnings("all")
	public void test6() {
		Map map = new HashMap();
		
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
	
	@Test
	@SuppressWarnings("all")
	public void test5() {
		Map map = new HashMap();
		
		map.put("梁山伯", "祝英台");
		map.put("单身狗", null);
		map.put("刘尚坤", new String[] {"如花", "芙蓉"});
		
		//遍历value
		Collection values = map.values();
		for (Object object : values) {
			System.out.println(object);
		}
		
	}
	
	@Test
	@SuppressWarnings("all")
	public void test4() {
		Map map = new HashMap();
		
		map.put("梁山伯", "祝英台");
		map.put("单身狗", null);
		map.put("刘尚坤", new String[] {"如花", "芙蓉"});
		
		//遍历key
		Set keySet = map.keySet();//因为map的key不能重复，所以拿出所有的key，就是一个set
		for (Object object : keySet) {
			System.out.println(object);
		}
		
	}
	
	@Test
	@SuppressWarnings("all")
	public void test3() {
		Map map = new HashMap();
		
		map.put("张三", "如花");
		map.put("张三", "芙蓉");
		
		
		System.out.println("对数：" + map.size());
		
	}
	
	@Test
	@SuppressWarnings("all")
	public void test2() {
		Map map = new HashMap();
		
		map.put("梁山伯", "祝英台");
		map.put("单身狗", null);
		map.put("刘尚坤", new String[] {"如花", "芙蓉"});
		
		map.remove("梁山伯");
		
		System.out.println("对数：" + map.size());
		
	}

	@Test
	@SuppressWarnings("all")
	public void test1() {
		Map map = new HashMap();
		
		map.put("梁山伯", "祝英台");
		map.put("单身狗", null);
		map.put("刘尚坤", new String[] {"如花", "芙蓉"});
		
		System.out.println("对数：" + map.size());
		
//		for (Object object : map) {
//			
//		}
		
//		map.iterator;
		
	}
	
	
}
