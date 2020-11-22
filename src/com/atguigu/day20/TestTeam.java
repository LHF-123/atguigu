package com.atguigu.day20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestTeam {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("下一个周日：" + now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));
		System.out.println("下周五：" + now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		System.out.println("本月最后一天：" + now.with(TemporalAdjusters.lastDayOfMonth()));//2020-08-31
	}
	
}
