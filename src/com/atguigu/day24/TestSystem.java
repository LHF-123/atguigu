package com.atguigu.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

/*
 * 	1、System中IO流对象
 * 
 * 	System.in:InputStream
 * 	System.out:PrintStream	
 * 	System.err:PrintStream	
 * 
 * 	PrintStream:
 * 	（1）不会抛异常
 * 	（2）自动刷新
 * 	如果其他IO流，可以手动刷新flush
 * 
 * 	发现：System.in，System.out等对象都是public static final的常量，并且初始化为null。
 * 	这个对象怎么赋值？
 * 		用C语言代码实现
 * 	而且setIn(), setOut()等，是用非java代码实现的
 * 
 * 	2、java.util,Scanner：扫描仪
 * 
 * 
 */
public class TestSystem {
	
	@Test
	public void testScanner() throws FileNotFoundException {
		Scanner input = new Scanner(new File("resources/1.txt"));
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		
		input.close();
	}
	
	@Test
	public void testSystemIn() throws FileNotFoundException {
		System.setIn(new FileInputStream("resources/1.txt"));
		
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextLine());
		System.out.println(input.nextLine());
		System.out.println(input.nextLine());
		
		input.close();
	}
	
	@Test
	public void testSystemOut() throws FileNotFoundException {
		System.setOut(new PrintStream("resources/1.txt"));
		
		System.out.println("hello");
		System.out.println("world");
		System.out.println("java");
	}
	
	@Test
	public void test1() {
//		System.out.print();
		System.out.println();
		System.out.println("xx");
	}

}
