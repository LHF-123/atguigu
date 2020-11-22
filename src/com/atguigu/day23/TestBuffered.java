package com.atguigu.day23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	缓冲IO流：
 * 	作用：提高效率
 * 
 * 	BufferedInputStream		-->InputStream	
 * 	BufferedOutputStream	-->OutputStream	
 * 	BufferedReader			-->Reader
 * 	BufferedWriter			-->Writer
 * 
 */
public class TestBuffered {
	
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			copyFile("F:/开发工具/android-studio.zip", "F:/开发工具/1.zip");
			long end = System.currentTimeMillis();
			
			System.out.println("复制成功，耗时：" + (end-start) + "毫秒");//1309
		} catch (IOException e) {
			System.out.println("复制失败");
		}
	}
	
	public static void copyFile(String srcPath, String destPath) throws IOException {
		//1、选择IO流
		//(1)考虑从srcPath文件读取，并写到destPath文件
		//(2)希望提高效率
		//FileInputStream用BufferedInputStream
		//FileOutputStream用BufferedOutputStream
		
		FileInputStream fis = new FileInputStream(srcPath);
		FileOutputStream fos = new FileOutputStream(destPath);
		
		BufferedInputStream bis = new BufferedInputStream(fis);//在fis基础上增加缓冲效果，装饰
		BufferedOutputStream bos = new BufferedOutputStream(fos);//在fos基础上增加缓冲效果，装饰
		
		//数据流向  srcPath --> fis --> bis --> 字节数组（桶）-->   bos --> fos --> destPath
		
		//2、一边读一边写
		byte[] data = new byte[1024];
		int len;
		while ((len = bis.read(data)) != -1) {
			bos.write(data, 0, len);
		}
		
		//3、关闭IO流
		//可以只关闭外层的，但是如果要全部关闭的话，这里要有顺序要求
		bos.close();
		bis.close();
		
		fos.close();
		fis.close();
		
		
	}

}
