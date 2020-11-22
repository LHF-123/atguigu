package com.atguigu.day24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * 	假设：有这样一些数据
 * 	String name = "白娘子";
 *	int age = 1000;
 *	char gebder = '女';
 *	double faLi = 10000.5;
 *
 *	运行中，停下来，下次希望从这个点继续。
 *	
 *	DataOutputStream（数据输出流）：
 *	数据输出流允许应用程序以适当方式将基本 Java 数据类型写入输出流中。
 *	然后，应用程序可以使用数据输入流将数据读入。
 *
 *	DataInputStream（数据输入流）：
 *	数据输入流允许应用程序以与机器无关方式从底层输入流中读取基本 Java 数据类型。
 *
 *	Java的基本数据类型：8种
 *	基本的Java数据类型：8种 + String
 *
 *	DataOutputStream:方法
 *		writeXxx(xx)
 *
 *	DataInputStream:方法
 *		readXxx(xx)
 *
 */
public class TestDataIO {
	
	@Test
	public void read() throws IOException {
		//（1）创建IO流
		//以DataOutputStream写的，要用DataInputStream读取
		DataInputStream dis = new DataInputStream(new FileInputStream("resources/game.dat"));
		
		//（2）读取
		//要求：读的顺序和写的顺序要一致
		String name = dis.readUTF();
		int age = dis.readInt();
		char gender = dis.readChar();
		double faLi = dis.readDouble();//顺序如果不一样，显示出来的会有一些问题
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(faLi);
		
		//（3）关闭IO流
		dis.close();
		
	}

	@Test
	public void save() throws IOException {
		//需求：把这些数据，按照不同的数据类型，进行保存，恢复时，也是按照不同的数据类型进行恢复
		String name = "白娘子";
		int age = 1000;
		char gebder = '女';
		double faLi = 10000.5;
		
		//（1）创建IO流
		//需要用DataOutputStream，他不是节点流，需要包装一个OutputStream系列的IO流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("resources/game.dat"));
		
		
		//（2）写数据
		dos.writeUTF(name);
		dos.writeInt(age);
		dos.writeChar(gebder);
		dos.writeDouble(faLi);
		
		//（3）关闭IO流
		dos.close();
		
	}
	
}
