package com.atguigu.day18;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

import org.junit.Test;

/*
 * 	异常对象：
 * 	（1）JVM自动抛出
 * 	（2）程序员手动抛出
 * 
 * 	无论是JVM自动抛出还是throw手动抛出，最终都用try...catch处理或者通过throws抛给上级
 * 
 * 	throw关键字是用于主动抛出异常对象。
 * 	语法格式：
 * 		语句：throw 异常对象;
 * 
 * 	说明：如果没有try...catch。他可以代替return语句，结束当前方法。但是无法返回正常的结果，只能带回“异常对象”
 * 
 * 	需求：
 * 		从键盘输入用户名、密码和检验码。
 * 		当校验码错误时，用异常来表示
 * 
 * 	Exception：
 * 	（1）构造器：可以为message属性赋值
 * 		new Exception("校验码错误")
 * 	（2）String getMessage()
 * 
 */
public class TestThrow {
	
	@Test
	public void test3() {
		
		try {
			login();
			System.out.println("登录成功");
		} catch (Exception e) {
			System.out.println("登录失败，失败原因：" + e.getMessage());
		}
		
	}
	
	public void login() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = scanner.nextLine();
		
		System.out.print("请输入密码：");
		String password = scanner.nextLine();
		
		String code = "1234";
		System.out.print("请输入校验码（" + code + "）：");
		String check = scanner.nextLine();
		
		if (!code.equals(check)) {
			throw new Exception("校验码输入错误");//非运行时异常，按编译时异常
			//throw new RuntimeException("校验码输入错误");
		}
		
		//做一个假登陆
		//假设用户名：admin，密码：123
		if (!("admin".equals(username) && "123".equals(password))) {
			throw new Exception("用户名或密码错误");
		}
		
	}
	
	@Test
	public void test2() {
		try {
			RuntimeException r = new RuntimeException("运行时异常");
			throw r;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("其他代码");
	}
	
	@Test
	public void test1() {
		try {
			throw new RuntimeException("运行时异常");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("其他代码");
	}
	
}
