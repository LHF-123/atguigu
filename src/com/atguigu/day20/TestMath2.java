package com.atguigu.day20;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/*
 * java.math包：
 * 	1、BigInteger:
 * 		大整数
 * 	2、BigDecimal:
 * 		不可变的任意精度的有符号十进制数
 * 
 * 	面试题：int, Integer, BigInteger的区别？
 * 	int：基本数据类型
 * 	Integer：包装类
 * 	BigInteger：不可变的任意精度的整数。
 * 
 * 	double, Double, BigDecimal的区别？
 * 	...
 * 
 * 	计算方面：
 * 	基本数据类型：直接+, -, * , / .....
 * 	包装类：拆箱再计算
 * 	BigInteger， BigDecimal：通过方法
 * 	
 */
public class TestMath2 {
	
	@Test
	public void test2() {
		BigDecimal big1 = new BigDecimal("12345.678901234567890");
		BigDecimal big2 = new BigDecimal("123.45678901234567890");
		
		//BigDecimal divide(BigDecimal divisor):如果除不尽，会报异常
//		System.out.println("商：" + big1.divide(big2));
		
		//BigDecimal divide(BigDecimal divisor, int roundingMode)
		System.out.println("商：" + big1.divide(big2, BigDecimal.ROUND_CEILING));
		System.out.println("商：" + big1.divide(big2, BigDecimal.ROUND_FLOOR));
		
		//BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
		System.out.println("商：" + big1.divide(big2, 6, BigDecimal.ROUND_FLOOR));
		System.out.println("商：" + big1.divide(big2, 6, BigDecimal.ROUND_CEILING));
		
	}
	
	@Test
	public void test1() {
		BigInteger big1 = new BigInteger("12345678901234567890");
		BigInteger big2 = new BigInteger("12345678901234567890");
		
		System.out.println("和：" + big1.add(big2));
		System.out.println("差：" + big1.subtract(big2));
		System.out.println("积：" + big1.multiply(big2));
		System.out.println("商：" + big1.divide(big2));
		System.out.println("幂：" + big1.pow(3));
		
	}

}
