package com.atguigu.day22exer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 	3、练习3
 * 	把本组学员的姓名和他的女（男）朋友们的姓名存到一个HashMap中，并且用entrySet遍历显示
 * 	方法二：
 */
public class TestHashMap {

	public static void main(String[] args) {
		//HashMap<K, V>
		//ArrayList<E>
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("李四");
		list1.add("王五");
		map.put("张三", list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		map.put("小华", list2);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("钱七");
		map.put("赵六", list3);
		
		//Set<E>:Map.Entry
		//Entry<K, V>:String和ArrayList<String>
		Set<Entry<String, ArrayList<String>>> entrySet = map.entrySet();
		for (Entry<String, ArrayList<String>> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key + "的对象们：");
			
			ArrayList<String> value = entry.getValue();
			for (String string : value) {
				System.out.println("\t" + string);
			}
		}
		
		
	}

}
