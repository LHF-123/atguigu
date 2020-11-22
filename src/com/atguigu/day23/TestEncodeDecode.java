package com.atguigu.day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 	编码：写
 * 	方式一：
 * 	（1）先用String的getByte(字符编码) --> byte[]数据
 * 	（2）用字节流写出去
 * 
 * 	方式二：
 * 	（1）OutputStreamWriter(字节流，字符编码)
 * 	（2）把字符的数据 --> OutputStreamWriter对象中
 * 			OutputStreamWriter对象.write(字符串或字符数组)
 * 
 * 
 * 	解码：读
 * 	方式一：
 * 	（1）先用字节流读取
 * 	（2）然后用new String(byte[] data, int offset, int count, 字符编码)
 * 
 * 	方式二：
 * 	（）先用字节流读取
 * 	（）InputStreamReader(字节流， 字符编码) --> 再读就是字符
 * 
 */
public class TestEncodeDecode {
	
	public static void main(String[] args) throws IOException {
//		testFileReaderFileWriter();
//		testString();
//		test();
//		System.out.println("复制完成");
		
//		testReadGBK();
//		testReadGBK2();
		testReadGBK3();
	}
	
	//方式二：用InputStreamReader
	public static void testReadGBK3() throws IOException {
		//读取resources/gbk.txt，并显示到控制台(当前平台是utf-8)
		//1、先创建两个IO流
		FileInputStream fr = new FileInputStream("resources/gbk.txt");
		//因为要解码，先要得到直接数据，然后把字节数据按照GBK进行解码，所以这里要用字节流
		InputStreamReader isr = new InputStreamReader(fr, "GBK");
		//数据流：gbk.txt --> fr --> 按照指定的编码 --> isr --> char[] data
		
		//2、读取
		char[] data = new char[1024];
		int len;
		while ((len = isr.read(data)) != -1) {
			System.out.println(new String(data, 0, len));
		}
		
		//3、关闭
		fr.close();
		
	}
	
	//方式一：用new String(byte[] data, int offset, int count, 字符编码)
	public static void testReadGBK2() throws IOException {
		//读取resources/gbk.txt，并显示到控制台(当前平台是utf-8)
		//1、先创建两个IO流
		FileInputStream fr = new FileInputStream("resources/gbk.txt");
		//因为要解码，先要得到直接数据，然后把字节数据按照GBK进行解码，所以这里要用字节流
		
		//2、读取
		byte[] data = new byte[1024];
		int len;
		while ((len = fr.read(data)) != -1) {
			System.out.println(new String(data, 0, len, "GBK"));
		}
		
		//3、关闭
		fr.close();
		
	}
	
	public static void testReadGBK() throws IOException {
		//读取resources/gbk.txt，并显示到控制台(当前平台是utf-8)
		//1、先创建两个IO流
		FileReader fr = new FileReader("resources/gbk.txt");
		
		//2、读取
		char[] data = new char[1024];
		int len;
		while ((len = fr.read(data)) != -1) {
			System.out.println(new String(data, 0, len));
		}
		
		//3、关闭
		fr.close();
		
	}
	
	/*
	 * 	从utf8.txt(UTF-8)文件复制内容到gbk.txt(GBK)文件中
	 * 	纯文本文件
	 * 	因为两个文件的字符编码不一致，需要解码和编码的辅助
	 * 
	 * 	OutputStreamWriter:把字符流的数据-->按照你指定的编码方式编码为-->字节流数据
	 * 
	 */
	public static void test() throws IOException {
		//1、先创建两个IO流
		FileReader fr = new FileReader("resources/utf8.txt");
		FileOutputStream fos = new FileOutputStream("resources/gbk.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		//因为需要把读到的数据按照“GBK”重新编码写到gbk.txt文件中
		//数据 utf8.txt --> fr --> char[] data --> osw --> fos --> gbk.txt
		
		//2、一边读一边写
		char[] data = new char[1024];
		int len;
		while ((len = fr.read(data)) != -1) {
			osw.write(data);
		}
		
		//3、关闭
		fr.close();
		osw.close();//注意关闭的顺序
		fos.close();
		
	}
	
	/*
	 * 	从utf8.txt(UTF-8)文件复制内容到gbk.txt(GBK)文件中
	 * 	纯文本文件
	 * 	因为两个文件的字符编码不一致，需要解码和编码的辅助
	 * 
	 * 	String：
	 * 	编码：byte[] getBytes(xx)：字符串转为字节数组
	 * 	解码：new String(byte[], xx)：把字节数组解码为字符串
	 * 
	 * 	因为我们这里平台（系统）的编码方式utf-8，读文件应该没问题
	 * 
	 */
	public static void testString() throws IOException {
		//1、先创建两个IO流
		FileReader fr = new FileReader("resources/utf8.txt");
		FileOutputStream fos = new FileOutputStream("resources/gbk.txt");
		//因为需要把读到的数据按照“GBK”重新编码写到gbk.txt文件中
		//编码：把字符串 --> 字节数组 --> 字节流
		
		//2、一边读一边写
		char[] data = new char[1024];
		int len;
		while ((len = fr.read(data)) != -1) {
			String string = new String(data, 0, len);
			fos.write(string.getBytes("GBK"));//使用String类的解码方法
		}
		
		//3、关闭
		fr.close();
		fos.close();
		
	}
	
	/*
	 * 	从utf8.txt(UTF-8)文件复制内容到gbk.txt(GBK)文件中
	 * 	纯文本文件
	 */
	public static void testFileReaderFileWriter() throws IOException {
		//1、先创建两个IO流
		FileReader fr = new FileReader("resources/utf8.txt");
		FileWriter fw = new FileWriter("resources/gbk.txt");
		
		//2、一边读一边写
		char[] data = new char[1024];
		int len;
		while ((len = fr.read(data)) != -1) {
			fw.write(data, 0, len);
		}
		
		//3、关闭
		fr.close();
		fw.close();
		
	}
	

}
