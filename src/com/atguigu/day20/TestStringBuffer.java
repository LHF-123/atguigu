package com.atguigu.day20;

import org.junit.Test;

/*
 * 	字符序列：String, StringBuffer, StringBuilder
 * 	String类型的对象不可变字符序列。所以又配备了另一个类StringBuffer，它是可变的字符序列。
 * 
 * 	StringBuffer：创建对象必须用new
 * 	StringBuffer的字符拼接不能直接用+，可以用append
 * 
 * 	常用方法：
 * 	（1）append系列：用于追加xx
 * 	（2）insert系列：插入xx
 * 	（3）delete系列：删除
 * 	（4）reverse系列：反转
 *
 * 	StringBuffer：又称为字符串缓冲区，内部用char[]数组存储。
 * 	数组的长度是不可变的。
 * 	（1）char[]的初始化长度是多少？
 * 		StringBuffer():默认是
		StringBuffer(String str)：默认长度是str.length+16
		StringBuffer(int capacity)：默认长度是由capacity指定
 * 	（2）如果char[]存满了，怎么办？
 * 		先把value的数组扩大为value.length*2+2，如果还不够，就按实际需要的来
 * 
 * 	StringBuilder:JDK 1.5
 * 	StringBuilder与StringBuffer的API完全兼容，但是StringBuilder不保证同步。
 * 	
 * 	换句话说：StringBuffer是线程安全的，StringBuilder是线程不安全
 * 	即当多线程来共同使用同一个StringBuffer的对象时，是安全的
 * 	即当多线程来共同使用同一个StringBuilder的对象时，是不安全的
 * 	
 * 	单线程情况下，建议使用StringBuilder
 * 
 * 	面试题：String、StringBuffer和StringBuilder三个的区别？
 * 	String：对象不可变
 * 	StringBuffer和StringBuilder：对象可变
 * 	StringBuffer是线程安全的，StringBuilder是线程不安全
 * 
 */
public class TestStringBuffer {
	
	@Test
	public void test6() {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < 5; i++) {
			s.append("1234567890");
		}
		
		System.out.println(s);
		
	}
	
	//反转
	@Test
	public void test5() {
		StringBuffer s = new StringBuffer("hello");
		s.reverse();
		System.out.println(s);
	}
	
	//删除
	@Test
	public void test4() {
		StringBuffer s = new StringBuffer("hello");
		s.delete(2, 5);
		System.out.println(s);
	}
	
	//插入xx
	@Test
	public void test3() {
		StringBuffer s = new StringBuffer("hello");
		s.insert(2, "world");
		System.out.println(s);
	}
	
	@Test
	public void test2() {
		StringBuffer s = new StringBuffer();
		s.append(1).append(2).append(3).append(4);
		System.out.println(s);
	}
	
	//追加字符
	@Test
	public void test1() {
		String str = "hello";
		StringBuffer stb = new StringBuffer("hello");
		
		change(str, stb);
		
		System.out.println(str);
		System.out.println(stb);
		
	}

	public void change(String str, StringBuffer stb) {
		str += "world";
		stb.append("world");
	}

}
