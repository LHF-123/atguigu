package com.atguigu.day23;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/*
 * OutputStream：
 * （1）void write(int data)
 * （2）void write(byte[] data)
 * （3）void write(byte[] data, int offset, int len)
 * 
 * Writer：
 * （1）void write(int data)
 * （2）void write(char[] data)
 * （3）void write(char[] data, int offset, int len)
 * （4）void write(String str)
 * （5）void write(String str,int offset,int len)
 */

public class TestOut {
	@Test
	public void test3() throws IOException{
		String str = "柴老师是尚硅谷第一大美女";
		
		//1、创建IO流：FileOutputStream或FileWriter
		FileWriter fw = new FileWriter("d:/1.txt",true);//追加模式
		
		//2、写
		fw.write(str);
		
		//3、关闭
		fw.close();
	}
	
	@Test
	public void test2() throws IOException{
		String str = "柴老师是大美女";
		
		//1、创建IO流：FileOutputStream或FileWriter
		FileWriter fw = new FileWriter("d:/1.txt");//覆盖模式
		
		//2、写
		fw.write(str);
		
		//3、关闭
		fw.close();
	}
	
	@Test
	public void test() throws IOException{
		String str = "柴老师是大美女";
		
		//1、创建IO流：FileOutputStream或FileWriter
		FileOutputStream fos = new FileOutputStream("d:/1.txt");
		
		//2、写
		fos.write(str.getBytes());
		
		//3、关闭
		fos.close();
	}
}
