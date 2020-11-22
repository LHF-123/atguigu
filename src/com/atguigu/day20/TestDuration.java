package com.atguigu.day20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import org.junit.Test;

/*
 * Duration:时间间隔
 * Period：日期间隔
 * 	between(x, y)
 */
public class TestDuration {
	
	@Test
	public void test3() {
		LocalTime now = LocalTime.now();
		LocalTime lunch = LocalTime.of(12, 0, 0);
		
		Duration period = Duration.between(now, lunch);
		System.out.println(period);
	}
	
	@Test
	public void test2() {
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(2019, 9, 1);
		
		Period period = Period.between(today, birth);
		System.out.println(period);
	}
	
	@Test
	public void test1() {
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(2001, 1, 1);
		
		Period period = Period.between(today, birth);
		System.out.println(period);
	}

}
