package com.atguigu.day22exer;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 	3、练习3
 * 	把本组学员的姓名和他的女（男）朋友们的姓名存到一个HashMap中，并且用entrySet遍历显示
 * 	方法一：
 */
public class TestMap {
	
	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		
		map.put("张三", new String[] {"李四", "王五"});
		map.put("小华", null);
		map.put("赵六", new String[] {"钱七"});
		
		//Set中的元素是Map.Entry类型
		//Entry的key是String，value是String[]
		Set<Entry<String, String[]>> entrySet = map.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
//			System.out.println(entry);
			
			String key = entry.getKey();
			System.out.println(key + "的对象是");
			
			String[] value = entry.getValue();
			if (value != null) {
				for (String name : value) {
					System.out.println("\t" + name);
				}
			}else {
				System.out.println("没有对象");
			}
			
			
		}
		
	}
	
}
