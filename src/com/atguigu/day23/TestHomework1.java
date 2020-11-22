package com.atguigu.day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//1、请编写代码把一个GBK的文本文件内容读取后存储到一个UTF-8的文本文件中。（不论平台是什么字符编码）
public class TestHomework1 {
	public static void main(String[] args) throws IOException {
		String src = "gbk.txt";//GBK的文本文件
		String dest = "utf8.txt";//UTF-8的文本文件
		
		//1、先创建IO流
		//这里涉及到哪些IO流
		//因为这里不清楚当前平台的字符编码
		//读取：只能选择字节输入流  FileInputStream + 进行解码InputStreamReader
		InputStreamReader isr = new InputStreamReader(new FileInputStream(src),"GBK");
		//输出：只能选择字节输出流  FileOutputStream + 进行编码OutputStreamWriter
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dest),"UTF-8");
		
		//2、一边读一边写
		//从isr中读取，已经解码后的数据，应该是字符流
		//从osw写出时，先写字符流，然后osw按照指定的编码方式，再写到FileOutputStream流中，再写到文件中
		char[] data = new char[1024];
		int len;
		while((len = isr.read(data)) != -1){
			osw.write(data, 0, len);
		}
		
		//3、关闭
		osw.close();
		isr.close();
	}
}
