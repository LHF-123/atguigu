package com.atguigu.day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * 	1、IO流的程序步骤：
 * 	（1）选择一个合适的IO流类型
 * 	例如：
 * 	读取一个文件，FileInputStream或FileReader
 * 
 * 	（2）调用合适的方法
 * 	例如：
 * 	读：read系列
 * 	写：write系列
 * 
 * 	（3）关闭IO流
 * 
 * 	比喻生活：
 * 	（1）打开水流
 * 	（2）进行xxx
 * 	（3）关闭水流
 * 
 * 	一、读一个文件
 * 	（1）选择一个合适的IO流类型：读取一个文件，FileInputStream或FileReader
 * 		这里我选择FileInputStream
 * 
 * 	（2）调用read方法
 * 
 * 	（3）关闭IO流
 * 
 * 	InputStream系列的读取的方法
 * 	（1）int read():一次读取一个字节，返回的是该字节的值
 * 	（2）int read(byte[] data)：一次读取多个字节，返回本次实际读取的字节的个数
 * 		把数据读取后，存到data中，从data[0]位置开始存储，data有多长，就读多少个，如果不够，那么全部读取
 * 	（3）int read(byte[] data, int offset, int len)：一次读取多个字节，返回本次实际读取的字节个数
 * 		把数据读取后，存到data中，从data[offset]位置开始存储，最多读取len个，如果不够len个，那么全部读取
 * 
 * 	如果流中没有数据了，read方法返回-1
 * 
 */
public class TestFileInputStream {
	
	@Test
	public void test3() throws IOException {
		//1、创建IO流
		//需要指定一个参数，表名从哪个文件读取
		FileInputStream fis = new FileInputStream("E:/code/1.txt");
		
		//2、进行读取操作
		byte[] data = new byte[10];
		//如果data数组无法装下文件的所有内容，可以用循环，反复读取
		int len;
//		while (true) {
//			len = fis.read(data);
//			if (len == -1) {
//				break;
//			}
//			System.out.print(new String(data, 0, len));
//		}
		
		while ((len = fis.read(data)) != -1) {
			System.out.print(new String(data, 0, len));
		}
		
		//3、关闭
		fis.close();
		
	}
	
	@Test
	public void test2() throws IOException {
		//1、创建IO流
		//需要指定一个参数，表名从哪个文件读取
		FileInputStream fis = new FileInputStream("E:/code/1.txt");
		
		//2、进行读取操作
		byte[] data = new byte[10];
		int len = fis.read(data);//从fis流读取，到data数组中
		System.out.println("len = " + len);
		
		//String：和字节数组相关的方法（1）getByte(xx)（2）new String(byte[] xx)
//		String string = new String(data);
		String string = new String(data, 0, len);
		System.out.println(string);
		
		//3、关闭
		fis.close();
		
	}
	
	//FileNotFoundException是IOException的子类
	@Test
	public void test1() throws IOException {
		//1、创建IO流
		//需要指定一个参数，表名从哪个文件读取
		FileInputStream fis = new FileInputStream("E:/code/1.txt");
		
		//2、进行读取操作
		int read = fis.read();
		System.out.println(read);//104
		
		//3、关闭
		fis.close();
		
	}

}
