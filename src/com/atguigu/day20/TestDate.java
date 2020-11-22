package com.atguigu.day20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/*
 * 	日期时间API：
 * 	第一代：java.util.Date
 * 		(1)年份：1900
 * 	
 * 	第二代：java.util.Calendar
 * 
 * 	第三代：JDK 1.8之后就引入了新的日期时间API，例如：LocalDate, LocalTime等
 * 		（1）老版的日期时间对象没有设计为不可变对象
 * 			每一个日期时间点，都应该用一个对象表示。不同的日期时间点应该用不同的对象表示。
 * 		（2）老版的日期时间API没有考虑闰秒
 * 		（3）关于日期格式化等API只支持Date类型，不支持Calendar
 * 
 * 
 * 	第一代：java.util.Date
 * 	1、new Date()
 * 	2、long getTime()
 * 	3、new Date(毫秒)
 * 
 * 
 * 	java.sql.Date是在JDBC中使用的
 * 
 * 	第二代：java.util.Calendar抽象类
 * 		子类：GregorianCalendar
 * 	
 * 	1、Calendar c = Calendar.getInstance();
 * 	2、get(常量名)获取具体的某个时间值
 * 
 * 	关于日期时间格式化和解析：
 * 	java.text.DateFormat:
 * 	java.text.SimpleDateFormat:
 * 		1、Date parse(str)
 * 		2、String format(date)
 * 
 */
public class TestDate {
	
	@Test
	public void test5() {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒 SSS毫秒");
		String str = sf.format(d);
		System.out.println(str);
	}
	
	@Test
	public void test3() throws ParseException {
		String str = "2020-08-06 18:06:45 345";
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date date = sf.parse(str);
		System.out.println(date);
	}
	
	@Test
	public void test2() {
		Calendar c = Calendar.getInstance();//用默认的语言环境和时区
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);//在格里高利历和罗马儒略历中一年的第一个月是January，为0
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日");
	}
	
	@Test
	public void test1() {
		Date now = new Date();
		System.out.println(now);
		
		long time = now.getTime();
		System.out.println(time);
		
		Date date = new Date(time);
		System.out.println(date);
		
		Date future = new Date(Long.MAX_VALUE);
		System.out.println(future);
		
	}

}
