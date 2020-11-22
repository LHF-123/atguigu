package com.atguigu.day20;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

/*
 * Instant:默认的是本初子午线的绝对时间
 */
public class TestInstant {
	
	@Test
	public void test1() {
		Instant i = Instant.now();
		System.out.println(i);//2020-08-07T03:24:25.741Z

		LocalDateTime z = LocalDateTime.now();
		System.out.println(z);
		
		OffsetDateTime atOffset = i.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);
		
		OffsetDateTime atOffset2 = i.atOffset(ZoneOffset.ofHours(-8));
		System.out.println(atOffset2);
	}
	
}
