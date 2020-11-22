package com.atguigu.day20exer;

public class TestExer3 {

	public static void main(String[] args) {
		String src = "abababkkcadkabkebfkabkskab";
		String sub = "ab";
		System.out.println(count(src, sub));
		
	}
	
	//方法一：查找+截取
	public static int count(String src, String sub) {
		int count = 0;
		while (src.indexOf(sub) != -1) {
			int index = src.indexOf(sub);
			src = src.substring(index+sub.length());
			count++;
		}
		return count;
	}
	
	//方法二：替换
	public static int count2(String src, String sub) {
		int count = 0;
		while (src.contains(sub)) {
			src = src.replaceFirst(sub, "");
			count++;
		}
		return count;
	}
	
}
