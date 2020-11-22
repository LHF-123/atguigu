package com.atguigu.day20;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

/*
 * LocalDate：只能表示日期，例如：生日，入职日期
 * LocalTime：只能表示时间
 * LocalDateTime：可以表示日期加时间，例如：用户注册日期时间，最后登录的日期时间，订单日期时间
 * 
 * 1、now()
 * 2、of()
 * 3、getYear
 * 	getXxx
 * 4、withXxx():修改
 * 5、plusXxx():加
 * 6、minusXxx():减
 * 7、isLeapYear():是否是闰年
 */
public class TestLocalDate {
	
	@Test
	public void test7() {
		LocalDate t = LocalDate.now();
		System.out.println(t.isLeapYear());
	}
	
	@Test
	public void test6() {
		LocalDate t = LocalDate.now();
		LocalDate days = t.minusDays(30);
		System.out.println(days);//2020-07-08
	}
	
	@Test
	public void test5() {
		LocalDate t = LocalDate.now();
		LocalDate days = t.plusDays(150);
		System.out.println(days);//2021-01-04
	}
	
	@Test
	public void Test4() {
		LocalDate birth = LocalDate.of(2001, 1, 1);
		int year = birth.getYear();
		
		LocalDate date = birth.withYear(2000);
		System.out.println(birth);
		System.out.println(date);//凡是修改就产生新的对象
	}
	
	@Test
	public void Test3() {
		LocalDate birth = LocalDate.of(2001, 1, 1);
		int year = birth.getYear();
		
		LocalDate today = LocalDate.now();
		int t = today.getYear();
		System.out.println(t-year);
	}
	
	@Test
	public void Test2() {
		LocalDate birth = LocalDate.of(2001, 1, 1);
		System.out.println(birth);
	}
	
	@Test
	public void Test1() {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}

}
