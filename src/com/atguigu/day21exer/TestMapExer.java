package com.atguigu.day21exer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 	把如下信息添加到Map中，并遍历显示
 * 	浙江省
 * 		绍兴市
 * 		温州市
 * 		嘉兴市
 * 		台州市
 * 		金华市
 * 		舟山市
 * 		衢州市
 * 		丽水市
 * 	海南省
 * 		海口市
 * 		三亚市
 * 	北京市
 * 		北京市
 */
public class TestMapExer {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		//key:省份名称
		//value：该省的城市
		ArrayList bj = new ArrayList();
		bj.add("北京市");
		
		ArrayList hn = new ArrayList();
		hn.add("海口市");
		hn.add("三亚市");
		
		ArrayList zj = new ArrayList();
		zj.add("绍兴市");
		zj.add("温州市");
		zj.add("嘉兴市");
		zj.add("台州市");
		zj.add("金华市");
		zj.add("舟山市");
		zj.add("衢州市");
		zj.add("丽水市");
		
		map.put("北京市", bj);
		map.put("海南省", hn);
		map.put("浙江省", zj);
		
		Set entrySet = map.entrySet();
//		for (Object object : entrySet) {
//			System.out.println(object);
//		}
		
		for (Object object : entrySet) {
			Map.Entry entry = (Entry) object;
			Object key = entry.getKey();//省份
			System.out.println(key);
			ArrayList value = (ArrayList) entry.getValue();
			
			for (Object city : value) {
				System.out.println("\t" + city);
			}
			
		}

	}

}
