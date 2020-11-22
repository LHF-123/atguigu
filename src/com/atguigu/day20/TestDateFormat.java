package com.atguigu.day20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.junit.Test;

/*
 * DateTimeFormatter:
 * 	DateTimeFormatter.ofLocalizedDate(预定义模式)
 * 	DateTimeFormatter.ofPattern(自定义模式);和SimpleDateFormat一样yyyy...
 */
public class TestDateFormat {
	
	@Test
	public void test2() {
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy年MM月dd日 E");
		System.out.println(d.format(today));
		
	}
	
	@Test
	public void test1() {
		LocalDate today = LocalDate.now();
		
		//style
		DateTimeFormatter d1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter d2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter d3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		System.out.println(d1.format(today));
		System.out.println(d2.format(today));
		System.out.println(d3.format(today));
	}
	
}
