package com.atguigu.day23;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

/*
 * 	Reader流中也有三个read方法：
 * 	（1）int read()：一次读取一个字符，返回本次字符的Unicode编码值
 * 	（2）int read(char[] data)：一次读取多个字符，最多读取data.length个，返回本次实际读取的字符数
 * 	（3）int read(char[] data, int offset, int len)：一次读取多个字符，最多读取len个，返回本次实际读取的字符数
 * 
 * 	如果流中没有数据了，返回-1
 * 
 */
public class TestFileReader {
	
	@Test
	public void test1() throws IOException {
		//1、创建IO流
		FileReader fis = new FileReader("E:/code/1.txt");
		
		//2、读
		char[] data = new char[10];
		int len = 0;
		while ((len = fis.read(data)) != -1) {
			System.out.print(new String(data, 0, len));
		}
		
		//3、关闭
		fis.close();
		
	}

}
