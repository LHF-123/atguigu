package com.atguigu.day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	IO流操作：
 * 	1、选择IO流
 */
public class TestCopy {
	
	public static void main(String[] args) {
		try {
//			copyFile("d:/1.txt", "d:/2.txt");
			
			long start = System.currentTimeMillis();
			copyFile("F:/开发工具/android-studio.zip", "F:/开发工具/1.zip");
			long end = System.currentTimeMillis();
			
			System.out.println("复制成功，耗时：" + (end-start) + "毫秒");//5346
		} catch (IOException e) {
			System.out.println("复制失败");
		}
	}
	
	/*
	 * 	复制一个文件的功能
	 * 	srcPath指定的文件，复制到destPath指定的文件
	 */
	public static void copyFile(String srcPath, String destPath) throws IOException {
		//1、选择IO流
		//从srcPath文件读取：FileInputStream
		//把数据写到destPath中：FileOutputStream
		FileInputStream fis = new FileInputStream(srcPath);
		FileOutputStream fos = new FileOutputStream(destPath);
		
		//2、一边读一边写，相当于用盆从一个池子装水到另一个池子
		//（1）准备一个盆
		byte[] data = new byte[1024];
		int len;
		while ((len = fis.read(data)) != -1) {
//			fos.write(data);//最后一次，可能遗留了上次的内容
			fos.write(data, 0, len);//len是每次读取了几个字节
		}
		
		
		//3、关闭IO流
		fos.close();
		fis.close();
	}

}
