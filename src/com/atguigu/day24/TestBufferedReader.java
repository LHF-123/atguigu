package com.atguigu.day24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	缓冲流是提供效率。
 * 
 * 	BufferedReader这个缓冲流有一个很好的方法：readLine()
 * 
 * 	纯文本的数据才有按行读的需求。
 */
public class TestBufferedReader {

	public static void main(String[] args) throws IOException {
		//需求是按行读
		//（1）创建IO流
		//因为BufferedReader不是节点流，需要包装一个Reader系列IO流
		BufferedReader br = new BufferedReader(new FileReader("resources/IOTest.txt"));
	
		//（2）读取
		//原来byte[], char[]    -1
		//现在：String          null
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		//（3）关闭IO流
		br.close();
	
	}
	
}
