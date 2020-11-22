package com.atguigu.day20;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

import org.junit.Test;

/*
 * ZoneDateTime
 * ZoneId
 */
public class TestZone {
	
	@Test
	public void test2() {
		ZonedDateTime z = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(z);
	}
	
	@Test
	public void test1() {
		//集合Set，是一个容器，装对象
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		//遍历集合
		for (String string : availableZoneIds) {
			System.out.println(string);
		}
	}

}
