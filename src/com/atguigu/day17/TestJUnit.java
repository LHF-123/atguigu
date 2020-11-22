package com.atguigu.day17;

import javax.xml.stream.events.StartDocument;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * 	域名：
 * 	com, edu, gov, org...
 * 	
 * 	三、单元测试相关的注解
 * 	1、声明：第三方回归测试框架声明，不是JDK声明
 * 	2、读取：由JUnit框架来读取
 * 
 * 	3、使用
 * 	（1）引入第三方回归测试框架jar（一堆类的class文件）
 * 		目前的IDE（Eclipse, IDEA）都有集成
 * 
 * 		项目名上右键->Build Path->Add Library-->JUnit-->选择版本-->finish
 * 	（2）可以使用的注解（在方法上）
 * 		@Test（掌握）
 * 		运行：
 * 		（1）Run as -> JUnit Test 单元测试
 * 		（2）如果没有选择方法，那么当前类的所有@Test标记的方法都会执行，如果选择了其中一个方法，那么就只运行这一个
 * 		要求：
 * 		（1）这个方法本身必须是public，void，（）
 * 		（2）这个方法所在的类也要是public
 * 
 * 	了解：
 * 	@Before:在每一个@Test标记的方法之前运行。
 * 	@After：在每一个@Test标记的方法之后运行。
 * 	@BeforeClass:在当前类初始化时执行，只执行一次，方法必须是static
 * 	@AfterClass:所有的方法之后，只执行一次，方法必须是static
 * 
 * 	白盒测试：程序自测，需要明确知道测试代码的编写，功能...
 * 	黑盒测试：测试人员，不需要知道功能如何实现，只对着用户需求文档，性能要求，安全要求进行
 * 
 * 
 */
public class TestJUnit {
	
	@BeforeClass
	public static void init() {
		System.out.println("初始化...");
	}
	
	@Before
	public void Start() {
		System.out.println("开始测试...");
	}
	
	@Test
	public void test1() {
		System.out.println("hello JUnit1");
	}
	
	@Test
	public void test2() {
		System.out.println("hello JUnit2");
	}
	
	@Test
	public void test3() {
		print("hello JUnit3");
	}
	
	public void print(String info) {
		System.out.println(info);
	}

}
